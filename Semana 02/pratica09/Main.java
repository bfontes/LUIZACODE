package com.company;

public class Main {

    public static void main(String[] args) {
        //Criando funcionarios do banco
        Funcionario funcionarioA = new Funcionario();
        Gerente gerenteA = new Gerente();

        //Criando um funcionario
        funcionarioA.setNome("Joao");
        funcionarioA.setCpf("123.456.978-12");
        funcionarioA.setSalario(1234.00);
        funcionarioA.setSenha(9876);

        //Imprimindo informações do funcionário
        // acessando pelo método que foi criado
        boolean funcionarioAutorizado = funcionarioA.autentica(9876);
        if (funcionarioAutorizado == true) {
            funcionarioA.verInfor();
        }

        //Criando um gerente
        gerenteA.setNome("Bia");
        gerenteA.setCpf("123.456.789-11");
        gerenteA.setSalario(5570.8);
        gerenteA.setSenha(1322);
        gerenteA.setNumeroDeFuncionariosGerenciados(4);

        //Imprimindo informações da gerente
        // acessando pelo método que foi criado
        boolean gerenteAutorizado = gerenteA.autentica(9876);
        if (gerenteAutorizado == true) {
            gerenteA.verInfor();
        }
    }
}