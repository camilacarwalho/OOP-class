package com.ifpb.figurageometrica.model;

public class Triangulo extends FiguraGeometrica {
    private int base;
    private int altura;

    public Triangulo(int base, int altura){
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {return base;}

    public void setBase(int base) {this.base = base;}

    public int getAltura() {return altura;}

    public void setAltura(int altura) {this.altura = altura;}

    @Override
    public void calcularArea() {
        System.out.println("Área do Triângulo: "+((base*altura)/2));

    }
}
