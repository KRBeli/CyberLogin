package com.mycompany.Banco;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.mycompany.cyberlogin.CyberLoginTelaCadastro;

public class CadastroDAO {
//DAO quer dizer Data Access Object
    public void inserir(CyberLoginTelaCadastro cyberLoginTelaCadastro){
String sql = "insert into cliente (nome, email, idade) values (?, ?, ?);";
        try (Connection conn = Conexao.obterConexao();
             PreparedStatement ps = conn.prepareStatement(sql);) {
            ps.setString(1, CyberLoginTelaCadastro.jTextFieldNome);
            ps.setString(2,);
            ps.setInt(3, );
            ps.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public ArrayList<Cliente> listar(){
        return null;
    }
    
    public Cliente buscar(int id) {
        String sql = "select * from cliente where ID_CLIENTE = ?;";
        try (Connection conn = Conexao.obterConexao();
             PreparedStatement ps = conn.prepareStatement(sql);) {
            ps.setInt(1, id);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    String nome = rs.getString("nome");
                    String email = rs.getString("email");
                    int idade = rs.getInt("idade");
                    return new Cliente(nome, email, idade);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void atualizar(Cliente cliente){

    }
    public void excluir(int id){
        
    }
}
