package com.baozistore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.baozistore.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}