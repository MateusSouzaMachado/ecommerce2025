package com.senai.ecommerce.service;

import com.senai.ecommerce.dtos.PaymentDTO;
import com.senai.ecommerce.entities.Payment;
import com.senai.ecommerce.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PaymentService {

    @Autowired
    private PaymentRepository paymentRepository;

    @Transactional(readOnly = true)
    public List<PaymentDTO> findAll(){
        return paymentRepository.findAll().stream().map(payment -> new PaymentDTO(payment.getId(),payment.getMoment())).toList();
    }


    public PaymentDTO create(PaymentDTO paymentDTO) {
        Payment payment = new Payment();

        payment.setMoment(paymentDTO.getMoment());
        payment =paymentRepository.save(payment);
        paymentDTO = new PaymentDTO(payment.getId(),payment.getMoment());

        return paymentDTO;
    }

    public PaymentDTO findById(Long id) {
        Payment payment = new Payment();
        payment = paymentRepository.findById(id).orElseThrow(() -> new RuntimeException("Payment not found"));
        return new PaymentDTO(payment.getId(),payment.getMoment());
    }

    public PaymentDTO update(Long id, PaymentDTO paymentDTO) {
        Payment payment = new Payment();
        payment = paymentRepository.findById(id).orElseThrow(() -> new RuntimeException("Payment not found"));
        payment.setMoment(paymentDTO.getMoment());
        paymentRepository.save(payment);
        return new PaymentDTO(payment.getId(),payment.getMoment());
    }

    public PaymentDTO delete(Long id) {
        Payment payment = new Payment();
        payment = paymentRepository.findById(id).orElseThrow(() -> new RuntimeException("Payment not found"));
        paymentRepository.delete(payment);
        return new PaymentDTO(payment.getId(),payment.getMoment());
    }
}
