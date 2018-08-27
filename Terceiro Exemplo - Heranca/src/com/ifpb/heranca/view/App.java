package com.ifpb.heranca.view;

import com.ifpb.heranca.model.Aluno;
import com.ifpb.heranca.model.Pessoa;
import com.ifpb.heranca.model.Professor;
import com.ifpb.heranca.model.TecnicoAdministrativo;
import com.ifpb.heranca.model.Turma;

import java.time.LocalDate;

public class App {
    public static void main(String[] args){
       Professor prof = new Professor("111.111.111-01","Maria",LocalDate.now(),1,1000,"POO");
       Aluno aluno = new Aluno("222.222.222-02","Camiula",LocalDate.now(),222,5.3f,45,5.7f);

       prof.imprimirObjeto();
       aluno.imprimirObjeto();
    }
}
