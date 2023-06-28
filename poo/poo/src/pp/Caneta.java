package pp;

public class Caneta {
        //atributos - "o que tem"
    private String modelo;
    private String cor;
    private float ponta;
    protected int carga;
     protected boolean tampada;

        //metodos - "o que faz"
    void status(){
        System.out.println("modelo: "+this.modelo);
        System.out.println("caneta cor: "+ this.cor);
        System.out.println("está tampada?: "+this.tampada);
        System.out.println("ponta: "+this.ponta);
        System.out.println("carga: "+this.carga);
    }
    public void rabiscar(){
        if (this.tampada == true){
            System.out.println("não dá, está tampada");
        } else {
            System.out.println("rasbiscando");
        }
    }
    private void tampar(){
        this.tampada = true;
    }
    private void destampar(){
        this.tampada = false;
    }

}
