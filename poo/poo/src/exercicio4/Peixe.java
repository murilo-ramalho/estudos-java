package exercicio4;

public class Peixe extends Animal{
    private String corEscama;
    @Override
    public void locomover() {
        System.out.println("nadando");
    }

    @Override
    public void alimentar() {
        System.out.println("comendo substancias");
    }

    @Override
    public void emitirSom() {
        System.out.println("peixe não faz som");
    }
    public void soltarBolha(){
        System.out.println("soltando bolha...");
    }

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
}
