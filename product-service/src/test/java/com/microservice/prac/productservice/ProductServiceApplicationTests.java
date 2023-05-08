package com.microservice.prac.productservice;

import com.microservice.prac.productservice.dto.ProductRequest;
import com.microservice.prac.productservice.repository.ProductRepository;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.DynamicPropertyRegistry;
import org.springframework.test.context.DynamicPropertySource;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.testcontainers.containers.PostgreSQLContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;
import org.testcontainers.shaded.com.fasterxml.jackson.core.JsonProcessingException;
import org.testcontainers.shaded.com.fasterxml.jackson.databind.ObjectMapper;

import java.math.BigDecimal;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@Testcontainers
@AutoConfigureMockMvc
class ProductServiceApplicationTests {
	// NOT YET WORK!!!!!!!!!!!
//	@Container
//	static PostgreSQLContainer postgreSQLContainer = new PostgreSQLContainer();
//	@Autowired
//	private MockMvc mockMvc;
//	@Autowired
//	private ObjectMapper objectMapper;
//	@Autowired
//	private ProductRepository productRepository;
//	@DynamicPropertySource
//	static void setProperties(DynamicPropertyRegistry dynamicPropertyRegistry){
//		dynamicPropertyRegistry.add("spring.datasource.url",postgreSQLContainer::getJdbcUrl);
//		dynamicPropertyRegistry.add("spring.datasource.username",postgreSQLContainer::getUsername);
//		dynamicPropertyRegistry.add("spring.datasource.password",postgreSQLContainer::getPassword);
//
//	}
//
//
//	@Test
//	void shouldCreateProduct() throws Exception {
//		ProductRequest productRequest = getProductRequest();
//		String product_str = objectMapper.writeValueAsString(productRequest);
//		mockMvc.perform(MockMvcRequestBuilders.post("/v1/api/product")
//				.contentType(MediaType.APPLICATION_JSON)
//				.content(product_str))
//				.andExpect(status().isCreated());
//		Assertions.assertEquals(1, productRepository.findAll().size());
//	}
//
//	private ProductRequest getProductRequest(){
//		return ProductRequest.builder()
//				.name("vivo1906")
//				.description("vivo phone")
//				.price(BigDecimal.valueOf(2000)).build();
//	}


}
