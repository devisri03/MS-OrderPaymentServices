package com.ls.paymentsService.service;

import com.ls.paymentsService.entity.Payments;
import com.ls.paymentsService.repository.PaymentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Random;
import java.util.UUID;

@Service
public class PaymentsServiceImpl implements PaymentsService {
    @Autowired
    private PaymentsRepository repository;

    @Override
    public Payments makePayments(Payments payments) {
        payments.setTransactionId(UUID.randomUUID().toString());
        payments.setPaymentStatus(paymentProcessing());
        return repository.save(payments);
    }

    @Override
    public Payments getPaymentByOrderId(Long orderId) {
        Payments payments = repository.findById(orderId).orElseThrow(() -> new RuntimeException("NOT_FOUND"));
        return payments;
    }

    private String paymentProcessing(){
        return new Random().nextBoolean()?"Success":"Failure";
    }
}
