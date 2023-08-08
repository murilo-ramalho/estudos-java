package janela.src;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        FrmCalcular form = new FrmCalcular();
        JFrame frame = new JFrame("Calculadora");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(form.panel);
        frame.setSize(500,500);
        frame.setVisible(true);
    }
}