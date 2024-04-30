package com.java.playground.cleancode.dry;


public class CalculatorDRY {
    // Cette méthode calcule la somme de deux entiers
    public int total(int firstOperand, int secondOperand) {
        return firstOperand + secondOperand;
    }

    // Cette méthode calcule la moyenne de deux entiers, réutilisant la méthode total pour éviter la duplication de code
    public int average(int firstOperand, int secondOperand) {
        int sum = total(firstOperand, secondOperand);
        return sum / 2;
    }
}
