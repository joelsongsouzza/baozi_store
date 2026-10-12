package com.baozistore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.baozistore.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}