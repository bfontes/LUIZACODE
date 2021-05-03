package com.company;

public class Conta
{
    private int numero;//atributos
    private String dono;//atributo
    private double saldo;//atributo

    public Conta(int numero, String dono, double saldo) {
        this.numero = numero;
        this.dono = dono;
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


    //get retorna o valor do atrubuto
    //set recebe o valor quando chamado e adicionar ao atrubuto quando privdo
    public boolean sacar(double valor) //método
    {
        if(valor <= this.saldo)
        {
            this.saldo = saldo - valor;
            return true;
        }
            return false;
    }
    public void transferencia(double valor)
    {
        this.saldo += valor;
    }
}
