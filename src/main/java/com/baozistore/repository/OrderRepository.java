package com.baozistore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.baozistore.model.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
}