package com.capstone.pizzastore.order.model;

import com.capstone.pizzastore.order.domain.OrderItem;
import com.capstone.pizzastore.order.domain.OrderStatus;
import com.capstone.pizzastore.order.domain.PaymentStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.util.List;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerOrderDto {

    private Long orderId;
    private Long customerId;
    private Instant orderDate;
    private List<OrderItem> orderItems;
    private OrderStatus orderStatus;
    private Long totalAmount;
    private PaymentStatus paymentStatus;
}
