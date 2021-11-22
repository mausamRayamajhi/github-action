package com.mausam.jpabuddy.repo;

import com.mausam.jpabuddy.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}