package com.senai.ecommerce.dtos;

import lombok.Data;

import java.time.LocalDate;

@Data
public class UserDTO {
    private Long id;
    private String name;
    private String email;
    private String phone;
    private LocalDate birthDate;
    private String password;
    private String roles;

    public UserDTO(Long id, String name, String email, String phone, LocalDate birthDate, String password, String roles) {
    }
}
