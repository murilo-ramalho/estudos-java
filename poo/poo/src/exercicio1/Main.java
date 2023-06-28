package exercicio1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("ola, quer criar uma conta?");
        System.out.println("1 - para sim \n2 - já tenho");

        Scanner opcaoSelecionada = new Scanner(System.in);
        int opcao = opcaoSelecionada.nextInt();
        escolha(opcao);
    }

    private static void escolha(int opcao) {
        if(opcao == 1){
            System.out.println("ok, escolha seu tipo de conta: ");
            System.out.println("1 - poupança\n2 - corrente\n");

            Scanner opcaoSelecionada = new Scanner(System.in);
            int opcao2 = opcaoSelecionada.nextInt();
            Conta conta = new Conta(opcao2);
        } else {
            System.out.println("ok, boa tarde");
        }
    }
}
