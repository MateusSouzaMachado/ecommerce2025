package com.senai.ecommerce.service;

import com.senai.ecommerce.dtos.UserDTO;
import com.senai.ecommerce.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Transactional(readOnly = true)
    public List<UserDTO> findAll() {
        return userRepository.findAll().stream().map(user -> new UserDTO(user.getId(),user.getName(),user.getEmail(),user.getPhone(),user.getBirthDate(),user.getPassword(),user.getRoles())).toList();
    }
}
