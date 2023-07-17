package com.joseantonio.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joseantonio.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}