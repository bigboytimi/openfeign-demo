package com.example.orderservice.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderRequest{
    private String productId;
    private int quantity;
}
