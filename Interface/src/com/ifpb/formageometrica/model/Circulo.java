package com.ifpb.formageometrica.model;

public class Circulo implements AreaCalculavel, Comparable<AreaCalculavel> {
    private double raio;

    public Circulo(double raio){this.raio=raio;}

    public double getRaio() {return raio;}

    public void setRaio(double raio) {this.raio = raio;}


    @Override
    public double calcularArea() {
        return (raio*raio)*3.14;
    }

    @Override
    public int compareTo(AreaCalculavel o) {
        double temp = calcularArea() - o.calcularArea();

    }
}

