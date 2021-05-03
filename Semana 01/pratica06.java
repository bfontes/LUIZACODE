package com.company;

import java.util.List;
import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {
    List names = new ArrayList();

        names.add("bia");
        names.add("10");
        names.add("1.50");
        names.add("a");
        names.add("java");
        names.add("15");


        for(Object name: names)
        {
            System.out.println("O valor da vez eh: "+name);
        }

    }
}
