package com.senai.ecommerce.controller;

import com.senai.ecommerce.dtos.OrdemItemDTO;
import com.senai.ecommerce.service.OrdemItemSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/ordemItem")
public class OrdemItemController {

    @Autowired
    private OrdemItemSevice ordemItemSevice;

    public ResponseEntity<List<OrdemItemDTO>> getAllOrdemItem(){
        List<OrdemItemDTO> list = ordemItemSevice.findAll();
        return ResponseEntity.ok(list);
    }
}
