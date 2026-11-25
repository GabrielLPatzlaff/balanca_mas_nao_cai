package view;

import dao.UsuarioDAO;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class TelaLogin extends javax.swing.JFrame {

    public TelaLogin() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        btnRetangulo14 = new javax.swing.JButton();
        btnRetangulo14.setFont(new java.awt.Font("SansSerif", 1, 14));
        btnRetangulo14.setText("Limpar");
        btnRetangulo14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetangulo14ActionPerformed(evt);
            }
        });
        btnRetangulo14.setBackground(new java.awt.Color(0xe7ece7));
        btnRetangulo14.setForeground(new java.awt.Color(0x20392c));
        btnRetangulo14.setBorderPainted(false);
        btnRetangulo14.setFocusPainted(false);
        btnEntrar12 = new javax.swing.JButton();
        btnEntrar12.setFont(new java.awt.Font("SansSerif", 1, 14));
        btnEntrar12.setText("Entrar");
        btnEntrar12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrar12ActionPerformed(evt);
            }
        });
        btnEntrar12.setBackground(new java.awt.Color(0x365642));
        btnEntrar12.setForeground(new java.awt.Color(0xffffff));
        btnEntrar12.setBorderPainted(false);
        btnEntrar12.setFocusPainted(false);
        pwdSenha9 = new javax.swing.JPasswordField();
        pwdSenha9.setFont(new java.awt.Font("SansSerif", 0, 13));
        pwdSenha9.setText("");
        pwdSenha9.setForeground(new java.awt.Color(0x8b978f));
        pwdSenha9.setBackground(java.awt.Color.WHITE);
        pwdSenha9.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0xdde5dd)));
        lblSenha8 = new javax.swing.JLabel();
        lblSenha8.setFont(new java.awt.Font("SansSerif", 1, 13));
        lblSenha8.setText("Senha");
        lblSenha8.setForeground(new java.awt.Color(0x68766c));
        txtEmail5 = new javax.swing.JTextField();
        txtEmail5.setFont(new java.awt.Font("SansSerif", 0, 13));
        txtEmail5.setText("");
        txtEmail5.setForeground(new java.awt.Color(0x8b978f));
        txtEmail5.setBackground(java.awt.Color.WHITE);
        txtEmail5.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0xdde5dd)));
        lblEmail4 = new javax.swing.JLabel();
        lblEmail4.setFont(new java.awt.Font("SansSerif", 1, 13));
        lblEmail4.setText("E-mail");
        lblEmail4.setForeground(new java.awt.Color(0x68766c));
        lblEntrarnosistema3 = new javax.swing.JLabel();
        lblEntrarnosistema3.setFont(new java.awt.Font("SansSerif", 0, 19));
        lblEntrarnosistema3.setText("Entrar no sistema");
        lblEntrarnosistema3.setForeground(new java.awt.Color(0x68766c));
        lblGestaodeObras2 = new javax.swing.JLabel();
        lblGestaodeObras2.setFont(new java.awt.Font("SansSerif", 1, 30));
        lblGestaodeObras2.setText("Gestão de Obras");
        lblGestaodeObras2.setForeground(new java.awt.Color(0x20392c));
        pnlRetangulo1 = new javax.swing.JPanel();
        pnlRetangulo1.setBackground(new java.awt.Color(0x365642));
        pnlPaineldeacesso0 = new javax.swing.JPanel();
        pnlPaineldeacesso0.setBackground(new java.awt.Color(0xffffff));
        pnlFundo = new javax.swing.JPanel();
        pnlFundo.setBackground(new java.awt.Color(0xf2f5f1));

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Login");
        setResizable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(548, 548, 548)
                .addComponent(btnRetangulo14, 176, 176, 176)
                .addGap(356, 356, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(354, 354, 354)
                .addComponent(btnEntrar12, 180, 180, 180)
                .addGap(546, 546, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(354, 354, 354)
                .addComponent(pwdSenha9, 370, 370, 370)
                .addGap(356, 356, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(354, 354, 354)
                .addComponent(lblSenha8, 300, 300, 300)
                .addGap(426, 426, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(354, 354, 354)
                .addComponent(txtEmail5, 370, 370, 370)
                .addGap(356, 356, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(354, 354, 354)
                .addComponent(lblEmail4, 300, 300, 300)
                .addGap(426, 426, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(354, 354, 354)
                .addComponent(lblEntrarnosistema3, 380, 380, 380)
                .addGap(346, 346, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(354, 354, 354)
                .addComponent(lblGestaodeObras2, 390, 390, 390)
                .addGap(336, 336, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(305, 305, 305)
                .addComponent(pnlRetangulo1, 470, 470, 470)
                .addGap(305, 305, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(305, 305, 305)
                .addComponent(pnlPaineldeacesso0, 470, 470, 470)
                .addGap(305, 305, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(pnlFundo, 1080, 1080, 1080)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(471, 471, 471)
                .addComponent(btnRetangulo14, 42, 42, 42)
                .addGap(187, 187, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(471, 471, 471)
                .addComponent(btnEntrar12, 42, 42, 42)
                .addGap(187, 187, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(385, 385, 385)
                .addComponent(pwdSenha9, 42, 42, 42)
                .addGap(273, 273, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(360, 360, 360)
                .addComponent(lblSenha8, 18, 18, 18)
                .addGap(322, 322, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(290, 290, 290)
                .addComponent(txtEmail5, 42, 42, 42)
                .addGap(368, 368, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(265, 265, 265)
                .addComponent(lblEmail4, 18, 18, 18)
                .addGap(417, 417, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(202, 202, 202)
                .addComponent(lblEntrarnosistema3, 24, 24, 24)
                .addGap(474, 474, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(151, 151, 151)
                .addComponent(lblGestaodeObras2, 36, 36, 36)
                .addGap(513, 513, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(pnlRetangulo1, 9, 9, 9)
                .addGap(596, 596, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(pnlPaineldeacesso0, 515, 515, 515)
                .addGap(90, 90, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(pnlFundo, 700, 700, 700)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnEntrar12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrar12ActionPerformed
      String email = txtEmail5.getText().trim();
      String senha = new String(pwdSenha9.getPassword());
      if (email.isEmpty() || senha.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Preencha o e-mail e a senha.");
        return;
      }
      try {
        UsuarioDAO dao = new UsuarioDAO();
        if (dao.autenticar(email, senha)) {
          new TelaMenuPrincipal().setVisible(true);
          dispose();
        } else {
          JOptionPane.showMessageDialog(this, "E-mail ou senha incorretos.");
        }
      } catch (SQLException erro) {
        JOptionPane.showMessageDialog(this, "Erro ao conectar ao banco: " + erro.getMessage());
      }
    }//GEN-LAST:event_btnEntrar12ActionPerformed
    private void btnRetangulo14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetangulo14ActionPerformed
        txtEmail5.setText("");
        pwdSenha9.setText("");
        txtEmail5.requestFocus();
    }//GEN-LAST:event_btnRetangulo14ActionPerformed

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> new TelaLogin().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRetangulo14;
    private javax.swing.JButton btnEntrar12;
    private javax.swing.JPasswordField pwdSenha9;
    private javax.swing.JLabel lblSenha8;
    private javax.swing.JTextField txtEmail5;
    private javax.swing.JLabel lblEmail4;
    private javax.swing.JLabel lblEntrarnosistema3;
    private javax.swing.JLabel lblGestaodeObras2;
    private javax.swing.JPanel pnlRetangulo1;
    private javax.swing.JPanel pnlPaineldeacesso0;
    private javax.swing.JPanel pnlFundo;
    // End of variables declaration//GEN-END:variables
}
