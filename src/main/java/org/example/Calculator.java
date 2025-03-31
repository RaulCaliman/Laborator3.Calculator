package org.example;

public class Calculator {
    protected double rezultat;

    public Calculator(double x) {
        this.rezultat = x;

    }
    public void adunare(double y){
        rezultat+= y;
    }
    public void scadere(double y){
        rezultat -= y;
    }
    public void inmultire(double y){
        rezultat *=y;
    }
    public void impartire(double y){
         if(y ==0){
             throw new ArithmeticException();
         }
    }
    public double getRezultat(){
        return rezultat;
    }
}
