package com.ifpb.segundoexemplo.model;

import java.time.LocalDate;
import java.time.Period;

public class Aluno{

    // Atributos que pertencem ao objeto

    private String cpf;
    private String nome;
    private int matricula;
    private LocalDate nascimento;
    private float nota1;
    private float nota2;
    
    //Construtor
    public Aluno(String cpf, String nome,int matricula,
                  LocalDate nascimento, float nota1, float nota2){
        this.cpf = cpf;
        this.nome = nome;
        this.matricula = matricula;
        this.nascimento = nascimento;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }
    //Getters and Setters

    public String getCpf(){
        return cpf;
    }
    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public int getMatricula(){
        return matricula;
    }
    public void setMatricula(int matricula)[
        this.matricula = matricula;
    }

    public LocalDate getNascimento(){
        return nascimento;
    }
    public void setNascimento(LocalDate nascimento){
        this.nascimento = nascimento;
    }
    
    public float getNota1(){
        return nota1;
    }
    public void setNota1(float nota1){
        this.nota1 = nota1;
    }
    
    public float getNota2(){
        return nota2;
    }
    public void setNota2(float nota2){
        this.nota2 = nota2;
    }
     public int getIdade(){
        Period period = Period.between(nascimento,
                LocalDate.now());

        return period.getYears();
    }
}
