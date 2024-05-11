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
String sql = "insert into cliente (nome, email, idade, cpf, sexo) values (?, ?, ?, ?, ?);";
        try (Connection conn = Conexao.obterConexao();
             PreparedStatement ps = conn.prepareStatement(sql);) {
            ps.setObject(1, CyberLoginTelaCadastro.jTextFieldNome);
            ps.setObject(2, CyberLoginTelaCadastro.jTextFieldEmail);
            ps.setObject(3, CyberLoginTelaCadastro.jTextFieldIdade);
            ps.setObject(4, CyberLoginTelaCadastro.jTextFieldCPF);
            ps.setObject(5, CyberLoginTelaCadastro.jTextFieldSexo);

            ps.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public ArrayList<CyberLoginTelaCadastro> listar(){
        return null;
    }
    
    public CyberLoginTelaCadastro buscar(int id) {
        String sql = "select * from cliente where ID_CLIENTE = ?;";
        try (Connection conn = Conexao.obterConexao();
             PreparedStatement ps = conn.prepareStatement(sql);) {
            ps.setInt(1, id);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    String nome = rs.getString("nome");
                    String email = rs.getString("email");
                    int idade = rs.getInt("idade");
                    String cpf = rs.getString("cpf");
                    String sexo = rs.getString("sexo");
                    return new CyberLoginTelaCadastro(nome, email, idade, cpf,sexo);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void atualizar(CyberLoginTelaCadastro cyberLoginTelaCadastro){

    }
    public void excluir(int id){
        
    }
}
