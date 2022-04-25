package com.ls.paymentsService.controllers;

import com.ls.paymentsService.entity.Payments;
import com.ls.paymentsService.service.PaymentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/payments")
public class PaymentsController {
    @Autowired
    private PaymentsService service;

    @PostMapping
    public Payments makePayment(@RequestBody Payments payments){
        return service.makePayments(payments);
    }

    @GetMapping("/{orderId}")
    public Payments fetchPaymentByOrder(@PathVariable Long orderId){
        return service.getPaymentByOrderId(orderId);
    }


}
