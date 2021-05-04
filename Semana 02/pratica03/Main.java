package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int confirma;
        Produto produto1 = new Produto("produto01",123);
        Produto produto2 = new Produto("produto02",145);
        Compra compra = new Compra();


        System.out.printf("Entre com o seu nome: ");
        String nome= entrada.next();
        System.out.printf("\nInsira seu logradouro: ");
        String logradouro = entrada.next();
        System.out.printf("\nInsira seu número: ");
        String num = entrada.next();
        System.out.printf("\nInsira a sua cidade: ");
        String cidade = entrada.next();
        System.out.printf("\nInsira o seu estado: ");
        String estado = entrada.next();

        Endereço endereco = new Endereço("rua nelson", "natal", "rn");



    }
}
