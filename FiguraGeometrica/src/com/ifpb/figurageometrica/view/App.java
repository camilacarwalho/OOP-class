package com.ifpb.figurageometrica.view;

import com.ifpb.figurageometrica.model.FiguraGeometrica;
import com.ifpb.figurageometrica.model.Triangulo;
import com.ifpb.figurageometrica.model.Quadrado;
import com.ifpb.figurageometrica.model.Circulo;


public class App {
    public static void main(String[] args){
        Circulo circulo = new Circulo(2);
        Triangulo triangulo = new Triangulo(2,2);
        Quadrado quadrado = new Quadrado(2);

        circulo.calcularArea();
        triangulo.calcularArea();
        quadrado.calcularArea();
    }
}
