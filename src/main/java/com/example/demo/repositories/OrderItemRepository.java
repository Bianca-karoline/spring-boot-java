package com.example.demo.repositories;

import com.example.demo.entitties.Category;
import com.example.demo.entitties.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
