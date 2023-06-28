package exercicio2;

import java.util.Scanner;

public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    //construtor


    public ContaBanco() {
        this.numConta = numConta;
        this.tipo = tipo;
        this.dono = dono;
        this.saldo = saldo;
        this.status = status;
    }

    public void abrirConta(){
        System.out.println("faça seu cadastro:");
        Scanner criarConta = new Scanner(System.in);

        System.out.println("tipo de conta\ncc - conta corrente\ncp - conta poupança");
        String tipo = criarConta.next();
        setDono(dono);

        System.out.println("seu nome: ");
        String nome = criarConta.next();
        setTipo(nome);

        this.numConta++;
        if (tipo=="cc") this.saldo = 50.00f;
        else this.saldo = 150.00f;
        this.status = true;
    }
    public void fecharConta(){
        if (this.saldo > 0){
            System.out.println("você ainda tem saldo!");
        } else {
            status = false;
            System.out.println("conta fechada");
        }
    }
    public void depositar(){
        if (this.status == true) {
            System.out.println("digite o quanto você deseja depositar: ");
            Scanner A = new Scanner(System.in);
            float deposito = A.nextFloat();

            setSaldo(this.saldo + deposito);
            System.out.println("seu saldo é de: R$" + getSaldo());
        } else {
            System.out.println("sua conta ainda não foi aberta!");
        }
    }
    public void sacar(){
        if (this.saldo<=0 && this.status == true){
            System.out.println("Você não tem saldo");
        } else {
            System.out.println("digite o quanto deseja sacar: R$");
            Scanner A = new Scanner(System.in);
            float sacar = A.nextFloat();

            setSaldo(this.saldo-sacar);
        }
    }
    public void pagarMensalidade(){
        System.out.println("você precisa pagar a mensalidade desse mês!\nR$12 para conta corrente\nR$20 para conta poupança");
        System.out.println("digite qualquer tecla para confirmar:");
        Scanner A = new Scanner(System.in);
        String confirmar = A.next();

        if (this.saldo > 0){
            if (this.tipo=="cc"){
                setSaldo(this.saldo-12f);
            } else {
                setSaldo(this.saldo-20);
            }
        } else System.out.println("você não tem saldo");
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
