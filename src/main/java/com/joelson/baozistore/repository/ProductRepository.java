package com.joelson.baozistore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joelson.baozistore.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}