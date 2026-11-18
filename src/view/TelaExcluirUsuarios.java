package view;

public class TelaExcluirUsuarios extends javax.swing.JFrame {

    public TelaExcluirUsuarios() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        pnlConteudo = new javax.swing.JPanel();
        pnlConteudo.setBackground(new java.awt.Color(242, 245, 241));
        lblSistema = new javax.swing.JLabel();
        lblSistema.setFont(new java.awt.Font("SansSerif", 1, 14));
        lblSistema.setText("BALANÇA MAS NÃO CAI");
        lblSistema.setForeground(new java.awt.Color(0x294735));
        lblTitulo = new javax.swing.JLabel();
        lblTitulo.setFont(new java.awt.Font("SansSerif", 1, 24));
        lblTitulo.setText("Excluir Usuários");
        lblTitulo.setForeground(new java.awt.Color(0x294735));
        scrollRegistros = new javax.swing.JScrollPane();
        tblRegistros = new javax.swing.JTable();
        tblRegistros.setModel(new javax.swing.table.DefaultTableModel(
            new Object[][] {}, new String[] {"Código", "Nome", "E-mail"}
        ) {
            public boolean isCellEditable(int row, int column) { return false; }
        });
        tblRegistros.setRowHeight(25);
        scrollRegistros.setViewportView(tblRegistros);
        btnExcluir = new javax.swing.JButton();
        btnExcluir.setFont(new java.awt.Font("SansSerif", 1, 14));
        btnExcluir.setText("Excluir");
        btnExcluir.setForeground(new java.awt.Color(0xffffff));
        btnExcluir.setBackground(new java.awt.Color(66, 102, 77));
        lblAviso = new javax.swing.JLabel();
        lblAviso.setFont(new java.awt.Font("SansSerif", 0, 14));
        lblAviso.setText("Selecione um registro na tabela.");
        lblAviso.setForeground(new java.awt.Color(0x294735));
        btnVoltar = new javax.swing.JButton();
        btnVoltar.setFont(new java.awt.Font("SansSerif", 1, 14));
        btnVoltar.setText("Voltar");
        btnVoltar.setForeground(new java.awt.Color(0xffffff));
        btnVoltar.setBackground(new java.awt.Color(66, 102, 77));

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Excluir Usuários");
        getContentPane().setLayout(new java.awt.BorderLayout());
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(pnlConteudo);
        pnlConteudo.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup().addGap(28, 28, 28)
                .addComponent(lblSistema, 614, 614, 614)
                .addGap(38, 38, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup().addGap(28, 28, 28)
                .addComponent(lblTitulo, 614, 614, 614)
                .addGap(38, 38, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup().addGap(28, 28, 28)
                .addComponent(scrollRegistros, 623, 623, 623)
                .addGap(29, 29, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup().addGap(510, 510, 510)
                .addComponent(btnExcluir, 142, 142, 142)
                .addGap(28, 28, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup().addGap(28, 28, 28)
                .addComponent(lblAviso, 463, 463, 463)
                .addGap(189, 189, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup().addGap(28, 28, 28)
                .addComponent(btnVoltar, 104, 104, 104)
                .addGap(548, 548, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup().addGap(20, 20, 20)
                .addComponent(lblSistema, 25, 25, 25)
                .addGap(435, 435, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup().addGap(65, 65, 65)
                .addComponent(lblTitulo, 35, 35, 35)
                .addGap(380, 380, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup().addGap(125, 125, 125)
                .addComponent(scrollRegistros, 210, 210, 210)
                .addGap(145, 145, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup().addGap(355, 355, 355)
                .addComponent(btnExcluir, 36, 36, 36)
                .addGap(89, 89, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup().addGap(350, 350, 350)
                .addComponent(lblAviso, 25, 25, 25)
                .addGap(105, 105, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup().addGap(410, 410, 410)
                .addComponent(btnVoltar, 32, 32, 32)
                .addGap(38, 38, Short.MAX_VALUE))
        );
        getContentPane().add(pnlConteudo, java.awt.BorderLayout.CENTER);
        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> new TelaExcluirUsuarios().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblSistema;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JScrollPane scrollRegistros;
    private javax.swing.JTable tblRegistros;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JLabel lblAviso;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JPanel pnlConteudo;
    // End of variables declaration//GEN-END:variables
}
