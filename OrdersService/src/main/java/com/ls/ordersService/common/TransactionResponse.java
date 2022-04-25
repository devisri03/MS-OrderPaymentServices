package com.ls.ordersService.common;

import com.ls.ordersService.entity.Orders;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TransactionResponse {
    private Orders orders;
    private String transactionId;
    private Integer amount;
    private String message;
}
