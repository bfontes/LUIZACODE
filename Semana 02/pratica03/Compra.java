package com.company;

public class Compra {
    private Pessoa pessoa;
    private Produto produto;

    public void Comprar(Pessoa pessoa, Produto produto){
        this.pessoa = pessoa;
        this.produto = produto;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public void comprar(Pessoa pessoa, Produto produto) {
        System.out.printf("\nVocê adicionou o produto %s no carrinho: ", pessoa.getNome(), produto.getNome());

    }

    public void verificarCompra(boolean confirmar) {
        if (confirmar == true) {
            System.out.printf("\nCompra realizada");;
        } else {
            System.out.printf("\nCompra nao efetuada");;
        }
    }
}
