package exercicio2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //ArrayList<ContaBanco> contas = new ArrayList<>();
        ContaBanco conta = new ContaBanco();

        boolean c = true;
        while (c) {
            System.out.println("voce pode escolher essa opções");
            System.out.println("1 - abrir conta");
            System.out.println("2 - fechar conta");
            System.out.println("3 - depositar");
            System.out.println("4 - sacar");
            System.out.println("5 - pagar mensalidade");
            System.out.println("6 - ver status");
            System.out.println("7 - sair");
            Scanner opcaoSelecionada = new Scanner(System.in);
            int opcao = opcaoSelecionada.nextInt();

            if (opcao == 1) {
                System.out.println("faça seu cadastro:");
                Scanner criarConta = new Scanner(System.in);

                System.out.println("tipo de conta \n cc - conta corrente \n cp - conta poupança");
                String tipo = criarConta.next();

                System.out.println("seu nome: ");
                String nome = criarConta.next();

                conta.abrirConta(tipo, nome);
            }else if (opcao == 2) {
                if (conta.getSaldo() > 0) {
                    System.out.println("você ainda tem saldo!");
                } else {
                    conta.fecharConta();
                    System.out.println("conta fechada");
                }
            } else if (opcao == 3) {
                if (conta.isStatus() == true) {
                    System.out.println("digite o quanto você deseja depositar: ");
                    Scanner A = new Scanner(System.in);
                    float deposito = A.nextFloat();
                    conta.depositar(deposito);

                    System.out.println("seu saldo é de: R$" + conta.getSaldo());
                } else {
                    System.out.println("sua conta ainda não foi aberta!");
                }
            } else if (opcao == 4) {
                if (conta.getSaldo()<=0 && conta.isStatus() == true){
                    System.out.println("Você não tem saldo");
                } else {
                    System.out.println("digite o quanto deseja sacar: R$");
                    Scanner A = new Scanner(System.in);
                    float saque = A.nextFloat();
                    conta.sacar(saque);
                }
            } else if (opcao == 5){
                System.out.println("você precisa pagar a mensalidade desse mês! \n R$12 para conta corrente \n R$20 para conta poupança");
                System.out.println("digite qualquer tecla para confirmar:");
                Scanner A = new Scanner(System.in);

                if (conta.getSaldo() > 0) conta.pagarMensalidade();
                else System.out.println("você não tem saldo");
            } else if (opcao == 6) {
                if (conta.isStatus()) System.out.println("sua conta está aberta");
                else System.out.println("sua conta não está aberta");
            } else if (opcao == 7) {
                c = false;
            } else System.out.println("descupe, essa opção não existe");
        }
    }
}
