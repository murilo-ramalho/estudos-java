package com.magnolia.main;

import teste1.Spritesheet;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;

public class Game extends Canvas implements Runnable {
    private static JFrame frame;
    private Thread thread;
    private boolean isRunning;
    private BufferedImage image;
    private Spritesheet sheet;
    private BufferedImage player[];
    private int frames = 0, maxFrames = 50, curAnimatio = 0,maxAnimation =2;
    private final int height = 180;//altura
    private final int width = 320;//largura
    private final int scale = 3;

    public static void main(String[] args){
        teste1.Game game = new teste1.Game();
        //game.start();
    }
    public Game(){
        sheet = new Spritesheet("/bigodin.png");
        player = new BufferedImage[2];
        player[0] = sheet.getSpritesheet(0,0,64,64);
        player[1] = sheet.getSpritesheet(66,0,64,64);
        sheet.getSpritesheet(20,20,32,32);
        this.setPreferredSize(new Dimension(width*scale,height*scale));
        initFrame();
        image = new BufferedImage(120,120, BufferedImage.TYPE_INT_RGB);
    }
    private void initFrame() {
        frame = new JFrame("teste 1");
        frame.add(this);
        frame.setResizable(false);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    private synchronized void start(){
        thread = new Thread(this);
        isRunning = true;
        thread.start();
    }
    private synchronized void stop(){
        isRunning = false;
        try {
            thread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    private void tick(){
        frames++;
        if (frames>maxFrames) {
            frames = 0;
            curAnimatio++;
            if (curAnimatio>=maxAnimation) curAnimatio= 0;
        }
    }
    private void render(){
        BufferStrategy bs = this.getBufferStrategy();
        if (bs==null){
            this.createBufferStrategy(3);
            return;
        }
        Graphics g = image.getGraphics();
        g.setColor(new Color(0,0,0));
        g.fillRect(0,0,width,height);

        g.setColor(new Color(15, 63, 5));
        g.fillRect(0,100,width,height);

        Graphics2D g2 = (Graphics2D) g;
        // rotacionar g2.rotate(Math.toRadians(90),90+32,90+32);
        g.drawImage(player[curAnimatio],20,40,null);

        g.dispose();
        g = bs.getDrawGraphics();
        g.drawImage(image,0,0,width*scale,height*scale,null);
        bs.show();
    }
    @Override
    public void run() {
        long lastTime = System.nanoTime();
        double amontOfTicks = 60.0;
        double ns = 1000000000/amontOfTicks;
        double delta = 0;
        int frames = 0;
        double timer = System.currentTimeMillis();
        while (isRunning){
            long now = System.nanoTime();
            delta+= (now - lastTime)/ns;
            lastTime = now;

            if (delta>= 1) {
                tick();
                render();
                frames++;
                delta--;
            }

            if (System.currentTimeMillis() - timer >= 1000) {
                System.out.println("FPS: "+ frames);
                frames = 0;
                timer +=1000;
            }
        }
        stop();
    }

}