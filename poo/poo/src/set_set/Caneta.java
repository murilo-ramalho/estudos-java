package set_set;

public class Caneta {

    //atributos
    private String modelo;
    private float ponta;
    private String cor;
    private boolean tampada;

    //construtor, inicia na instancia da classe, não usa void
    public Caneta(String modelo, float ponta, String cor, boolean tampada) {
        setModelo(modelo);
        setCor(cor);
        setPonta(ponta);
        setTampada(tampada);
    }

    // get e set
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getPonta() {
        return ponta;
    }

    public void setPonta(float ponta) {
        this.ponta = ponta;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    // estado - is
    public boolean isTampada() {
        return tampada;
    }

    public void setTampada(boolean tampada) {
        this.tampada = true;
    }
    public void status(){
        System.out.println("modelo "+ getModelo());
        System.out.println("cor " + getCor());
        System.out.println("ponta "+ getPonta());
        if (isTampada()){
            System.out.println("não dá, está tampada");
        } else {
            System.out.println("rasbiscando");
        }
    }
}
