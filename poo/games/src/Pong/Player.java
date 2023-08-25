package Pong;

import java.awt.*;

public class Player {
    private boolean up, down;
    private int x,y;
    private int width, height;
    public Player(int xx, int yy, int width,int height){
        setX(xx);
        setY(yy);
        setWidth(width);
        setHeight(height);
    }
    public void tick(){
        if (isUp()) setY(getY()-1);
        else if (isDown()) setY(getY()+1);

        if (getY()+getHeight() > Game.height) setY(Game.height - getHeight());
        else if (getY()<0) setY(0);
    }
    public void render(Graphics g){
        g.setColor(Color.BLUE);
        g.fillRect(getX(),getY(),getWidth(),getHeight());
    }

    public boolean isUp() {
        return up;
    }

    public void setUp(boolean up) {
        this.up = up;
    }

    public boolean isDown() {
        return down;
    }

    public void setDown(boolean down) {
        this.down = down;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
