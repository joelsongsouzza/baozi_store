package com.joelson.baozistore.controller;

import com.joelson.baozistore.model.Order;
import com.joelson.baozistore.repository.OrderRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/orders")
public class OrderController {
    @Autowired
    private OrderRepository orderRepo;

    @PostMapping
    public Order create(@RequestBody Order order) {
        order.setId(null);
        return orderRepo.save(order);
    }

    @GetMapping
    public List<Order> findAll() {
        return orderRepo.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Order> findById(@PathVariable Long id) {
        return orderRepo.findById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
    	orderRepo.deleteById(id);
    }
}
