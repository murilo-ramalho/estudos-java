package UEC;

import java.util.Random;

public class Luta {
    private Lutador desafiante, desafiado;
    private int rounds;
    private String categoria;
    private boolean aprovada;
    public void marcarluta(Lutador desafiante, Lutador desafiado){
        if (desafiado.getCategoria() == desafiante.getCategoria() && desafiado != desafiante){
            setAprovada(true);
            setDesafiado(desafiado);
            setDesafiante(desafiante);
            setCategoria(desafiante.getCategoria());
        } else {
            setAprovada(false);
            setDesafiado(null);
            setDesafiante(null);
            setCategoria(null);
        }
    }
    public void lutar(){
        if (isAprovada()){
            System.out.println(" CATEGORIA: " +getCategoria());
            System.out.println("DESAFIANTE");
            desafiante.apresentar();
            System.out.println("DESAFIADO");
            desafiado.apresentar();

            Random n = new Random();
            int vencedor = n.nextInt(3);

            switch (vencedor){
                case 0:
                    System.out.println("EMPATE!");
                    desafiado.empatarLuta();
                    desafiante.empatarLuta();
                    break;
                case 1:
                    System.out.println(desafiado.getNome()+ " Ganhou");
                    desafiado.ganharLuta();
                    desafiante.perderLuta();
                    break;
                case 2:
                    System.out.println(desafiante.getNome()+ " Ganhou!");
                    desafiante.ganharLuta();
                    desafiado.perderLuta();
                    break;
            }

        } else System.out.println("A luta NÃO pode acontecer!");
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
}
