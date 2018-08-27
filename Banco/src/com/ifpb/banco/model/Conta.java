package com.ifpb.banco.model;

public abstract class Conta {
    private int numero;
    private String titular;
    private float saldo;

    public Conta(int numero, String titular, float saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }

    public int getNumero() {return numero;}

    public void setNumero(int numero) { this.numero = numero;}

    public String getTitular() {return titular;}

    public void setTitular(String titular) {this.titular = titular;}

    public float getSaldo() {return saldo;}

    public void setSaldo(float saldo) {this.saldo = saldo;}
}
