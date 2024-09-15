package com.capstone.pizzastore.order.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Data;

import java.time.Instant;

@Entity
@Builder
@Data
public class CustomerOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderId;
    private Long customerId;
    private Instant orderDate;
    private OrderStatus orderStatus;
    private Long totalAmount;
    private PaymentStatus paymentStatus;
}
