package view;

public class TelaConsultarEngenheiros extends javax.swing.JFrame {

    public TelaConsultarEngenheiros() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlConteudo = new javax.swing.JPanel();
        lblSistema = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        scrollRegistros = new javax.swing.JScrollPane();
        tblRegistros = new javax.swing.JTable();
        lblAviso = new javax.swing.JLabel();
        btnVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Consultar Engenheiros");
        getContentPane().setLayout(new java.awt.BorderLayout());

        pnlConteudo.setBackground(new java.awt.Color(242, 245, 241));

        lblSistema.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lblSistema.setText("BALANÇA MAS NÃO CAI");
        lblSistema.setForeground(new java.awt.Color(41, 71, 53));

        lblTitulo.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        lblTitulo.setText("Consultar Engenheiros");
        lblTitulo.setForeground(new java.awt.Color(41, 71, 53));

        tblRegistros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "CREA", "Data de admissão"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblRegistros.setRowHeight(25);
        scrollRegistros.setViewportView(tblRegistros);

        lblAviso.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lblAviso.setText("Nenhum registro cadastrado.");
        lblAviso.setForeground(new java.awt.Color(41, 71, 53));

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
                .addGap(28, 28, 28)
                .addGroup(pnlConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSistema, 614, 614, 614)
                    .addComponent(lblTitulo, 614, 614, 614)
                    .addComponent(scrollRegistros, 623, 623, 623)
                    .addComponent(lblAviso, 463, 463, 463)
                    .addComponent(btnVoltar, 104, 104, 104))
                .addContainerGap(26, Short.MAX_VALUE))
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
                        .addGap(125, 125, 125)
                        .addComponent(scrollRegistros, 210, 210, 210))
                    .addGroup(pnlConteudoLayout.createSequentialGroup()
                        .addGap(350, 350, 350)
                        .addComponent(lblAviso, 25, 25, 25))
                    .addGroup(pnlConteudoLayout.createSequentialGroup()
                        .addGap(410, 410, 410)
                        .addComponent(btnVoltar, 32, 32, 32)))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        getContentPane().add(pnlConteudo, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        new TelaManutencaoEngenheiros().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> new TelaConsultarEngenheiros().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel lblAviso;
    private javax.swing.JLabel lblSistema;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel pnlConteudo;
    private javax.swing.JScrollPane scrollRegistros;
    private javax.swing.JTable tblRegistros;
    // End of variables declaration//GEN-END:variables
}
