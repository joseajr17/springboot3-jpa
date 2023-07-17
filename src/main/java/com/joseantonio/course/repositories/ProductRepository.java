package com.joseantonio.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joseantonio.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}