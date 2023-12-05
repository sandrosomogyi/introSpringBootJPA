package com.ssomogyi.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ssomogyi.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
