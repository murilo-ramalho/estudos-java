package janela.src;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrmCalcular {
    public JPanel panel;
    private JTextField txtNum1;
    private JTextField txtNum2;
    private JButton btnEnviar;
    private JLabel lblSoma;
    private JLabel lblMult;
    private JLabel lblSub;
    private JLabel lblDiv;

    public FrmCalcular(){
        //panel = new JPanel();
        btnEnviar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Double soma, multiplicacao,subtracao,divisao;
                Double num1 = Double.valueOf(txtNum1.getText());
                Double num2 = Double.valueOf(txtNum2.getText());

                soma = num1+num2;
                multiplicacao = num1*num2;
                subtracao = num1-num2;
                divisao = num1/num2;

                lblSoma.setText("Soma = "+soma);
                lblMult.setText("Multiplicação = "+multiplicacao);
                lblSub.setText("Subtração = "+subtracao);
                lblDiv.setText("Divisão = "+divisao);
            }
        });
    }
}
