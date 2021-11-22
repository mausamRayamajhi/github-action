package com.mausam.jpabuddy.repo;

import com.mausam.jpabuddy.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
    List<Customer> findByName(String name);

    List<Customer> findByEmail(String email);

    long countDistinctByNameIgnoreCase(String name);


}