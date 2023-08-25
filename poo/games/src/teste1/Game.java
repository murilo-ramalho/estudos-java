package teste1;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;

public class Game extends Canvas implements Runnable {
    private static JFrame frame;
    private Thread thread;
    private boolean isRunning;
    private final BufferedImage image;
    private Spritesheet sheet;
    private final BufferedImage[] player_walk;
    private final BufferedImage[] player_idle;
    private final BufferedImage[] player_ataque;
    private int frames = 0, maxFrames = 7, curAnimatio = 0,maxAnimation = 6;
    private int frames1 = 0, maxFrames1 = 7, curAnimatio1 = 0,maxAnimation1 = 11;
    private int frames2 = 0, maxFrames2 = 7, curAnimatio2 = 0,maxAnimation2 = 4;
    private final int height = 180;//altura
    private final int width = 180;//largura
    private final int scale = 3;

    public static void main(String[] args){
        Game game = new Game();
        game.start();
    }
    public Game(){
        sheet = new Spritesheet("/asset_bigodin.png");
        sheet.getSpritesheet(20,20,32,32);
        player_walk = new BufferedImage[6];
            player_walk[0] = sheet.getSpritesheet(0,64,64,64);
            player_walk[1] = sheet.getSpritesheet(64,64,64,64);
            player_walk[2] = sheet.getSpritesheet(128,64,64,64);
            player_walk[3] = sheet.getSpritesheet(192,64,64,64);
            player_walk[4] = sheet.getSpritesheet(256,64,64,64);
            player_walk[5] = sheet.getSpritesheet(320,64,64,64);

        player_idle = new BufferedImage[11];
            player_idle[0] = sheet.getSpritesheet(0,0,64,64);
            player_idle[1] = sheet.getSpritesheet(64,0,64,64);
            player_idle[2] = sheet.getSpritesheet(0,128,64,64);
            player_idle[3] = sheet.getSpritesheet(64,128,64,64);
            player_idle[4] = sheet.getSpritesheet(128,128,64,64);
            player_idle[5] = sheet.getSpritesheet(192,128,64,64);
            player_idle[6] = sheet.getSpritesheet(256,128,64,64);
            player_idle[7] = sheet.getSpritesheet(320,128,64,64);
            player_idle[8] = sheet.getSpritesheet(0,192,64,64);
            player_idle[9] = sheet.getSpritesheet(64,192,64,64);
            player_idle[10] = sheet.getSpritesheet(128,192,64,64);

        player_ataque = new BufferedImage[4];
            player_ataque[0] = sheet.getSpritesheet(0,128,64,64);
            player_ataque[1] = sheet.getSpritesheet(64,128,64,64);
            player_ataque[2] = sheet.getSpritesheet(128,128,64,64);
            player_ataque[3] = sheet.getSpritesheet(192,128,64,64);

        this.setPreferredSize(new Dimension(width*scale,height*scale));
        initFrame();
        image = new BufferedImage(120,120, BufferedImage.TYPE_INT_RGB);
    }
    private void initFrame() {
        frame = new JFrame("teste 1");
        frame.add(this);
        frame.setResizable(true);
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
        frames1++;
        frames2++;
        if (frames>maxFrames) {
            frames = 0;
            curAnimatio++;
            if (curAnimatio>=maxAnimation) curAnimatio= 0;
        }
        if (frames1>maxFrames1){
            frames1=0;
            curAnimatio1++;
            if (curAnimatio1>=maxAnimation1) curAnimatio1= 0;
        }
        if (frames2>maxFrames2){
            frames2=0;
            curAnimatio2++;
            if (curAnimatio2>=maxAnimation2) curAnimatio2= 0;
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
        g.fillRect(0,0,width,height*scale);

        g.setColor(new Color(15, 63, 5));
        g.fillRect(0,100,width*scale,height);

        Graphics2D g2 = (Graphics2D) g;
        // rotacionar g2.rotate(Math.toRadians(90),90+32,90+32);
        g.drawImage(player_walk[curAnimatio],0,40,null);
        g.drawImage(player_idle[curAnimatio1], 40,40,null);
        //g.drawImage(player_ataque[curAnimatio2], 60,40,null);

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
                //System.out.println("FPS: "+ frames);
                frames = 0;
                timer +=1000;
            }
        }
        stop();
    }

}
