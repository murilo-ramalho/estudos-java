import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame listarCliente = new JFrame("ListarClientes");
        listarCliente.setContentPane(new ListarCliente().getPanel());
        listarCliente.setSize(500,500);
        listarCliente.setVisible(true);
        listarCliente.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}