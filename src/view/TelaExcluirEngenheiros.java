package view;

public class TelaExcluirEngenheiros extends javax.swing.JFrame {

    public TelaExcluirEngenheiros() {
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
        btnExcluir = new javax.swing.JButton();
        lblAviso = new javax.swing.JLabel();
        btnVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Excluir Engenheiros");
        getContentPane().setLayout(new java.awt.BorderLayout());

        pnlConteudo.setBackground(new java.awt.Color(242, 245, 241));

        lblSistema.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lblSistema.setText("BALANÇA MAS NÃO CAI");
        lblSistema.setForeground(new java.awt.Color(41, 71, 53));

        lblTitulo.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        lblTitulo.setText("Excluir Engenheiros");
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

        btnExcluir.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.setForeground(new java.awt.Color(255, 255, 255));
        btnExcluir.setBackground(new java.awt.Color(66, 102, 77));

        lblAviso.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lblAviso.setText("Selecione um registro na tabela.");
        lblAviso.setForeground(new java.awt.Color(41, 71, 53));

        btnVoltar.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnVoltar.setText("Voltar");
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
                        .addGap(28, 28, 28)
                        .addComponent(scrollRegistros, 623, 623, 623))
                    .addGroup(pnlConteudoLayout.createSequentialGroup()
                        .addGap(510, 510, 510)
                        .addComponent(btnExcluir, 142, 142, 142))
                    .addGroup(pnlConteudoLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(lblAviso, 463, 463, 463))
                    .addGroup(pnlConteudoLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(btnVoltar, 104, 104, 104)))
                .addContainerGap(30, Short.MAX_VALUE))
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
                        .addGap(355, 355, 355)
                        .addComponent(btnExcluir, 36, 36, 36))
                    .addGroup(pnlConteudoLayout.createSequentialGroup()
                        .addGap(350, 350, 350)
                        .addComponent(lblAviso, 25, 25, 25))
                    .addGroup(pnlConteudoLayout.createSequentialGroup()
                        .addGap(410, 410, 410)
                        .addComponent(btnVoltar, 32, 32, 32)))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        getContentPane().add(pnlConteudo, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> new TelaExcluirEngenheiros().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel lblAviso;
    private javax.swing.JLabel lblSistema;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel pnlConteudo;
    private javax.swing.JScrollPane scrollRegistros;
    private javax.swing.JTable tblRegistros;
    // End of variables declaration//GEN-END:variables
}
