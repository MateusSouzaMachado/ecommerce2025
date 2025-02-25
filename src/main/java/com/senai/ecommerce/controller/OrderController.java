package com.senai.ecommerce.controller;
//
//import com.senai.ecommerce.dtos.OrderDTO;
//import com.senai.ecommerce.service.OrderService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/api/order")
//public class OrderController {
//
//    @Autowired
//    private OrderService orderService;
//
//    @GetMapping
//    public ResponseEntity<List<OrderDTO>> getAllOrders(){
//        List<OrderDTO> list = orderService.findAll();
//        return ResponseEntity.ok(list);
//    }
//
//    @GetMapping(value = "/{id}")
//    public ResponseEntity<OrderDTO> getOrderById(@PathVariable Long id){
//        OrderDTO orderDTO = orderService.findById(id);
//        return ResponseEntity.ok(orderDTO);
//    }
//
//    @PostMapping
//    public ResponseEntity<OrderDTO> createOrder(@RequestBody OrderDTO orderDTO){
//        OrderDTO order = orderService.create(orderDTO);
//        return ResponseEntity.ok(order);
//    }
//
//    @PutMapping(value = "/{id}")
//    public ResponseEntity<OrderDTO> updateOrder(@PathVariable Long id, @RequestBody OrderDTO orderDTO){
//        OrderDTO order = orderService.update(id,orderDTO);
//        return ResponseEntity.ok(order);
//    }
//
//    @DeleteMapping(value = "/{id}")
//    public ResponseEntity<Void> deleteOrder(@PathVariable Long id){
//        OrderDTO order = orderService.delete(id);
//        return ResponseEntity.noContent().build();
//
//
//}
