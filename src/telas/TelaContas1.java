/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package telas;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



/**
 *
 * @author Bruno Eduardo <https://github.com/brnduol>
 */
public class TelaContas1 extends javax.swing.JFrame {

    /**
     * Creates new form TelaContas1
     */
    public TelaContas1() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblConta = new javax.swing.JLabel();
        lblSaldo = new javax.swing.JLabel();
        lblTipo = new javax.swing.JLabel();
        txtConta = new javax.swing.JTextField();
        txtSaldo = new javax.swing.JTextField();
        cmbTipo = new javax.swing.JComboBox<>();
        bntCriar = new javax.swing.JButton();
        bntExcluir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jmPrincipal = new javax.swing.JMenuItem();
        jmHistorico = new javax.swing.JMenuItem();
        jmGraficos = new javax.swing.JMenuItem();
        jmCategorias = new javax.swing.JMenuItem();
        jmSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblConta.setText("Conta");

        lblSaldo.setText("Saldo");

        lblTipo.setText("Tipo");

        cmbTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Despesa", "Receita", " " }));

        bntCriar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/1486485557-add-create-new-more-plus_81188.png"))); // NOI18N
        bntCriar.setText("Criar");
        bntCriar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntCriarActionPerformed(evt);
            }
        });

        bntExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/1486564399-close_81512.png"))); // NOI18N
        bntExcluir.setText("Excluir");
        bntExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntExcluirActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Conta", "Saldo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/1485477024-menu_78574.png"))); // NOI18N
        jMenu2.setText("Menu");

        jmPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/32officeicons-31_89708.png"))); // NOI18N
        jmPrincipal.setText("Tela principal");
        jmPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmPrincipalActionPerformed(evt);
            }
        });
        jMenu2.add(jmPrincipal);

        jmHistorico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Historical_icon-icons.com_54175.png"))); // NOI18N
        jmHistorico.setText("Historico");
        jmHistorico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmHistoricoActionPerformed(evt);
            }
        });
        jMenu2.add(jmHistorico);

        jmGraficos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/1477521928_10_icon-icons.com_74620.png"))); // NOI18N
        jmGraficos.setText("Graficos");
        jmGraficos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmGraficosActionPerformed(evt);
            }
        });
        jMenu2.add(jmGraficos);

        jmCategorias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/1486486297-attribute-category-label-shop-price-price-tag-tag_81213.png"))); // NOI18N
        jmCategorias.setText("Categorias");
        jmCategorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmCategoriasActionPerformed(evt);
            }
        });
        jMenu2.add(jmCategorias);

        jmSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/logout256_24927.png"))); // NOI18N
        jmSair.setText("Sair");
        jmSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmSairActionPerformed(evt);
            }
        });
        jMenu2.add(jmSair);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(57, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblConta, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtConta, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(302, 302, 302))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(198, 198, 198)
                                .addComponent(bntExcluir))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(bntCriar))
                            .addComponent(txtSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblConta)
                    .addComponent(txtConta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSaldo)
                            .addComponent(txtSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTipo)
                            .addComponent(cmbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addComponent(bntCriar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 260, Short.MAX_VALUE)
                        .addComponent(bntExcluir)
                        .addGap(27, 27, 27))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bntCriarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntCriarActionPerformed
        // Obtém o modelo da tabela
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

        // Obtém os dados dos campos de texto
        String conta = txtConta.getText();
        String saldoText = txtSaldo.getText();

        // Verifica se os campos não estão vazios
        if (!conta.isEmpty() && !saldoText.isEmpty()) {
            try {
                // Tenta converter o saldo para um número (Double)
                Double saldo = Double.parseDouble(saldoText);

                // Insere a nova linha na primeira posição (índice 0)
                model.insertRow(0, new Object[]{conta, saldo});

                // Limpa os campos de texto após a inserção
                txtConta.setText("");
                txtSaldo.setText("");
            } catch (NumberFormatException e) {
                // Se não for possível converter, exibe uma mensagem de erro
                JOptionPane.showMessageDialog(this, "Por favor, insira um valor numérico válido para o saldo.");
            }
        } else {
            // Exibe uma mensagem se algum dos campos estiver vazio
            JOptionPane.showMessageDialog(this, "Por favor, preencha todos os campos.");
        }
    }//GEN-LAST:event_bntCriarActionPerformed

    private void bntExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntExcluirActionPerformed
        // Obtém o modelo da tabela
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

        // Verifica se há uma linha selecionada
        int selectedRow = jTable1.getSelectedRow();

        if (selectedRow != -1) {
            // Remove a linha selecionada
            model.removeRow(selectedRow);
        } else {
            // Caso nenhuma linha seja selecionada, exibe uma mensagem de erro
            JOptionPane.showMessageDialog(null, "Selecione uma linha para excluir.");
        }
    }//GEN-LAST:event_bntExcluirActionPerformed

    private void jmCategoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmCategoriasActionPerformed
        // Abrir a tela de categorias
        TelaCategoria1 telaCategoria = new TelaCategoria1();
        telaCategoria.setVisible(true);
        this.dispose(); // Fecha a tela atual
    }//GEN-LAST:event_jmCategoriasActionPerformed

    private void jmPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmPrincipalActionPerformed
        // Abrir a tela principal
        TelaPrincipal1 telaPrincipal = new TelaPrincipal1();
        telaPrincipal.setVisible(true);
        this.dispose(); // Fecha a tela atual
    }//GEN-LAST:event_jmPrincipalActionPerformed

    private void jmHistoricoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmHistoricoActionPerformed
        // Abrir a tela de histórico
        TelaHistorico1 telaHistorico = new TelaHistorico1();
        telaHistorico.setVisible(true);
        this.dispose(); // Fecha a tela atual
    }//GEN-LAST:event_jmHistoricoActionPerformed

    private void jmGraficosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmGraficosActionPerformed
        // Abrir a tela de gráficos
        TelaGrafico1 telaGrafico = new TelaGrafico1();
        telaGrafico.setVisible(true);
        this.dispose(); // Fecha a tela atual
    }//GEN-LAST:event_jmGraficosActionPerformed

    private void jmSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmSairActionPerformed
        // Voltar para a tela principal ao clicar em "Sair"
        TelaPrincipal1 telaPrincipal = new TelaPrincipal1();
        telaPrincipal.setVisible(true);
        this.dispose(); // Fecha a tela atual
    }//GEN-LAST:event_jmSairActionPerformed

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
            java.util.logging.Logger.getLogger(TelaContas1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaContas1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaContas1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaContas1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaContas1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntCriar;
    private javax.swing.JButton bntExcluir;
    private javax.swing.JComboBox<String> cmbTipo;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JMenuItem jmCategorias;
    private javax.swing.JMenuItem jmGraficos;
    private javax.swing.JMenuItem jmHistorico;
    private javax.swing.JMenuItem jmPrincipal;
    private javax.swing.JMenuItem jmSair;
    private javax.swing.JLabel lblConta;
    private javax.swing.JLabel lblSaldo;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JTextField txtConta;
    private javax.swing.JTextField txtSaldo;
    // End of variables declaration//GEN-END:variables
}
