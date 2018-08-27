package com.ifpb.exemplo.view;

import com.ifpb.exemplo.exceptions.SaldoInsuficienteException;
import com.ifpb.exemplo.exceptions.ValorNegativoException;
import com.ifpb.exemplo.model.ContaCorrente;

public class App {
    public static void main(String[] args)  {
        ContaCorrente contaCorrente = new ContaCorrente(134,"Camiula");
        try{
            System.out.println(contaCorrente.sacar(500));
        } catch (ValorNegativoException|SaldoInsuficienteException ex){
            ex.
        }
        contaCorrente.depositar(56);
        System.out.println(contaCorrente.getSaldo());
    }
}
