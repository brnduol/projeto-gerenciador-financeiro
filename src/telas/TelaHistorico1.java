
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package telas;


import classesGerenciador.Categoria;
import classesGerenciador.ContasUsuarios;
import classesGerenciador.OrigemRenda;
import classesGerenciador.Transacao;
import classesGerenciador.Usuario;
import java.time.format.DateTimeFormatter;
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
        
       
        initComponents();
        this.setLocationRelativeTo(null);
        carregarMesHistorico();
        carregarAnoHistorico();

        // Adicionando o DocumentListener para os campos
        adicionarDocumentListener(contaHistorico);
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
        String filtroTexto = contaHistorico.getText();
        //String filtroTextoCategoria = categoriaHistorico.getText();

        if (filtroTexto.isEmpty()) {
            limparTabela(); // Limpar a tabela
        } else {
            carregarTabela(false); // Carregar com filtro
        }
    }
    
   private void limparTabela() {
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

   
   
        private void carregarTabela(boolean exibirMensagem) {
   

            DefaultTableModel modelo = (DefaultTableModel) tblHistorico.getModel();
            modelo.setRowCount(0); // Limpa a tabela antes de carregar novos dados

            String filtroTexto = contaHistorico.getText().trim().toLowerCase(); 
            String mesSelecionado = cbMesHistorico.getSelectedItem().toString();
            String anoSelecionado = cbAnoHistorico.getSelectedItem().toString();

            boolean filtrarMes = !mesSelecionado.equals("Selecione um mês");
            boolean filtrarAno = !anoSelecionado.equals("Selecione um ano");
            boolean encontrouAlgumaTransacao = false;

            int contaId = contaAtual.getId(); // Obtém o ID da conta atual

            // Iterar pelas categorias de despesas
            for (Categoria categoria : contaAtual.getCategorias()) {
                for (Transacao transacao : categoria.getTransacoes()) {
                    if ((filtrarMes || filtrarAno) && transacao.getData() != null) {
                        int anoTransacao = transacao.getData().getYear();
                        int mesTransacao = transacao.getData().getMonthValue();
                        String numeroMesSelecionado = MesUtils.obterNumeroMes(mesSelecionado);

                        // Verifica filtros de mês e ano
                        if ((filtrarMes && !numeroMesSelecionado.equals(String.format("%02d", mesTransacao))) || 
                            (filtrarAno && !anoSelecionado.equals(String.valueOf(anoTransacao)))) {
                            continue;
                        }
                    }

                    String categoriaNome = categoria.getNomeCategoria().toLowerCase();
                    String data = transacao.getData().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                    double valor = transacao.getValor();
                    String tipo = "Despesa";

                    if (filtroTexto.isEmpty() || String.valueOf(contaId).contains(filtroTexto) || categoriaNome.contains(filtroTexto)) {
                        modelo.addRow(new Object[]{contaId, data, valor, tipo, categoriaNome});
                        encontrouAlgumaTransacao = true;
                    }
                }
            }

            // Iterar pelas categorias de receitas
            for (OrigemRenda origemRenda : contaAtual.getOrigemRendas()) {
                for (Transacao transacao : origemRenda.getTransacoes()) {
                    if ((filtrarMes || filtrarAno) && transacao.getData() != null) {
                        int anoTransacao = transacao.getData().getYear();
                        int mesTransacao = transacao.getData().getMonthValue();
                        String numeroMesSelecionado = MesUtils.obterNumeroMes(mesSelecionado);

                        if ((filtrarMes && !numeroMesSelecionado.equals(String.format("%02d", mesTransacao))) || 
                            (filtrarAno && !anoSelecionado.equals(String.valueOf(anoTransacao)))) {
                            continue;
                        }
                    }

                    String categoriaNome = origemRenda.getNomeOrigemRenda().toLowerCase();
                    String data = transacao.getData().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                    double valor = transacao.getValor();
                    String tipo = "Receita";

                    if (filtroTexto.isEmpty() || String.valueOf(contaId).contains(filtroTexto) || categoriaNome.contains(filtroTexto)) {
                        modelo.addRow(new Object[]{contaId, data, valor, tipo, categoriaNome});
                        encontrouAlgumaTransacao = true;
                    }
                }
            }

            if (exibirMensagem && !encontrouAlgumaTransacao) {
                JOptionPane.showMessageDialog(null, "Nenhuma transação encontrada", "Mensagem", JOptionPane.PLAIN_MESSAGE);
            }

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
        btnPesquisarHistorico = new javax.swing.JButton();
        cbMesHistorico = new javax.swing.JComboBox<>();
        cbAnoHistorico = new javax.swing.JComboBox<>();
        limparFiltroHistorico = new javax.swing.JButton();
        contaHistorico = new javax.swing.JTextField();
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

        limparFiltroHistorico.setText("Limpar");
        limparFiltroHistorico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limparFiltroHistoricoActionPerformed(evt);
            }
        });

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
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 858, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cbMesHistorico, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43)
                                .addComponent(cbAnoHistorico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(186, 186, 186)
                                .addComponent(btnPesquisarHistorico))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(contaHistorico, javax.swing.GroupLayout.PREFERRED_SIZE, 532, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addComponent(limparFiltroHistorico)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(limparFiltroHistorico)
                    .addComponent(contaHistorico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbMesHistorico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbAnoHistorico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisarHistorico))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbMesHistoricoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbMesHistoricoActionPerformed
    
    }//GEN-LAST:event_cbMesHistoricoActionPerformed

    private void btnPesquisarHistoricoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarHistoricoActionPerformed
        String filtro = contaHistorico.getText().trim().toLowerCase();
        int index1 = cbAnoHistorico.getSelectedIndex();
        int index2 = cbMesHistorico.getSelectedIndex();

        if (index1 == 0 && index2 == 0 && filtro.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Pelo menos um filtro deve ser selecionado", "Mensagem", JOptionPane.PLAIN_MESSAGE);
        } else {
            carregarTabela(true); // Exibe a mensagem quando não houver resultados
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

    private void limparFiltroHistoricoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limparFiltroHistoricoActionPerformed
        contaHistorico.setText("");
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
    private javax.swing.JComboBox<String> cbAnoHistorico;
    private javax.swing.JComboBox<String> cbMesHistorico;
    private javax.swing.JTextField contaHistorico;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem jmPrincipal;
    private javax.swing.JButton limparFiltroHistorico;
    private javax.swing.JMenuBar menuHistorico;
    private javax.swing.JTable tblHistorico;
    // End of variables declaration//GEN-END:variables
}