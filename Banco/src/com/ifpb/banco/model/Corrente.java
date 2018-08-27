package com.ifpb.banco.model;

public class Corrente extends Conta implements Tributavel {
    private float limite;
    private float tavaJuros;

    public Corrente(int numero, String titular, float saldo, float limite, float tavaJuros) {
        super(numero, titular, saldo);
        this.limite = limite;
        this.tavaJuros = tavaJuros;
    }
    public float getLimite() {
        return limite;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }

    public float getTavaJuros() {
        return tavaJuros;
    }

    public void setTavaJuros(float tavaJuros) {
        this.tavaJuros = tavaJuros;
    }
    @Override
    public String toString() {
        return "Corrente{" +
                "limite=" + limite +
                ", tavaJuros=" + tavaJuros +
                '}';
    }

    @Override
    public void aplicarTributos() {
        if(getSaldo()<0){
            setSaldo(getSaldo()*tavaJuros);
        }
    }
}
