package com.joseantonio.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joseantonio.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}