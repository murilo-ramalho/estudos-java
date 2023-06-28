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

            switch (opcao) {
                case 1:
                    conta.abrirConta();
                    break;
                case 2:
                    conta.fecharConta();
                    break;
                case 3:
                    conta.depositar();
                    break;
                case 4:
                    conta.sacar();
                    break;
                case 5:
                    conta.pagarMensalidade();
                    break;
                case 6:
                    if (conta.isStatus()) System.out.println("sua conta está aberta");
                    else System.out.println("sua conta não está aberta");
                    break;
                case 7:
                    c = false;
                    break;
                default:
                    System.out.println("descupe, essa opção não existe");
            }
        }
    }
}
