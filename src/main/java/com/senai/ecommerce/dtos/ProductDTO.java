package com.senai.ecommerce.dtos;

import lombok.Data;

@Data
public class ProductDTO {

    private Long id;
    private String name;
    private double price;
    private String description;
    private String imaUrl;

    public ProductDTO(Long id, String name, double price, String description, String imaUrl) {
    }
}
