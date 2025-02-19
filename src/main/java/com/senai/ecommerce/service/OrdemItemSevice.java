package com.senai.ecommerce.service;

import com.senai.ecommerce.dtos.OrdemItemDTO;
import com.senai.ecommerce.repository.OrdemItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class OrdemItemSevice {

    @Autowired
    private OrdemItemRepository ordemItemRepository;

    @Transactional(readOnly = true)
    public List<OrdemItemDTO> findAll() {
        return ordemItemRepository.findAll().stream().map(ordemItem -> new OrdemItemDTO(ordemItem.getQuantity(),ordemItem.getPrice())).toList();
    }
}
