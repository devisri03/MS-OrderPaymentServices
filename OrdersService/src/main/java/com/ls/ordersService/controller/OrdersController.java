package com.ls.ordersService.controller;

import com.ls.ordersService.common.TransactionRequest;
import com.ls.ordersService.common.TransactionResponse;
import com.ls.ordersService.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/orders")
public class OrdersController {
    @Autowired
    private OrdersService service;

    @PostMapping
    public TransactionResponse bookOrders(@RequestBody TransactionRequest request){
        return service.saveOrders(request);
    }
}
