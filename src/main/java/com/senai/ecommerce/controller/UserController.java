//package com.senai.ecommerce.controller;
//
//import com.senai.ecommerce.dtos.UserDTO;
//import com.senai.ecommerce.service.UserService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/api/user")
//public class UserController {
//
//    @Autowired
//    private UserService userService;
//
//    @GetMapping
//    public ResponseEntity<List<UserDTO>> getAllUsers() {
//        List<UserDTO> list = userService.findAll();
//        return ResponseEntity.ok(list);
//    }
//
//    @GetMapping(value = "/{id}")
//    public ResponseEntity<UserDTO> getUserById(@PathVariable Long id){
//        UserDTO userDTO = userService.findById(id);
//        return ResponseEntity.ok(userDTO);
//    }
//
//    @PostMapping
//    public ResponseEntity<UserDTO> createUser(@RequestBody UserDTO userDTO){
//        UserDTO user = userService.create(userDTO);
//        return ResponseEntity.ok(user);
//    }
//
//    @PutMapping(value = "/{id}")
//    public ResponseEntity<UserDTO> updateUser(@PathVariable Long id, @RequestBody UserDTO userDTO){
//        UserDTO user = userService.update(id,userDTO);
//        return ResponseEntity.ok(user);
//    }
//
//    @DeleteMapping(value = "/{id}")
//    public ResponseEntity<Void> deleteUser(@PathVariable Long id){
//        UserDTO user = userService.delete(id);
//        return ResponseEntity.noContent().build();
//    }
//}
