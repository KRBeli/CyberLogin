package com.mycompany.Banco;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Classe responsável por estabelecer a conexão com o banco de dados.
 */

public class Conexao {
    
    private static String host = "localhost";
    private static String porta = "3306";
    private static String user = "root";
    private static String password = "#Ievenes@123"; 
    private static String database = "cad_clientes";
    
    /**
     * Obtém a conexão com o banco de dados.
     * 
     * @return A conexão estabelecida com o banco de dados.
     * @throws SQLException Se ocorrer um erro ao estabelecer a conexão.
     */

    public static Connection obterConexao() throws SQLException {
        String url = String.format("jdbc:mysql://%s:%s/%s",
                host, porta, database);
        return DriverManager.getConnection(url, user, password);
    }
}
