package com.senai.ecommerce.controller;

import com.senai.ecommerce.dtos.CategoryDTO;
import com.senai.ecommerce.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/category")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    public ResponseEntity<List<CategoryDTO>> getAllCategories(){
        List<CategoryDTO> list = categoryService.findAll();
        return ResponseEntity.ok(list);
    }
}
