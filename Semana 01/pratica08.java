package com.company;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        Scanner sc  = new Scanner(System.in);
        int codigo=0;

        names.add("Tainá");
        names.add("Stelinha");
        names.add("Tequilina");
        names.add("pituzinho");
        names.add("fofinho");

        System.out.println("Qual dos nomes abaixo vc deseja exluir da lista ? ");
        System.out.println("Código---Nome");
        for (int i = 0; i < 5; i++)
        {
            System.out.println("     "+(i+1)+"---"+names.get(i));
        }
        System.out.println("Código: ");
        codigo = sc.nextInt();

        names.remove(codigo-1);

        for (int i = 0; i < 4; i++)
        {
            System.out.println(names.get(i));
        }
    }
}
