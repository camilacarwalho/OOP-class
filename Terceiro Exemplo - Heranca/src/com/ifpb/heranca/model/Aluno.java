package com.ifpb.heranca.model;

import java.time.LocalDate;

public class Aluno extends Pessoa {

    private int matricula;
    private float notas[];

    public Aluno(String cpf, String nome, LocalDate nascimento, int matricula, float... notas) {
        super (cpf, nome, nascimento);
        this.matricula = matricula;
        this.notas = notas;
    }


    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public float[] getNotas(){return notas;}

    public void setNotas(float[] notas){
        this.notas = notas;
    }

    //Sobrescrever
    @Override
    public void imprimirObjeto(){
        System.out.println("Nome: "+getNome());
        System.out.println("Cpf: "+getCpf());
        System.out.println("Matricula: "+matricula);
       }
}
