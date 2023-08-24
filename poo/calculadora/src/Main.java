import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame calculator;
        calculator = new JFrame("Calculator");
        calculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        calculator.setContentPane(new Calculator().getPanel());
        calculator.setSize(300,400);
        calculator.setVisible(true);
    }
}