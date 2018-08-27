package com.ifpb.formageometrica.model;

public interface AreaCalculavel extends Comparable<AreaCalculavel> {
    double calcularArea();
    @Override
    default int compareTo(AreaCalculavel o){
        double temp
    }
}

