package com.projects.customers.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.projects.customers.api.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
