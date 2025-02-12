package com.senai.ecommerce.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.time.Instant;

@Data
@Entity
@Table(name = "tb_order_item")
public class OrdemItem {

    @EmbeddedId
    private OrdemItemPK id = new OrdemItemPK();

    private int quantity;
    private double price;
}