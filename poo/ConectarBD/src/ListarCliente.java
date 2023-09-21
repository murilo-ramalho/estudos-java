import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.*;

public class ListarCliente {
    private JPanel panel;
    private JButton btnAddCliente;
    private JTable tblCliente;
    
    //DB
    private final String url = "jdbc:mysql://localhost/cliente_db";
    private final String user = "root";
    private final String pass = "";

    public ListarCliente(){
        try {
            Connection connection = DriverManager.getConnection(url,user,pass);
            Object[][] dados = consultarClientes(connection);
            String[] cabecalho = {"id","nome","email"};

            tblCliente.setEnabled(false);
            tblCliente.setModel(new DefaultTableModel(dados, cabecalho));
            tblCliente.setEnabled(true);
        } catch (SQLException e){
            System.out.println("erro:"+e.getMessage());
        }
    }
    public String[][] consultarClientes(Connection connection){
        String selectQuery = "SELECT * FROM clientes";
        String[][] retorno = new String[100][3];

        try (
            Statement statement = connection.createStatement();
            ResultSet res = statement.executeQuery(selectQuery);
        ){
            int  i = 0;

            while (res.next()){
                retorno[i][0] = res.getString("id");
                retorno[i][1] = res.getString("nome");
                retorno[i][2] = res.getString("email");

                i++;
            }
        } catch (SQLException e){
            System.out.println("ERRO:" + e.getMessage());
        }

        return retorno;
    }
    public JPanel getPanel(){
        return this.panel;
    }
}
