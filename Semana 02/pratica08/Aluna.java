package com.company;

public class Aluna {
    String Nome;
    int nota1, nota2;
    double media;
    public String getNome() {
        return this.Nome;
    }

    public void setNome(String nome) {
        this.Nome = nome;
    }

    public int getNota1() {
        return this.nota1;
    }

    public void setNota1(int nota1) {
        this.nota1 = nota1;
    }

    public int getNota2() {
        return this.nota2;
    }

    public void setNota2(int nota2) {
        this.nota2 = nota2;
    }

    public double getMedia() {
        return ((this.nota1 + this.nota2)/2);
    }
}
