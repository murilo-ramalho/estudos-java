package exercicio4;

public class Main {
    public static void main(String[] args){
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();
        Kanguru k = new Kanguru();
        Cachorro c = new Cachorro();
        Cobra cc = new Cobra();
        Tartaruga t = new Tartaruga();
        Goldfish g = new Goldfish();
        Arara aa = new Arara();

        m.setPeso(35.3f);
        m.setCorPelo("marrom");
        m.alimentar();
        m.locomover();
        m.emitirSom();

        a.locomover();
        p.locomover();
        p.locomover();
    }
}
