
package proyecto_gauss;

//@author Alfredo Loyola Nabor

import javax.swing.JOptionPane;


public class FrmMatriz_Gauss2 extends javax.swing.JFrame {
FrmComprobacion2 fin=new FrmComprobacion2();//ESTAS VARIABLES SIRVEN PARA DETERMINAR DONDE SE VA A DIRIGIR EL NUMERO, EN ESTE CASO EN """FrmComprobacion_2"""

    
    public FrmMatriz_Gauss2() {
        initComponents();
    }


    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtResultado10 = new javax.swing.JTextField();
        txtResultado11 = new javax.swing.JTextField();
        txtResultado12 = new javax.swing.JTextField();
        btnCalcula = new javax.swing.JButton();
        btnVolver1 = new javax.swing.JButton();
        btnLimpiar1 = new javax.swing.JButton();
        txtValor6 = new javax.swing.JTextField();
        btnComprobacion = new javax.swing.JButton();
        txtValor3 = new javax.swing.JTextField();
        txtResultado3 = new javax.swing.JTextField();
        txtResultado2 = new javax.swing.JTextField();
        txtResultado1 = new javax.swing.JTextField();
        txtResultado4 = new javax.swing.JTextField();
        txtResultado5 = new javax.swing.JTextField();
        txtResultado6 = new javax.swing.JTextField();
        txtValor7 = new javax.swing.JTextField();
        txtValor8 = new javax.swing.JTextField();
        txtValor9 = new javax.swing.JTextField();
        txtValor10 = new javax.swing.JTextField();
        txtValor11 = new javax.swing.JTextField();
        txtValor12 = new javax.swing.JTextField();
        txtResultado7 = new javax.swing.JTextField();
        txtValor1 = new javax.swing.JTextField();
        txtResultado8 = new javax.swing.JTextField();
        txtValor2 = new javax.swing.JTextField();
        txtResultado9 = new javax.swing.JTextField();
        txtValor4 = new javax.swing.JTextField();
        txtValor5 = new javax.swing.JTextField();
        etqIngrese24 = new javax.swing.JLabel();
        etqIngrese23 = new javax.swing.JLabel();
        etqIngrese22 = new javax.swing.JLabel();
        etqBienvendo11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtResultado10.setEditable(false);
        txtResultado10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtResultado10.setMaximumSize(new java.awt.Dimension(60, 20));
        txtResultado10.setMinimumSize(new java.awt.Dimension(60, 20));
        txtResultado10.setPreferredSize(new java.awt.Dimension(60, 20));
        txtResultado10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtResultado10ActionPerformed(evt);
            }
        });

        txtResultado11.setEditable(false);
        txtResultado11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtResultado11.setMaximumSize(new java.awt.Dimension(60, 20));
        txtResultado11.setMinimumSize(new java.awt.Dimension(60, 20));
        txtResultado11.setPreferredSize(new java.awt.Dimension(60, 20));
        txtResultado11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtResultado11ActionPerformed(evt);
            }
        });

        txtResultado12.setEditable(false);
        txtResultado12.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtResultado12.setMaximumSize(new java.awt.Dimension(60, 20));
        txtResultado12.setMinimumSize(new java.awt.Dimension(60, 20));
        txtResultado12.setPreferredSize(new java.awt.Dimension(60, 20));
        txtResultado12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtResultado12ActionPerformed(evt);
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

        btnVolver1.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        btnVolver1.setForeground(new java.awt.Color(255, 0, 0));
        btnVolver1.setText("VOLVER");
        btnVolver1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolver1ActionPerformed(evt);
            }
        });

        btnLimpiar1.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        btnLimpiar1.setForeground(new java.awt.Color(255, 0, 0));
        btnLimpiar1.setText("LIMPIAR");
        btnLimpiar1.setMaximumSize(new java.awt.Dimension(60, 20));
        btnLimpiar1.setMinimumSize(new java.awt.Dimension(60, 20));
        btnLimpiar1.setPreferredSize(new java.awt.Dimension(60, 20));
        btnLimpiar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiar1ActionPerformed(evt);
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

        btnComprobacion.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        btnComprobacion.setForeground(new java.awt.Color(255, 0, 0));
        btnComprobacion.setText("COMPROBAR");
        btnComprobacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprobacionActionPerformed(evt);
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

        txtValor7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtValor7.setMaximumSize(new java.awt.Dimension(60, 20));
        txtValor7.setMinimumSize(new java.awt.Dimension(60, 20));
        txtValor7.setPreferredSize(new java.awt.Dimension(60, 20));
        txtValor7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValor7ActionPerformed(evt);
            }
        });
        txtValor7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtValor7KeyTyped(evt);
            }
        });

        txtValor8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtValor8.setMaximumSize(new java.awt.Dimension(60, 20));
        txtValor8.setMinimumSize(new java.awt.Dimension(60, 20));
        txtValor8.setPreferredSize(new java.awt.Dimension(60, 20));
        txtValor8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValor8ActionPerformed(evt);
            }
        });
        txtValor8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtValor8KeyTyped(evt);
            }
        });

        txtValor9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtValor9.setMaximumSize(new java.awt.Dimension(60, 20));
        txtValor9.setMinimumSize(new java.awt.Dimension(60, 20));
        txtValor9.setPreferredSize(new java.awt.Dimension(60, 20));
        txtValor9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValor9ActionPerformed(evt);
            }
        });
        txtValor9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtValor9KeyTyped(evt);
            }
        });

        txtValor10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtValor10.setMaximumSize(new java.awt.Dimension(60, 20));
        txtValor10.setMinimumSize(new java.awt.Dimension(60, 20));
        txtValor10.setPreferredSize(new java.awt.Dimension(60, 20));
        txtValor10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValor10ActionPerformed(evt);
            }
        });
        txtValor10.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtValor10KeyTyped(evt);
            }
        });

        txtValor11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtValor11.setMaximumSize(new java.awt.Dimension(60, 20));
        txtValor11.setMinimumSize(new java.awt.Dimension(60, 20));
        txtValor11.setPreferredSize(new java.awt.Dimension(60, 20));
        txtValor11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValor11ActionPerformed(evt);
            }
        });
        txtValor11.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtValor11KeyTyped(evt);
            }
        });

        txtValor12.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtValor12.setMaximumSize(new java.awt.Dimension(60, 20));
        txtValor12.setMinimumSize(new java.awt.Dimension(60, 20));
        txtValor12.setPreferredSize(new java.awt.Dimension(60, 20));
        txtValor12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValor12ActionPerformed(evt);
            }
        });
        txtValor12.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtValor12KeyTyped(evt);
            }
        });

        txtResultado7.setEditable(false);
        txtResultado7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtResultado7.setMaximumSize(new java.awt.Dimension(60, 20));
        txtResultado7.setMinimumSize(new java.awt.Dimension(60, 20));
        txtResultado7.setPreferredSize(new java.awt.Dimension(60, 20));
        txtResultado7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtResultado7ActionPerformed(evt);
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

        txtResultado8.setEditable(false);
        txtResultado8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtResultado8.setMaximumSize(new java.awt.Dimension(60, 20));
        txtResultado8.setMinimumSize(new java.awt.Dimension(60, 20));
        txtResultado8.setPreferredSize(new java.awt.Dimension(60, 20));
        txtResultado8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtResultado8ActionPerformed(evt);
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

        txtResultado9.setEditable(false);
        txtResultado9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtResultado9.setMaximumSize(new java.awt.Dimension(60, 20));
        txtResultado9.setMinimumSize(new java.awt.Dimension(60, 20));
        txtResultado9.setPreferredSize(new java.awt.Dimension(60, 20));
        txtResultado9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtResultado9ActionPerformed(evt);
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

        etqIngrese24.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        etqIngrese24.setText("INGRESE SUS VALORES");

        etqIngrese23.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        etqIngrese23.setText("          RESULTADOS");

        etqIngrese22.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        etqIngrese22.setText("                    MATRIZ GAUSSIANA");

        etqBienvendo11.setFont(new java.awt.Font("Cambria", 1, 36)); // NOI18N
        etqBienvendo11.setForeground(new java.awt.Color(255, 0, 0));
        etqBienvendo11.setText("    BIENVENIDO");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(txtValor2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtValor5, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtValor8, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtValor11, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnVolver1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtValor3, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtValor6, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(txtValor9, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtValor12, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(70, 70, 70)
                                        .addComponent(btnLimpiar1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(txtValor1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(etqIngrese24, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtValor4, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtValor7, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtValor10, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(89, 89, 89)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtResultado1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtResultado2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtResultado3, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(etqIngrese23, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(txtResultado5, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(txtResultado8, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(txtResultado4, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(txtResultado7, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(txtResultado6, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(txtResultado9, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtResultado10, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtResultado11, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtResultado12, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(128, 128, 128)
                                .addComponent(btnCalcula, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(67, 67, 67)
                                .addComponent(btnComprobacion))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(316, 316, 316)
                        .addComponent(etqIngrese22, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(324, 324, 324)
                        .addComponent(etqBienvendo11, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(etqBienvendo11, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etqIngrese22, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etqIngrese24, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etqIngrese23, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtValor1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtValor4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtValor7, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtValor10, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtResultado1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtResultado4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtResultado7, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtResultado10, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtValor2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtValor5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtValor8, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtValor11, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtResultado2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtResultado5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtResultado8, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtResultado11, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtValor3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtValor6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtValor9, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtValor12, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtResultado3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtResultado6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtResultado9, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtResultado12, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnLimpiar1, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                        .addComponent(btnCalcula, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                        .addComponent(btnComprobacion, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE))
                    .addComponent(btnVolver1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtResultado10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtResultado10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtResultado10ActionPerformed

    private void txtResultado11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtResultado11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtResultado11ActionPerformed

    private void txtResultado12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtResultado12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtResultado12ActionPerformed

    private void btnCalculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalculaActionPerformed

//EN ESTE APARTADO SE HACE TODO EL PROCESO PARA QUE SE PUEDA GENERAR LOS RESULTADOS PARA DESPUES SUMARLA Y OBTENER
//EL RESULTADO FINAL Y SE PUEDA GUARDAR EN SUS RESPECTIVA CAJA DE TEXTO
        double valor1;
        double valor2;
        double valor3;
        double valor4;
        double valor5;
        double valor6;
        double valor7;
        double valor8;
        double valor9;
        double valor10;
        double valor11;
        double valor12;
        double valor13=0;

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
        double resultado14;
        double resultado15;
        double resultado16;
        double resultado17;
        double resultado18;
        double resultado19;
        double resultado20;
        double resultado21;
        double resultado22;
        double resultado23;
        double resultado24;
        double resultado25;
        double resultado26;
        double resultado27;
        double resultado28;
        double resultado29;
        double resultado30;
        double resultado31;
        double resultado32;

        valor1=Double.parseDouble(this.txtValor1.getText());
        valor2=Double.parseDouble(this.txtValor2.getText());
        valor3=Double.parseDouble(this.txtValor3.getText());
        valor4=Double.parseDouble(this.txtValor4.getText());
        valor5=Double.parseDouble(this.txtValor5.getText());
        valor6=Double.parseDouble(this.txtValor6.getText());
        valor7=Double.parseDouble(this.txtValor7.getText());
        valor8=Double.parseDouble(this.txtValor8.getText());
        valor9=Double.parseDouble(this.txtValor9.getText());
        valor10=Double.parseDouble(this.txtValor10.getText());
        valor11=Double.parseDouble(this.txtValor11.getText());
        valor12=Double.parseDouble(this.txtValor12.getText());

        resultado1=valor2*valor3 - valor3*valor2;//SE ELIMINA LA 1,3
        resultado2=valor2*valor6 - valor3*valor5;
        resultado3=valor2*valor9 - valor3*valor8;
        resultado4=valor2*valor12 - valor3*valor11;

        //this.txtResultado3.setText(String.valueOf(resultado1));//==0
        //this.txtResultado6.setText(String.valueOf(resultado2));//==-20
        //this.txtResultado9.setText(String.valueOf(resultado3));//==8
        //this.txtResultado12.setText(String.valueOf(resultado4));//==4
        //this.txtResultado1.setText(String.valueOf(valor1));//==6
        //this.txtResultado2.setText(String.valueOf(valor2));//==8
        //this.txtResultado4.setText(String.valueOf(valor4));//==3
        //this.txtResultado5.setText(String.valueOf(valor5));//==9
        //this.txtResultado7.setText(String.valueOf(valor7));//==1
        //this.txtResultado8.setText(String.valueOf(valor8));//==6
        //this.txtResultado10.setText(String.valueOf(valor10));//==9
        //this.txtResultado11.setText(String.valueOf(valor11));//==3

        resultado5=valor1*valor2 - valor2*valor1;//SE ELIMINA LA 1,2
        resultado6=valor1*valor5 - valor2*valor4;
        resultado7=valor1*valor8 - valor2*valor7;
        resultado8=valor1*valor11 - valor2*valor10;
        //this.txtResultado2.setText(String.valueOf(resultado5));
        //this.txtResultado5.setText(String.valueOf(resultado6));
        //this.txtResultado8.setText(String.valueOf(resultado7));
        //this.txtResultado11.setText(String.valueOf(resultado8));
        //this.txtResultado1.setText(String.valueOf(valor1));
        //this.txtResultado4.setText(String.valueOf(valor4));
        //this.txtResultado7.setText(String.valueOf(valor7));
        //this.txtResultado10.setText(String.valueOf(valor10));
        //this.txtResultado9.setText(String.valueOf(resultado3));
        //this.txtResultado3.setText(String.valueOf(resultado1));
        //this.txtResultado6.setText(String.valueOf(resultado2));
        //this.txtResultado12.setText(String.valueOf(resultado4));

        resultado9=resultado6 * resultado1 - resultado2 * resultado5;//SE ELIMINA LA 1,2
        resultado10=resultado6 * resultado2 - resultado2 * resultado6;
        resultado11=resultado6 * resultado3 - resultado2 * resultado7;
        resultado12=resultado6 * resultado4 - resultado2 * resultado8;
        this.txtResultado3.setText(String.valueOf(valor13));
        this.txtResultado6.setText(String.valueOf(resultado10));
        //this.txtResultado9.setText(String.valueOf(resultado11));
        //this.txtResultado12.setText(String.valueOf(resultado12));

        resultado13=resultado11 * resultado5 - resultado7 * resultado9;//SE ELIMINA LA 1,2
        resultado14=resultado11 * resultado6 - resultado7 * resultado10;
        resultado15=resultado11 * resultado7 - resultado7 * resultado11;
        resultado16=resultado11 * resultado8 - resultado7 * resultado12;
        this.txtResultado2.setText(String.valueOf(valor13));
        //this.txtResultado5.setText(String.valueOf(resultado14));
        this.txtResultado8.setText(String.valueOf(resultado15));
        //this.txtResultado11.setText(String.valueOf(resultado16));

        resultado17=resultado7 * resultado9 - resultado11 * valor1;
        resultado18=resultado7 * resultado10 - resultado11 * valor4;
        resultado19=resultado7 * resultado11 - resultado11 * resultado7;
        resultado20=valor7 * resultado12 - resultado11 * valor10;
        //this.txtResultado1.setText(String.valueOf(resultado17));
        //this.txtResultado4.setText(String.valueOf(resultado18));
        //this.txtResultado7.setText(String.valueOf(resultado19));
        //this.txtResultado10.setText(String.valueOf(resultado20));

        resultado21=-resultado18 * resultado13 + resultado14 * resultado17;
        resultado22=-resultado18 * resultado14 + resultado14 * resultado18;
        resultado23=-resultado18 * resultado15 + resultado14 * resultado19;
        resultado24=-resultado18 * resultado16 + resultado14 * resultado20;
        //this.txtResultado1.setText(String.valueOf(resultado21));
        this.txtResultado4.setText(String.valueOf(resultado22));
        this.txtResultado7.setText(String.valueOf(resultado23));
        //this.txtResultado10.setText(String.valueOf(resultado24));

        resultado25=resultado21 / resultado21;
        resultado26=resultado14 / resultado14;
        resultado27=resultado11 / resultado11;
        resultado28=resultado24 / resultado21;
        resultado29=resultado16 / resultado14;
        resultado30=resultado12 / resultado11;

        this.txtResultado1.setText(String.valueOf(resultado25));
        this.txtResultado5.setText(String.valueOf(resultado26));
        this.txtResultado9.setText(String.valueOf(resultado27));
        this.txtResultado10.setText(String.valueOf(resultado28));
        this.txtResultado11.setText(String.valueOf(resultado29));
        this.txtResultado12.setText(String.valueOf(resultado30));
    }//GEN-LAST:event_btnCalculaActionPerformed

    private void btnVolver1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolver1ActionPerformed

//ESTA INSTRUCCION DICE QUE AL MOMENTO DE DAR CLIC EN EL BOTON """VOLVER""" TE MANDARA AL FORULARIO """FrmOpc_Matriz"""
        FrmOpc_Matriz abrir=new FrmOpc_Matriz();
        abrir.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnVolver1ActionPerformed

    private void btnLimpiar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiar1ActionPerformed

//ESTOS HACE QUE AL DAR CLIC AL BOTON """LIMPIAR""" SE ELIMINE TODO EL REGISTRO
        txtValor1.setText(null);
        txtValor2.setText(null);
        txtValor3.setText(null);
        txtValor4.setText(null);
        txtValor5.setText(null);
        txtValor6.setText(null);
        txtValor7.setText(null);
        txtValor8.setText(null);
        txtValor9.setText(null);
        txtValor10.setText(null);
        txtValor11.setText(null);
        txtValor12.setText(null);

        txtResultado1.setText(null);
        txtResultado2.setText(null);
        txtResultado3.setText(null);
        txtResultado4.setText(null);
        txtResultado5.setText(null);
        txtResultado6.setText(null);
        txtResultado7.setText(null);
        txtResultado8.setText(null);
        txtResultado9.setText(null);
        txtResultado10.setText(null);
        txtResultado11.setText(null);
        txtResultado12.setText(null);
    }//GEN-LAST:event_btnLimpiar1ActionPerformed

    private void txtValor6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValor6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtValor6ActionPerformed

    private void btnComprobacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprobacionActionPerformed

        //PRIMERA LINEA EN LA COMPROBACION
        fin.txtComprobacion1.setText(txtValor1.getText());
        fin.show();

        fin.txtComprobacion2.setText(txtResultado10.getText());
        fin.show();

        fin.txtComprobacion3.setText(txtValor4.getText());
        fin.show();

        fin.txtComprobacion4.setText(txtResultado11.getText());
        fin.show();

        fin.txtComprobacion5.setText(txtValor7.getText());
        fin.show();

        fin.txtComprobacion6.setText(txtResultado12.getText());
        fin.show();

        //SEGUNDA LINEA EN LA COMPROBACION
        fin.txtComprobacion8.setText(txtValor2.getText());
        fin.show();

        fin.txtComprobacion9.setText(txtResultado10.getText());
        fin.show();

        fin.txtComprobacion10.setText(txtValor5.getText());
        fin.show();

        fin.txtComprobacion11.setText(txtResultado11.getText());
        fin.show();

        fin.txtComprobacion12.setText(txtValor8.getText());
        fin.show();

        fin.txtComprobacion13.setText(txtResultado12.getText());
        fin.show();

        //TERCERA LINEA EN LA COMPROBACION
        fin.txtComprobacion15.setText(txtValor3.getText());
        fin.show();

        fin.txtComprobacion16.setText(txtResultado10.getText());
        fin.show();

        fin.txtComprobacion17.setText(txtValor6.getText());
        fin.show();

        fin.txtComprobacion18.setText(txtResultado11.getText());
        fin.show();

        fin.txtComprobacion19.setText(txtValor9.getText());
        fin.show();

        fin.txtComprobacion20.setText(txtResultado12.getText());
        fin.show();

    }//GEN-LAST:event_btnComprobacionActionPerformed

    private void txtValor3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValor3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtValor3ActionPerformed

    private void txtResultado3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtResultado3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtResultado3ActionPerformed

    private void txtResultado2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtResultado2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtResultado2ActionPerformed

    private void txtResultado1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtResultado1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtResultado1ActionPerformed

    private void txtResultado4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtResultado4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtResultado4ActionPerformed

    private void txtResultado5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtResultado5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtResultado5ActionPerformed

    private void txtResultado6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtResultado6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtResultado6ActionPerformed

    private void txtValor7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValor7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtValor7ActionPerformed

    private void txtValor8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValor8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtValor8ActionPerformed

    private void txtValor9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValor9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtValor9ActionPerformed

    private void txtValor10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValor10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtValor10ActionPerformed

    private void txtValor11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValor11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtValor11ActionPerformed

    private void txtValor12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValor12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtValor12ActionPerformed

    private void txtResultado7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtResultado7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtResultado7ActionPerformed

    private void txtValor1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValor1ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_txtValor1ActionPerformed

    private void txtResultado8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtResultado8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtResultado8ActionPerformed

    private void txtValor2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValor2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtValor2ActionPerformed

    private void txtResultado9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtResultado9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtResultado9ActionPerformed

    private void txtValor4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValor4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtValor4ActionPerformed

    private void txtValor5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValor5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtValor5ActionPerformed

    private void txtValor1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtValor1KeyTyped

//EN ESTE APARTADO LO QUE DICE ES QUE SOLO SE PUEDE INGRESAR NUMEROS EN LA CAJA DE TEXTO, EN ESTE CASO EN LA """txtValor1"""
        char validar=evt.getKeyChar();
        if(Character.isLetter(validar)){
        getToolkit().beep();
        evt.consume();
        JOptionPane.showMessageDialog(rootPane, "INGRESE SOLO NUMERO");
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

    private void txtValor7KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtValor7KeyTyped

//EN ESTE APARTADO LO QUE DICE ES QUE SOLO SE PUEDE INGRESAR NUMEROS EN LA CAJA DE TEXTO, EN ESTE CASO EN LA """txtValor7"""
        char validar=evt.getKeyChar();
        if(Character.isLetter(validar)){
        getToolkit().beep();
        evt.consume();
        JOptionPane.showMessageDialog(rootPane, "INGRESE SOLO NUMERO");
        }
//EN ESTE APARTADO LO QUE DICE ES QUE SOLO SE PUEDE INGRESAR 2 DIGITOS EN LA CAJA DE TEXTO, EN ESTE CASO EN LA """txtValor7"""    
        int Num_Caracter=2;
        if(txtValor7.getText().length()>=Num_Caracter){
        evt.consume();
        JOptionPane.showMessageDialog(rootPane, "MAXIMO 2 DIGITOS");
                }
    }//GEN-LAST:event_txtValor7KeyTyped

    private void txtValor8KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtValor8KeyTyped

//EN ESTE APARTADO LO QUE DICE ES QUE SOLO SE PUEDE INGRESAR NUMEROS EN LA CAJA DE TEXTO, EN ESTE CASO EN LA """txtValor8"""
        char validar=evt.getKeyChar();
        if(Character.isLetter(validar)){
        getToolkit().beep();
        evt.consume();
        JOptionPane.showMessageDialog(rootPane, "INGRESE SOLO NUMERO");
        }
//EN ESTE APARTADO LO QUE DICE ES QUE SOLO SE PUEDE INGRESAR 2 DIGITOS EN LA CAJA DE TEXTO, EN ESTE CASO EN LA """txtValor8"""    
        int Num_Caracter=2;
        if(txtValor8.getText().length()>=Num_Caracter){
        evt.consume();
        JOptionPane.showMessageDialog(rootPane, "MAXIMO 2 DIGITOS");
                }
    }//GEN-LAST:event_txtValor8KeyTyped

    private void txtValor9KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtValor9KeyTyped

//EN ESTE APARTADO LO QUE DICE ES QUE SOLO SE PUEDE INGRESAR NUMEROS EN LA CAJA DE TEXTO, EN ESTE CASO EN LA """txtValor9"""
        char validar=evt.getKeyChar();
        if(Character.isLetter(validar)){
        getToolkit().beep();
        evt.consume();
        JOptionPane.showMessageDialog(rootPane, "INGRESE SOLO NUMERO");
        }
//EN ESTE APARTADO LO QUE DICE ES QUE SOLO SE PUEDE INGRESAR 2 DIGITOS EN LA CAJA DE TEXTO, EN ESTE CASO EN LA """txtValor9"""    
        int Num_Caracter=2;
        if(txtValor9.getText().length()>=Num_Caracter){
        evt.consume();
        JOptionPane.showMessageDialog(rootPane, "MAXIMO 2 DIGITOS");
                }
    }//GEN-LAST:event_txtValor9KeyTyped

    private void txtValor10KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtValor10KeyTyped

//EN ESTE APARTADO LO QUE DICE ES QUE SOLO SE PUEDE INGRESAR NUMEROS EN LA CAJA DE TEXTO, EN ESTE CASO EN LA """txtValor10"""
        char validar=evt.getKeyChar();
        if(Character.isLetter(validar)){
        getToolkit().beep();
        evt.consume();
        JOptionPane.showMessageDialog(rootPane, "INGRESE SOLO NUMERO");
        }
//EN ESTE APARTADO LO QUE DICE ES QUE SOLO SE PUEDE INGRESAR 2 DIGITOS EN LA CAJA DE TEXTO, EN ESTE CASO EN LA """txtValor10"""    
        int Num_Caracter=2;
        if(txtValor10.getText().length()>=Num_Caracter){
        evt.consume();
        JOptionPane.showMessageDialog(rootPane, "MAXIMO 2 DIGITOS");
                }
    }//GEN-LAST:event_txtValor10KeyTyped

    private void txtValor11KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtValor11KeyTyped
//EN ESTE APARTADO LO QUE DICE ES QUE SOLO SE PUEDE INGRESAR NUMEROS EN LA CAJA DE TEXTO, EN ESTE CASO EN LA """txtValor11"""
        char validar=evt.getKeyChar();
        if(Character.isLetter(validar)){
        getToolkit().beep();
        evt.consume();
        JOptionPane.showMessageDialog(rootPane, "INGRESE SOLO NUMERO");
        }
//EN ESTE APARTADO LO QUE DICE ES QUE SOLO SE PUEDE INGRESAR 2 DIGITOS EN LA CAJA DE TEXTO, EN ESTE CASO EN LA """txtValor11"""    
        int Num_Caracter=2;
        if(txtValor11.getText().length()>=Num_Caracter){
        evt.consume();
        JOptionPane.showMessageDialog(rootPane, "MAXIMO 2 DIGITOS");
                }
    }//GEN-LAST:event_txtValor11KeyTyped

    private void txtValor12KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtValor12KeyTyped

//EN ESTE APARTADO LO QUE DICE ES QUE SOLO SE PUEDE INGRESAR NUMEROS EN LA CAJA DE TEXTO, EN ESTE CASO EN LA """txtValor12"""
        char validar=evt.getKeyChar();
        if(Character.isLetter(validar)){
        getToolkit().beep();
        evt.consume();
        JOptionPane.showMessageDialog(rootPane, "INGRESE SOLO NUMERO");
        }
//EN ESTE APARTADO LO QUE DICE ES QUE SOLO SE PUEDE INGRESAR 2 DIGITOS EN LA CAJA DE TEXTO, EN ESTE CASO EN LA """txtValor12"""    
        int Num_Caracter=2;
        if(txtValor12.getText().length()>=Num_Caracter){
        evt.consume();
        JOptionPane.showMessageDialog(rootPane, "MAXIMO 2 DIGITOS");
                }
    }//GEN-LAST:event_txtValor12KeyTyped

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
            java.util.logging.Logger.getLogger(FrmMatriz_Gauss2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMatriz_Gauss2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMatriz_Gauss2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMatriz_Gauss2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMatriz_Gauss2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcula;
    private javax.swing.JButton btnComprobacion;
    private javax.swing.JButton btnLimpiar1;
    private javax.swing.JButton btnVolver1;
    private javax.swing.JLabel etqBienvendo11;
    private javax.swing.JLabel etqIngrese22;
    private javax.swing.JLabel etqIngrese23;
    private javax.swing.JLabel etqIngrese24;
    public javax.swing.JTextField txtResultado1;
    public javax.swing.JTextField txtResultado10;
    public javax.swing.JTextField txtResultado11;
    public javax.swing.JTextField txtResultado12;
    public javax.swing.JTextField txtResultado2;
    public javax.swing.JTextField txtResultado3;
    public javax.swing.JTextField txtResultado4;
    public javax.swing.JTextField txtResultado5;
    public javax.swing.JTextField txtResultado6;
    public javax.swing.JTextField txtResultado7;
    public javax.swing.JTextField txtResultado8;
    public javax.swing.JTextField txtResultado9;
    public javax.swing.JTextField txtValor1;
    public javax.swing.JTextField txtValor10;
    public javax.swing.JTextField txtValor11;
    public javax.swing.JTextField txtValor12;
    public javax.swing.JTextField txtValor2;
    public javax.swing.JTextField txtValor3;
    public javax.swing.JTextField txtValor4;
    public javax.swing.JTextField txtValor5;
    public javax.swing.JTextField txtValor6;
    public javax.swing.JTextField txtValor7;
    public javax.swing.JTextField txtValor8;
    public javax.swing.JTextField txtValor9;
    // End of variables declaration//GEN-END:variables
}
