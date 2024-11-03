package com.example.demo.repositories;

import com.example.demo.entitties.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
