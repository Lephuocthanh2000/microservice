package com.ThanhLe.demo.controller;

import com.ThanhLe.demo.entity.DemoEntity;
import com.ThanhLe.demo.repository.DemoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/")
public class DemoController {
    @Autowired
    DemoRepository demoRepository;

    // Get All Customers
    @GetMapping("/customers")
    List<DemoEntity> all(){
        return demoRepository.findAll();
    }

    // Get Single Customer
    @GetMapping("/customers/{id}")
    Optional<DemoEntity> findCustomer(@PathVariable Long id){
        return demoRepository.findById(id);
    }

    // Create New Customer
    @PostMapping("/customers")
    DemoEntity createCustomer (@RequestBody DemoEntity newCustomer) {
        return demoRepository.save(newCustomer);
    }

    // Update Customer Information
    @PutMapping("/customers/{id}")
    DemoEntity updateCustomer (@RequestBody DemoEntity updatedCustomer, @PathVariable Long id) {
        return demoRepository.save(updatedCustomer);
    }

    // Delete Single Customer
    @DeleteMapping ("/customers/{id}")
    void deleteCustomer(@PathVariable Long id){
        demoRepository.deleteById(id);
    }
}
