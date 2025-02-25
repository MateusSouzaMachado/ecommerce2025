package com.senai.ecommerce.dtos;

import com.senai.ecommerce.entities.Category;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ProductDTO {

    private Long id;
    @Size(min = 2, max = 100, message = "Name must be between 2 and 100 characters")
    @NotBlank(message = "Name is required")
    private String name;
    @NotBlank(message = "Price is required")
    @Positive(message = "Price must be positive")
    private double price;
    @Size(min = 10, message = "Description must be between 2 and 500 characters")
    @NotBlank(message = "Description is required")
    private String description;
    private String imaUrl;
    @NotEmpty(message = "Categories is required")
    private List<CategoryDTO> categories;

    public ProductDTO(Long id, String name, double price, String description, String imaUrl) {
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories.stream().map(category -> new CategoryDTO(category.getName(),category.getId())).toList();
    }

    public @NotEmpty(message = "Categories is required") List<CategoryDTO> getCategories() {
        return categories;
    }
}
