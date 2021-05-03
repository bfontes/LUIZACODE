package com.company;

public class Main {

    public static void main(String[] args) {
        //instanciando um objeto pessoa
        Pessoa pessoa = new Pessoa("bia", 19, "ba21k");

        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());
        System.out.println(pessoa.getCnh());

    }
}
