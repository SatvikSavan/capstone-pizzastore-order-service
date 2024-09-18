package com.capstone.pizzastore.order.service;

import com.capstone.pizzastore.order.configuration.MenuServiceClient;
import com.capstone.pizzastore.order.domain.CustomerOrder;
import com.capstone.pizzastore.order.domain.OrderItem;
import com.capstone.pizzastore.order.domain.OrderStatus;
import com.capstone.pizzastore.order.model.ItemDto;
import com.capstone.pizzastore.order.model.OrderCreateRequest;
import com.capstone.pizzastore.order.model.OrderCreateRequestDetails;
import com.capstone.pizzastore.order.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class OrderService {

    private final MenuServiceClient menuServiceClient;
    private final OrderRepository orderRepository;

    public CustomerOrder createOrder(OrderCreateRequest orderCreateRequest) {
        List<OrderCreateRequestDetails> orderCreateRequestDetailsList =
                orderCreateRequest.getOrderCreateRequestDetailsList();

        CustomerOrder customerOrder = CustomerOrder.builder().build();
        List<OrderItem> orderItemsList = new ArrayList<>();

        orderCreateRequestDetailsList.forEach(orderRequest -> {
            Long itemId = orderRequest.getItemId();
            ItemDto item = menuServiceClient.getItemDetails(String.valueOf(itemId));
            OrderItem orderItem = OrderItem.builder().orderItemId(itemId)
                    .price(item.getPrice()).quantity(orderRequest.getQuantity()).build();
            orderItemsList.add(orderItem);
        });
        customerOrder.setOrderItems(orderItemsList);
        customerOrder.setOrderStatus(OrderStatus.ACCEPTED);
        orderRepository.save(customerOrder);
        return customerOrder;
    }

    public CustomerOrder getOrderDetails(String orderId) {
        Optional<CustomerOrder> order = orderRepository.findById(Long.valueOf(orderId));
        if (order.isEmpty()) {
            throw new RuntimeException("INVALID ORDER ID");
        } else {
            return order.get();
        }

    }
}
