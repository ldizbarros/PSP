/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion;

import calculadoraclient_v2.MetodosCalculadora;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;


/**
 *
 * @author ldizbarros
 */
public class Calculadora extends javax.swing.JFrame {
    
    int operando=0;
    /**
     * Creates new form Calculadora
     */
    public Calculadora() {
        initComponents();
        this.setLocationRelativeTo(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel = new javax.swing.JPanel();
        jTFCalculos = new javax.swing.JTextField();
        jPanelBotones = new javax.swing.JPanel();
        jB1 = new javax.swing.JButton();
        jB8 = new javax.swing.JButton();
        jB9 = new javax.swing.JButton();
        jBDividir = new javax.swing.JButton();
        jB4 = new javax.swing.JButton();
        jB5 = new javax.swing.JButton();
        jB6 = new javax.swing.JButton();
        jBMultiplicar = new javax.swing.JButton();
        jB7 = new javax.swing.JButton();
        jB2 = new javax.swing.JButton();
        jB3 = new javax.swing.JButton();
        jB0 = new javax.swing.JButton();
        jBMenos = new javax.swing.JButton();
        jBRaiz = new javax.swing.JButton();
        jBIgual = new javax.swing.JButton();
        jBMas = new javax.swing.JButton();
        jBCero = new javax.swing.JButton();
        jBOFF = new javax.swing.JButton();
        lblServerIP = new javax.swing.JLabel();
        lblServerPort = new javax.swing.JLabel();
        txtIPServer = new javax.swing.JTextField();
        txtPORTServer = new javax.swing.JTextField();
        btnSERVER = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora");

        jTFCalculos.setEditable(false);
        jTFCalculos.setFont(new java.awt.Font("Ubuntu Light", 1, 24)); // NOI18N

        jPanelBotones.setBackground(new java.awt.Color(229, 226, 226));

        jB1.setFont(new java.awt.Font("Ubuntu Light", 1, 18)); // NOI18N
        jB1.setText("1");
        jB1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB1ActionPerformed(evt);
            }
        });

        jB8.setFont(new java.awt.Font("Ubuntu Light", 1, 18)); // NOI18N
        jB8.setText("8");
        jB8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jB8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB8ActionPerformed(evt);
            }
        });

        jB9.setFont(new java.awt.Font("Ubuntu Light", 1, 18)); // NOI18N
        jB9.setText("9");
        jB9.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jB9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB9ActionPerformed(evt);
            }
        });

        jBDividir.setFont(new java.awt.Font("Ubuntu Light", 1, 18)); // NOI18N
        jBDividir.setText("/");
        jBDividir.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jBDividir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBDividirActionPerformed(evt);
            }
        });

        jB4.setFont(new java.awt.Font("Ubuntu Light", 1, 18)); // NOI18N
        jB4.setText("4");
        jB4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jB4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB4ActionPerformed(evt);
            }
        });

        jB5.setFont(new java.awt.Font("Ubuntu Light", 1, 18)); // NOI18N
        jB5.setText("5");
        jB5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jB5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB5ActionPerformed(evt);
            }
        });

        jB6.setFont(new java.awt.Font("Ubuntu Light", 1, 18)); // NOI18N
        jB6.setText("6");
        jB6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jB6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB6ActionPerformed(evt);
            }
        });

        jBMultiplicar.setFont(new java.awt.Font("Ubuntu Light", 1, 18)); // NOI18N
        jBMultiplicar.setText("*");
        jBMultiplicar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jBMultiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBMultiplicarActionPerformed(evt);
            }
        });

        jB7.setFont(new java.awt.Font("Ubuntu Light", 1, 18)); // NOI18N
        jB7.setText("7");
        jB7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jB7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB7ActionPerformed(evt);
            }
        });

        jB2.setFont(new java.awt.Font("Ubuntu Light", 1, 18)); // NOI18N
        jB2.setText("2");
        jB2.setToolTipText("");
        jB2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jB2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB2ActionPerformed(evt);
            }
        });

        jB3.setFont(new java.awt.Font("Ubuntu Light", 1, 18)); // NOI18N
        jB3.setText("3");
        jB3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jB3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB3ActionPerformed(evt);
            }
        });

        jB0.setFont(new java.awt.Font("Ubuntu Light", 1, 18)); // NOI18N
        jB0.setText("0");
        jB0.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jB0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB0ActionPerformed(evt);
            }
        });

        jBMenos.setFont(new java.awt.Font("Ubuntu Light", 1, 18)); // NOI18N
        jBMenos.setText("-");
        jBMenos.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jBMenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBMenosActionPerformed(evt);
            }
        });

        jBRaiz.setFont(new java.awt.Font("Ubuntu Light", 1, 18)); // NOI18N
        jBRaiz.setText("Raiz");
        jBRaiz.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jBRaiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBRaizActionPerformed(evt);
            }
        });

        jBIgual.setFont(new java.awt.Font("Ubuntu Light", 1, 18)); // NOI18N
        jBIgual.setText("=");
        jBIgual.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jBIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBIgualActionPerformed(evt);
            }
        });

        jBMas.setFont(new java.awt.Font("Ubuntu Light", 1, 18)); // NOI18N
        jBMas.setText("+");
        jBMas.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jBMas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBMasActionPerformed(evt);
            }
        });

        jBCero.setBackground(new java.awt.Color(255, 51, 51));
        jBCero.setFont(new java.awt.Font("Ubuntu Light", 1, 12)); // NOI18N
        jBCero.setText("AC");
        jBCero.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jBCero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCeroActionPerformed(evt);
            }
        });

        jBOFF.setBackground(new java.awt.Color(51, 153, 255));
        jBOFF.setFont(new java.awt.Font("Ubuntu Light", 1, 12)); // NOI18N
        jBOFF.setText("OFF");
        jBOFF.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jBOFF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBOFFActionPerformed(evt);
            }
        });

        lblServerIP.setText("IP del Server:");

        lblServerPort.setText("Puerto del Server:");

        txtIPServer.setFont(new java.awt.Font("Ubuntu Light", 1, 24)); // NOI18N

        txtPORTServer.setFont(new java.awt.Font("Ubuntu Light", 1, 24)); // NOI18N

        btnSERVER.setBackground(java.awt.Color.lightGray);
        btnSERVER.setFont(new java.awt.Font("Ubuntu Light", 1, 12)); // NOI18N
        btnSERVER.setText("Set Server");
        btnSERVER.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSERVER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSERVERActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelBotonesLayout = new javax.swing.GroupLayout(jPanelBotones);
        jPanelBotones.setLayout(jPanelBotonesLayout);
        jPanelBotonesLayout.setHorizontalGroup(
            jPanelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBotonesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelBotonesLayout.createSequentialGroup()
                        .addComponent(lblServerIP)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtIPServer, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelBotonesLayout.createSequentialGroup()
                            .addComponent(jB4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jB5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jB6, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jBMultiplicar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanelBotonesLayout.createSequentialGroup()
                            .addComponent(lblServerPort)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtPORTServer, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanelBotonesLayout.createSequentialGroup()
                            .addGroup(jPanelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanelBotonesLayout.createSequentialGroup()
                                    .addComponent(jB7, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jB8, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanelBotonesLayout.createSequentialGroup()
                                    .addGap(32, 32, 32)
                                    .addComponent(jBCero, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jBOFF)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanelBotonesLayout.createSequentialGroup()
                                    .addComponent(jB9, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jBDividir, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBotonesLayout.createSequentialGroup()
                                    .addGap(0, 0, Short.MAX_VALUE)
                                    .addComponent(btnSERVER)
                                    .addGap(10, 10, 10))))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelBotonesLayout.createSequentialGroup()
                            .addGroup(jPanelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanelBotonesLayout.createSequentialGroup()
                                    .addComponent(jB0, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jBIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jBRaiz, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanelBotonesLayout.createSequentialGroup()
                                    .addComponent(jB1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jB2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jB3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jBMenos, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBotonesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBMas, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanelBotonesLayout.setVerticalGroup(
            jPanelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBotonesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBOFF)
                    .addComponent(jBCero, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSERVER))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIPServer, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblServerIP, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPORTServer, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblServerPort))
                .addGroup(jPanelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelBotonesLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(jPanelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jB7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jB8, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jB9, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelBotonesLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBDividir, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBMultiplicar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jB4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jB5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jB6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jB1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBMenos, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBMas, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBRaiz, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB0, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        lblServerIP.getAccessibleContext().setAccessibleName("lblServer");

        javax.swing.GroupLayout jPanelLayout = new javax.swing.GroupLayout(jPanel);
        jPanel.setLayout(jPanelLayout);
        jPanelLayout.setHorizontalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTFCalculos, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelLayout.setVerticalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTFCalculos, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBOFFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBOFFActionPerformed
        try {
            MetodosCalculadora.cerrarSocket();
        } catch (IOException ex) {
            Logger.getLogger(Calculadora.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.exit(0);
    }//GEN-LAST:event_jBOFFActionPerformed

    private void jBCeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCeroActionPerformed
        jTFCalculos.setText("");
    }//GEN-LAST:event_jBCeroActionPerformed

    private void jB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB1ActionPerformed
        jTFCalculos.setText(jTFCalculos.getText()+"1");
    }//GEN-LAST:event_jB1ActionPerformed

    private void jB2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB2ActionPerformed
        jTFCalculos.setText(jTFCalculos.getText()+"2");
    }//GEN-LAST:event_jB2ActionPerformed

    private void jB3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB3ActionPerformed
        jTFCalculos.setText(jTFCalculos.getText()+"3");
    }//GEN-LAST:event_jB3ActionPerformed

    private void jB4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB4ActionPerformed
        jTFCalculos.setText(jTFCalculos.getText()+"4");
    }//GEN-LAST:event_jB4ActionPerformed

    private void jB5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB5ActionPerformed
        jTFCalculos.setText(jTFCalculos.getText()+"5");
    }//GEN-LAST:event_jB5ActionPerformed

    private void jB6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB6ActionPerformed
        jTFCalculos.setText(jTFCalculos.getText()+"6");
    }//GEN-LAST:event_jB6ActionPerformed

    private void jB7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB7ActionPerformed
        jTFCalculos.setText(jTFCalculos.getText()+"7");
    }//GEN-LAST:event_jB7ActionPerformed

    private void jB8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB8ActionPerformed
        jTFCalculos.setText(jTFCalculos.getText()+"8");
    }//GEN-LAST:event_jB8ActionPerformed

    private void jB9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB9ActionPerformed
        jTFCalculos.setText(jTFCalculos.getText()+"9");
    }//GEN-LAST:event_jB9ActionPerformed

    private void jB0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB0ActionPerformed
        jTFCalculos.setText(jTFCalculos.getText()+"0");
    }//GEN-LAST:event_jB0ActionPerformed

    private void jBRaizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBRaizActionPerformed
         jTFCalculos.setText(jTFCalculos.getText()+"Raiz");
        operando=5;
    }//GEN-LAST:event_jBRaizActionPerformed

    private void jBIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBIgualActionPerformed
        String calculo = jTFCalculos.getText();
        if (calculo==null){
            JOptionPane.showMessageDialog(jPanelBotones, "No se a introducido ningun numero");
        }else{
            if (operando==0){
                JOptionPane.showMessageDialog(jPanelBotones, "No se a introducido ningun operando");
            }else{
                if (operando==1){
                    String[] numeros = calculo.split(Pattern.quote("+"));
                    int num1 = Integer.parseInt(numeros[0]);
                    int num2 = Integer.parseInt(numeros[1]);
                    try {
                        MetodosCalculadora.operacion(operando, num1, num2);
                    } catch (IOException ex) {
                        Logger.getLogger(Calculadora.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }else if (operando==2){
                    String[] numeros = calculo.split(Pattern.quote("-"));
                    int num1 = Integer.parseInt(numeros[0]);
                    int num2 = Integer.parseInt(numeros[1]);
                    try {
                        MetodosCalculadora.operacion(operando, num1, num2);
                    } catch (IOException ex) {
                        Logger.getLogger(Calculadora.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }else if (operando==3){
                    String[] numeros = calculo.split(Pattern.quote("*"));
                    int num1 = Integer.parseInt(numeros[0]);
                    int num2 = Integer.parseInt(numeros[1]);
                    try {
                        MetodosCalculadora.operacion(operando, num1, num2);
                    } catch (IOException ex) {
                        Logger.getLogger(Calculadora.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }else if (operando==3){
                    String[] numeros = calculo.split(Pattern.quote("/"));
                    int num1 = Integer.parseInt(numeros[0]);
                    int num2 = Integer.parseInt(numeros[1]);
                    try {
                        MetodosCalculadora.operacion(operando, num1, num2);
                    } catch (IOException ex) {
                        Logger.getLogger(Calculadora.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }else{
                    String[] numeros = calculo.split(Pattern.quote("Raiz"));
                    int num1 = Integer.parseInt(numeros[0]);
                    int num2 = 0;
                    try {
                        MetodosCalculadora.operacion(operando, num1, num2);
                    } catch (IOException ex) {
                        Logger.getLogger(Calculadora.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }
        String resultado="";
        try {
            resultado = MetodosCalculadora.recibirResultado();
        } catch (IOException ex) {
            Logger.getLogger(Calculadora.class.getName()).log(Level.SEVERE, null, ex);
        }
        jTFCalculos.setText(resultado);
    }//GEN-LAST:event_jBIgualActionPerformed

    private void jBDividirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBDividirActionPerformed
        jTFCalculos.setText(jTFCalculos.getText()+"/");
        operando=4;
    }//GEN-LAST:event_jBDividirActionPerformed

    private void jBMultiplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBMultiplicarActionPerformed
        jTFCalculos.setText(jTFCalculos.getText()+"*");
        operando=3;
    }//GEN-LAST:event_jBMultiplicarActionPerformed

    private void jBMenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBMenosActionPerformed
        jTFCalculos.setText(jTFCalculos.getText()+"-");
        operando=2;
    }//GEN-LAST:event_jBMenosActionPerformed

    private void jBMasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBMasActionPerformed
        jTFCalculos.setText(jTFCalculos.getText()+"+");
        operando=1;
    }//GEN-LAST:event_jBMasActionPerformed

    private void btnSERVERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSERVERActionPerformed
        String ip = txtIPServer.getText();
        String port = txtPORTServer.getText();
        if (ip.equalsIgnoreCase("localhost") || ip.equalsIgnoreCase("127.0.0.1")){
            try {
                MetodosCalculadora.conexionSocket(ip, port);
            } catch (IOException ex) {
                Logger.getLogger(Calculadora.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            JOptionPane.showMessageDialog(jPanelBotones, "No existe ningun server con la ip introducida");
        }
    }//GEN-LAST:event_btnSERVERActionPerformed

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
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSERVER;
    private javax.swing.JButton jB0;
    private javax.swing.JButton jB1;
    private javax.swing.JButton jB2;
    private javax.swing.JButton jB3;
    private javax.swing.JButton jB4;
    private javax.swing.JButton jB5;
    private javax.swing.JButton jB6;
    private javax.swing.JButton jB7;
    private javax.swing.JButton jB8;
    private javax.swing.JButton jB9;
    private javax.swing.JButton jBCero;
    private javax.swing.JButton jBDividir;
    private javax.swing.JButton jBIgual;
    private javax.swing.JButton jBMas;
    private javax.swing.JButton jBMenos;
    private javax.swing.JButton jBMultiplicar;
    private javax.swing.JButton jBOFF;
    private javax.swing.JButton jBRaiz;
    private javax.swing.JPanel jPanel;
    private javax.swing.JPanel jPanelBotones;
    private javax.swing.JTextField jTFCalculos;
    private javax.swing.JLabel lblServerIP;
    private javax.swing.JLabel lblServerPort;
    private javax.swing.JTextField txtIPServer;
    private javax.swing.JTextField txtPORTServer;
    // End of variables declaration//GEN-END:variables
}