package com.senai.ecommerce.dtos;

import com.senai.ecommerce.entities.OrderStatus;
import lombok.Data;

import java.time.Instant;

@Data
public class OrderDTO {

    private Long id;
    private Instant moment;
    private OrderStatus status;

    public OrderDTO(Long id, Instant moment, OrderStatus status) {
    }
}
