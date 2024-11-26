package com.example.demo.repositories;

import com.example.demo.entitties.Category;
import com.example.demo.entitties.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
