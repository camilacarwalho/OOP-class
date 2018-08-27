package com.ifpb.heranca.model;

import java.time.LocalDate;

public class TecnicoAdministrativo extends Funcionario {
    //ATRIBUTOS
    private String setor;

    //CONSTRUTOR
    public TecnicoAdministrativo(String cpf, String nome, float salario, LocalDate nascimento, String setor) {
        super(cpf, nome, nascimento, salario);
        this.setor = setor;
    }

    //GETTERS AND SETTERS
    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    //Sobrescrever
    @Override
    public void imprimirObjeto() {
        System.out.println("Nome: " + getNome());
        System.out.println("Cpf: " + getCpf());
        System.out.println("Salário: " + getSalario());
        System.out.println("Setor: " + setor);
    }
}

