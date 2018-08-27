package com.ifpb.formageometrica.view;

import com.ifpb.formageometrica.model.AreaCalculavel;
import com.ifpb.formageometrica.model.Circulo;
import com.ifpb.formageometrica.model.Quadrado;
import com.ifpb.formageometrica.model.Triangulo;

public class App {
    public static void main(String[] args) {

        AreaCalculavel array[]={
          new Quadrado()
        }
        Circulo circulo = new Circulo(2);
        Triangulo triangulo = new Triangulo(2,2);
        Quadrado quadrado = new Quadrado(2);
        //
        AreaCalculavel c = new Quadrado(2);
        imprimir(circulo);
        }

public static void imprimir (AreaCalculavel a){

    System.out.println(a.calcularArea());}
}
