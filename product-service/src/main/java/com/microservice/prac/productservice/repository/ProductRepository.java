package com.microservice.prac.productservice.repository;

import com.microservice.prac.productservice.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductRepository extends JpaRepository<Product,String> {

}
