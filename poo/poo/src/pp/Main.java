package pp;

public class Main {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.modelo = "bic";
        c1.cor = "azul";
        c1.ponta = 0.5f;
        c1.carga = 50;
        c1.tampada = false;
        c1.status();

        Caneta c2 = new Caneta();
        c2.modelo = "4 pontas";
        c2.cor = "preto";
        c2.ponta = 1.5f;
        c2.carga = 20;
        c2.tampar();
        c2.status();
        c2.rabiscar();
    }
}