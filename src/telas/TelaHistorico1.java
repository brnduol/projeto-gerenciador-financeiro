
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package telas;


import classesGerenciador.ContasUsuarios;
import classesGerenciador.Usuario;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import projeto.gerenciador.financeiro.ControleTelas;
 
/**
 *
 * @author Bruno Eduardo <https://github.com/brnduol>
 */
public class TelaHistorico1 extends javax.swing.JFrame {
    private ArrayList<Object[]> listaHistoricos; // Lista genérica para armazenar os dados do histórico
    private ContasUsuarios contaUsuarios;
    private Usuario contaAtual;
    private ControleTelas controleTelas;

    /**
     * Creates new form TelaHistorico1
     */
    public TelaHistorico1() {
        contaUsuarios = ContasUsuarios.getInstance();
        contaAtual = contaUsuarios.conta();
        controleTelas = ControleTelas.getInstance();
        
        
        listaHistoricos = new ArrayList<>();
        contaUsuarios = ContasUsuarios.getInstance();
        contaAtual = contaUsuarios.conta();
        
        initComponents();
        this.setLocationRelativeTo(null);
        carregarMesHistorico();
        carregarAnoHistorico();

        // Adicionando o DocumentListener para os campos
        adicionarDocumentListener(contaHistorico);
        adicionarDocumentListener(categoriaHistorico);
    }
    
    private void adicionarDocumentListener(JTextField campo) {
        campo.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                atualizarTabela();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                atualizarTabela();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                atualizarTabela();
            }
        });
    }
    
    // Método para atualizar a tabela
    private void atualizarTabela() {
        String filtroTextoConta = contaHistorico.getText();
        String filtroTextoCategoria = categoriaHistorico.getText();

        if (filtroTextoConta.isEmpty() && filtroTextoCategoria.isEmpty()) {
            limparTabela(); // Limpar a tabela
        } else {
            carregarTabela(false); // Carregar com filtro
        }
    }
    
    private void limparTabela() {
        // Lógica para limpar a tabela, dependendo de como você a estiver preenchendo
        DefaultTableModel modeloTabela = (DefaultTableModel) tblHistorico.getModel();
        modeloTabela.setRowCount(0); // Exemplo de como limpar a tabela
}
    
    
    public class MesUtils {

        private static final Map<String, String> mesParaNumero;

        static {
            mesParaNumero = new HashMap<>();
            mesParaNumero.put("Janeiro", "01");
            mesParaNumero.put("Fevereiro", "02");
            mesParaNumero.put("Março", "03");
            mesParaNumero.put("Abril", "04");
            mesParaNumero.put("Maio", "05");
            mesParaNumero.put("Junho", "06");
            mesParaNumero.put("Julho", "07");
            mesParaNumero.put("Agosto", "08");
            mesParaNumero.put("Setembro", "09");
            mesParaNumero.put("Outubro", "10");
            mesParaNumero.put("Novembro", "11");
            mesParaNumero.put("Dezembro", "12");
        }

        public static String obterNumeroMes(String nomeMes) {
            return mesParaNumero.getOrDefault(nomeMes, ""); // Retorna "" caso o mês não seja encontrado
        }
    }

   
   
        public void carregarTabela(boolean exibirMensagem) {
            DefaultTableModel modelo = (DefaultTableModel) tblHistorico.getModel();
            modelo.setRowCount(0); // Limpa a tabela antes de carregar novos dados

            String filtroConta = contaHistorico.getText().trim().toLowerCase();
            String filtroCategoria = categoriaHistorico.getText().trim().toLowerCase();
            String mesSelecionado = cbMesHistorico.getSelectedItem().toString();
            String anoSelecionado = cbAnoHistorico.getSelectedItem().toString();

            boolean filtrarMesAno = !mesSelecionado.equals("Selecione um mês") && !anoSelecionado.equals("Selecione um ano");
            boolean encontrouAlgumaTransacao = false; // Para verificar se ao menos uma transação é encontrada

            // Verifica as transações baseadas nos filtros
            for (Object[] item : listaHistoricos) {
                String conta = item[0].toString().toLowerCase();
                String data = item[1].toString();
                String categoria = item[4].toString().toLowerCase();

                boolean adicionarLinha = true;

                // Filtra por conta
                if (!filtroConta.isEmpty() && !conta.contains(filtroConta)) {
                    adicionarLinha = false;
                }

                // Filtra por categoria
                if (!filtroCategoria.isEmpty() && !categoria.contains(filtroCategoria)) {
                    adicionarLinha = false;
                }

                // Filtra por mês e ano
                if (filtrarMesAno) {
                    String numeroMes = MesUtils.obterNumeroMes(mesSelecionado); // Obtém o número do mês pela classe auxiliar
                    String[] partesData = data.split("/");
                    String mesHistorico = partesData[1];
                    String anoHistorico = partesData[2];

                    if (!(numeroMes.equals(mesHistorico) && anoSelecionado.equals(anoHistorico))) {
                        adicionarLinha = false;
                    }
                }

                // Adiciona a linha à tabela
                if (adicionarLinha) {
                    modelo.addRow(item);
                    encontrouAlgumaTransacao = true; // Encontrou ao menos uma transação correspondente
                }
            }

            // Exibe mensagem apenas se a pesquisa não encontrar transações para o mês e ano
            if (exibirMensagem && !encontrouAlgumaTransacao) {
                JOptionPane.showMessageDialog(null, "Nenhuma transação encontrada", "Mensagem", JOptionPane.PLAIN_MESSAGE);
            }

            // Atualiza a tabela com os resultados
            tblHistorico.setModel(modelo);
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
        contaHistorico = new javax.swing.JTextField();
        categoriaHistorico = new javax.swing.JTextField();
        limparFiltroHistorico = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        menuHistorico = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jmPrincipal = new javax.swing.JMenuItem();
        btContasHistorico = new javax.swing.JMenuItem();
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

        contaHistorico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contaHistoricoActionPerformed(evt);
            }
        });

        categoriaHistorico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoriaHistoricoActionPerformed(evt);
            }
        });

        limparFiltroHistorico.setText("Limpar");
        limparFiltroHistorico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limparFiltroHistoricoActionPerformed(evt);
            }
        });

        jLabel1.setText("Filtrar por Conta");

        jLabel2.setText("Filtrar por Categoria");

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/1485477024-menu_78574.png"))); // NOI18N
        jMenu3.setText("Menu");

        jmPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/32officeicons-31_89708.png"))); // NOI18N
        jmPrincipal.setText("Tela principal");
        jmPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmPrincipalActionPerformed(evt);
            }
        });
        jMenu3.add(jmPrincipal);

        btContasHistorico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/shoppaymentorderbuy-23_icon-icons.com_73884.png"))); // NOI18N
        btContasHistorico.setText("Contas");
        btContasHistorico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btContasHistoricoActionPerformed(evt);
            }
        });
        jMenu3.add(btContasHistorico);

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
                            .addComponent(cbAnoHistorico, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(130, 130, 130)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(contaHistorico, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(categoriaHistorico, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(btnPesquisarHistorico)
                        .addGap(160, 160, 160)
                        .addComponent(limparFiltroHistorico)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMesHistorico)
                    .addComponent(cbMesHistorico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(contaHistorico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAnoHistorico)
                            .addComponent(cbAnoHistorico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(categoriaHistorico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(0, 53, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(limparFiltroHistorico)
                            .addComponent(btnPesquisarHistorico))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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
               carregarTabela(true); // Exibe a mensagem quando não houver resultados
                }
            }
        
        
        


    }//GEN-LAST:event_btnPesquisarHistoricoActionPerformed

    private void btSairHistoricoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairHistoricoActionPerformed
        contaUsuarios.sairConta();
        controleTelas.getTelaLogin().setVisible(true);
        dispose();
    }//GEN-LAST:event_btSairHistoricoActionPerformed

    private void btContasHistoricoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btContasHistoricoActionPerformed
        controleTelas.getTelaContas().setVisible(true);
        dispose();
        
        
    }//GEN-LAST:event_btContasHistoricoActionPerformed

    private void btGraficosHistoricoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGraficosHistoricoActionPerformed
        controleTelas.getTelaGrafico().setVisible(true);
        dispose();
        
    }//GEN-LAST:event_btGraficosHistoricoActionPerformed

    private void btCategoriasHistoricoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCategoriasHistoricoActionPerformed
        controleTelas.getTelaCategoria().setVisible(true);
        dispose();
    }//GEN-LAST:event_btCategoriasHistoricoActionPerformed

    private void jmPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmPrincipalActionPerformed
        // Abrir a tela principal
        controleTelas.getTelaPrincipal().setVisible(true);
        this.dispose(); // Fecha a tela atual
    }//GEN-LAST:event_jmPrincipalActionPerformed

    private void contaHistoricoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contaHistoricoActionPerformed
       

    }//GEN-LAST:event_contaHistoricoActionPerformed

    private void categoriaHistoricoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoriaHistoricoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_categoriaHistoricoActionPerformed

    private void limparFiltroHistoricoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limparFiltroHistoricoActionPerformed
        contaHistorico.setText("");
        categoriaHistorico.setText("");
        cbMesHistorico.setSelectedIndex(0);
        cbAnoHistorico.setSelectedIndex(0);
    }//GEN-LAST:event_limparFiltroHistoricoActionPerformed

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
    private javax.swing.JMenuItem btSairHistorico;
    private javax.swing.JButton btnPesquisarHistorico;
    private javax.swing.JTextField categoriaHistorico;
    private javax.swing.JComboBox<String> cbAnoHistorico;
    private javax.swing.JComboBox<String> cbMesHistorico;
    private javax.swing.JTextField contaHistorico;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem jmPrincipal;
    private javax.swing.JLabel lblAnoHistorico;
    private javax.swing.JLabel lblMesHistorico;
    private javax.swing.JButton limparFiltroHistorico;
    private javax.swing.JMenuBar menuHistorico;
    private javax.swing.JTable tblHistorico;
    // End of variables declaration//GEN-END:variables
}