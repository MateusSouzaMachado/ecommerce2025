package com.senai.ecommerce.controller;
//
//import com.senai.ecommerce.dtos.CategoryDTO;
//import com.senai.ecommerce.service.CategoryService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/api/category")
//public class CategoryController {
//
//    @Autowired
//    private CategoryService categoryService;
//
//    @GetMapping
//    public ResponseEntity<List<CategoryDTO>> getAllCategories(){
//        List<CategoryDTO> list = categoryService.findAll();
//        return ResponseEntity.ok(list);
//    }
//
//    @GetMapping(value = "/{id}")
//    public ResponseEntity<CategoryDTO> getCategoryById(@PathVariable Long id){
//        CategoryDTO categoryDTO = categoryService.findById(id);
//        return ResponseEntity.ok(categoryDTO);
//    }
//
//    @PostMapping
//    public  ResponseEntity<CategoryDTO> createCategory(@RequestBody CategoryDTO categoryDTO){
//        CategoryDTO category = categoryService.create(categoryDTO);
//        return ResponseEntity.ok(category);
//    }
//
//    @PutMapping(value = "/{id}")
//    public ResponseEntity<CategoryDTO> updateCategory(@PathVariable Long id, @RequestBody CategoryDTO categoryDTO){
//        CategoryDTO category = categoryService.update(id,categoryDTO);
//        return ResponseEntity.ok(category);
//    }
//
//    @DeleteMapping(value = "/{id}")
//    public ResponseEntity<Void> deleteCategory(@PathVariable Long id){
//        CategoryDTO category = categoryService.delete(id);
//        return ResponseEntity.noContent().build();
//    }
//
//
//}
