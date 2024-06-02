package com.mycompany.Interfaces;

import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import com.mycompany.Banco.CadastroDAO;
import com.mycompany.Bordas.RoundJPanel;
import com.mycompany.Bordas.RoundedTextField;

public class CyberLoginTela extends JFrame implements ActionListener {

    private static final long serialVersionUID = 1L;
    private javax.swing.JButton botaoCadastrar;
    private javax.swing.JButton botaoLogin;
    private javax.swing.JButton botaoFechar;
    public static javax.swing.JPasswordField campoSenha;
    public static javax.swing.JTextField campoUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private String admin = "admin@cyberlogin.com";
    private String senhaAdmin = "admin@1234";

    public CyberLoginTela() {
        initComponents();
    }

    private void initComponents() {
        RoundJPanel jPanel1 = new RoundJPanel();
        campoUsuario = new javax.swing.JTextField();
        campoSenha = new javax.swing.JPasswordField();
        botaoCadastrar = new javax.swing.JButton();
        botaoLogin = new javax.swing.JButton();
        botaoFechar = new javax.swing.JButton();
        RoundJPanel jPanel2 = new RoundJPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jPanel1.setForeground(new java.awt.Color(204, 204, 204));
        ImageIcon imgIcon = new ImageIcon(getClass().getResource("CyberLoginMini.png"));
        Image img = imgIcon.getImage();
        Image resizedImage = img.getScaledInstance(32, 32, java.awt.Image.SCALE_SMOOTH);
        this.setIconImage(resizedImage);
        
        campoUsuario.setBackground(new java.awt.Color(255,255,255));
        campoUsuario.add(new RoundedTextField(30));
        campoUsuario.addActionListener(this);

        campoSenha.setBackground(new java.awt.Color(255,255,255));
        campoSenha.add(new RoundedTextField(30));
        campoSenha.addActionListener(this);

        botaoCadastrar.setBackground(new java.awt.Color(51, 51, 51));
        botaoCadastrar.setForeground(new java.awt.Color(255, 255, 255));
        botaoCadastrar.setText("Cadastrar");
        botaoCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadastrarActionPerformed(evt);
            }
        });

        botaoLogin.setBackground(new java.awt.Color(51, 51, 51));
        botaoLogin.setForeground(new java.awt.Color(255, 255, 255));
        botaoLogin.setText("Logar");
        botaoLogin.addActionListener(this);

        botaoFechar.setBackground(new java.awt.Color(51, 51, 51));
        botaoFechar.setForeground(new java.awt.Color(255, 255, 255));
        botaoFechar.setText("X");
        botaoFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                System.exit(0);
            }
        });
        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("14/04: Entrega01(gui): gui de login sem funcionalidades");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("28/04: Entrega02(bd): script do banco de dados");
        jLabel5.setToolTipText("");

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("12/05: Entrega03(gui): login funcionando");

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("19/05: Entrega04(admin): cadastro de eventos");

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("26/05: Entrega05(comum): criação de conta");

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("02/06: Entrega06(comum): listar eventos");

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Eventos:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0,123, 123)
                        .addComponent(jLabel10)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(44, 44, 44)
                .addComponent(jLabel5)
                .addGap(44, 44, 44)
                .addComponent(jLabel6)
                .addGap(44, 44, 44)
                .addComponent(jLabel7)
                .addGap(44, 44, 44)
                .addComponent(jLabel8)
                .addGap(44, 44, 44)
                .addComponent(jLabel9)
                .addGap(41, 41, 41))
        );

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("CyberLogin logoMini.png"))); // NOI18N

        jLabel1.setText("Usuário:");

        jLabel3.setText("Senha:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addContainerGap(19, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(botaoLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botaoCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(campoSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(74, 74, 74))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("CyberLogin");
    }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CyberLoginTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        CadastroDAO dao = new CadastroDAO();
        try {
            if (campoUsuario.getText().equals(admin) && campoSenha.getText().equals(senhaAdmin)) {
                new InterfaceEventoAdmin().setVisible(true);
                this.dispose();
            } else if (dao.checkLogin(campoUsuario.getText(), campoSenha.getText())) {
                new InterfaceEventoUser().setVisible(true);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Senha Incorreta!");
            }
        } catch (HeadlessException | SQLException e1) {
            e1.printStackTrace();
        }
    }

    private void botaoCadastrarActionPerformed(java.awt.event.ActionEvent evt) {
        CyberLoginTelaCadastro telaCadastro = new CyberLoginTelaCadastro();
        telaCadastro.setVisible(true);
    }
}
