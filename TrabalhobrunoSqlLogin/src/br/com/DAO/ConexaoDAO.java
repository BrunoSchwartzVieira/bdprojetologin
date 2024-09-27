package br.com.DAO;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class ConexaoDAO {

    private static String Driver;

    public static Connection conector() {

        java.sql.Connection conexao = null;

        String drive = "com.mysql.jdbc:Driver";

        String url = "jdbc:mysql://localhost:3306/bdprojetoaula";

        String user = "root";

        String password = "root";
        try {
       
            Class.forName(Driver);
            conexao = DriverManager.getConnection (url, user, password);
            return conexao;
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Classe de Conexão" + e);
        }
                
        return null;
    }
}

