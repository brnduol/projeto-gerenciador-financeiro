
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package telas;


import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
 
/**
 *
 * @author Bruno Eduardo <https://github.com/brnduol>
 */
public class TelaHistorico1 extends javax.swing.JFrame {
    private ArrayList<Object[]> listaHistoricos; // Lista genérica para armazenar os dados do histórico

    /**
     * Creates new form TelaHistorico1
     */
    public TelaHistorico1() {
        initComponents();
        this.setLocationRelativeTo(null);
        carregarMesHistorico();  
        carregarAnoHistorico();
    }
    
    public void carregarTabela(){
        // Criar o modelo da tabela
        DefaultTableModel modelo = new DefaultTableModel(new Object[]{"Conta", "Data", "Valor", "Tipo", "Categoria"}, 0);
        
        // Filtrar os dados e adicionar as linhas na tabela
        String mesSelecionado = cbMesHistorico.getSelectedItem().toString();
        String anoSelecionado = cbAnoHistorico.getSelectedItem().toString();
        
        for (Object[] item : listaHistoricos) {
            String data = item[1].toString(); // Supondo que a data esteja na segunda coluna (índice 1)
            String[] partesData = data.split("/"); // Supondo que a data esteja no formato "dd/mm/aaaa"
            
            String mesHistorico = partesData[1]; // Mês da data
            String anoHistorico = partesData[2]; // Ano da data
            
            // Verificar se o item corresponde ao mês e ano selecionados
            if (mesHistorico.equalsIgnoreCase(mesSelecionado) && anoHistorico.equals(anoSelecionado)) { // equalsIgnoreCase()ignora a diferença de maiúsculas e minúsculas
                modelo.addRow(item); // Adiciona o item à tabela
            }
        }
        
        if (modelo.getRowCount() > 0) {
            tblHistorico.setModel(modelo);
            } else {
                JOptionPane.showMessageDialog(null, "Nenhuma transação encontrada para o mês e ano selecionados", "Mensagem", JOptionPane.PLAIN_MESSAGE);
            }
        
        // Configurar largura da tabela
        tblHistorico.getColumnModel().getColumn(0).setPreferredWidth(10);
        tblHistorico.getColumnModel().getColumn(1).setPreferredWidth(10);
        tblHistorico.getColumnModel().getColumn(2).setPreferredWidth(30);
        tblHistorico.getColumnModel().getColumn(3).setPreferredWidth(10);
        tblHistorico.getColumnModel().getColumn(4).setPreferredWidth(10);
    
    }
    
    public void carregarMesHistorico(){
            //Remover os itens da ComboBox
            cbMesHistorico.removeAllItems();

            cbMesHistorico.addItem("Selecione um mês");

            String[] meses = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", 
                  "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};

            // Adiciona os meses ao JComboBox
            for (String mes : meses) {
                cbMesHistorico.addItem(mes);

            }
        }
    
     public void carregarAnoHistorico(){
            //Remover os itens da ComboBox
            cbAnoHistorico.removeAllItems();

            cbAnoHistorico.addItem("Selecione um ano");

            String[] anos = {"2024", "2025"};

            // Adiciona os meses ao JComboBox
            for (String ano : anos) {
                cbAnoHistorico.addItem(ano);

            }
        }



    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblHistorico = new javax.swing.JTable();
        lblMesHistorico = new javax.swing.JLabel();
        lblAnoHistorico = new javax.swing.JLabel();
        btnPesquisarHistorico = new javax.swing.JButton();
        cbMesHistorico = new javax.swing.JComboBox<>();
        cbAnoHistorico = new javax.swing.JComboBox<>();
        menuHistorico = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        btContasHistorico = new javax.swing.JMenuItem();
        btHistorico = new javax.swing.JMenuItem();
        btGraficosHistorico = new javax.swing.JMenuItem();
        btCategoriasHistorico = new javax.swing.JMenuItem();
        btSairHistorico = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblHistorico.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Conta", "Data", "Valor", "Tipo", "Categoria"
            }
        ));
        jScrollPane1.setViewportView(tblHistorico);

        lblMesHistorico.setText("Mês");

        lblAnoHistorico.setText("Ano");

        btnPesquisarHistorico.setText("Pesquisar");
        btnPesquisarHistorico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarHistoricoActionPerformed(evt);
            }
        });

        cbMesHistorico.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbMesHistorico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbMesHistoricoActionPerformed(evt);
            }
        });

        cbAnoHistorico.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/1485477024-menu_78574.png"))); // NOI18N
        jMenu3.setText("Menu");

        btContasHistorico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/shoppaymentorderbuy-23_icon-icons.com_73884.png"))); // NOI18N
        btContasHistorico.setText("Contas");
        btContasHistorico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btContasHistoricoActionPerformed(evt);
            }
        });
        jMenu3.add(btContasHistorico);

        btHistorico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Historical_icon-icons.com_54175.png"))); // NOI18N
        btHistorico.setText("Historico");
        btHistorico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btHistoricoActionPerformed(evt);
            }
        });
        jMenu3.add(btHistorico);

        btGraficosHistorico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/1477521928_10_icon-icons.com_74620.png"))); // NOI18N
        btGraficosHistorico.setText("Graficos");
        btGraficosHistorico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGraficosHistoricoActionPerformed(evt);
            }
        });
        jMenu3.add(btGraficosHistorico);

        btCategoriasHistorico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/1486486297-attribute-category-label-shop-price-price-tag-tag_81213.png"))); // NOI18N
        btCategoriasHistorico.setText("Categorias");
        btCategoriasHistorico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCategoriasHistoricoActionPerformed(evt);
            }
        });
        jMenu3.add(btCategoriasHistorico);

        btSairHistorico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/logout256_24927.png"))); // NOI18N
        btSairHistorico.setText("Sair");
        btSairHistorico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairHistoricoActionPerformed(evt);
            }
        });
        jMenu3.add(btSairHistorico);

        menuHistorico.add(jMenu3);

        setJMenuBar(menuHistorico);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 864, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMesHistorico, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAnoHistorico, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbMesHistorico, 0, 103, Short.MAX_VALUE)
                            .addComponent(cbAnoHistorico, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(286, 286, 286)
                        .addComponent(btnPesquisarHistorico)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMesHistorico)
                    .addComponent(cbMesHistorico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addComponent(btnPesquisarHistorico)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAnoHistorico)
                    .addComponent(cbAnoHistorico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbMesHistoricoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbMesHistoricoActionPerformed
    
    }//GEN-LAST:event_cbMesHistoricoActionPerformed

    private void btnPesquisarHistoricoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarHistoricoActionPerformed

        int index1 = cbAnoHistorico.getSelectedIndex();
        int index2 = cbMesHistorico.getSelectedIndex();

        if (index1 == 0 || index2 == 0) {
            // Verifica se algum item foi selecionado (item obrigatório)
            JOptionPane.showMessageDialog(null, "Todos os campos devem ser selecionados", "Mensagem", JOptionPane.PLAIN_MESSAGE);
        } else {
            // Verifica se a lista de históricos está vazia
            if (listaHistoricos.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Você não possui transação", "Mensagem", JOptionPane.PLAIN_MESSAGE);
            } else {
                carregarTabela();
                }
            }
        


    }//GEN-LAST:event_btnPesquisarHistoricoActionPerformed

    private void btSairHistoricoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairHistoricoActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btSairHistoricoActionPerformed

    private void btContasHistoricoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btContasHistoricoActionPerformed
        new TelaContas1().setVisible(true);
    }//GEN-LAST:event_btContasHistoricoActionPerformed

    private void btHistoricoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btHistoricoActionPerformed
        new TelaHistorico1().setVisible(true);
    }//GEN-LAST:event_btHistoricoActionPerformed

    private void btGraficosHistoricoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGraficosHistoricoActionPerformed
        new TelaGrafico1().setVisible(true);
    }//GEN-LAST:event_btGraficosHistoricoActionPerformed

    private void btCategoriasHistoricoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCategoriasHistoricoActionPerformed
        new TelaCategoria1().setVisible(true);
    }//GEN-LAST:event_btCategoriasHistoricoActionPerformed

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
            java.util.logging.Logger.getLogger(TelaHistorico1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaHistorico1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaHistorico1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaHistorico1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaHistorico1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem btCategoriasHistorico;
    private javax.swing.JMenuItem btContasHistorico;
    private javax.swing.JMenuItem btGraficosHistorico;
    private javax.swing.JMenuItem btHistorico;
    private javax.swing.JMenuItem btSairHistorico;
    private javax.swing.JButton btnPesquisarHistorico;
    private javax.swing.JComboBox<String> cbAnoHistorico;
    private javax.swing.JComboBox<String> cbMesHistorico;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAnoHistorico;
    private javax.swing.JLabel lblMesHistorico;
    private javax.swing.JMenuBar menuHistorico;
    private javax.swing.JTable tblHistorico;
    // End of variables declaration//GEN-END:variables
}