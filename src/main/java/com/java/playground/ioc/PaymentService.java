package com.java.playground.ioc;

/**
 * Interface PaymentService qui définit les méthodes de base pour les services de paiement.
 * Les classes qui implémentent cette interface peuvent fournir différentes implémentations
 * de processus de paiement (par exemple, PayPal, carte de crédit, etc.).
 */
public interface PaymentService {

    /**
     * Méthode pour effectuer un paiement.
     * @param amount Le montant à payer.
     * @return Le résultat du paiement, souvent sous forme de confirmation ou de reçu.
     */
    String pay(double amount);

    /**
     * Méthode pour annuler un paiement.
     * @param transactionId L'identifiant de la transaction à annuler.
     * @return Le résultat de l'annulation, indiquant si elle a réussi ou non.
     */
    boolean cancelPayment(String transactionId);
}
