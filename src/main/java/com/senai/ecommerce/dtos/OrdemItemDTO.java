package com.senai.ecommerce.dtos;

import lombok.Data;

@Data
public class OrdemItemDTO {
    private int quantity;
    private double price;

    public OrdemItemDTO(int quantity, double price) {
    }
}
