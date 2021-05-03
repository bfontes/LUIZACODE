package com.company;
import  java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);

	    int codigo, quantidade;
	    double total;

        System.out.println("Entre com o código do seu pedido: ");
        codigo = sc.nextInt();

        System.out.println("Entre com a quantidade do seu pedido: ");
        quantidade = sc.nextInt();

        switch (codigo)
        {
            case 100:
                total = quantidade * 1.20;
                System.out.printf("Você pediu cachorro quente, e seu pedido foi %.2f", total);
                break;
            case 101:
                total = quantidade * 1.30;
                System.out.printf("Voce pediu um bauru simples, e seu pedido foi %.2f, ", total);
                break;
            case 102:
                total = quantidade * 1.50;
                System.out.printf("Voce pediu um bauru simples, e seu pedido foi %.2f, ", total);
                break;
            case 103:
                total = quantidade * 1.20;
                System.out.printf("Voce pediu um hambúrguer, e seu pedido foi %.2f, ", total);
                break;
            default:
                System.out.println("codigo não encontrado ou invalido");
        }
    }
}
