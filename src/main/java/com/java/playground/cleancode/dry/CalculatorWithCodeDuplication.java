package com.java.playground.cleancode.dry;

public class CalculatorWithCodeDuplication {
    // Cette méthode calcule la somme de deux entiers
    public int total(int firstOperand, int secondOperand) {
        return firstOperand + secondOperand;
    }

    // Cette méthode calcule la moyenne de deux entiers
    public int average(int firstOperand, int secondOperand) {
        int sum = firstOperand + secondOperand;
        return sum / 2;
    }
}
