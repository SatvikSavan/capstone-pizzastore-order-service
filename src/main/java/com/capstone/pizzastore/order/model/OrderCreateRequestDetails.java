package com.capstone.pizzastore.order.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderCreateRequestDetails {

    private Long itemId;
    private String itemName;
    private int quantity;
    private String category;
}
