package com.company;

public class Produto {
    private long codigo;
    private String nome;

    public Produto(String nome, long codigo)
    {
        this.nome = nome;
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
