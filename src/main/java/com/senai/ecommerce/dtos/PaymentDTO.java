package com.senai.ecommerce.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.Instant;
@AllArgsConstructor
@Data
public class PaymentDTO {

    private Long id;
    private Instant moment;


}
