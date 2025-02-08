package com.senai.ecommerce.repository;

import com.senai.ecommerce.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;


// Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}