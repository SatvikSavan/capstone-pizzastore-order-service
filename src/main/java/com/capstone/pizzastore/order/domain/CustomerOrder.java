package com.capstone.pizzastore.order.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;

import java.time.Instant;
import java.util.List;

@Entity
@Builder
@Data
public class CustomerOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderId;
    private Long customerId;
    @CreatedDate
    private Instant orderDate;
    private List<OrderItem> orderItems;
    private OrderStatus orderStatus;
    private Long totalAmount;
    private PaymentStatus paymentStatus;
}
