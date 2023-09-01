package com.example.orderservice.service;

import com.example.orderservice.model.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "product-service", url = "http://localhost:8081")//add your appropriate port number
public interface ProductServiceClient {

    @GetMapping("/api/v1/product/{productId}")
    Product getProductById(@PathVariable("productId") String productId);
}
