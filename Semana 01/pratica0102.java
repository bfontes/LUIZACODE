package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe seu peso: ");
        float peso = sc.nextFloat();

        System.out.println("Informe sua altura: ");
        float altura = sc.nextFloat();

        double imc = (double)peso / Math.pow((double)altura, 2.0);
        System.out.println("Seu IMC é: " + imc);

        switch (imc) {
            case (imc < 19.1):
                System.out.println("Muito abaixo do peso ");
                break;
            case (imc > 19.1 && imc <= 25.8): {
                System.out.println("Abaixo do peso");
                break;
            }
            case (imc > 25.8 && imc <= 27.3): {
                System.out.println("Peso normal");
                break;
            }
            case (imc > 27.3 && imc <= 32.3): {
                System.out.print("Acima do peso");
                break;
            }
            default:
                System.out.println("ihhh");

        }
    }
}
