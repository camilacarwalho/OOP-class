package com.ifpb.formageometrica.model;

public class Quadrado implements AreaCalculavel, Comparable<AreaCalculavel>{
    private double lado;

    public Quadrado(double lado){this.lado = lado;}

    public double getLado() {return lado;}

    public void setLado(double lado){this.lado = lado;}

    @Override
    public double calcularArea() {
        return lado*lado;
    }

    @Override
    public int compareTo(AreaCalculavel o) {
        return 0;
    }
}
