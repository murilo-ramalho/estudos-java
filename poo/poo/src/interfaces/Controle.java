package interfaces;

public class Controle implements Controlador{
    private int volume;
    private boolean ligado;
    private boolean tocando;
    @Override
    public void ligar() {
        this.setLigado(true);
    }
    @Override
    public void desligar() {
        this.setLigado(false);
    }
    @Override
    public void abrirMenu() {
        System.out.println("ligado: "+this.isLigado());
        System.out.println("tocando: "+this.isTocando());
        System.out.println("volume: "+this.getVolume());
        for (int i =0;i <= this.getVolume(); i+=5){
            System.out.print("|");
        }
    }
    @Override
    public void fecharMenu() {
        System.out.println("fechando");
    }
    @Override
    public void maisVolume() {
        if (isLigado())this.setVolume(this.getVolume()+5);
    }

    @Override
    public void menosVolume() {
        if (isLigado())this.setVolume(this.getVolume()-5);
    }

    @Override
    public void ligarMudo() {
        if (this.isLigado() && this.getVolume() > 0) this.setVolume(0);
    }

    @Override
    public void desligarMudo() {
        if (this.isLigado() && this.getVolume() == 0) this.setVolume(50);
    }

    @Override
    public void play() {
        if (this.isLigado() && !(this.isTocando())) this.setTocando(true);
    }

    @Override
    public void pause() {
        if (this.isLigado() && this.isTocando()) this.setTocando(false);
    }

    public Controle() {
        this.setLigado(false);
        this.setTocando(false);
        this.setVolume(50);
    }

    private int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    private boolean isLigado() {
        return ligado;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private boolean isTocando() {
        return tocando;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }
}
