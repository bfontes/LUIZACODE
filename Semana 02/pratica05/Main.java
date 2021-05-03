package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
	//criando um cliente
	Pessoa clienteBia = new Pessoa("bia", "12345","rua bia");
	Pessoa clienteJoao = new Pessoa("joao", "617089", "rua joao");
	Pessoa clienteAna = new Pessoa("ana", "435676", "rua ana");


	//criando uma conta
	Conta contaBia = new Conta(123456,"Bia", 100);
	Conta contaJoao = new Conta(123456,"Joao", 200);
	Conta contaAna = new Conta(123456,"Ana", 300);

	//adicionar os valores das contas nas pessoas
	clienteBia.setConta(contaBia);
	clienteJoao.setConta(contaJoao);
	clienteAna.setConta(contaAna);

	/*
	//adicionando os valores os atributos de pessoa
	cliente.setNome("Bia");
	cliente.setEndereco("Machado de Assis");
	cliente.setCpf("707123");
	cliente.setConta(contaBia);
	 */


	//pessoa bia realiza o saque;
	boolean BiapodeSacar = clienteBia.getConta().sacar(10);
	if(BiapodeSacar == true) {
		System.out.println("Saque realizado com sucesso");
	}
	else {
		System.out.println("Saldo indisponível");
	}

	//pessoa joao tranfere pra pessoa ana
		System.out.println("Informe o valor da transferencia: ");
	    double valor = sc.nextInt();
		boolean JoaopodeSacar =  clienteJoao.getConta().sacar(valor);
		if(JoaopodeSacar == true) {
			System.out.println("Saque realizado com sucesso");
			clienteAna.getConta().transferencia(valor);
		}
		else {
			System.out.println("Saldo indisponível");
		}

		//pessoa ana realiza saque
		boolean AnapodeSacar = clienteJoao.getConta().sacar(10);
		if(AnapodeSacar == true) {
			System.out.println("Saque realizado com sucesso");
		}
		else {
			System.out.println("Saldo indisponível");
		}

		//imprimir os valores
		System.out.printf("A %s tem saldo %.2f\n", clienteBia.getNome(), clienteBia.getConta().getSaldo());
		System.out.printf("O %s tem saldo %.2f\n", clienteJoao.getNome(), clienteJoao.getConta().getSaldo());
		System.out.printf("A %s tem saldo %.2f\n", clienteAna.getNome(), clienteAna.getConta().getSaldo());

	/*
	//imprimir os valores
		if(podeSacar == true)
		{
			System.out.printf("A cliente %s tem o cpf %s \n", cliente.getNome(), cliente.getCpf());
			System.out.println("O saldo da conta eh: "+ cliente.getConta().getSaldo());
		}
		else
		{
			System.out.println("Ta liso visse...");
		}
	 */


	/*
	conta.setDono("Taina");
	conta.setNumero(123456);
	conta.setSaldo(70);

	System.out.println(conta.sacar(10));
	System.out.println(conta.getSaldo());
	 */
    }
}
