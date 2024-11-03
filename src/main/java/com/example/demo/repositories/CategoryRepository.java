package com.example.demo.repositories;

import com.example.demo.entitties.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
