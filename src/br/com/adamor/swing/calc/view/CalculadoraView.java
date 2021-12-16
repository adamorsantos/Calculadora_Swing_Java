/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.adamor.swing.calc.view;

/**
 *
 * @author adamo
 */
public class CalculadoraView extends javax.swing.JFrame {

    /**
     * Creates new form Calculadora
     */
    public CalculadoraView() {
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

        jPanel1 = new javax.swing.JPanel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jPanel2 = new javax.swing.JPanel();
        jTextResultado = new javax.swing.JTextField();
        jButtonLimpar = new javax.swing.JButton();
        jButtonDiv = new javax.swing.JButton();
        jButtonPotencia = new javax.swing.JButton();
        jButtonPorcentagem = new javax.swing.JButton();
        jButtonSete = new javax.swing.JButton();
        jButtonQuatro = new javax.swing.JButton();
        jButtonUm = new javax.swing.JButton();
        jButtonZero = new javax.swing.JButton();
        jButtonOito = new javax.swing.JButton();
        jButtonCinco = new javax.swing.JButton();
        jButtonDois = new javax.swing.JButton();
        jButtonPonto = new javax.swing.JButton();
        jButtonNove = new javax.swing.JButton();
        jButtonSeis = new javax.swing.JButton();
        jButtonTres = new javax.swing.JButton();
        jButtonMulti = new javax.swing.JButton();
        jButtonSubtracao = new javax.swing.JButton();
        jButtonSoma = new javax.swing.JButton();
        jButtonIgual = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora");

        jTextResultado.setEditable(false);
        jTextResultado.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jTextResultado.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jButtonLimpar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonLimpar.setText("C");

        jButtonDiv.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonDiv.setText("/");
        jButtonDiv.setMaximumSize(new java.awt.Dimension(41, 23));
        jButtonDiv.setMinimumSize(new java.awt.Dimension(41, 23));
        jButtonDiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDivActionPerformed(evt);
            }
        });

        jButtonPotencia.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jButtonPotencia.setText("^");
        jButtonPotencia.setMaximumSize(new java.awt.Dimension(41, 23));
        jButtonPotencia.setMinimumSize(new java.awt.Dimension(41, 23));
        jButtonPotencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPotenciaActionPerformed(evt);
            }
        });

        jButtonPorcentagem.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonPorcentagem.setText("%");
        jButtonPorcentagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPorcentagemActionPerformed(evt);
            }
        });

        jButtonSete.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonSete.setText("7");
        jButtonSete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSeteActionPerformed(evt);
            }
        });

        jButtonQuatro.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonQuatro.setText("4");
        jButtonQuatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonQuatroActionPerformed(evt);
            }
        });

        jButtonUm.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonUm.setText("1");
        jButtonUm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUmActionPerformed(evt);
            }
        });

        jButtonZero.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonZero.setText("0");
        jButtonZero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonZeroActionPerformed(evt);
            }
        });

        jButtonOito.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonOito.setText("8");
        jButtonOito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOitoActionPerformed(evt);
            }
        });

        jButtonCinco.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonCinco.setText("5");
        jButtonCinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCincoActionPerformed(evt);
            }
        });

        jButtonDois.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonDois.setText("2");
        jButtonDois.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDoisActionPerformed(evt);
            }
        });

        jButtonPonto.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonPonto.setText(".");

        jButtonNove.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonNove.setText("9");
        jButtonNove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNoveActionPerformed(evt);
            }
        });

        jButtonSeis.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonSeis.setText("6");
        jButtonSeis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSeisActionPerformed(evt);
            }
        });

        jButtonTres.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonTres.setText("3");
        jButtonTres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTresActionPerformed(evt);
            }
        });

        jButtonMulti.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonMulti.setText("*");
        jButtonMulti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMultiActionPerformed(evt);
            }
        });

        jButtonSubtracao.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonSubtracao.setText("-");
        jButtonSubtracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSubtracaoActionPerformed(evt);
            }
        });

        jButtonSoma.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonSoma.setText("+");
        jButtonSoma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSomaActionPerformed(evt);
            }
        });

        jButtonIgual.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonIgual.setText("=");
        jButtonIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIgualActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextResultado)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButtonLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonPotencia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonPorcentagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonDiv, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButtonZero, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonPonto, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonIgual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButtonUm, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonDois, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonTres, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonSoma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jButtonQuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonCinco, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonSeis, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonSubtracao, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jButtonSete, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonOito, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonNove, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonMulti, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonLimpar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonPotencia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonDiv, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButtonPorcentagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSete, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonOito, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonNove, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonMulti, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonQuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCinco, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSeis, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSubtracao, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonUm, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonDois, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonTres, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSoma, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonZero, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonPonto, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonZeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonZeroActionPerformed
        String n0 = "0";
        int num0 = Integer.parseInt(n0);
        jTextResultado.setText(n0);
    }//GEN-LAST:event_jButtonZeroActionPerformed

    private void jButtonUmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUmActionPerformed
        String n1 = "1";
        int num1 = Integer.parseInt(n1);
        jTextResultado.setText(n1);
    }//GEN-LAST:event_jButtonUmActionPerformed

    private void jButtonDoisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDoisActionPerformed
        String n2 = "2";
        int num2 = Integer.parseInt(n2);
        jTextResultado.setText(n2);
    }//GEN-LAST:event_jButtonDoisActionPerformed

    private void jButtonTresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTresActionPerformed
        String n3 = "3";
        int num3 = Integer.parseInt(n3);
        jTextResultado.setText(n3);
    }//GEN-LAST:event_jButtonTresActionPerformed

    private void jButtonQuatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonQuatroActionPerformed
        String n4 = "4";
        int num4 = Integer.parseInt(n4);
        jTextResultado.setText(n4);
    }//GEN-LAST:event_jButtonQuatroActionPerformed

    private void jButtonCincoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCincoActionPerformed
        String n5 = "5";
        int num5 = Integer.parseInt(n5);
        jTextResultado.setText(n5);
    }//GEN-LAST:event_jButtonCincoActionPerformed

    private void jButtonSeisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSeisActionPerformed
        String n6 = "6";
        int num6 = Integer.parseInt(n6);
        jTextResultado.setText(n6);
    }//GEN-LAST:event_jButtonSeisActionPerformed

    private void jButtonSeteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSeteActionPerformed
        String n7 = "7";
        int num7 = Integer.parseInt(n7);
        jTextResultado.setText(n7);
    }//GEN-LAST:event_jButtonSeteActionPerformed

    private void jButtonOitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOitoActionPerformed
        String n8 = "8";
        int num8 = Integer.parseInt(n8);
        jTextResultado.setText(n8);
    }//GEN-LAST:event_jButtonOitoActionPerformed

    private void jButtonNoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNoveActionPerformed
        String n9 = "9";
        int num9 = Integer.parseInt(n9);
        jTextResultado.setText(n9);
    }//GEN-LAST:event_jButtonNoveActionPerformed

    private void jButtonSomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSomaActionPerformed
        String simb_soma = "+";
        jTextResultado.setText(simb_soma);
    }//GEN-LAST:event_jButtonSomaActionPerformed

    private void jButtonSubtracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSubtracaoActionPerformed
        String simb_sub = "-";
        jTextResultado.setText(simb_sub);
    }//GEN-LAST:event_jButtonSubtracaoActionPerformed

    private void jButtonMultiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMultiActionPerformed
        String simb_mult = "x";
        jTextResultado.setText(simb_mult);
    }//GEN-LAST:event_jButtonMultiActionPerformed

    private void jButtonDivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDivActionPerformed
        String simb_div = "/";
        jTextResultado.setText(simb_div);
    }//GEN-LAST:event_jButtonDivActionPerformed

    private void jButtonIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIgualActionPerformed
        String simb_igual = "=";
        jTextResultado.setText(simb_igual);
    }//GEN-LAST:event_jButtonIgualActionPerformed

    private void jButtonPotenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPotenciaActionPerformed
        String simb_potencia = "^";
        jTextResultado.setText(simb_potencia);
    }//GEN-LAST:event_jButtonPotenciaActionPerformed

    private void jButtonPorcentagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPorcentagemActionPerformed
        String simb_porcento = "%";
        jTextResultado.setText(simb_porcento);
    }//GEN-LAST:event_jButtonPorcentagemActionPerformed

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
            java.util.logging.Logger.getLogger(CalculadoraView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalculadoraView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalculadoraView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalculadoraView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalculadoraView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCinco;
    private javax.swing.JButton jButtonDiv;
    private javax.swing.JButton jButtonDois;
    private javax.swing.JButton jButtonIgual;
    private javax.swing.JButton jButtonLimpar;
    private javax.swing.JButton jButtonMulti;
    private javax.swing.JButton jButtonNove;
    private javax.swing.JButton jButtonOito;
    private javax.swing.JButton jButtonPonto;
    private javax.swing.JButton jButtonPorcentagem;
    private javax.swing.JButton jButtonPotencia;
    private javax.swing.JButton jButtonQuatro;
    private javax.swing.JButton jButtonSeis;
    private javax.swing.JButton jButtonSete;
    private javax.swing.JButton jButtonSoma;
    private javax.swing.JButton jButtonSubtracao;
    private javax.swing.JButton jButtonTres;
    private javax.swing.JButton jButtonUm;
    private javax.swing.JButton jButtonZero;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextResultado;
    // End of variables declaration//GEN-END:variables
}