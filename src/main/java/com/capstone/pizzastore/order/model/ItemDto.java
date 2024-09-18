package com.capstone.pizzastore.order.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ItemDto {

    private Long itemId;
    private String itemName;
    private String itemDescription;
    private CategoryDto category;
    private Long price;
    private boolean isAvailable;
}
