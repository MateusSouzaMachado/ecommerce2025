package com.senai.ecommerce.repository;

import com.senai.ecommerce.entities.OrdemItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrdemItemRepository extends JpaRepository<OrdemItem,Long> {
}
