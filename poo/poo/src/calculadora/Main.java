package calculadora;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame calculadora = new JFrame("Calculadora");
        calculadora.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        calculadora.setContentPane(new Calculadora().getPanel());
        calculadora.setSize(300,400);
        calculadora.setVisible(true);
    }
}