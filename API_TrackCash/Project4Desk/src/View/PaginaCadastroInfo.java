package View;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.JOptionPane;
import model.bean.CanalInfo;
import model.dao.CanalDAO;

public class PaginaCadastroInfo extends javax.swing.JFrame {
    
    Connection con = ConnectionFactory.getConnection();
    PreparedStatement pst = null;
    ResultSet rs = null;

    public PaginaCadastroInfo() {

        initComponents();
        restaurarDadosComboBoxCargo();
        
    }
    
    public void Plataforma() {
        String sql = "SELECT * FROM cadastro_canal where can_empresa = ?";

        try {

            pst = con.prepareStatement(sql);
            pst.setString(1, (String) cbxCanal.getSelectedItem());

            rs = pst.executeQuery();

            if (rs.next()) {

                String can_plataforma = rs.getString(4);
                //System.out.println(can_plataforma);
                CanalInfo p = new CanalInfo();
                p.setEmpresa((String) cbxCanal.getSelectedItem());
                if (can_plataforma.equals("Token")) {
                    PaginaCadastroInfoToken frm = new PaginaCadastroInfoToken();
                    frm.exportarCadastro(p);
                    frm.setVisible(true);
                    this.dispose();
                } else {
                    PaginaCadastroInfoUs frm = new PaginaCadastroInfoUs();
                    frm.exportarCadastro(p);
                    frm.setVisible(true);
                    this.dispose();
                }

            } else {
                JOptionPane.showMessageDialog(null, "Erro: ");

            }

        } catch (SQLException erro) {

            JOptionPane.showMessageDialog(null, "Erro CanalDAO ListarCargo: " + erro.getMessage());

        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        btn_VoltarCadAtivo = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        jLabel_LogoTelaPrincipal = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        lbl_4dGroupInfoUs = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        lbl_CompInfoUs = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        lbl_cadasCanaInfoUs = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        lbl_canalInfoUs = new javax.swing.JLabel();
        cbxCanal = new javax.swing.JComboBox<>();
        btn_cadastrarInfoUs1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de Informações");
        setAutoRequestFocus(false);
        setMinimumSize(new java.awt.Dimension(850, 600));
        setPreferredSize(new java.awt.Dimension(1200, 630));

        jPanel1.setBackground(new java.awt.Color(255, 62, 21));
        jPanel1.setPreferredSize(new java.awt.Dimension(250, 630));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel11.setBackground(new java.awt.Color(255, 62, 21));
        jPanel11.setPreferredSize(new java.awt.Dimension(100, 200));
        jPanel11.setLayout(new java.awt.GridBagLayout());

        btn_VoltarCadAtivo.setBackground(new java.awt.Color(45, 18, 75));
        btn_VoltarCadAtivo.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        btn_VoltarCadAtivo.setForeground(new java.awt.Color(255, 255, 255));
        btn_VoltarCadAtivo.setText("Voltar");
        btn_VoltarCadAtivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_VoltarCadAtivoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 63;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(60, 40, 93, 30);
        jPanel11.add(btn_VoltarCadAtivo, gridBagConstraints);

        jPanel1.add(jPanel11, java.awt.BorderLayout.PAGE_END);

        jPanel12.setBackground(new java.awt.Color(255, 62, 21));
        jPanel12.setPreferredSize(new java.awt.Dimension(100, 200));
        jPanel12.setLayout(new java.awt.GridBagLayout());

        jLabel_LogoTelaPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/Untitled-removebg-preview.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(40, 60, 27, 57);
        jPanel12.add(jLabel_LogoTelaPrincipal, gridBagConstraints);

        jPanel1.add(jPanel12, java.awt.BorderLayout.PAGE_START);

        getContentPane().add(jPanel1, java.awt.BorderLayout.LINE_END);

        jPanel2.setBackground(new java.awt.Color(241, 241, 241));
        jPanel2.setPreferredSize(new java.awt.Dimension(1020, 630));
        jPanel2.setLayout(new java.awt.BorderLayout());

        jPanel3.setBackground(new java.awt.Color(241, 241, 241));
        jPanel3.setMinimumSize(new java.awt.Dimension(993, 120));
        jPanel3.setPreferredSize(new java.awt.Dimension(0, 120));
        jPanel3.setLayout(new java.awt.BorderLayout());

        jPanel4.setBackground(new java.awt.Color(241, 241, 241));
        jPanel4.setMinimumSize(new java.awt.Dimension(143, 120));
        jPanel4.setPreferredSize(new java.awt.Dimension(150, 100));
        jPanel4.setLayout(new java.awt.GridLayout(1, 0));
        jPanel3.add(jPanel4, java.awt.BorderLayout.LINE_START);

        jPanel5.setBackground(new java.awt.Color(241, 241, 241));
        jPanel5.setMinimumSize(new java.awt.Dimension(850, 150));
        jPanel5.setPreferredSize(new java.awt.Dimension(850, 100));
        jPanel5.setLayout(new java.awt.GridBagLayout());

        lbl_4dGroupInfoUs.setFont(new java.awt.Font("Segoe UI", 1, 70)); // NOI18N
        lbl_4dGroupInfoUs.setForeground(new java.awt.Color(45, 18, 75));
        lbl_4dGroupInfoUs.setText("4D Group");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(30, 170, 26, 213);
        jPanel5.add(lbl_4dGroupInfoUs, gridBagConstraints);

        jPanel3.add(jPanel5, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel3, java.awt.BorderLayout.PAGE_START);

        jPanel6.setBackground(new java.awt.Color(241, 241, 241));
        jPanel6.setLayout(new java.awt.BorderLayout());

        jPanel7.setBackground(new java.awt.Color(241, 241, 241));
        jPanel7.setPreferredSize(new java.awt.Dimension(100, 40));
        jPanel7.setLayout(new java.awt.GridBagLayout());

        lbl_CompInfoUs.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lbl_CompInfoUs.setForeground(new java.awt.Color(45, 18, 75));
        lbl_CompInfoUs.setText("Company");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 430, 8, 368);
        jPanel7.add(lbl_CompInfoUs, gridBagConstraints);

        jPanel6.add(jPanel7, java.awt.BorderLayout.PAGE_START);

        jPanel8.setBackground(new java.awt.Color(241, 241, 241));
        jPanel8.setLayout(new java.awt.BorderLayout());

        jPanel9.setBackground(new java.awt.Color(241, 241, 241));
        jPanel9.setPreferredSize(new java.awt.Dimension(100, 50));
        jPanel9.setLayout(new java.awt.GridBagLayout());

        lbl_cadasCanaInfoUs.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        lbl_cadasCanaInfoUs.setForeground(new java.awt.Color(45, 18, 75));
        lbl_cadasCanaInfoUs.setText("Cadastro de Informações ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 260, 0, 199);
        jPanel9.add(lbl_cadasCanaInfoUs, gridBagConstraints);

        jPanel8.add(jPanel9, java.awt.BorderLayout.PAGE_START);

        jPanel10.setBackground(new java.awt.Color(241, 241, 241));
        jPanel10.setPreferredSize(new java.awt.Dimension(1100, 100));
        jPanel10.setLayout(new java.awt.GridBagLayout());

        lbl_canalInfoUs.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_canalInfoUs.setForeground(new java.awt.Color(45, 18, 75));
        lbl_canalInfoUs.setText("Canal");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 273;
        gridBagConstraints.ipady = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(40, 250, 0, 0);
        jPanel10.add(lbl_canalInfoUs, gridBagConstraints);

        cbxCanal.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        cbxCanal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecionar" }));
        cbxCanal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxCanalActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 352;
        gridBagConstraints.ipady = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 250, 0, 200);
        jPanel10.add(cbxCanal, gridBagConstraints);

        btn_cadastrarInfoUs1.setBackground(new java.awt.Color(255, 62, 21));
        btn_cadastrarInfoUs1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        btn_cadastrarInfoUs1.setForeground(new java.awt.Color(255, 255, 255));
        btn_cadastrarInfoUs1.setText("Salvar");
        btn_cadastrarInfoUs1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cadastrarInfoUs1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 108;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(160, 410, 86, 0);
        jPanel10.add(btn_cadastrarInfoUs1, gridBagConstraints);

        jPanel8.add(jPanel10, java.awt.BorderLayout.CENTER);

        jPanel6.add(jPanel8, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel6, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_VoltarCadAtivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_VoltarCadAtivoActionPerformed
        // TODO add your handling code here:
        new PaginaCadastrosAtivos().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_VoltarCadAtivoActionPerformed

    private void cbxCanalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxCanalActionPerformed

    }//GEN-LAST:event_cbxCanalActionPerformed

    private void btn_cadastrarInfoUs1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cadastrarInfoUs1ActionPerformed
        Plataforma();

    }//GEN-LAST:event_btn_cadastrarInfoUs1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PaginaCadastroInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PaginaCadastroInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PaginaCadastroInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PaginaCadastroInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PaginaCadastroInfo().setVisible(true);
            }
        });
    }
    Vector<Integer> idCanais = new Vector<Integer>();

    public void restaurarDadosComboBoxCargo() {

        try {
            CanalDAO objcanaldao = new CanalDAO();
            ResultSet rs = objcanaldao.listarEmpresa();

            while (rs.next()) {
                idCanais.addElement(rs.getInt(1));
                cbxCanal.addItem(rs.getString(2));
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Carregar ComboBox" + erro);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_VoltarCadAtivo;
    private javax.swing.JButton btn_cadastrarInfoUs1;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbxCanal;
    private javax.swing.JLabel jLabel_LogoTelaPrincipal;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel lbl_4dGroupInfoUs;
    private javax.swing.JLabel lbl_CompInfoUs;
    private javax.swing.JLabel lbl_cadasCanaInfoUs;
    private javax.swing.JLabel lbl_canalInfoUs;
    // End of variables declaration//GEN-END:variables
}
