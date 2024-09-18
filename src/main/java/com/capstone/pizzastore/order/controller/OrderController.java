package com.capstone.pizzastore.order.controller;

import com.capstone.pizzastore.order.domain.CustomerOrder;
import com.capstone.pizzastore.order.model.CustomerOrderDto;
import com.capstone.pizzastore.order.model.OrderCreateRequest;
import com.capstone.pizzastore.order.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders")
@RequiredArgsConstructor
public class OrderController {

    private final OrderService orderService;

    @PostMapping("/create")
    public ResponseEntity<CustomerOrder> createOrder(@RequestBody OrderCreateRequest orderCreateRequest) {
        CustomerOrder orderCreateResponse =
                orderService.createOrder(orderCreateRequest);
        return ResponseEntity.ok(orderCreateResponse);
    }
}
