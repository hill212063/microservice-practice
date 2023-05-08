package com.microservice.prac.orderservice.repository;

import com.microservice.prac.orderservice.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Long> {
}
