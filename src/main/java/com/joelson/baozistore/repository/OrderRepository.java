package com.joelson.baozistore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joelson.baozistore.model.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
}