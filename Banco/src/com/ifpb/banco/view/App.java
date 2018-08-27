package com.ifpb.banco.view;


import com.ifpb.banco.model.Conta;
import com.ifpb.banco.model.Corrente;
import com.ifpb.banco.model.Poupanca;
import com.ifpb.banco.model.Salario;

public class App {
    public static void main(String[] args) {
        Salario salario = new Salario(12,"Camiula",555f,59,545f);
        salario.aplicarTributos();
      }

}
