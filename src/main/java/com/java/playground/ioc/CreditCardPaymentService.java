package com.java.playground.ioc;


import org.springframework.stereotype.Service;

@Service
public class CreditCardPaymentService implements PaymentService {

    @Override
    public String pay(double amount) {
        // Logique de traitement du paiement par carte de crédit
        System.out.println("Processing credit card payment for amount: " + amount);
        return "Transaction successful. Amount: " + amount;
    }

    @Override
    public boolean cancelPayment(String transactionId) {
        // Logique d'annulation de la transaction
        System.out.println("Cancelling payment with transaction ID: " + transactionId);
        return true;  // Supposons que l'annulation est toujours réussie pour simplifier
    }
}