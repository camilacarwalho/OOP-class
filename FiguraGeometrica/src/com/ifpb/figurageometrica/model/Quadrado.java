package com.ifpb.figurageometrica.model;

public class Quadrado extends FiguraGeometrica {
    private int lado;

    public Quadrado(int lado){this.lado = lado;}

    public int getLado() {return lado;}

    public void setLado(int lado){this.lado = lado;}

    @Override
    public void calcularArea() {
        System.out.println("Área do Quadrado: "+(lado*lado));

    }
}
