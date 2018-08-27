package com.ifpb.banco.model;

public class Salario extends Conta implements Tributavel{
    private int dia;
    private float salario;

    public Salario(int numero, String titular, float saldo, int dia, float salario) {
        super(numero, titular, saldo);
        this.dia = dia;
        this.salario = salario;
    }

    public int getDia() {return dia;}

    public void setDia(int dia) {this.dia = dia;}

    public float getSalario() {return salario;}

    public void setSalario(float salario) {this.salario = salario; }

    @Override
    public String toString() {
        return "Salario{" +
                "dia=" + dia +
                ", salario=" + salario +
                '}';
    }

    @Override
    public void aplicarTributos() {
        setSaldo(getSalario()*00.99f);
    }
}
