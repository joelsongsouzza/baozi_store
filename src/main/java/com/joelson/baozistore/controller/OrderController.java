package com.joelson.baozistore.controller;

import com.joelson.baozistore.model.Order;
import com.joelson.baozistore.model.Product;
import com.joelson.baozistore.repository.OrderRepository;
import com.joelson.baozistore.repository.ProductRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/orders")
public class OrderController {
    @Autowired
    private OrderRepository orderRepo;

    @Autowired
    private ProductRepository productRepo;

    @PostMapping
    public ResponseEntity<?> create(@RequestBody Order order) {
        Product product = productRepo.findById(order.getProductId()).orElse(null);

        if (product == null) {
            return ResponseEntity.badRequest().body("Produto não encontrado");
        }
        if (!product.getHasStock()) {
            return ResponseEntity.badRequest().body("Objeto não possui estoque");
        }

        order.setId(null);
        return ResponseEntity.ok(orderRepo.save(order));
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
