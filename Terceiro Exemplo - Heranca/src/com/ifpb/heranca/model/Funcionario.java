package com.ifpb.heranca.model;

import java.time.LocalDate;
        //Herda atributos de Pessoa
public abstract class Funcionario extends Pessoa {
        private float salario;
        public Funcionario(String cpf, String nome, LocalDate nascimento, float salario){
            super(cpf,nome,nascimento);
            this.salario = salario;
        }
        //Getters and Setters
        public float getSalario(){return salario;}

        public void setSalario(float salario){this.salario = salario;}
}
