package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int numero=0, opcao;
     double resultado;

         do {

             System.out.println("----------MENU----------");
             System.out.println("1. Raiz quadrada");
             System.out.println("2. Metade");
             System.out.println("3. 10%");
             System.out.println("4. O dobro");
             System.out.println("5. Sair");


             System.out.println("Entre com a opção desejada :");
             opcao = sc.nextInt();

             if(opcao!=5)
             {
                 System.out.println("Entre com um número de 1 a 5: ");
                 numero = sc.nextInt();
             }
             switch(opcao)
             {
                 case 1:
                     resultado = Math.sqrt(numero);
                     System.out.printf("O resultado foi %.2f\n", resultado);
                     break;
                 case 2:
                     resultado = numero/2;
                     System.out.printf("O resultado foi %.2f\n", resultado);
                     break;
                 case 3:
                     resultado = 0.1*numero;
                     System.out.printf("O resultado foi %.2f\n", resultado);
                     break;
                 case 4:
                     resultado = 2*numero;
                     System.out.printf("O resultado foi %.2f\n", resultado);
                     break;
                 case 5:
                     System.out.println("Sair");
                     break;
                 default:
                     System.out.println("opção inválida");

             }


         }while(opcao!=5);


    }
}
