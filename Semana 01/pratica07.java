package com.company;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> names = new ArrayList<>();

        for(int i=0; i<5; i++)
        {
            System.out.println("Entre com o nome: ");
            String nome = sc.nextLine();
            names.add(nome);
        }
        for(int i=4; i>=0; i--)
        {
            System.out.println(names.get(i));
        }

    }
}

