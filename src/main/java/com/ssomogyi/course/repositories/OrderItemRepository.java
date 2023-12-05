package com.ssomogyi.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ssomogyi.course.entities.OrderItem;
import com.ssomogyi.course.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
