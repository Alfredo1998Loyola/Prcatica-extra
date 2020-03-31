
package proyecto_gauss;

//@author Alfredo Loyola Nabor

import javax.swing.JOptionPane;


public class FrmError extends javax.swing.JFrame {


    public FrmError() {
        initComponents();
    }


    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtRelativo = new javax.swing.JTextField();
        etqValor33 = new javax.swing.JLabel();
        txtPorcentual = new javax.swing.JTextField();
        etqValor44 = new javax.swing.JLabel();
        btnVolver2 = new javax.swing.JButton();
        txtValor1 = new javax.swing.JTextField();
        btnLimpiar = new javax.swing.JButton();
        txtValor2 = new javax.swing.JTextField();
        btnCalcular = new javax.swing.JButton();
        etqResulltado = new javax.swing.JLabel();
        etqSuma = new javax.swing.JLabel();
        etqResta = new javax.swing.JLabel();
        etqMultiplicacion = new javax.swing.JLabel();
        etqBienvendo11 = new javax.swing.JLabel();
        txtAbsoluto = new javax.swing.JTextField();
        etqIngrese22 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtRelativo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtRelativo.setMaximumSize(new java.awt.Dimension(60, 20));
        txtRelativo.setMinimumSize(new java.awt.Dimension(60, 20));
        txtRelativo.setPreferredSize(new java.awt.Dimension(60, 20));

        etqValor33.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        etqValor33.setText("             VALOR 1");

        txtPorcentual.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPorcentual.setMaximumSize(new java.awt.Dimension(60, 20));
        txtPorcentual.setMinimumSize(new java.awt.Dimension(60, 20));
        txtPorcentual.setPreferredSize(new java.awt.Dimension(60, 20));

        etqValor44.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        etqValor44.setText("             VALOR 2");

        btnVolver2.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        btnVolver2.setForeground(new java.awt.Color(255, 0, 0));
        btnVolver2.setText("VOLVER");
        btnVolver2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolver2ActionPerformed(evt);
            }
        });

        txtValor1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtValor1.setMaximumSize(new java.awt.Dimension(60, 20));
        txtValor1.setMinimumSize(new java.awt.Dimension(60, 20));
        txtValor1.setPreferredSize(new java.awt.Dimension(60, 20));
        txtValor1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValor1ActionPerformed(evt);
            }
        });
        txtValor1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtValor1KeyTyped(evt);
            }
        });

        btnLimpiar.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(255, 0, 0));
        btnLimpiar.setText("LIMPIAR");
        btnLimpiar.setMaximumSize(new java.awt.Dimension(60, 20));
        btnLimpiar.setMinimumSize(new java.awt.Dimension(60, 20));
        btnLimpiar.setPreferredSize(new java.awt.Dimension(60, 20));
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        txtValor2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtValor2.setMaximumSize(new java.awt.Dimension(60, 20));
        txtValor2.setMinimumSize(new java.awt.Dimension(60, 20));
        txtValor2.setPreferredSize(new java.awt.Dimension(60, 20));
        txtValor2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtValor2KeyTyped(evt);
            }
        });

        btnCalcular.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        btnCalcular.setForeground(new java.awt.Color(255, 0, 0));
        btnCalcular.setText("CALCULAR");
        btnCalcular.setMaximumSize(new java.awt.Dimension(60, 20));
        btnCalcular.setMinimumSize(new java.awt.Dimension(60, 20));
        btnCalcular.setPreferredSize(new java.awt.Dimension(60, 20));
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        etqResulltado.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        etqResulltado.setText("         RESUTADOS");

        etqSuma.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        etqSuma.setText("ERROR ABSOLUTO");

        etqResta.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        etqResta.setText("ERROR RELATIVO");

        etqMultiplicacion.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        etqMultiplicacion.setText("ERROR PORCENTUAL");

        etqBienvendo11.setFont(new java.awt.Font("Cambria", 1, 36)); // NOI18N
        etqBienvendo11.setForeground(new java.awt.Color(255, 0, 0));
        etqBienvendo11.setText("        BIENVENIDO");

        txtAbsoluto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtAbsoluto.setMaximumSize(new java.awt.Dimension(60, 20));
        txtAbsoluto.setMinimumSize(new java.awt.Dimension(60, 20));
        txtAbsoluto.setPreferredSize(new java.awt.Dimension(60, 20));

        etqIngrese22.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        etqIngrese22.setText("INGRESE SUS VALORES");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etqBienvendo11, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtValor1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(etqSuma, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(etqResta, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(etqMultiplicacion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                                    .addComponent(btnCalcular, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(etqValor33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(etqResulltado, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtValor2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtAbsoluto, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtRelativo, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPorcentual, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnVolver2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(etqValor44, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addComponent(etqIngrese22, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etqBienvendo11, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(etqIngrese22, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etqValor33, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(etqValor44, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtValor1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtValor2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etqResulltado, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCalcular, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etqSuma, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAbsoluto, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etqResta, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRelativo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etqMultiplicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPorcentual, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVolver2, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE))
                .addGap(33, 33, 33))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolver2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolver2ActionPerformed

////ESTA INSTRUCCION DICE QUE AL MOMENTO DE DAR CLIC EN EL BOTON """VOLVER""" TE MANDARA AL FORULARIO """FrmMenu"""
        FrmMenu abrir=new FrmMenu();
        abrir.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnVolver2ActionPerformed

    private void txtValor1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValor1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtValor1ActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
 
//ESTOS HACE QUE AL DAR CLIC AL BOTON """LIMPIAR""" SE ELIMINE TODO EL REGISTRO DE LAS CAJAS DE TEXTOS SIGUENTE:
        txtValor1.setText(null);
        txtValor2.setText(null);
        txtAbsoluto.setText(null);
        txtRelativo.setText(null);
        txtPorcentual.setText(null);
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed

////ESTAS VARIABLES SON PARA QUE SE MULTIPLIQUEN MUTUAMENTE (DEPENDE DE LA CONDICION PLASMADA) ENTRE SI Y OBTENER LOS RESUTADOS REQUERIDOS
        double valor1;
        double valor2;
        double absoluto1;
        double relativo;
        double porcentual;
        valor1=Double.parseDouble(this.txtValor1.getText());
        valor2=Double.parseDouble(this.txtValor2.getText());
        absoluto1=valor1-valor2;
        relativo=absoluto1/valor1;
        porcentual=relativo*100;
        this.txtAbsoluto.setText(String.valueOf(absoluto1));
        this.txtRelativo.setText(String.valueOf(relativo));
        this.txtPorcentual.setText(String.valueOf(porcentual));
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void txtValor1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtValor1KeyTyped

//EN ESTE APARTADO LO QUE DICE ES QUE SOLO SE PUEDE INGRESAR NUMEROS EN LA CAJA DE TEXTO, EN ESTE CASO EN LA """txtValor1"""
        char validar=evt.getKeyChar();
        if(Character.isLetter(validar)){
        getToolkit().beep();
        evt.consume();
        JOptionPane.showMessageDialog(rootPane, "INGRESE SOLO NUMERO");
        }
//EN ESTE APARTADO LO QUE DICE ES QUE SOLO SE PUEDE INGRESAR 2 DIGITOS EN LA CAJA DE TEXTO, EN ESTE CASO EN LA """txtValor1"""    
        int Num_Caracter=8;
        if(txtValor1.getText().length()>=Num_Caracter){
        evt.consume();
        JOptionPane.showMessageDialog(rootPane, "MAXIMO 8 DIGITOS");
                }
    }//GEN-LAST:event_txtValor1KeyTyped

    private void txtValor2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtValor2KeyTyped

//EN ESTE APARTADO LO QUE DICE ES QUE SOLO SE PUEDE INGRESAR NUMEROS EN LA CAJA DE TEXTO, EN ESTE CASO EN LA """txtValor2"""
        char validar=evt.getKeyChar();
        if(Character.isLetter(validar)){
        getToolkit().beep();
        evt.consume();
        JOptionPane.showMessageDialog(rootPane, "INGRESE SOLO NUMERO");
        }
//EN ESTE APARTADO LO QUE DICE ES QUE SOLO SE PUEDE INGRESAR 2 DIGITOS EN LA CAJA DE TEXTO, EN ESTE CASO EN LA """txtValor2"""    
        int Num_Caracter=8;
        if(txtValor2.getText().length()>=Num_Caracter){
        evt.consume();
        JOptionPane.showMessageDialog(rootPane, "MAXIMO 8 DIGITOS");
                }
    }//GEN-LAST:event_txtValor2KeyTyped

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
            java.util.logging.Logger.getLogger(FrmError.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmError.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmError.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmError.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmError().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnVolver2;
    private javax.swing.JLabel etqBienvendo11;
    private javax.swing.JLabel etqIngrese22;
    private javax.swing.JLabel etqMultiplicacion;
    private javax.swing.JLabel etqResta;
    private javax.swing.JLabel etqResulltado;
    private javax.swing.JLabel etqSuma;
    private javax.swing.JLabel etqValor33;
    private javax.swing.JLabel etqValor44;
    private javax.swing.JTextField txtAbsoluto;
    private javax.swing.JTextField txtPorcentual;
    private javax.swing.JTextField txtRelativo;
    private javax.swing.JTextField txtValor1;
    private javax.swing.JTextField txtValor2;
    // End of variables declaration//GEN-END:variables
}
