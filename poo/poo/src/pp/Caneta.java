package pp;

public class Caneta {
        //atributos - "o que tem"
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;

        //metodos - "o que faz"
    void status(){
        System.out.println("modelo: "+this.modelo);
        System.out.println("caneta cor: "+ this.cor);
        System.out.println("está tampada?: "+this.tampada);
        System.out.println("ponta: "+this.ponta);
        System.out.println("carga: "+this.carga);
    }
    void rabiscar(){
        if (this.tampada == true){
            System.out.println("não dá, está tampada");
        } else {
            System.out.println("rasbiscando");
        }
    }
    void tampar(){
        this.tampada = true;
    }
    void destampar(){
        this.tampada = false;
    }

}
