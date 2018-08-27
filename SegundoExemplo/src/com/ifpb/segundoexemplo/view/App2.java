package com.ifpb.segundoexemplo.view;

import com.ifpb.segundoexemplo.model.ContaCorrente;
import java.util.Scanner;

public class App2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ContaCorrente contacorrente = new ContaCorrente();
        int n = 0;
       //Menu
        System.out.println("1-Criar Conta \n 2-Sacar \n 3-Depositar \n 4-Transferir \n 5-Ver Saldo");
        int acesso = scanner.nextInt();
        while(n=0){
            switch(acesso){
            case 1 : contacorrente.criarconta();
                     break;
            case 2 : contacorrente.sacar();
                     break;
            case 3 : contacorrente.depositar();
                     break;
            case 4 : contacorrente.transferir();
                     break;
            case 5 : System.out.println(getSaldo);
                     break;
            default: System.out.println("Comando inválido!!"); 
            
            }        
    }
        
}

