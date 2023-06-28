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

    public void abrirConta(String tipo, String dono){
        this.tipo = tipo;
        this.dono = dono;
        this.numConta++;
        if (tipo=="cc") this.saldo = 50.00f;
        else this.saldo = 150.00f;
        this.status = true;
    }
    public void fecharConta(){
        status = false;
    }
    public void depositar(float deposito){
        setSaldo(this.saldo + deposito);
    }
    public void sacar(float saque){
        setSaldo(this.saldo-saque);
    }
    public void pagarMensalidade(){
        if (this.tipo=="cc"){
            setSaldo(this.saldo-12f);
        } else {
            setSaldo(this.saldo-20);
        }
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
