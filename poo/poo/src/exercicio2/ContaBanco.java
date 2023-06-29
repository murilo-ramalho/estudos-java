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

    }

    public void abrirConta(String tipo, String dono){
        setTipo(tipo);
        setDono(dono);
        setNumConta(+1);
        if (tipo=="cc") setSaldo(50f);
        else setSaldo(150f);
        setStatus(true);
    }
    public void fecharConta(){
        status = false;
    }
    public void depositar(float deposito){
        setSaldo(+deposito);
    }
    public void sacar(float saque){
        setSaldo(-saque);
    }
    public void pagarMensalidade(){
        if (getTipo()=="cc"){
            setSaldo(-12f);
        } else {
            setSaldo(-20);
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
