package com.example.orderservice.service;

import com.example.orderservice.model.Order;
import com.example.orderservice.model.OrderRequest;
import com.example.orderservice.model.Product;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class OrderService {

    private final ProductServiceClient productServiceClient;


    public Order createOrder(OrderRequest request) {

        //fetch product info
        Product product = productServiceClient.
                getProductById(request.getProductId());

        // Create and return the order
        Order order = new Order();
        order.setId(1L);
        order.setQuantity(request.getQuantity());
        order.setProductId(product.getId());
        order.setProductPrice(product.getPrice());
        order.setProductName(product.getName());

        return order;
    }
}
