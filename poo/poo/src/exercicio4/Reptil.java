package exercicio4;

public class Reptil extends Animal{
    private String corEscama;
    @Override
    public void locomover() {
        System.out.println("rastejando");
    }

    @Override
    public void alimentar() {
        System.out.println("comendo");
    }

    @Override
    public void emitirSom() {
        System.out.println("AAAAAAAAAAAAAAAAAA");
    }

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
}
