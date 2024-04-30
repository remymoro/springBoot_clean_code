package com.java.playground.cleancode.kiss;

public class SimpleMaxCalculator {
    public int findMax(int a, int b, int c) {
        return Math.max(Math.max(a, b), c);
    }
}

//Avantages de l'Approche KISS
//Facilité de compréhension : Le code simplifié est plus facile à comprendre pour quelqu'un qui n'est pas familiarisé avec le projet.
//Réduction des erreurs : Moins de code signifie généralement moins de place pour les erreurs.
//Facilité de maintenance : Avec moins de complexité, les modifications futures sont plus faciles à implémenter.
