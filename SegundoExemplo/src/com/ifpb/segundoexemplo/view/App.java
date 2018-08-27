package com.ifpb.segundoexemplo.view;

import com.ifpb.segundoexemplo.model.Aluno;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class App {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.
                ofPattern("dd/MM/yyyy");

        System.out.println("Informe o CPF:");
        String cpf = scanner.nextLine();

        System.out.println("Informe o nome:");
        String nome = scanner.nextLine();

        System.out.println("Informe a Matricula:");
        int matricula = scanner.nextInt();

        System.out.println("Informe a data de nascimento:");
        String data = scanner.nextLine();
        LocalDate nascimento = LocalDate.parse(data, formatter);

        System.out.println("Informe a primeira nota: ");
        float nota1 = scanner.nextFloat();

        System.out.println("Informe a segunda nota: ");
        float nota2 = scanner.nextFloat();


        Aluno aluno = new Aluno(cpf, nome, nascimento, nota1, nota2);

    }
}
