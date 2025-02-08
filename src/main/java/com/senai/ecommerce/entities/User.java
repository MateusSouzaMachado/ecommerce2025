package com.senai.ecommerce.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
@Table(name = "tb_user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String phone;
    private LocalDate birthDate;
    private String password;
    private String roles;

}
