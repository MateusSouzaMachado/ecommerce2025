package com.senai.ecommerce.dtos;

import lombok.Data;

@Data
public class CategoryDTO {
    private Long id;
    private String name;

    public CategoryDTO(String name, Long id) {
    }
}
