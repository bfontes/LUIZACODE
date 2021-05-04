package com.company;

public class Professor {
    String Nome = "Alex";
    String curso = "TI";
    int cpf, listaAlunos;
    int ValorAula = 29;
    private int SalarioProfessor;


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

    public void setSalarioProfessor(int numeroAulas) {
       this.SalarioProfessor = this.ValorAula * numeroAulas;
    }
    public int getSalarioProfessor() {
        return SalarioProfessor;
    }
}
