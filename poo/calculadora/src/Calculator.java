import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator {
    private JTextField txtVisor;
    private JButton btnClear;
    private JButton btn0;
    private JButton btnResult;
    private JButton btnDiv;
    private JButton btn1;
    private JButton btn2;
    private JButton btn3;
    private JButton btnMulti;
    private JButton btn4;
    private JButton btn5;
    private JButton btn6;
    private JButton btnSub;
    private JButton btn7;
    private JButton btn8;
    private JButton btn9;
    private JButton btnAd;
    private JPanel panel;
    private Double valor;
    private String operacao;
    public JPanel getPanel(){
        return this.panel;
    }

    public Calculator(){
        //BOTÕES DE NÚMERO
        btn0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtVisor.setText(txtVisor.getText()+"0");
            }
        });
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtVisor.setText(txtVisor.getText()+"1");
            }
        });
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtVisor.setText(txtVisor.getText()+"2");
            }
        });
        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtVisor.setText(txtVisor.getText()+"3");
            }
        });
        btn4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtVisor.setText(txtVisor.getText()+"4");
            }
        });
        btn5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtVisor.setText(txtVisor.getText()+"5");
            }
        });
        btn6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtVisor.setText(txtVisor.getText()+"6");
            }
        });
        btn7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtVisor.setText(txtVisor.getText()+"7");
            }
        });
        btn8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtVisor.setText(txtVisor.getText()+"8");
            }
        });
        btn9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtVisor.setText(txtVisor.getText()+"9");
            }
        });
        //BOTÃO DE LIMPAR
        btnClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtVisor.setText("");
                operacao = "";
                valor = null;
            }
        });
        //BOTÕES DE OPERAÇÃO
        btnAd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                valor = Double.valueOf(txtVisor.getText());
                operacao = "+";
                txtVisor.setText("");
            }
        });
        btnSub.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                valor = Double.valueOf(txtVisor.getText());
                operacao = "-";
                txtVisor.setText("");
            }
        });
        btnDiv.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                valor = Double.valueOf(txtVisor.getText());
                operacao = "/";
                txtVisor.setText("");
            }
        });
        btnMulti.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                valor = Double.valueOf(txtVisor.getText());
                operacao = "*";
                txtVisor.setText("");
            }
        });
        //BOTÃO DE RESULTADO
        btnResult.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Double resultant;
                switch (operacao){
                    case "+":
                        resultant = valor + Double.valueOf(txtVisor.getText());
                        txtVisor.setText(String.valueOf(resultant));
                        break;
                    case "-":
                        resultant = valor - Double.valueOf(txtVisor.getText());
                        txtVisor.setText(String.valueOf(resultant));
                        break;
                    case "/":
                        resultant = valor / Double.valueOf(txtVisor.getText());
                        txtVisor.setText(String.valueOf(resultant));
                        break;
                    case "*":
                        resultant = valor * Double.valueOf(txtVisor.getText());
                        txtVisor.setText(String.valueOf(resultant));
                        break;
                }
            }
        });
    }
}
