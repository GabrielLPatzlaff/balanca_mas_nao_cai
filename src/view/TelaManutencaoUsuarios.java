package view;

public class TelaManutencaoUsuarios extends javax.swing.JFrame {

    public TelaManutencaoUsuarios() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlConteudo = new javax.swing.JPanel();
        lblSistema = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        btnIncluir = new javax.swing.JButton();
        btnConsultar = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Manutenção de Usuários");
        getContentPane().setLayout(new java.awt.BorderLayout());

        pnlConteudo.setBackground(new java.awt.Color(242, 245, 241));

        lblSistema.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lblSistema.setText("BALANÇA MAS NÃO CAI");
        lblSistema.setForeground(new java.awt.Color(41, 71, 53));

        lblTitulo.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        lblTitulo.setText("Manutenção de Usuários");
        lblTitulo.setForeground(new java.awt.Color(41, 71, 53));

        btnIncluir.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnIncluir.setText("Incluir");
        btnIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIncluirActionPerformed(evt);
            }
        });
        btnIncluir.setForeground(new java.awt.Color(255, 255, 255));
        btnIncluir.setBackground(new java.awt.Color(66, 102, 77));

        btnConsultar.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });
        btnConsultar.setForeground(new java.awt.Color(255, 255, 255));
        btnConsultar.setBackground(new java.awt.Color(66, 102, 77));

        btnAlterar.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });
        btnAlterar.setForeground(new java.awt.Color(255, 255, 255));
        btnAlterar.setBackground(new java.awt.Color(66, 102, 77));

        btnExcluir.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });
        btnExcluir.setForeground(new java.awt.Color(255, 255, 255));
        btnExcluir.setBackground(new java.awt.Color(66, 102, 77));

        btnVoltar.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });
        btnVoltar.setForeground(new java.awt.Color(255, 255, 255));
        btnVoltar.setBackground(new java.awt.Color(66, 102, 77));

        javax.swing.GroupLayout pnlConteudoLayout = new javax.swing.GroupLayout(pnlConteudo);
        pnlConteudo.setLayout(pnlConteudoLayout);
        pnlConteudoLayout.setHorizontalGroup(
            pnlConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlConteudoLayout.createSequentialGroup()
                .addGroup(pnlConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlConteudoLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(lblSistema, 614, 614, 614))
                    .addGroup(pnlConteudoLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(lblTitulo, 614, 614, 614))
                    .addGroup(pnlConteudoLayout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(btnIncluir, 264, 264, 264))
                    .addGroup(pnlConteudoLayout.createSequentialGroup()
                        .addGap(349, 349, 349)
                        .addComponent(btnConsultar, 264, 264, 264))
                    .addGroup(pnlConteudoLayout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(btnAlterar, 264, 264, 264))
                    .addGroup(pnlConteudoLayout.createSequentialGroup()
                        .addGap(349, 349, 349)
                        .addComponent(btnExcluir, 264, 264, 264))
                    .addGroup(pnlConteudoLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(btnVoltar, 104, 104, 104)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlConteudoLayout.setVerticalGroup(
            pnlConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlConteudoLayout.createSequentialGroup()
                .addGroup(pnlConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlConteudoLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(lblSistema, 25, 25, 25))
                    .addGroup(pnlConteudoLayout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(lblTitulo, 35, 35, 35))
                    .addGroup(pnlConteudoLayout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(btnIncluir, 65, 65, 65))
                    .addGroup(pnlConteudoLayout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(btnConsultar, 65, 65, 65))
                    .addGroup(pnlConteudoLayout.createSequentialGroup()
                        .addGap(245, 245, 245)
                        .addComponent(btnAlterar, 65, 65, 65))
                    .addGroup(pnlConteudoLayout.createSequentialGroup()
                        .addGap(245, 245, 245)
                        .addComponent(btnExcluir, 65, 65, 65))
                    .addGroup(pnlConteudoLayout.createSequentialGroup()
                        .addGap(410, 410, 410)
                        .addComponent(btnVoltar, 32, 32, 32)))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        getContentPane().add(pnlConteudo, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIncluirActionPerformed
        new TelaIncluirUsuarios().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnIncluirActionPerformed
    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        new TelaConsultarUsuarios().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnConsultarActionPerformed
    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        new TelaAlterarUsuarios().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnAlterarActionPerformed
    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        new TelaExcluirUsuarios().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnExcluirActionPerformed
    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        new TelaMenuPrincipal().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> new TelaManutencaoUsuarios().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnIncluir;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel lblSistema;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel pnlConteudo;
    // End of variables declaration//GEN-END:variables
}
