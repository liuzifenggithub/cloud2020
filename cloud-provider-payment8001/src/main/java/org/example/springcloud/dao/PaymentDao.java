package org.example.springcloud.dao;

import org.apache.ibatis.annotations.Mapper;
import org.example.springcloud.entities.Payment;

@Mapper
public interface PaymentDao {

    public int save(Payment payment);
    public Payment getPaymentById(Long id);
}
