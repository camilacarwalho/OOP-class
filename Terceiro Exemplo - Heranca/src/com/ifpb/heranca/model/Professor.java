package com.ifpb.heranca.model;

import java.time.LocalDate;

public class Professor extends Funcionario {
    //Atributos
    private int matricula;
    private String disciplina;

    //Construtor
    public Professor(String cpf, String nome, LocalDate nascimento, int matricula,
                     float salario, String disciplina) {
        super(cpf, nome, nascimento, salario);
        this.matricula = matricula;
        this.disciplina = disciplina;
    }

    //Getters and Setters
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    //Sobrescrever
    @Override
    public void imprimirObjeto() {
        System.out.println("Nome: " + getNome());
        System.out.println("Cpf: " + getCpf());
        System.out.println("Salário: " + getSalario());
        System.out.println("Matricula: " + matricula);
        System.out.println("Disciplina: " + disciplina);
    }
}
