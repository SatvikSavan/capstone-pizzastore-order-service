package com.capstone.pizzastore.order.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderItemDto {
    private Long itemId;
    private String itemName;
    private Integer quantity;
    private boolean isAvailable;
    private Long price;
}
