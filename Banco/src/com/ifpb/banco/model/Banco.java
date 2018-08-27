package com.ifpb.banco.model;

public class Banco {
    private Conta[] contas;
    //gets,sets,cadastro...
    public void aplicarTributos(Tributavel t){
        t.aplicarTributos();
    }
}
