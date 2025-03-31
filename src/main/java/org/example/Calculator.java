package org.example;

public class Calculator {
    protected double rezultat;

    public Calculator(double x) {
        this.rezultat = x;

    }
    public Calculator adunare(double y){
        rezultat+= y;
        return this;
    }
    public Calculator scadere(double y){
        rezultat -= y;
        return this;
    }
    public Calculator inmultire(double y){
        rezultat *=y;
        return this;
    }
    public Calculator impartire(double y){
         if(y ==0){
             throw new ArithmeticException();
         }
         rezultat /=y;
        return this;
    }
    public Calculator radical(int x) {
        if(x <0){
            throw new ArithmeticException("Nu se poate radical din numere negative");
        }

        rezultat = Math.sqrt(rezultat);
        return this;

    }
    public Calculator exponenti(int x) {
        if (rezultat == 0 && x < 0) {
            throw new ArithmeticException("Nu se poate ridica 0 la un exponent negativ.");
        }
        rezultat = Math.pow(x, rezultat);
        return this;
    }
    public double getRezultat(){
        return rezultat;
    }

}
