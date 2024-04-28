package com.mycompany.cyberlogin;
import java.sql.DriverManager;
import java.sql.Connection;

/**
 *  ConnectionFactory
 */
public class  ConnectionFactory {

    private String usuario = "root";
    private String senha = "4854";
    private String host = "localhost";
    private String porta = "3306";
    private String bd = "db_pessoas";

    public Connection obtemConexao (){
        try {
            Connection c = DriverManager.getConnection("jdbc:mysql://" + host + ":" + porta + "/" +
            bd,
            usuario,
            senha
            );
            return c;
        } 
        catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}