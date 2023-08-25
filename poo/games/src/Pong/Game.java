package Pong;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;

import static java.lang.Thread.sleep;

public class Game extends Canvas implements Runnable, KeyListener {
    private static final int scale = 2;
    public static int width = 320*scale, height = 180*scale;
    public BufferedImage layer = new BufferedImage(width,height,BufferedImage.TYPE_INT_RGB);
    public static Player player;
    public static Enemy enemy;
    public static Ball ball;

    public Game(){
        this.setPreferredSize(new Dimension(width,height));
        this.addKeyListener(this);
        player = new Player(30,100,10,50);
        enemy = new Enemy(width-40,100,10,50,2f);
        ball = new Ball(200,100,5,5,5);
    }
    public static void main(String[] args){
        //_________janela_______________
        Game game = new Game();
        JFrame frame = new JFrame("pong");
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(game);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        new Thread(game).start();
    }
    public void tick(){
        player.tick();
        enemy.tick();
        ball.tick();
    }
    public void render(){
        BufferStrategy bs = this.getBufferStrategy();
        if (bs == null){
            this.createBufferStrategy(3);
            return;
        }
        Graphics g = layer.getGraphics();
        g.setColor(Color.black);
        g.fillRect(0,0,width,height);
        player.render(g);
        enemy.render(g);
        ball.render(g);

        g = bs.getDrawGraphics();
        g.drawImage(layer,0,0,width,height,null);
        bs.show();
    }

    @Override
    public void run() {
        while (true){
            requestFocus();
            tick();
            render();
            try {
                sleep(1000/60);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_W) player.setUp(true);
        else if (e.getKeyCode() == KeyEvent.VK_S) player.setDown(true);
    }
    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_W) {
            player.setUp(true);
        } else if (e.getKeyCode() == KeyEvent.VK_S) {
            player.setDown(true);
        }
    }
    @Override
    public void keyReleased(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_W) {
            player.setUp(false);
        } else if (e.getKeyCode() == KeyEvent.VK_S) {
            player.setDown(false);
        }
    }
}
