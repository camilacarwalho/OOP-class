package com.ifpb.exemplo.model;

import com.ifpb.exemplo.exceptions.LimiteExcedidoException;
import com.ifpb.exemplo.exceptions.SaldoInsuficienteException;
import com.ifpb.exemplo.exceptions.ValorNegativoException;

public class ContaCorrente {
    private int numero;
    private String titular;
    private double saldo;


    public ContaCorrente(int numero, String titular) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = 0;
    }

    public boolean sacar(double valor) throws ValorNegativoException, SaldoInsuficienteException{
        if (valor<=0){
            throw new ValorNegativoException("O valor não pode ser"+" negativo ou zero.");
        }
        if (valor>saldo){
            throw new SaldoInsuficienteException("O valor não pode ser"+" maior que o saldo da conta.");
        }
        saldo-=valor;
        return true;
    }
    public boolean depositar(double valor) throws ValorNegativoException, LimiteExcedidoException {
        if (valor<=0){
            throw new ValorNegativoException("O valor não pode ser"+" negativo ou zero.");
        }
        if (valor>5000){
            throw new LimiteExcedidoException("O valor não ser" + " maior que o estabelecido para sua conta");
        }
        saldo+=valor;
        return true;
    }
    public boolean transferir(ContaCorrente outra, double valor) throws ValorNegativoException, SaldoInsuficienteException, LimiteExcedidoException{
        if(sacar(valor)){
            outra.depositar(valor);
            return true;
        }
        return false;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }
}
