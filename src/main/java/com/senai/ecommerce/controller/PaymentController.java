package com.senai.ecommerce.controller;

import com.senai.ecommerce.dtos.PaymentDTO;
import com.senai.ecommerce.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/payment")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;


    @GetMapping(value = "/{id}")
    public ResponseEntity<PaymentDTO> getPaymentById(@PathVariable Long id){
        PaymentDTO paymentDTO = paymentService.findById(id);
        return ResponseEntity.ok(paymentDTO);
    }

    @GetMapping
    public ResponseEntity<List<PaymentDTO>> getAllPayments(){
        List<PaymentDTO> list = paymentService.findAll();
        return ResponseEntity.ok(list);
    }

    @PostMapping
    public ResponseEntity<PaymentDTO> createPayment(@RequestBody PaymentDTO paymentDTO){
        PaymentDTO payment = paymentService.create(paymentDTO);
        return ResponseEntity.ok(payment);
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<PaymentDTO> updatePayment(@PathVariable Long id, @RequestBody PaymentDTO paymentDTO){
        PaymentDTO payment = paymentService.update(id,paymentDTO);
        return ResponseEntity.ok(payment);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Object> deletePayment(@PathVariable Long id){
        PaymentDTO payment = paymentService.delete(id);
        return ResponseEntity.ok(payment);
    }
}
