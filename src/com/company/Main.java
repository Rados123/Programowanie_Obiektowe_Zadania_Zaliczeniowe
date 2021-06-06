package com.company;

public class Main {

    public static void main(String[] args) {

        Ksztalt kwadrat = new Kwadrat(5);
        System.out.println("Powierzchnia Ksztaltu to: " + kwadrat.obliczPowierzchnie());
        Ksztalt kolo = new Kolo(5);
        System.out.println("Powierzchnia Ksztaltu to: " + kolo.obliczPowierzchnie());
        //W wynikach podanych w zadaniu wartość koła wynosi 2 zamiast 5, zdecydowałem się kierować poleceniem.

    }
}
abstract class Ksztalt {
    public abstract double obliczPowierzchnie();
    public abstract double obliczObwod();
}
class Kwadrat extends Ksztalt {
    double dlugoscBoku;
    public Kwadrat(double dlugoscBoku) {
        this.dlugoscBoku = dlugoscBoku;
    }
    public double obliczPowierzchnie() {
        return dlugoscBoku * dlugoscBoku;
    }
    public double obliczObwod() {
        return dlugoscBoku * 4;
    }
}
class Kolo extends Ksztalt {
    private final double dlugoscR;
    public Kolo(double dlugoscR) {
        this.dlugoscR = dlugoscR;
    }
    public double obliczPowierzchnie() {
        return Math.PI * dlugoscR * dlugoscR;
    }
    public double obliczObwod() {
        return 2 * Math.PI * dlugoscR;
    }
}


