package com.ls.ordersService.service;

import com.ls.ordersService.common.Payment;
import com.ls.ordersService.common.TransactionRequest;
import com.ls.ordersService.common.TransactionResponse;
import com.ls.ordersService.entity.Orders;
import com.ls.ordersService.repository.OrdersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class OrdersServiceImpl implements OrdersService {
    private static final String SUCCESS_MSG="Payment Successful, Order Placed";
    private static final String FAILURE_MSG="Payment Failed, Order not Placed";
    @Autowired
    private OrdersRepository repository;
    @Autowired
    private RestTemplate template;

    @Override
    public TransactionResponse saveOrders(TransactionRequest request) {
        Orders orders = request.getOrders();
        Payment payment = request.getPayment();
        payment.setOrderId(orders.getId());
        payment.setAmount(orders.getPrice());
        Payment response = template.postForObject("http://PAYMENTS-APP:8000/payments",payment,Payment.class);
        String msg = response.getPaymentStatus().equalsIgnoreCase("Success") ? SUCCESS_MSG : FAILURE_MSG;
        repository.save(orders);
        return new TransactionResponse(orders,response.getTransactionId(),response.getAmount(),msg);
    }

}
