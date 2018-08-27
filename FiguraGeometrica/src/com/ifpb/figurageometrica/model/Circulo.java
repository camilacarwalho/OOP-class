package com.ifpb.figurageometrica.model;

public class Circulo extends FiguraGeometrica {
    private int raio;

    public Circulo(int raio){this.raio=raio;}

    public int getRaio() {return raio;}

    public void setRaio(int raio) {this.raio = raio;}

    @Override
    public void calcularArea() {
        System.out.println("Área do Cículo: "+((raio*raio)*3.14));
    }
}
