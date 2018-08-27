package com.ifpb.exemplo.view;

import com.ifpb.exemplo.model.Turma;
import com.ifpb.exemplo.model.Aluno;

public class App {
    public static void main(String[] args) {
        Turma turma = new Turma("POO");
        Aluno aluno1 = new Aluno(1,"Teo","Eng Civil");
        Aluno aluno2 = new Aluno(2,"Camila","ADS");
        Aluno aluno3 = new Aluno(1,"Dudu","ADS");
        System.out.println(turma.addAluno(aluno1));
        System.out.println(turma.addAluno(aluno3));


    }
}
