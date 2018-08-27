package com.ifpb.banco.model;

public class Poupanca extends Conta implements Tributavel{
    private int diaBase;

    public Poupanca(int numero, String titular, float saldo, int diaBase) {
        super(numero, titular, saldo);
        this.diaBase = diaBase;
    }

    public int getDiaBase() {return diaBase;}

    public void setDiaBase(int diaBase) {this.diaBase = diaBase;}

    @Override
    public String toString() {
        return "Poupanca{" +
                "diaBase=" + diaBase +
                '}';
    }

    @Override
    public void aplicarTributos() {

    }
}
