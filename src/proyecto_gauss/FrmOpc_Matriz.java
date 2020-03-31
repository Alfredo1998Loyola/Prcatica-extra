
package proyecto_gauss;

//@author Alfredo Loyola Nabor

public class FrmOpc_Matriz extends javax.swing.JFrame {


    public FrmOpc_Matriz() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnVolver2 = new javax.swing.JButton();
        btnMatriz = new javax.swing.JButton();
        etqBienvenido1 = new javax.swing.JLabel();
        etqBien = new javax.swing.JLabel();
        btnMatriz2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnVolver2.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        btnVolver2.setText("VOLVER");
        btnVolver2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolver2ActionPerformed(evt);
            }
        });

        btnMatriz.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        btnMatriz.setText("MATRIZ 3 * 3");
        btnMatriz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMatrizActionPerformed(evt);
            }
        });

        etqBienvenido1.setFont(new java.awt.Font("Cambria", 1, 36)); // NOI18N
        etqBienvenido1.setForeground(new java.awt.Color(255, 0, 0));
        etqBienvenido1.setText("   BIENVENIDO");

        etqBien.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        etqBien.setForeground(new java.awt.Color(255, 0, 0));
        etqBien.setText("        ELIGE LA OPCION QUE DESEE");

        btnMatriz2.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        btnMatriz2.setText("MATRIZ 2 * 2");
        btnMatriz2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMatriz2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etqBien, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(etqBienvenido1)
                            .addComponent(btnMatriz2, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnMatriz, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(btnVolver2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(etqBienvenido1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etqBien, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnMatriz2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnMatriz, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnVolver2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolver2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolver2ActionPerformed

//ESTA INSTRUCCION DICE QUE AL MOMENTO DE DAR CLIC EN EL BOTON """VOLVER""" TE MANDARA AL FORULARIO """FrmMenu"""
        FrmMenu abrir=new FrmMenu();
        abrir.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnVolver2ActionPerformed

    private void btnMatrizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMatrizActionPerformed

//ESTA INSTRUCCION DICE QUE AL MOMENTO DE DAR CLIC EN EL BOTON """MATRIZ 3 * 3""" TE MANDARA AL FORULARIO """Matriz_Gauss2"""
        FrmMatriz_Gauss2 abrir=new FrmMatriz_Gauss2();
        abrir.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnMatrizActionPerformed

    private void btnMatriz2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMatriz2ActionPerformed

//ESTA INSTRUCCION DICE QUE AL MOMENTO DE DAR CLIC EN EL BOTON """MATRIZ 2 * 2""" TE MANDARA AL FORULARIO """FrmMatriz_Gauss1"""  
        FrmMatriz_Gauss1 abrir=new FrmMatriz_Gauss1();
        abrir.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnMatriz2ActionPerformed

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
            java.util.logging.Logger.getLogger(FrmOpc_Matriz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmOpc_Matriz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmOpc_Matriz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmOpc_Matriz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmOpc_Matriz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMatriz;
    private javax.swing.JButton btnMatriz2;
    private javax.swing.JButton btnVolver2;
    private javax.swing.JLabel etqBien;
    private javax.swing.JLabel etqBienvenido1;
    // End of variables declaration//GEN-END:variables
}
