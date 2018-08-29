package com.ifpb.exemplo.view;

import com.ifpb.exemplo.exceptions.LimiteExcedidoException;
import com.ifpb.exemplo.exceptions.SaldoInsuficienteException;
import com.ifpb.exemplo.exceptions.ValorNegativoException;
import com.ifpb.exemplo.model.ContaCorrente;

import javax.swing.*;

public class App {
    public static void main(String[] args)  {
        ContaCorrente contaCorrente = new ContaCorrente(134,"Camiula");
        try{
            contaCorrente.sacar(500);
        } catch (ValorNegativoException|SaldoInsuficienteException ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }


        System.out.println(contaCorrente.getSaldo());
    }
}
