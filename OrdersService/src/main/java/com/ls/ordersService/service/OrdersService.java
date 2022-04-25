package com.ls.ordersService.service;

import com.ls.ordersService.common.TransactionRequest;
import com.ls.ordersService.common.TransactionResponse;
import com.ls.ordersService.entity.Orders;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface OrdersService {
    TransactionResponse saveOrders(TransactionRequest request);

   // List<TransactionResponse> getAllOrderDetails();
}
