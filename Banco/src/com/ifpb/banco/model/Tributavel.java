package com.ifpb.banco.model;

public interface Tributavel {
    void aplicarTributos();

    default void aplicarTributos() {
        System.out.println("default");
    }
}
