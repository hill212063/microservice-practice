package com.microservice.prac.productservice.service;

import com.microservice.prac.productservice.dto.ProductRequest;
import com.microservice.prac.productservice.dto.ProductResponse;
import com.microservice.prac.productservice.model.Product;
import com.microservice.prac.productservice.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
@Slf4j
public class ProductService {

    private final ProductRepository productRepository;

    public void createProduct(ProductRequest productRequest){
        Product product = Product.builder()
                .name(productRequest.getName())
                .description(productRequest.getDescription())
                .price(productRequest.getPrice()).build();
        productRepository.save(product);
        log.info("Product {} is saved",product.getId());
    }
    private ProductResponse mapToProductResponse(Product product){
        return ProductResponse.builder()
                .id(product.getId())
                .name(product.getName())
                .description(product.getDescription())
                .price(product.getPrice()).build();
    }
    public List<ProductResponse> getAllProducts(){
        List<Product> products =productRepository.findAll();
        return products.stream().map(this::mapToProductResponse).toList();
    }
}
