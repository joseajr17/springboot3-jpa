package com.joseantonio.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joseantonio.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}