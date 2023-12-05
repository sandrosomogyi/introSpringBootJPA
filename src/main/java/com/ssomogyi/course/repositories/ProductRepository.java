package com.ssomogyi.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ssomogyi.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
