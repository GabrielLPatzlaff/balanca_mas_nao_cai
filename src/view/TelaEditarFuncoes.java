package view;

public class TelaEditarFuncoes extends javax.swing.JFrame {

    public TelaEditarFuncoes() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlConteudo = new javax.swing.JPanel();
        lblSistema = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        lblCampo0 = new javax.swing.JLabel();
        txtCampo0 = new javax.swing.JTextField();
        lblCampo1 = new javax.swing.JLabel();
        txtCampo1 = new javax.swing.JTextField();
        btnIncluir = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Alterar Funções");
        getContentPane().setLayout(new java.awt.BorderLayout());

        pnlConteudo.setBackground(new java.awt.Color(242, 245, 241));

        lblSistema.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lblSistema.setText("BALANÇA MAS NÃO CAI");
        lblSistema.setForeground(new java.awt.Color(41, 71, 53));

        lblTitulo.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        lblTitulo.setText("Alterar Funções");
        lblTitulo.setForeground(new java.awt.Color(41, 71, 53));

        lblCampo0.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lblCampo0.setText("Código");
        lblCampo0.setForeground(new java.awt.Color(41, 71, 53));

        txtCampo0.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        txtCampo0.setForeground(new java.awt.Color(41, 71, 53));
        txtCampo0.setEditable(false);

        lblCampo1.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lblCampo1.setText("Descrição");
        lblCampo1.setForeground(new java.awt.Color(41, 71, 53));

        txtCampo1.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        txtCampo1.setForeground(new java.awt.Color(41, 71, 53));

        btnIncluir.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnIncluir.setText("Salvar alteração");
        btnIncluir.setForeground(new java.awt.Color(255, 255, 255));
        btnIncluir.setBackground(new java.awt.Color(66, 102, 77));

        btnLimpar.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnLimpar.setText("Limpar");
        btnLimpar.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpar.setBackground(new java.awt.Color(66, 102, 77));

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
                        .addGap(38, 38, 38)
                        .addComponent(lblCampo0, 283, 283, 283))
                    .addGroup(pnlConteudoLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(txtCampo0, 283, 283, 283))
                    .addGroup(pnlConteudoLayout.createSequentialGroup()
                        .addGap(359, 359, 359)
                        .addComponent(lblCampo1, 283, 283, 283))
                    .addGroup(pnlConteudoLayout.createSequentialGroup()
                        .addGap(359, 359, 359)
                        .addComponent(txtCampo1, 283, 283, 283))
                    .addGroup(pnlConteudoLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(btnIncluir, 170, 170, 170))
                    .addGroup(pnlConteudoLayout.createSequentialGroup()
                        .addGap(222, 222, 222)
                        .addComponent(btnLimpar, 128, 128, 128))
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
                        .addGap(130, 130, 130)
                        .addComponent(lblCampo0, 23, 23, 23))
                    .addGroup(pnlConteudoLayout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(txtCampo0, 32, 32, 32))
                    .addGroup(pnlConteudoLayout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(lblCampo1, 23, 23, 23))
                    .addGroup(pnlConteudoLayout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(txtCampo1, 32, 32, 32))
                    .addGroup(pnlConteudoLayout.createSequentialGroup()
                        .addGap(355, 355, 355)
                        .addComponent(btnIncluir, 36, 36, 36))
                    .addGroup(pnlConteudoLayout.createSequentialGroup()
                        .addGap(355, 355, 355)
                        .addComponent(btnLimpar, 36, 36, 36))
                    .addGroup(pnlConteudoLayout.createSequentialGroup()
                        .addGap(410, 410, 410)
                        .addComponent(btnVoltar, 32, 32, 32)))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        getContentPane().add(pnlConteudo, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> new TelaEditarFuncoes().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIncluir;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel lblCampo0;
    private javax.swing.JLabel lblCampo1;
    private javax.swing.JLabel lblSistema;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel pnlConteudo;
    private javax.swing.JTextField txtCampo0;
    private javax.swing.JTextField txtCampo1;
    // End of variables declaration//GEN-END:variables
}
