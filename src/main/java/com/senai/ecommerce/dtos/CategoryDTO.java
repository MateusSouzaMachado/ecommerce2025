package com.senai.ecommerce.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CategoryDTO {
    private Long id;
    @Size(min = 2, max = 100, message = "Name must be between 2 and 100 characters")
    @NotBlank(message = "Name is required")
    private String name;
    private List<ProductDTO> products;

    public CategoryDTO(String name, Long id) {
    }

    public void setProducts(Set<ProductDTO> products) {
        this.products = products.stream().map(product -> new ProductDTO(product.getId(),product.getName(),product.getPrice(),product.getDescription(),product.getImaUrl(),product.getCategories())).toList();
    }
}
