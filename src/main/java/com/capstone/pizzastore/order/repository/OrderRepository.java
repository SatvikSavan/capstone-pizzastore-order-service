package com.capstone.pizzastore.order.repository;

import com.capstone.pizzastore.order.domain.CustomerOrder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<CustomerOrder, Long> {
}
