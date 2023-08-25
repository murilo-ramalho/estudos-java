package Pong;

import java.awt.*;
import java.util.Random;

public class Ball{
    private double x,y,width,height,dx,dy,speed;
    public void tick(){
        setX(getX()+getDx()*getSpeed());
        setY(getY()+getDy()*getSpeed());

        if (getY()+getDy()*getSpeed() + getHeight() >= Game.height) setDy(getDy()*-1);
        else if (getY()+getDy()*getSpeed() + getHeight() < 0) setDy(getDy()*-1);
        if (getX() >= Game.height*2){
            new Game();
            return;
        } else if (getX() < 0) {
            new Game();
            return;
        }
        Rectangle rec = new Rectangle((int) (getX()+getDx()*getSpeed()), (int) (getY()+getDy()*getSpeed()), (int) getWidth(), (int) getHeight());
        Rectangle recPlayer = new Rectangle(Game.player.getX(),Game.player.getY(),Game.player.getWidth(),Game.player.getHeight());
        Rectangle recEnemy = new Rectangle((int) Game.enemy.getX(), (int) Game.enemy.getY(), (int) Game.enemy.getWidth(), (int) Game.enemy.getHeight());

        if (rec.intersects(recPlayer)){
            int angle = new Random().nextInt(120-45)+46;
            setDx(Math.cos(Math.toRadians(angle)));
            setDy(Math.cos(Math.toRadians(angle)));
            setDx(getDx()*-1);
        }
        else if (rec.intersects(recEnemy)){
            int angle = new Random().nextInt(120-45)+46;
            setDx(Math.cos(Math.toRadians(angle)));
            setDy(Math.cos(Math.toRadians(angle)));
            setDx(getDx()*-1);
        }
    }
    public void render(Graphics g){
        g.setColor(Color.yellow);
        g.fillRect((int) getX(), (int) getY(), (int) getWidth(), (int) getHeight());
    }
    public Ball(int x, int y, int width, int height, float speed){
        setX(x);
        setY(y);
        setWidth(width);
        setHeight(height);
        setSpeed(speed);

        int angle = new Random().nextInt(120-45)+46;
        setDx(Math.cos(Math.toRadians(angle)));
        setDy(Math.cos(Math.toRadians(angle)));
    }

    public double getDx() {
        return dx;
    }

    public void setDx(double dx) {
        this.dx = dx;
    }

    public double getDy() {
        return dy;
    }

    public void setDy(double dy) {
        this.dy = dy;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
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
}
