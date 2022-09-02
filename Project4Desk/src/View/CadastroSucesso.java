/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

/**
 *
 * @author justx
 */
public class CadastroSucesso extends javax.swing.JFrame {

    /**
     * Creates new form PaginaCadastroVagas
     */
    public CadastroSucesso() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        btn_VoltarCad = new javax.swing.JButton();
        panel_quadLarCadas = new javax.swing.JPanel();
        lbl_logoCadas = new javax.swing.JLabel();
        lbl_cadasCanaisCadas = new javax.swing.JLabel();
        lbl_senhaCad = new javax.swing.JLabel();
        lbl_crieSuaConta = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setPreferredSize(new java.awt.Dimension(1200, 630));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_VoltarCad.setBackground(new java.awt.Color(204, 204, 204));
        btn_VoltarCad.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        btn_VoltarCad.setText("Voltar");
        btn_VoltarCad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_VoltarCadActionPerformed(evt);
            }
        });
        jPanel2.add(btn_VoltarCad, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 460, 200, 60));

        panel_quadLarCadas.setBackground(new java.awt.Color(255, 62, 21));

        lbl_logoCadas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/Untitled-removebg-preview.png"))); // NOI18N

        lbl_cadasCanaisCadas.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        lbl_cadasCanaisCadas.setForeground(new java.awt.Color(255, 255, 255));
        lbl_cadasCanaisCadas.setText("Cadastro");

        javax.swing.GroupLayout panel_quadLarCadasLayout = new javax.swing.GroupLayout(panel_quadLarCadas);
        panel_quadLarCadas.setLayout(panel_quadLarCadasLayout);
        panel_quadLarCadasLayout.setHorizontalGroup(
            panel_quadLarCadasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_quadLarCadasLayout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(lbl_cadasCanaisCadas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 746, Short.MAX_VALUE)
                .addComponent(lbl_logoCadas, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79))
        );
        panel_quadLarCadasLayout.setVerticalGroup(
            panel_quadLarCadasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_quadLarCadasLayout.createSequentialGroup()
                .addGroup(panel_quadLarCadasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_quadLarCadasLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbl_logoCadas, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_quadLarCadasLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(lbl_cadasCanaisCadas)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(panel_quadLarCadas, new org.netbeans.lib.awtextra.AbsoluteConstraints(-4, 0, 1240, 140));

        lbl_senhaCad.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_senhaCad.setForeground(new java.awt.Color(45, 18, 75));
        lbl_senhaCad.setText("Voltar ao Login!!!");
        jPanel2.add(lbl_senhaCad, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 410, -1, -1));

        lbl_crieSuaConta.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        lbl_crieSuaConta.setForeground(new java.awt.Color(45, 18, 75));
        lbl_crieSuaConta.setText("Cadastro Realizado com Sucesso!!!");
        jPanel2.add(lbl_crieSuaConta, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 300, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_VoltarCadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_VoltarCadActionPerformed
        // TODO add your handling code here:
        new Login().setVisible(true);
	this.dispose();
    }//GEN-LAST:event_btn_VoltarCadActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroSucesso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroSucesso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroSucesso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroSucesso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new CadastroSucesso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_VoltarCad;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbl_cadasCanaisCadas;
    private javax.swing.JLabel lbl_crieSuaConta;
    private javax.swing.JLabel lbl_logoCadas;
    private javax.swing.JLabel lbl_senhaCad;
    private javax.swing.JPanel panel_quadLarCadas;
    // End of variables declaration//GEN-END:variables
}
