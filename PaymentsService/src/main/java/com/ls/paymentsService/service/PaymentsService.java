package com.ls.paymentsService.service;

import com.ls.paymentsService.entity.Payments;
import org.springframework.stereotype.Service;

@Service
public interface PaymentsService {
    Payments makePayments(Payments payments);
    Payments getPaymentByOrderId(Long orderId);
}
