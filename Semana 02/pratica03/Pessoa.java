package com.company;

public class Pessoa {
    private String nome;
    private Endereço endereco;
    private String numero;


    public Pessoa(String nome, String numero, Endereço endereco) {
        this.nome = nome;
        this.numero = numero;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereço getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereço endereco) {
        this.endereco = endereco;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Endereço consultarEndereco(Endereço endereco){
        this.endereco =  endereco;
        return endereco;
    }
    public String consultaNome(String nome)
    {
        this.nome = nome;
        return nome;
    }

}
