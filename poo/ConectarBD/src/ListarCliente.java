import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

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
        } catch (SQLException e){
            System.out.println("erro:"+e.getMessage());
        }
    }
    public JPanel getPanel(){
        return this.panel;
    }
}
