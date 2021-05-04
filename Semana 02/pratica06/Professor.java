package com.company;

public class Professor {
    String Nome = "Alex";
    String curso= "TI";
    int cpf, salario, listaAlunos;

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
