//package com.senai.ecommerce.controller;
//
//import com.senai.ecommerce.dtos.OrdemItemDTO;
//import com.senai.ecommerce.service.OrdemItemSevice;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/api/ordemItem")
//public class OrdemItemController {
//
//    @Autowired
//    private OrdemItemSevice ordemItemSevice;
//
//    @GetMapping
//    public ResponseEntity<List<OrdemItemDTO>> getAllOrdemItem(){
//        List<OrdemItemDTO> list = ordemItemSevice.findAll();
//        return ResponseEntity.ok(list);
//    }
//
//    @GetMapping(value = "/{id}")
//    public ResponseEntity<OrdemItemDTO> getOrdemItemById(@PathVariable Long id){
//        OrdemItemDTO ordemItemDTO = ordemItemSevice.findById(id);
//        return ResponseEntity.ok(ordemItemDTO);
//    }
//
//    @PostMapping
//    public ResponseEntity<OrdemItemDTO> createOrdemItem(@RequestBody OrdemItemDTO ordemItemDTO){
//        OrdemItemDTO ordemItem = ordemItemSevice.create(ordemItemDTO);
//        return ResponseEntity.ok(ordemItem);
//    }
//
//    @PutMapping(value = "/{id}")
//    public ResponseEntity<OrdemItemDTO> updateOrdemItem(@PathVariable Long id, @RequestBody OrdemItemDTO ordemItemDTO){
//        OrdemItemDTO ordemItem = ordemItemSevice.update(id,ordemItemDTO);
//        return ResponseEntity.ok(ordemItem);
//    }
//
//    @DeleteMapping(value = "/{id}")
//    public ResponseEntity<Void> deleteOrdemItem(@PathVariable Long id){
//        OrdemItemDTO ordemItem = ordemItemSevice.delete(id);
//        return ResponseEntity.noContent().build();
//    }
//
//}
