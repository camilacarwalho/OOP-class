package com.ifpb.heranca.model;

import java.util.Arrays;

public class Turma {
    private Professor professor;
    private Aluno[] alunos;
    private String disciplina;
    private int quantidade;

    public Turma(Professor professor, String disciplina){
        this.professor = professor;
        this.disciplina = disciplina;
        this.alunos = new Aluno[40];
        quantidade=0;
    }
    public boolean addAluno(Aluno aluno){
        if(quantidade<alunos.length){
            alunos[quantidade++]=aluno;
            return true;
        }else{
            return false;
        }
    }
    public Aluno[] getAlunos(){
        return Arrays.copyOfRange(alunos,0,quantidade);

    }

    public Professor getProfessor() {
        return professor;
    }


    public String getDisciplina() {
        return disciplina;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
