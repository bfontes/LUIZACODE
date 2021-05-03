package com.company;

import java.util.List;
import java.util.ArrayList;
import java.util.Random;
public class Main {

    public static void main(String[] args) {
	List <Integer> valores = new ArrayList<>();
	Random r = new Random();
	int aux;

        for (int i = 0; i < 10; i++)
        {
            valores.add(r.nextInt((100-10)+1) + 10);
        }
        aux = valores.get(0);
        for (int i = 1; i < 10; i++)
        {
            if(aux < valores.get(i))
            {
                aux = valores.get(i);
            }
        }
        System.out.println("Os valores aleatórios gerados foram; "+valores);
        System.out.println("O maior inteiro dentre os aleatórios foram: "+aux);

    }
}
