package com.joseantonio.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joseantonio.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}