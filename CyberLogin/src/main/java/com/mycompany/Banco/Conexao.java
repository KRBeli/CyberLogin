package com.mycompany.Banco;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    
    private static String host = "localhost";
    private static String porta = "3306";
    private static String user = "root";
    private static String password = "#Ievenes@123"; 
    private static String database = "cad_clientes";
    
    public static Connection obterConexao() throws SQLException {
        String url = String.format("jdbc:mysql://%s:%s/%s",
                host, porta, database);
        return DriverManager.getConnection(url, user, password);
    }
}
