package exercicio1;

import java.util.Scanner;

public class Conta {
    public Conta(int opcao2) {
        if (opcao2 == 1){
            System.out.println("preenchar seus dados:");

            System.out.println("seu nome: ");
            Scanner dados = new Scanner(System.in);
            String nome = dados.next();

            System.out.println("seu CPF: ");
            String cpf = dados.next();

            System.out.println("seu cidade: ");
            String cidade = dados.next();

            System.out.println("sua senha: ");
            String senha = dados.next();

            ContaPoupanca contaPoupanca = new ContaPoupanca(nome,cpf,cidade,senha);
        } else if (opcao2 == 2){
            System.out.println("preenchar seus dados:");

            System.out.println("seu nome: ");
            Scanner dados = new Scanner(System.in);
            String nome = dados.next();

            System.out.println("seu CPF: ");
            String cpf = dados.next();

            System.out.println("seu cidade: ");
            String cidade = dados.next();

            System.out.println("sua senha: ");
            String senha = dados.next();

            ContaPoupanca contaCorrente = new ContaPoupanca(nome,cpf,cidade,senha);
        } else System.out.println("opção invalida, por favor digite novamente");
    }
}
