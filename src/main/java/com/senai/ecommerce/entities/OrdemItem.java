package com.senai.ecommerce.entities;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "tb_ordem_item")
public class OrdemItem {
    @EmbeddedId
    private OrdemItemPK id = new OrdemItemPK();

    private int quantidty;
    private double price;
}
