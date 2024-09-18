package com.capstone.pizzastore.order.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderCreateRequest {

    private List<OrderCreateRequestDetails> orderCreateRequestDetailsList;
}
