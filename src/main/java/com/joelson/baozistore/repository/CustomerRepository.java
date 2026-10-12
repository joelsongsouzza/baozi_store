package com.joelson.baozistore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joelson.baozistore.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}