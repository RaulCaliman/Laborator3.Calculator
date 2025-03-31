package org.example;

public class AdvancedCalc extends Calculator {
    public AdvancedCalc(double x) {
        super(x);
    }
    public void radical(int x) {
        if(x <0){
            throw new ArithmeticException("Nu se poate radical din numere negative");
        }

            rezultat = Math.sqrt(rezultat);

    }
    public void exponenti(int x) {
        if (rezultat == 0 && x < 0) {
            throw new ArithmeticException("Nu se poate ridica 0 la un exponent negativ.");
        }
        rezultat = Math.pow(x, rezultat);
    }

}
