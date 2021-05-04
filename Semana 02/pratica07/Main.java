package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //instanciando o objeto professor na classe
	 Professor professor = new Professor();
	   //instanciando o objeto aluna na classe
	 Aluna aluna = new Aluna();

	 Scanner sc = new Scanner(System.in);
	 System.out.println("Entre com o valor referente ao numero de aulas ministradas: ");
	 int numeroAulas = sc.nextInt();
	//chamando a função na main com o numero de aulas
	 professor.setSalarioProfessor(numeroAulas);
	 //mostrando na tela o salario do prof
	 System.out.println("O salário do prof eh: "+ professor.getSalarioProfessor());

	 //System.out.println("O "+professor.getNome()+" faz "+professor.getCurso());


    }
}
