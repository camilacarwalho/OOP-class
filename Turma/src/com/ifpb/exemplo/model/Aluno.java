package com.ifpb.exemplo.model;

import java.util.Objects;


/**
 *A classe aluno modela a entidade aluno do domínio da aplicação.
 * <b>oi</b>
 * <img src="https://cdn.shopify.com/s/files/1/0344/6469/products/New-Cute-Pet-Cat-Costume-Cartoon-Funny-Pet-Cat-Clothes-Hot-Puppy-Clothing-Doctor-Uniform-Hat_copy_1024x1024.jpg?v=1504800100"  alt="cat">
 * @author Camila Carvalho
 * @see java.util.Stack
 */

public class Aluno {
    private int matricula;
    private String nome;
    private String curso;

    public Aluno(int matricula, String nome, String curso) {
        this.matricula = matricula;
        this.nome = nome;
        this.curso = curso;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "matricula=" + matricula +
                ", nome='" + nome + '\'' +
                ", curso='" + curso + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return matricula == aluno.matricula;
    }

    @Override
    public int hashCode() {

        return Objects.hash(matricula);
    }
}
