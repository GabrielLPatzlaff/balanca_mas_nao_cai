package view;

public class TelaMenuPrincipal extends javax.swing.JFrame {

    public TelaMenuPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlConteudo = new javax.swing.JPanel();
        lblSistema = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        btnFases = new javax.swing.JButton();
        btnEngenheiros = new javax.swing.JButton();
        btnFuncoes = new javax.swing.JButton();
        btnUsuarios = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Menu principal");
        getContentPane().setLayout(new java.awt.BorderLayout());

        pnlConteudo.setBackground(new java.awt.Color(242, 245, 241));

        lblSistema.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lblSistema.setText("BALANÇA MAS NÃO CAI");
        lblSistema.setForeground(new java.awt.Color(41, 71, 53));

        lblTitulo.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        lblTitulo.setText("Menu principal");
        lblTitulo.setForeground(new java.awt.Color(41, 71, 53));

        btnFases.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnFases.setText("Fases");
        btnFases.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFasesActionPerformed(evt);
            }
        });
        btnFases.setForeground(new java.awt.Color(255, 255, 255));
        btnFases.setBackground(new java.awt.Color(66, 102, 77));

        btnEngenheiros.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnEngenheiros.setText("Engenheiros");
        btnEngenheiros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEngenheirosActionPerformed(evt);
            }
        });
        btnEngenheiros.setForeground(new java.awt.Color(255, 255, 255));
        btnEngenheiros.setBackground(new java.awt.Color(66, 102, 77));

        btnFuncoes.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnFuncoes.setText("Funções");
        btnFuncoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFuncoesActionPerformed(evt);
            }
        });
        btnFuncoes.setForeground(new java.awt.Color(255, 255, 255));
        btnFuncoes.setBackground(new java.awt.Color(66, 102, 77));

        btnUsuarios.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnUsuarios.setText("Usuários");
        btnUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuariosActionPerformed(evt);
            }
        });
        btnUsuarios.setForeground(new java.awt.Color(255, 255, 255));
        btnUsuarios.setBackground(new java.awt.Color(66, 102, 77));

        btnVoltar.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnVoltar.setText("Sair");
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
                        .addComponent(btnFases, 264, 264, 264))
                    .addGroup(pnlConteudoLayout.createSequentialGroup()
                        .addGap(349, 349, 349)
                        .addComponent(btnEngenheiros, 264, 264, 264))
                    .addGroup(pnlConteudoLayout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(btnFuncoes, 264, 264, 264))
                    .addGroup(pnlConteudoLayout.createSequentialGroup()
                        .addGap(349, 349, 349)
                        .addComponent(btnUsuarios, 264, 264, 264))
                    .addGroup(pnlConteudoLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(btnVoltar, 104, 104, 104)))
                .addGap(38, 43, Short.MAX_VALUE))
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
                        .addComponent(btnFases, 65, 65, 65))
                    .addGroup(pnlConteudoLayout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(btnEngenheiros, 65, 65, 65))
                    .addGroup(pnlConteudoLayout.createSequentialGroup()
                        .addGap(245, 245, 245)
                        .addComponent(btnFuncoes, 65, 65, 65))
                    .addGroup(pnlConteudoLayout.createSequentialGroup()
                        .addGap(245, 245, 245)
                        .addComponent(btnUsuarios, 65, 65, 65))
                    .addGroup(pnlConteudoLayout.createSequentialGroup()
                        .addGap(410, 410, 410)
                        .addComponent(btnVoltar, 32, 32, 32)))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        getContentPane().add(pnlConteudo, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnFasesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFasesActionPerformed
        new TelaManutencaoFases().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnFasesActionPerformed
    private void btnEngenheirosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEngenheirosActionPerformed
        new TelaManutencaoEngenheiros().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnEngenheirosActionPerformed
    private void btnFuncoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFuncoesActionPerformed
        new TelaManutencaoFuncoes().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnFuncoesActionPerformed
    private void btnUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuariosActionPerformed
        new TelaManutencaoUsuarios().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnUsuariosActionPerformed
    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        new TelaLogin().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> new TelaMenuPrincipal().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEngenheiros;
    private javax.swing.JButton btnFases;
    private javax.swing.JButton btnFuncoes;
    private javax.swing.JButton btnUsuarios;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel lblSistema;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel pnlConteudo;
    // End of variables declaration//GEN-END:variables
}
