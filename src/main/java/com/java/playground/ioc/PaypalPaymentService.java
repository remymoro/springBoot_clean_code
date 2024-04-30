package com.java.playground.ioc;


import org.springframework.stereotype.Service;

@Service
public class PaypalPaymentService implements PaymentService {


    @Override
    public String pay(double amount) {
        return "";
    }

    @Override
    public boolean cancelPayment(String transactionId) {
        return false;
    }
}
