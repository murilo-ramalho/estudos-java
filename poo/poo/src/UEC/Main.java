package UEC;
/*

        exemplo de agregação

*/
public class Main {
    public static void main(String[] args){
        Lutador lutadores[] = new Lutador[6];
        Luta luta = new Luta();

        lutadores[0] = new Lutador("pretty boy","França",31,1.75f,68.9f,11,2,1);
        lutadores[1] = new Lutador("puscript","Brasil",29,1.68f,68.9f,11,2,1);
        lutadores[2] = new Lutador("snapshadow","EUA", 35,1.65f,80.9f,12,2,1);
        lutadores[3] = new Lutador("dead code","autralia", 28, 1.93f,81.6f,13,0,1);
        lutadores[4] = new Lutador("ufocobol", "Brasil",37,1.70f,119.3f,5,4,3);
        lutadores[5] = new Lutador("nerdart", "eua",30,1.81f,105.7f,12,2,4);

        luta.marcarluta(lutadores[0],lutadores[1]);
        luta.lutar();
    }
}
