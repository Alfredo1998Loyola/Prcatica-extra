
package proyecto_gauss;

//@author Alfredo Loyola Nabor

import javax.swing.JOptionPane;


public class FrmMatriz_Gauss1 extends javax.swing.JFrame {
FrmComprobacion1 fin=new FrmComprobacion1();//ESTAS VARIABLES SIRVEN PARA DETERMINAR DONDE SE VA A DIRIGIR EL NUMERO, EN ESTE CASO EN """FrmComprobacion_1"""


    public FrmMatriz_Gauss1() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtResultado1 = new javax.swing.JTextField();
        txtResultado2 = new javax.swing.JTextField();
        txtValor1 = new javax.swing.JTextField();
        txtResultado3 = new javax.swing.JTextField();
        txtValor2 = new javax.swing.JTextField();
        txtResultado4 = new javax.swing.JTextField();
        txtValor4 = new javax.swing.JTextField();
        txtResultado5 = new javax.swing.JTextField();
        txtValor5 = new javax.swing.JTextField();
        txtResultado6 = new javax.swing.JTextField();
        btnVolver2 = new javax.swing.JButton();
        btnCalcula = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnComprobacion = new javax.swing.JButton();
        txtValor6 = new javax.swing.JTextField();
        txtValor3 = new javax.swing.JTextField();
        etqBienvendo11 = new javax.swing.JLabel();
        etqIngrese22 = new javax.swing.JLabel();
        etqIngrese24 = new javax.swing.JLabel();
        etqIngrese23 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtResultado1.setEditable(false);
        txtResultado1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtResultado1.setMaximumSize(new java.awt.Dimension(60, 20));
        txtResultado1.setMinimumSize(new java.awt.Dimension(60, 20));
        txtResultado1.setPreferredSize(new java.awt.Dimension(60, 20));
        txtResultado1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtResultado1ActionPerformed(evt);
            }
        });

        txtResultado2.setEditable(false);
        txtResultado2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtResultado2.setMaximumSize(new java.awt.Dimension(60, 20));
        txtResultado2.setMinimumSize(new java.awt.Dimension(60, 20));
        txtResultado2.setPreferredSize(new java.awt.Dimension(60, 20));
        txtResultado2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtResultado2ActionPerformed(evt);
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

        txtResultado3.setEditable(false);
        txtResultado3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtResultado3.setMaximumSize(new java.awt.Dimension(60, 20));
        txtResultado3.setMinimumSize(new java.awt.Dimension(60, 20));
        txtResultado3.setPreferredSize(new java.awt.Dimension(60, 20));
        txtResultado3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtResultado3ActionPerformed(evt);
            }
        });

        txtValor2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtValor2.setMaximumSize(new java.awt.Dimension(60, 20));
        txtValor2.setMinimumSize(new java.awt.Dimension(60, 20));
        txtValor2.setPreferredSize(new java.awt.Dimension(60, 20));
        txtValor2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValor2ActionPerformed(evt);
            }
        });
        txtValor2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtValor2KeyTyped(evt);
            }
        });

        txtResultado4.setEditable(false);
        txtResultado4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtResultado4.setMaximumSize(new java.awt.Dimension(60, 20));
        txtResultado4.setMinimumSize(new java.awt.Dimension(60, 20));
        txtResultado4.setPreferredSize(new java.awt.Dimension(60, 20));
        txtResultado4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtResultado4ActionPerformed(evt);
            }
        });

        txtValor4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtValor4.setMaximumSize(new java.awt.Dimension(60, 20));
        txtValor4.setMinimumSize(new java.awt.Dimension(60, 20));
        txtValor4.setPreferredSize(new java.awt.Dimension(60, 20));
        txtValor4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValor4ActionPerformed(evt);
            }
        });
        txtValor4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtValor4KeyTyped(evt);
            }
        });

        txtResultado5.setEditable(false);
        txtResultado5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtResultado5.setMaximumSize(new java.awt.Dimension(60, 20));
        txtResultado5.setMinimumSize(new java.awt.Dimension(60, 20));
        txtResultado5.setPreferredSize(new java.awt.Dimension(60, 20));
        txtResultado5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtResultado5ActionPerformed(evt);
            }
        });

        txtValor5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtValor5.setMaximumSize(new java.awt.Dimension(60, 20));
        txtValor5.setMinimumSize(new java.awt.Dimension(60, 20));
        txtValor5.setPreferredSize(new java.awt.Dimension(60, 20));
        txtValor5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValor5ActionPerformed(evt);
            }
        });
        txtValor5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtValor5KeyTyped(evt);
            }
        });

        txtResultado6.setEditable(false);
        txtResultado6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtResultado6.setMaximumSize(new java.awt.Dimension(60, 20));
        txtResultado6.setMinimumSize(new java.awt.Dimension(60, 20));
        txtResultado6.setPreferredSize(new java.awt.Dimension(60, 20));
        txtResultado6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtResultado6ActionPerformed(evt);
            }
        });

        btnVolver2.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        btnVolver2.setForeground(new java.awt.Color(255, 0, 0));
        btnVolver2.setText("VOLVER");
        btnVolver2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolver2ActionPerformed(evt);
            }
        });

        btnCalcula.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        btnCalcula.setForeground(new java.awt.Color(255, 0, 0));
        btnCalcula.setText("CALCULAR");
        btnCalcula.setMaximumSize(new java.awt.Dimension(60, 20));
        btnCalcula.setMinimumSize(new java.awt.Dimension(60, 20));
        btnCalcula.setPreferredSize(new java.awt.Dimension(60, 20));
        btnCalcula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalculaActionPerformed(evt);
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

        btnComprobacion.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        btnComprobacion.setForeground(new java.awt.Color(255, 0, 0));
        btnComprobacion.setText("COMPROBAR");
        btnComprobacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprobacionActionPerformed(evt);
            }
        });

        txtValor6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtValor6.setMaximumSize(new java.awt.Dimension(60, 20));
        txtValor6.setMinimumSize(new java.awt.Dimension(60, 20));
        txtValor6.setPreferredSize(new java.awt.Dimension(60, 20));
        txtValor6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValor6ActionPerformed(evt);
            }
        });
        txtValor6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtValor6KeyTyped(evt);
            }
        });

        txtValor3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtValor3.setMaximumSize(new java.awt.Dimension(60, 20));
        txtValor3.setMinimumSize(new java.awt.Dimension(60, 20));
        txtValor3.setPreferredSize(new java.awt.Dimension(60, 20));
        txtValor3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValor3ActionPerformed(evt);
            }
        });
        txtValor3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtValor3KeyTyped(evt);
            }
        });

        etqBienvendo11.setFont(new java.awt.Font("Cambria", 1, 36)); // NOI18N
        etqBienvendo11.setForeground(new java.awt.Color(255, 0, 0));
        etqBienvendo11.setText("      BIENVENIDO");

        etqIngrese22.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        etqIngrese22.setText("                      MATRIZ GAUSSIANA");

        etqIngrese24.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        etqIngrese24.setText("INGRESE SUS VALORES");

        etqIngrese23.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        etqIngrese23.setText("          RESULTADOS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(218, 218, 218)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etqBienvendo11, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etqIngrese22, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtValor1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtValor3, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtValor5, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtValor2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtValor4, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtValor6, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnVolver2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(97, 97, 97)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(101, 101, 101)
                                .addComponent(txtResultado4, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtResultado6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnCalcula, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(btnComprobacion))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtResultado2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtResultado1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(19, 19, 19)
                                .addComponent(txtResultado3, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtResultado5, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(etqIngrese24, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(226, 226, 226)
                        .addComponent(etqIngrese23, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etqBienvendo11, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etqIngrese22, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etqIngrese24, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etqIngrese23, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtValor1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtValor3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtValor5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtValor6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtValor2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtValor4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtResultado1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtResultado3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtResultado5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtResultado6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtResultado2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtResultado4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVolver2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnComprobacion, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCalcula, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtResultado1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtResultado1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtResultado1ActionPerformed

    private void txtResultado2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtResultado2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtResultado2ActionPerformed

    private void txtValor1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValor1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtValor1ActionPerformed

    private void txtResultado3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtResultado3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtResultado3ActionPerformed

    private void txtValor2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValor2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtValor2ActionPerformed

    private void txtResultado4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtResultado4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtResultado4ActionPerformed

    private void txtValor4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValor4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtValor4ActionPerformed

    private void txtResultado5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtResultado5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtResultado5ActionPerformed

    private void txtValor5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValor5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtValor5ActionPerformed

    private void txtResultado6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtResultado6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtResultado6ActionPerformed

    private void btnVolver2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolver2ActionPerformed

//ESTA INSTRUCCION DICE QUE AL MOMENTO DE DAR CLIC EN EL BOTON """VOLVER""" TE MANDARA AL FORULARIO """FrmOpc_Matriz"""
        FrmOpc_Matriz abrir=new FrmOpc_Matriz();
        abrir.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnVolver2ActionPerformed

    private void btnCalculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalculaActionPerformed

        //Se elimina cualquier espacio en blanco 
//String validar = txtValor1.getText().trim(); 
//Si no ha escrito nada 
//if( validar.length()== 0 ) { 
//JOptionPane.showMessageDialog(rootPane, "FAVOR DE LLENAR TODOS LOS CAMPOS SIN DEJAR VACIOS");

//}
        
        
        
//EN ESTE APARTADO SE HACE TODO EL PROCESO PARA QUE SE PUEDA GENERAR LOS RESULTADOS PARA DESPUES SUMARLA Y OBTENER
//EL RESULTADO FINAL Y SE PUEDA GUARDAR EN SUS RESPECTIVA CAJA DE TEXTO
        double valor1;
        double valor2;
        double valor3;
        double valor4;
        double valor5;
        double valor6;

        double resultado1;
        double resultado2;
        double resultado3;
        double resultado4;
        double resultado5;
        double resultado6;
        double resultado7;
        double resultado8;
        double resultado9;
        double resultado10;
        double resultado11;
        double resultado12;
        double resultado13;

        valor1=Double.parseDouble(this.txtValor1.getText());
        valor2=Double.parseDouble(this.txtValor2.getText());
        valor3=Double.parseDouble(this.txtValor3.getText());
        valor4=Double.parseDouble(this.txtValor4.getText());
        valor5=Double.parseDouble(this.txtValor5.getText());
        valor6=Double.parseDouble(this.txtValor6.getText());

        resultado1=valor1*valor2 - valor2*valor1;//0
        resultado2=valor1*valor4 - valor2*valor3;
        resultado3=valor1*valor6 - valor2*valor5;
        this.txtResultado2.setText(String.valueOf(resultado1));//0
        //this.txtResultado4.setText(String.valueOf(resultado2));
        //this.txtResultado6.setText(String.valueOf(resultado3));

        resultado4=valor3*resultado1 - resultado2 * valor1;
        resultado5=valor3*resultado2 - resultado2 * valor3;
        resultado6=valor3*resultado3 - resultado2 * valor5;
        //this.txtResultado1.setText(String.valueOf(resultado4));
        this.txtResultado3.setText(String.valueOf(resultado5));
        //this.txtResultado5.setText(String.valueOf(resultado6));

        resultado7=resultado4/resultado4;
        resultado8=resultado2/resultado2;
        resultado9=resultado6/resultado4;
        resultado10=resultado3/resultado2;
        this.txtResultado1.setText(String.valueOf(resultado7));
        this.txtResultado4.setText(String.valueOf(resultado8));
        this.txtResultado5.setText(String.valueOf(resultado9));
        this.txtResultado6.setText(String.valueOf(resultado10));
    }//GEN-LAST:event_btnCalculaActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed

//ESTOS HACE QUE AL DAR CLIC AL BOTON """LIMPIAR""" SE ELIMINE TODO EL REGISTRO
        txtValor1.setText(null);
        txtValor2.setText(null);
        txtValor3.setText(null);
        txtValor4.setText(null);
        txtValor5.setText(null);
        txtValor6.setText(null);

        txtResultado1.setText(null);
        txtResultado2.setText(null);
        txtResultado3.setText(null);
        txtResultado4.setText(null);
        txtResultado5.setText(null);
        txtResultado6.setText(null);
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnComprobacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprobacionActionPerformed


        //PRIMERA LINEA DE LA MATRIZ
        fin.txtComprobacion1.setText(txtValor1.getText());
        fin.show();

        fin.txtComprobacion2.setText(txtResultado5.getText());
        fin.show();

        fin.txtComprobacion3.setText(txtValor3.getText());
        fin.show();

        fin.txtComprobacion4.setText(txtResultado6.getText());
        fin.show();

        //SEGUNDA LINEA DE LA MATRIZ
        fin.txtComprobacion6.setText(txtValor2.getText());
        fin.show();

        fin.txtComprobacion7.setText(txtResultado5.getText());
        fin.show();

        fin.txtComprobacion8.setText(txtValor4.getText());
        fin.show();

        fin.txtComprobacion9.setText(txtResultado6.getText());
        fin.show();

    }//GEN-LAST:event_btnComprobacionActionPerformed

    private void txtValor6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValor6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtValor6ActionPerformed

    private void txtValor3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValor3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtValor3ActionPerformed

    private void txtValor1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtValor1KeyTyped
     
//EN ESTE APARTADO LO QUE DICE ES QUE SOLO SE PUEDE INGRESAR NUMEROS EN LA CAJA DE TEXTO, EN ESTE CASO EN LA """txtValor1"""
        char validar=evt.getKeyChar();
        if(Character.isLetter(validar)){
        getToolkit().beep();
        evt.consume();

        }
//EN ESTE APARTADO LO QUE DICE ES QUE SOLO SE PUEDE INGRESAR 2 DIGITOS EN LA CAJA DE TEXTO, EN ESTE CASO EN LA """txtValor1"""    
        int Num_Caracter=2;
        if(txtValor1.getText().length()>=Num_Caracter){
        evt.consume();
        JOptionPane.showMessageDialog(rootPane, "MAXIMO 2 DIGITOS");
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
        int Num_Caracter=2;
        if(txtValor2.getText().length()>=Num_Caracter){
        evt.consume();
        JOptionPane.showMessageDialog(rootPane, "MAXIMO 2 DIGITOS");
                }
    }//GEN-LAST:event_txtValor2KeyTyped

    private void txtValor3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtValor3KeyTyped

//EN ESTE APARTADO LO QUE DICE ES QUE SOLO SE PUEDE INGRESAR NUMEROS EN LA CAJA DE TEXTO, EN ESTE CASO EN LA """txtValor3"""
        char validar=evt.getKeyChar();
        if(Character.isLetter(validar)){
        getToolkit().beep();
        evt.consume();
        JOptionPane.showMessageDialog(rootPane, "INGRESE SOLO NUMERO");
        }
//EN ESTE APARTADO LO QUE DICE ES QUE SOLO SE PUEDE INGRESAR 2 DIGITOS EN LA CAJA DE TEXTO, EN ESTE CASO EN LA """txtValor3"""    
        int Num_Caracter=2;
        if(txtValor3.getText().length()>=Num_Caracter){
        evt.consume();
        JOptionPane.showMessageDialog(rootPane, "MAXIMO 2 DIGITOS");
                }
    }//GEN-LAST:event_txtValor3KeyTyped

    private void txtValor4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtValor4KeyTyped

//EN ESTE APARTADO LO QUE DICE ES QUE SOLO SE PUEDE INGRESAR NUMEROS EN LA CAJA DE TEXTO, EN ESTE CASO EN LA """txtValor4"""
        char validar=evt.getKeyChar();
        if(Character.isLetter(validar)){
        getToolkit().beep();
        evt.consume();
        JOptionPane.showMessageDialog(rootPane, "INGRESE SOLO NUMERO");
        }
//EN ESTE APARTADO LO QUE DICE ES QUE SOLO SE PUEDE INGRESAR 2 DIGITOS EN LA CAJA DE TEXTO, EN ESTE CASO EN LA """txtValor4"""    
        int Num_Caracter=2;
        if(txtValor4.getText().length()>=Num_Caracter){
        evt.consume();
        JOptionPane.showMessageDialog(rootPane, "MAXIMO 2 DIGITOS");
                }
    }//GEN-LAST:event_txtValor4KeyTyped

    private void txtValor5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtValor5KeyTyped

//EN ESTE APARTADO LO QUE DICE ES QUE SOLO SE PUEDE INGRESAR NUMEROS EN LA CAJA DE TEXTO, EN ESTE CASO EN LA """txtValor5"""
        char validar=evt.getKeyChar();
        if(Character.isLetter(validar)){
        getToolkit().beep();
        evt.consume();
        JOptionPane.showMessageDialog(rootPane, "INGRESE SOLO NUMERO");
        }
//EN ESTE APARTADO LO QUE DICE ES QUE SOLO SE PUEDE INGRESAR 2 DIGITOS EN LA CAJA DE TEXTO, EN ESTE CASO EN LA """txtValor5"""    
        int Num_Caracter=2;
        if(txtValor5.getText().length()>=Num_Caracter){
        evt.consume();
        JOptionPane.showMessageDialog(rootPane, "MAXIMO 2 DIGITOS");
                }
    }//GEN-LAST:event_txtValor5KeyTyped

    private void txtValor6KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtValor6KeyTyped

//EN ESTE APARTADO LO QUE DICE ES QUE SOLO SE PUEDE INGRESAR NUMEROS EN LA CAJA DE TEXTO, EN ESTE CASO EN LA """txtValor6"""
        char validar=evt.getKeyChar();
        if(Character.isLetter(validar)){
        getToolkit().beep();
        evt.consume();
        JOptionPane.showMessageDialog(rootPane, "INGRESE SOLO NUMERO");
        }
//EN ESTE APARTADO LO QUE DICE ES QUE SOLO SE PUEDE INGRESAR 2 DIGITOS EN LA CAJA DE TEXTO, EN ESTE CASO EN LA """txtValor6"""    
        int Num_Caracter=2;
        if(txtValor6.getText().length()>=Num_Caracter){
        evt.consume();
        JOptionPane.showMessageDialog(rootPane, "MAXIMO 2 DIGITOS");
                }
    }//GEN-LAST:event_txtValor6KeyTyped

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
            java.util.logging.Logger.getLogger(FrmMatriz_Gauss1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMatriz_Gauss1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMatriz_Gauss1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMatriz_Gauss1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMatriz_Gauss1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcula;
    private javax.swing.JButton btnComprobacion;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnVolver2;
    private javax.swing.JLabel etqBienvendo11;
    private javax.swing.JLabel etqIngrese22;
    private javax.swing.JLabel etqIngrese23;
    private javax.swing.JLabel etqIngrese24;
    public javax.swing.JTextField txtResultado1;
    public javax.swing.JTextField txtResultado2;
    public javax.swing.JTextField txtResultado3;
    public javax.swing.JTextField txtResultado4;
    public javax.swing.JTextField txtResultado5;
    public javax.swing.JTextField txtResultado6;
    public javax.swing.JTextField txtValor1;
    public javax.swing.JTextField txtValor2;
    public javax.swing.JTextField txtValor3;
    public javax.swing.JTextField txtValor4;
    public javax.swing.JTextField txtValor5;
    public javax.swing.JTextField txtValor6;
    // End of variables declaration//GEN-END:variables
}
