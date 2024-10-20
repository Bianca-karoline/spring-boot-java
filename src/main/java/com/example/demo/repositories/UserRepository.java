package com.example.demo.repositories;

import com.example.demo.entitties.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
