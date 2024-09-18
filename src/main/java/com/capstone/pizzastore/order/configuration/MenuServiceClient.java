package com.capstone.pizzastore.order.configuration;

import com.capstone.pizzastore.order.model.ItemDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@RequiredArgsConstructor
public class MenuServiceClient {

    private final String menuServiceUrl = "http://localhost:8081/pizza-store/menu-service";

    private final RestTemplate restTemplate;

    public ItemDto getItemDetails(String itemId) {
       return restTemplate.getForObject(menuServiceUrl+"/getitem/"+itemId, ItemDto.class);
    }
}


