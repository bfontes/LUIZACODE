package com.company;

public class Pessoa {
    private String nome;
    private Endereço endereco;
    private String numero;


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
