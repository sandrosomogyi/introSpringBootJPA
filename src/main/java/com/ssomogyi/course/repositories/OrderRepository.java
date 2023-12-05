package com.ssomogyi.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ssomogyi.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
