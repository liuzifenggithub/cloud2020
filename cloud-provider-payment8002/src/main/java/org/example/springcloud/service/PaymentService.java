package org.example.springcloud.service;


import org.example.springcloud.entities.Payment;

public interface PaymentService {
    public int save(Payment payment);
    public Payment getPaymentById(Long id);
}
