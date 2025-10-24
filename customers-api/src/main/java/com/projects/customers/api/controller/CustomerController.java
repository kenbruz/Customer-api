package com.projects.customers.api.controller;


import com.projects.customers.api.model.Customer;
import com.projects.customers.api.repository.CustomerRepository;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {


    private final CustomerRepository repository;

    public CustomerController(CustomerRepository repository) {
        this.repository = repository;
    }

    // Create a new customer
    @PostMapping
    public Customer addCustomer(@RequestBody Customer customer) {
        return repository.save(customer);
    }
}
