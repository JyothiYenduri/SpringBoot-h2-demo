package com.example.springbooth2integration.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springbooth2integration.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
