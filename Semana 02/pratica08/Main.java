package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //instanciando o objeto professor na classe
	 Professor professor = new Professor();
	   //instanciando o objeto aluna na classe
	 Aluna aluna = new Aluna();

	 Scanner sc = new Scanner(System.in);
	 /*
	 System.out.println("Entre com o valor referente ao numero de aulas ministradas: ");
	 int numeroAulas = sc.nextInt();

	//chamando a função na main com o numero de aulas
	 professor.setSalarioProfessor(numeroAulas);

	 //mostrando na tela o salario do prof
	 System.out.println("O salário do prof eh: "+ professor.getSalarioProfessor());
	  */

	//pedindo pra entrar com o nome da aluna
		System.out.println("Entre com o nome da aluna: ");
		String nome = sc.nextLine();

		System.out.println("Entre com o valor da nota 1: ");
		int nota1 = sc.nextInt();

		System.out.println("Entre com o valor da nota 2: ");
		int nota2 = sc.nextInt();
		//chamando o nome da aluna
		aluna.setNome(nome);
		//chamando as notas
		aluna.setNota1(nota1);
		aluna.setNota2(nota2);
		System.out.println("A "+aluna.getNome()+" tem "+aluna.getMedia()+" de media");

	}
}
