package ex4_calculadora;

// @author jean //
public class ex4a
extends javax.swing.JFrame {

    double entradaNum1;
    double entradaNum2;
    double resultado;
    String op;

    public ex4a() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jtxtVisor = new javax.swing.JTextField();
        jbtnAC = new javax.swing.JButton();
        jbtnPorc = new javax.swing.JButton();
        jbtnBar = new javax.swing.JButton();
        jbtnMult = new javax.swing.JButton();
        jbtnD7 = new javax.swing.JButton();
        jbtnD8 = new javax.swing.JButton();
        jbtnD9 = new javax.swing.JButton();
        jbtnSub = new javax.swing.JButton();
        jbtnD4 = new javax.swing.JButton();
        jbtnD5 = new javax.swing.JButton();
        jbtnD6 = new javax.swing.JButton();
        jbtnAdd = new javax.swing.JButton();
        jbtnD1 = new javax.swing.JButton();
        jbtnD2 = new javax.swing.JButton();
        jbtnD3 = new javax.swing.JButton();
        jbtnD0 = new javax.swing.JButton();
        jbtnPonto = new javax.swing.JButton();
        jbtnEqual = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtxtVisor.setEditable(false);
        jtxtVisor.setFont(new java.awt.Font("Segoe UI", 0, 40)); // NOI18N
        jtxtVisor.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jbtnAC.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jbtnAC.setText("AC");
        jbtnAC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnACActionPerformed(evt);
            }
        });

        jbtnPorc.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jbtnPorc.setText("%");
        jbtnPorc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPorcActionPerformed(evt);
            }
        });

        jbtnBar.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jbtnBar.setText("/");
        jbtnBar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnBarActionPerformed(evt);
            }
        });

        jbtnMult.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jbtnMult.setText("x");
        jbtnMult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnMultActionPerformed(evt);
            }
        });

        jbtnD7.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jbtnD7.setText("7");
        jbtnD7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnD7ActionPerformed(evt);
            }
        });

        jbtnD8.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jbtnD8.setText("8");
        jbtnD8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnD8ActionPerformed(evt);
            }
        });

        jbtnD9.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jbtnD9.setText("9");
        jbtnD9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnD9ActionPerformed(evt);
            }
        });

        jbtnSub.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jbtnSub.setText("-");
        jbtnSub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSubActionPerformed(evt);
            }
        });

        jbtnD4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jbtnD4.setText("4");
        jbtnD4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnD4ActionPerformed(evt);
            }
        });

        jbtnD5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jbtnD5.setText("5");
        jbtnD5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnD5ActionPerformed(evt);
            }
        });

        jbtnD6.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jbtnD6.setText("6");
        jbtnD6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnD6ActionPerformed(evt);
            }
        });

        jbtnAdd.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jbtnAdd.setText("+");
        jbtnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAddActionPerformed(evt);
            }
        });

        jbtnD1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jbtnD1.setText("1");
        jbtnD1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnD1ActionPerformed(evt);
            }
        });

        jbtnD2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jbtnD2.setText("2");
        jbtnD2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnD2ActionPerformed(evt);
            }
        });

        jbtnD3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jbtnD3.setText("3");
        jbtnD3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnD3ActionPerformed(evt);
            }
        });

        jbtnD0.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jbtnD0.setText("0");
        jbtnD0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnD0ActionPerformed(evt);
            }
        });

        jbtnPonto.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jbtnPonto.setText(".");
        jbtnPonto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPontoActionPerformed(evt);
            }
        });

        jbtnEqual.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jbtnEqual.setText("=");
        jbtnEqual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnEqualActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jtxtVisor, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jbtnAC, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(2, 2, 2)
                            .addComponent(jbtnPorc, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(2, 2, 2)
                            .addComponent(jbtnBar, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(2, 2, 2)
                            .addComponent(jbtnMult, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jbtnD7, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(2, 2, 2)
                            .addComponent(jbtnD8, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(2, 2, 2)
                            .addComponent(jbtnD9, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(2, 2, 2)
                            .addComponent(jbtnSub, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jbtnD4, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(2, 2, 2)
                            .addComponent(jbtnD5, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(2, 2, 2)
                            .addComponent(jbtnD6, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(2, 2, 2)
                            .addComponent(jbtnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jbtnD1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(2, 2, 2)
                                    .addComponent(jbtnD2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jbtnD0, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(2, 2, 2)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jbtnD3, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jbtnPonto, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(2, 2, 2)
                            .addComponent(jbtnEqual, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 430, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jtxtVisor, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(13, 13, 13)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jbtnAC, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbtnPorc, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbtnBar, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbtnMult, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(3, 3, 3)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jbtnD7, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbtnD8, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbtnD9, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbtnSub, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(3, 3, 3)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jbtnD4, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbtnD5, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbtnD6, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbtnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(3, 3, 3)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jbtnD1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jbtnD2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(3, 3, 3)
                            .addComponent(jbtnD0, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jbtnD3, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(3, 3, 3)
                            .addComponent(jbtnPonto, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jbtnEqual, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 430));

        pack();

    private void Entrada (String q)
    {
        String Nums = jtxtVisor.getText() + q;
        jtxtVisor.setText(Nums);
    }

    private void jbtnACActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnACActionPerformed
        jtxtVisor.setText("");

        String fn, sn;

        fn = String.valueOf(entradaNum1);
        sn = String.valueOf(entradaNum2);

        fn = "";
        sn = "";
    }//GEN-LAST:event_jbtnACActionPerformed

    private void jbtnPorcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPorcActionPerformed
        entradaNum1 = Double.parseDouble(jtxtVisor.getText());
        op = "%";
    }//GEN-LAST:event_jbtnPorcActionPerformed

    private void jbtnBarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnBarActionPerformed
        entradaNum1 = Double.parseDouble(jtxtVisor.getText());
        jtxtVisor.setText("");
        op = "/";
    }//GEN-LAST:event_jbtnBarActionPerformed

    private void jbtnMultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnMultActionPerformed
        entradaNum1 = Double.parseDouble(jtxtVisor.getText());
        jtxtVisor.setText("");
        op = "*";
    }//GEN-LAST:event_jbtnMultActionPerformed

    private void jbtnD7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnD7ActionPerformed
        Entrada("7");
    }//GEN-LAST:event_jbtnD7ActionPerformed

    private void jbtnD8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnD8ActionPerformed
        Entrada("8");
    }//GEN-LAST:event_jbtnD8ActionPerformed

    private void jbtnD9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnD9ActionPerformed
        Entrada("9");
    }//GEN-LAST:event_jbtnD9ActionPerformed

    private void jbtnSubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSubActionPerformed
        String currentText = jtxtVisor.getText();

    if (currentText.isEmpty() || currentText.equals("-")) {
        jtxtVisor.setText("-");
    } else {
        entradaNum1 = Double.parseDouble(currentText);
        jtxtVisor.setText("");
        op = "-";
        }
    }//GEN-LAST:event_jbtnSubActionPerformed

    private void jbtnD4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnD4ActionPerformed
        Entrada("4");
    }//GEN-LAST:event_jbtnD4ActionPerformed

    private void jbtnD5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnD5ActionPerformed
        Entrada("5");
    }//GEN-LAST:event_jbtnD5ActionPerformed

    private void jbtnD6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnD6ActionPerformed
        Entrada("6");
    }//GEN-LAST:event_jbtnD6ActionPerformed

    private void jbtnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAddActionPerformed
        entradaNum1 = Double.parseDouble(jtxtVisor.getText());
        jtxtVisor.setText("");
        op = "+";
    }//GEN-LAST:event_jbtnAddActionPerformed

    private void jbtnD1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnD1ActionPerformed
        Entrada("1");
    }

    private void jbtnD2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnD2ActionPerformed
        Entrada("2");
    }

    private void jbtnD3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnD3ActionPerformed
        Entrada("3");
    }

    private void jbtnD0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnD0ActionPerformed
        Entrada("0");
    }

    private void jbtnPontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPontoActionPerformed
        if (! jtxtVisor.getText().contains("."))
        {
            jtxtVisor.setText(jtxtVisor.getText() + jbtnPonto.getText());
        }
    }

    private void jbtnEqualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnEqualActionPerformed
        entradaNum2 = Double.parseDouble(jtxtVisor.getText());
        if (op == "+")
        {
            resultado = entradaNum1 + entradaNum2;
            jtxtVisor.setText(String.valueOf(resultado));
        } else if (op == "-")
        {
            resultado = entradaNum1 - entradaNum2;
            jtxtVisor.setText(String.valueOf(resultado));
        } else if (op == "*")
        {
            resultado = entradaNum1 * entradaNum2;
            jtxtVisor.setText(String.valueOf(resultado));
        } else if (op == "/")
        {
            resultado = entradaNum1 / entradaNum2;
            jtxtVisor.setText(String.valueOf(resultado));
        } else if (op == "%")
        {
            resultado = Double.parseDouble(jtxtVisor.getText())/100;
            jtxtVisor.setText(String.valueOf(resultado));
        }
    }
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new calculadora().setVisible(true);
            }
        });
    }
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbtnAC;
    private javax.swing.JButton jbtnAdd;
    private javax.swing.JButton jbtnBar;
    private javax.swing.JButton jbtnD0;
    private javax.swing.JButton jbtnD1;
    private javax.swing.JButton jbtnD2;
    private javax.swing.JButton jbtnD3;
    private javax.swing.JButton jbtnD4;
    private javax.swing.JButton jbtnD5;
    private javax.swing.JButton jbtnD6;
    private javax.swing.JButton jbtnD7;
    private javax.swing.JButton jbtnD8;
    private javax.swing.JButton jbtnD9;
    private javax.swing.JButton jbtnEqual;
    private javax.swing.JButton jbtnMult;
    private javax.swing.JButton jbtnPonto;
    private javax.swing.JButton jbtnPorc;
    private javax.swing.JButton jbtnSub;
    private javax.swing.JTextField jtxtVisor;
}