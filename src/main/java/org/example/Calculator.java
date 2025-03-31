package org.example;

public class Calculator {
    private int rezultat;

    public Calculator(int x) {
        this.rezultat = x;

    }
    public void adunare(int y){
        rezultat+= y;
    }
    public void scadere(int y){
        rezultat -= y;
    }
    public void inmultire(int y){
        rezultat *=y;
    }
    public void impartire(int y){
         if(y ==0){
             throw new ArithmeticException();
         }
    }
    public int getRezultat(){
        return rezultat;
    }
}
