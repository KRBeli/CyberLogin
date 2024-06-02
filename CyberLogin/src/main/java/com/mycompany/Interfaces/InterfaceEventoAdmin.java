package com.mycompany.Interfaces;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import com.mycompany.Banco.CadastroDAO;
import com.mycompany.Banco.CadastroEvento;
import com.mycompany.Bordas.RoundJPanel;

public class InterfaceEventoAdmin extends javax.swing.JFrame implements ActionListener {

    private javax.swing.JButton jButtonCadastrarEvento;
    private javax.swing.JButton jButtonVisualizar;
    private javax.swing.JLabel jLabelCadastroDeEvento;
    private javax.swing.JLabel jLabelDataFim;
    private javax.swing.JLabel jLabelDataInicio;
    private javax.swing.JLabel jLabelDescricao;
    private javax.swing.JLabel jLabelHoraFim;
    private javax.swing.JLabel jLabelHoraInicio;
    private javax.swing.JLabel jLabelLogo;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public static javax.swing.JTextField jTextFieldDataFim;
    public static javax.swing.JTextField jTextFieldDataInicio;
    public static javax.swing.JTextField jTextFieldDescricao;
    public static javax.swing.JTextField jTextFieldHoraFim;
    public static javax.swing.JTextField jTextFieldHoraInicio;
    public static javax.swing.JTextField jTextFieldNome;

    public InterfaceEventoAdmin() {
        initComponents();
    }

    private void initComponents() {
        jPanel1 = new javax.swing.JPanel();
        jLabelLogo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        RoundJPanel jPanel3 = new RoundJPanel();
        jLabelDataFim = new javax.swing.JLabel();
        jLabelDataInicio = new javax.swing.JLabel();
        jLabelHoraInicio = new javax.swing.JLabel();
        jLabelDescricao = new javax.swing.JLabel();
        jLabelHoraFim = new javax.swing.JLabel();
        jLabelNome = new javax.swing.JLabel();
        jButtonCadastrarEvento = new javax.swing.JButton();
        jButtonVisualizar = new javax.swing.JButton();
        jTextFieldNome = new javax.swing.JTextField();
        jTextFieldDescricao = new javax.swing.JTextField();
        jTextFieldDataInicio = new javax.swing.JTextField();
        jTextFieldHoraInicio = new javax.swing.JTextField();
        jTextFieldDataFim = new javax.swing.JTextField();
        jTextFieldHoraFim = new javax.swing.JTextField();
        jLabelCadastroDeEvento = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextFieldDataFim.addActionListener(this);
        jTextFieldDataInicio.addActionListener(this);
        jTextFieldDescricao.addActionListener(this);
        jTextFieldHoraFim.addActionListener(this);
        jTextFieldHoraInicio.addActionListener(this);
        jTextFieldNome.addActionListener(this);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setPreferredSize(new java.awt.Dimension(1366, 768));
        ImageIcon imgIcon = new ImageIcon(getClass().getResource("CyberLoginMini.png"));
        Image img = imgIcon.getImage();
        Image resizedImage = img.getScaledInstance(32, 32, java.awt.Image.SCALE_SMOOTH);
        this.setIconImage(resizedImage);

        jLabelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("CyberLogin logo.png")));

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));

        jLabelDataFim.setFont(new java.awt.Font("Segoe UI", 0, 18));
        jLabelDataFim.setText("Data Fim:");

        jLabelDataInicio.setFont(new java.awt.Font("Segoe UI", 0, 18));
        jLabelDataInicio.setText("Data Inicio:");

        jLabelHoraInicio.setFont(new java.awt.Font("Segoe UI", 0, 18));
        jLabelHoraInicio.setText("Hora Inicio:");

        jLabelDescricao.setFont(new java.awt.Font("Segoe UI", 0, 18));
        jLabelDescricao.setText("Descrição Detalhada:");

        jLabelHoraFim.setFont(new java.awt.Font("Segoe UI", 0, 18));
        jLabelHoraFim.setText("Hora Fim:");

        jLabelNome.setFont(new java.awt.Font("Segoe UI", 0, 18));
        jLabelNome.setText("Nome: ");

        jButtonCadastrarEvento.setText("Cadastrar");
        jButtonCadastrarEvento.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonCadastrarEvento.addActionListener(this);
        jButtonVisualizar.setText("Visualizar");
        jButtonVisualizar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonVisualizar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                InterfaceEventoUser interfaceEventoUser = new InterfaceEventoUser();
                interfaceEventoUser.setVisible(true);
                
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabelDataInicio)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldDataInicio))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabelHoraInicio)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldHoraInicio)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabelDataFim)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldDataFim, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabelHoraFim)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldHoraFim, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonCadastrarEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(114, 114, 114)
                        .addComponent(jButtonVisualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(259, 259, 259))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabelNome)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 770, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabelDescricao)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 663, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 2, Short.MAX_VALUE)))
                .addGap(118, 118, 118))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNome)
                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDescricao)
                    .addComponent(jTextFieldDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDataInicio)
                    .addComponent(jLabelDataFim)
                    .addComponent(jTextFieldDataInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldDataFim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelHoraInicio)
                    .addComponent(jLabelHoraFim)
                    .addComponent(jTextFieldHoraInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldHoraFim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCadastrarEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonVisualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(96, Short.MAX_VALUE))
        );

        jLabelCadastroDeEvento.setFont(new java.awt.Font("Calibri", 1, 48));
        jLabelCadastroDeEvento.setText("Cadastro de Eventos");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(469, 469, 469)
                        .addComponent(jLabelCadastroDeEvento))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(157, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabelCadastroDeEvento)
                .addGap(33, 33, 33)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelLogo)
                .addGap(381, 381, 381))
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 575, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(130, 130, 130))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1372, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 873, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setExtendedState(MAXIMIZED_BOTH);
        setLocationRelativeTo(null);
        setTitle("Cyber Eventos");
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
            java.util.logging.Logger.getLogger(InterfaceEventoAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
            new InterfaceEventoAdmin().setVisible(true);
        });
    }

    public void actionPerformed(ActionEvent e) {
        CadastroEvento cadastroEvento = new CadastroEvento();
        cadastroEvento.setNomeEvento(jTextFieldNome.getText());
        cadastroEvento.setDescricao(jTextFieldDescricao.getText());
        cadastroEvento.setDataInicio(jTextFieldDataInicio.getText());
        cadastroEvento.setDataFim(jTextFieldDataFim.getText());
        cadastroEvento.setHoraInicio(jTextFieldHoraInicio.getText());
        cadastroEvento.setHoraFim(jTextFieldHoraFim.getText());
        CadastroDAO cadastroDAO2 = new CadastroDAO();
        try {
            cadastroDAO2.inserirEvento(cadastroEvento);
            JOptionPane.showMessageDialog(null, "Evento cadastrado com sucesso!");
            jTextFieldNome.setText("");
            jTextFieldDescricao.setText("");
            jTextFieldDataInicio.setText("");
            jTextFieldDataFim.setText("");
            jTextFieldHoraInicio.setText("");
            jTextFieldHoraFim.setText("");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar");
        }
    }
}
