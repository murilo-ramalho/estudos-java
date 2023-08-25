package Pong;

import java.awt.*;

public class Enemy {
    private double x,y,width,height;
    private float dificuldade;
    public void tick(){
        setY(getY()+(Game.ball.getY() - getY()-19)*getDificuldade());
    }
    public void render(Graphics g){
        g.setColor(Color.red);
        g.fillRect((int) getX(), (int) getY(), (int) getWidth(), (int) getHeight());
    }
    public Enemy(int x, int y,int width,int height,float dificuldade){
        setX(x);
        setY(y);
        setWidth(width);
        setHeight(height);
        setDificuldade(dificuldade);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public float getDificuldade() {
        return dificuldade;
    }

    public void setDificuldade(float dificuldade) {
        if (dificuldade == 1f) this.dificuldade = 0.08f;
        else if (dificuldade == 2f) this.dificuldade = 0.04f;
        else if (dificuldade == 3f) this.dificuldade = 0.2f;
    }
}
