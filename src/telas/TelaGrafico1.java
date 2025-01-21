/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package telas;

import classesGerenciador.ContasUsuarios;
import classesGerenciador.Usuario;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;
import javax.swing.*;
import projeto.gerenciador.financeiro.ControleTelas;
/**
 *
 * @author Bruno Eduardo <https://github.com/brnduol>
 */
public class TelaGrafico1 extends javax.swing.JFrame {
    private ContasUsuarios contaUsuarios;
    private Usuario contaAtual;
    private ControleTelas controleTelas;
    
    /**
     * Creates new form TelaGrafico1
     */
    public TelaGrafico1() {
        contaUsuarios = ContasUsuarios.getInstance();
        contaAtual = contaUsuarios.conta();
        initComponents();
        this.setLocationRelativeTo(null);
        setSize(1000, 800);  
        jPanel1.setLayout(new java.awt.BorderLayout()); 
        carregarMesGrafico();
        carregarAnoGrafico();
        
    }
    
    
    public void carregarMesGrafico(){
            //Remover os itens da ComboBox
            cbMesGrafico.removeAllItems();

            cbMesGrafico.addItem("Selecione um mês");

            String[] meses = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", 
                  "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};

            // Adiciona os meses ao JComboBox
            for (String mes : meses) {
                cbMesGrafico.addItem(mes);

            }
        }
    
     public void carregarAnoGrafico(){
            //Remover os itens da ComboBox
            cbAnoGrafico.removeAllItems();

            cbAnoGrafico.addItem("Selecione um ano");

            String[] anos = {"2024", "2025"};

            // Adiciona os meses ao JComboBox
            for (String ano : anos) {
                cbAnoGrafico.addItem(ano);

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

        lblMesGrafico = new javax.swing.JLabel();
        lblAnoGrafico = new javax.swing.JLabel();
        btnGerarGrafico = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        cbMesGrafico = new javax.swing.JComboBox<>();
        cbAnoGrafico = new javax.swing.JComboBox<>();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuGrafico = new javax.swing.JMenu();
        jmPrincipal = new javax.swing.JMenuItem();
        btContasGrafico = new javax.swing.JMenuItem();
        btHistoricoGrafico = new javax.swing.JMenuItem();
        btCategoriasGrafico = new javax.swing.JMenuItem();
        btSairGrafico = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblMesGrafico.setText("Mês");

        lblAnoGrafico.setText("Ano");

        btnGerarGrafico.setText("Gerar");
        btnGerarGrafico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGerarGraficoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 530, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 262, Short.MAX_VALUE)
        );

        cbMesGrafico.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cbAnoGrafico.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        menuGrafico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/1485477024-menu_78574.png"))); // NOI18N
        menuGrafico.setText("Menu");

        jmPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/32officeicons-31_89708.png"))); // NOI18N
        jmPrincipal.setText("Tela principal");
        jmPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmPrincipalActionPerformed(evt);
            }
        });
        menuGrafico.add(jmPrincipal);

        btContasGrafico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/shoppaymentorderbuy-23_icon-icons.com_73884.png"))); // NOI18N
        btContasGrafico.setText("Contas");
        btContasGrafico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btContasGraficoActionPerformed(evt);
            }
        });
        menuGrafico.add(btContasGrafico);

        btHistoricoGrafico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Historical_icon-icons.com_54175.png"))); // NOI18N
        btHistoricoGrafico.setText("Historico");
        btHistoricoGrafico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btHistoricoGraficoActionPerformed(evt);
            }
        });
        menuGrafico.add(btHistoricoGrafico);

        btCategoriasGrafico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/1486486297-attribute-category-label-shop-price-price-tag-tag_81213.png"))); // NOI18N
        btCategoriasGrafico.setText("Categorias");
        btCategoriasGrafico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCategoriasGraficoActionPerformed(evt);
            }
        });
        menuGrafico.add(btCategoriasGrafico);

        btSairGrafico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/logout256_24927.png"))); // NOI18N
        btSairGrafico.setText("Sair");
        btSairGrafico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairGraficoActionPerformed(evt);
            }
        });
        menuGrafico.add(btSairGrafico);

        jMenuBar1.add(menuGrafico);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblAnoGrafico, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(cbMesGrafico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbAnoGrafico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(67, 67, 67)
                                .addComponent(btnGerarGrafico))))
                    .addComponent(lblMesGrafico, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(396, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblMesGrafico)
                            .addComponent(cbMesGrafico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnGerarGrafico)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAnoGrafico, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbAnoGrafico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(141, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
                        

        private void mostrarGrafico() {
            // Criar o dataset do gráfico de pizza
            DefaultPieDataset dataset = new DefaultPieDataset();

            // Adicionar valores de exemplo
            dataset.setValue("Categoria 1", 50);
            dataset.setValue("Categoria 2", 30);
            dataset.setValue("Categoria 3", 20);

            // Criar o gráfico de pizza
            JFreeChart chart = ChartFactory.createPieChart(
                "Gráfico", // Título do gráfico
                dataset, // Dataset com os dados
                true, // Exibir legenda
                true, // Exibir tooltip
                false // Exibir URLs
            );
            
            System.out.println("Gráfico gerado"); // print para controle
            
            
            // Adicionar o gráfico ao painel (jPanel1)
            ChartPanel chartPanel = new ChartPanel(chart);
            chartPanel.setPreferredSize(new java.awt.Dimension(600, 400));

            // Limpar o painel antes de adicionar um novo gráfico
            jPanel1.removeAll();
            jPanel1.add(chartPanel, java.awt.BorderLayout.CENTER);
            jPanel1.revalidate();
            jPanel1.repaint();
    }   
  
    
    private void btnGerarGraficoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGerarGraficoActionPerformed
                                  
        int index1 = cbAnoGrafico.getSelectedIndex();
        int index2 = cbMesGrafico.getSelectedIndex();
        
        if (index1 == 0 || index2 == 0) {
            JOptionPane.showMessageDialog(null, "Todos os campos devem ser selecionados", "Mensagem", JOptionPane.PLAIN_MESSAGE);
        } else {
            mostrarGrafico();
        }       
    }//GEN-LAST:event_btnGerarGraficoActionPerformed

    private void btContasGraficoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btContasGraficoActionPerformed
        // Abrir a tela principal
        controleTelas.getTelaContas().setVisible(true);
        this.dispose(); // Fecha a tela atual
        
        
    }//GEN-LAST:event_btContasGraficoActionPerformed

    private void btHistoricoGraficoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btHistoricoGraficoActionPerformed
        // Abrir a tela de histórico
        controleTelas.getTelaHistorico().setVisible(true);
        this.dispose(); // Fecha a tela atual
    }//GEN-LAST:event_btHistoricoGraficoActionPerformed

    private void btCategoriasGraficoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCategoriasGraficoActionPerformed
        controleTelas.getTelaCategoria().setVisible(true);
        dispose();
    }//GEN-LAST:event_btCategoriasGraficoActionPerformed

    private void btSairGraficoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairGraficoActionPerformed
        contaUsuarios.sairConta();
        controleTelas.getTelaLogin().setVisible(true);
        dispose();
    }//GEN-LAST:event_btSairGraficoActionPerformed

    private void jmPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmPrincipalActionPerformed
        // Abrir a tela principal
        controleTelas.getTelaPrincipal().setVisible(true);
        this.dispose(); // Fecha a tela atual
    }//GEN-LAST:event_jmPrincipalActionPerformed

                    

    
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
            java.util.logging.Logger.getLogger(TelaGrafico1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaGrafico1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaGrafico1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaGrafico1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()  {
            public void run() {
                new TelaGrafico1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem btCategoriasGrafico;
    private javax.swing.JMenuItem btContasGrafico;
    private javax.swing.JMenuItem btHistoricoGrafico;
    private javax.swing.JMenuItem btSairGrafico;
    private javax.swing.JButton btnGerarGrafico;
    private javax.swing.JComboBox<String> cbAnoGrafico;
    private javax.swing.JComboBox<String> cbMesGrafico;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuItem jmPrincipal;
    private javax.swing.JLabel lblAnoGrafico;
    private javax.swing.JLabel lblMesGrafico;
    private javax.swing.JMenu menuGrafico;
    // End of variables declaration//GEN-END:variables
}
