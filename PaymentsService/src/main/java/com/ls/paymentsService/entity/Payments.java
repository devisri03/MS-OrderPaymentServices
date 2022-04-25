package com.ls.paymentsService.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "payments_Tb")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Payments {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String paymentStatus;
    private String transactionId;
    private Long orderId;
    private Integer amount;
}
