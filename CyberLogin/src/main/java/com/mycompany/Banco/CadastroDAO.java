package com.mycompany.Banco;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CadastroDAO {

    /**
     * Insere um evento no banco de dados.
     * 
     * @param cadastroEvento um objeto CadastroEvento contendo as informações do evento a ser inserido
     */
    
    public void inserirEvento(CadastroEvento cadastroEvento){
        String sql = "insert into eventos (nome, descricao, datainicio, datafim, horainicio, horafim) values (?, ?, ?, ?, ?, ?);";
                try (Connection conn = Conexao.obterConexao();
                     PreparedStatement ps = conn.prepareStatement(sql);) {
                    ps.setString(1, cadastroEvento.getNomeEvento());
                    ps.setString(2, cadastroEvento.getDescricao());
                    ps.setString(3, cadastroEvento.getDataInicio());
                    ps.setString(4, cadastroEvento.getDataFim());
                    ps.setString(5, cadastroEvento.getHoraInicio());
                    ps.setString(6, cadastroEvento.getHoraFim());
                    ps.execute();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

        /**
         * Busca todos os eventos cadastrados no banco de dados.
         * @param buscarEventos um objeto CadastroEvento contendo as informações do evento a ser inserido
         * @return uma lista de objetos CadastroEvento contendo os eventos encontrados
         */

        public List<CadastroEvento> buscarEventos() {
            List<CadastroEvento> eventos = new ArrayList<>();
            String sql = "SELECT nome, descricao, datainicio, datafim, horainicio, horafim FROM eventos WHERE datafim >= ? OR (datafim = ? AND horafim > ?)";

            try (Connection conn = Conexao.obterConexao();
                 PreparedStatement ps = conn.prepareStatement(sql)) {

                LocalDate currentDate = LocalDate.now();
                LocalTime currentTime = LocalTime.now();
                DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm");

                String formattedDate = currentDate.format(dateFormatter);
                String formattedTime = currentTime.format(timeFormatter);

                ps.setString(1, formattedDate);
                ps.setString(2, formattedDate);
                ps.setString(3, formattedTime);
                ResultSet rs = ps.executeQuery();

                while (rs.next()) {
                    CadastroEvento evento = new CadastroEvento();
                    evento.setNomeEvento(rs.getString("nome"));
                    evento.setDescricao(rs.getString("descricao"));
                    evento.setDataInicio(rs.getString("datainicio"));
                    evento.setDataFim(rs.getString("datafim"));
                    evento.setHoraInicio(rs.getString("horainicio"));
                    evento.setHoraFim(rs.getString("horafim"));
                    eventos.add(evento);
                }

            } catch (SQLException e) {
                e.printStackTrace();
            }

            return eventos;
        }
        
        /**
         * Insere um novo cadastro no banco de dados.
         * 
         * @param cadastro O objeto Cadastro a ser inserido.
         */

        public void inserir(Cadastro cadastro){
            String sql = "insert into cliente (nome, email, idade, cpf, sexo, senha) values (?, ?, ?, ?, ?, ?);";
            try (Connection conn = Conexao.obterConexao();
                PreparedStatement ps = conn.prepareStatement(sql);) {
                ps.setString(1, cadastro.getNome());
                ps.setString(2, cadastro.getEmail());
                ps.setInt(3, cadastro.getIdade());
                ps.setString(4, cadastro.getCpf());
                ps.setString(5, cadastro.getSexo());
                ps.setString(6, cadastro.getSenha());
                ps.execute();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    
    
        /**
         * Verifica se o login é válido para o email e senha fornecidos.
         * 
         * @param email o email do usuário
         * @param senha a senha do usuário
         * @return true se o login for válido, false caso contrário
         * @throws SQLException se ocorrer um erro ao acessar o banco de dados
         */

        public boolean checkLogin (String email, String senha) throws SQLException{
            Connection con = Conexao.obterConexao();
            PreparedStatement stmt = null;
            ResultSet rs = null;
            boolean check = false;

            try{
                stmt = con.prepareStatement("SELECT * FROM CLIENTE WHERE email = ? and senha = ?");
                stmt.setString(1, email);
                stmt.setString(2, senha);

                rs = stmt.executeQuery();

                if (rs.next()) {
                    check = true;
                }
            }catch (SQLException ex){
                Logger.getLogger(CadastroDAO.class.getName()).log(Level.SEVERE,null,ex);
            }
            return check;
        }
}
