
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
        

        // Adicionando o DocumentListener para os campos
        adicionarDocumentListener(contaHistorico);
    }
    
  
    // O listener chama o método atualizarTabela() sempre que o conteúdo do campo é alterado
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


    
    /* verifica se o campo de texto está vazio. Se estiver, ele limpa a tabela; 
       caso contrário, carrega a tabela com os dados filtrados. */
    
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
        modeloTabela.setRowCount(0); 
    }

    
   

    /*
    carrega as transações na tabela com base nos filtros aplicados (conta, mês e ano). 
    Itera sobre as categorias de despesas e receitas, aplica os filtros e adiciona as transações correspondentes à tabela. 
    Se nenhuma transação for encontrada e o parâmetro exibirMensagem for true, uma mensagem é exibida ao usuário. */
    
    private void carregarTabela(boolean exibirMensagem) {


        DefaultTableModel modelo = (DefaultTableModel) tblHistorico.getModel();
        modelo.setRowCount(0); // Limpa a tabela antes de carregar novos dados

        String filtroTexto = contaHistorico.getText().trim().toLowerCase(); 
        String mesTexto = txtMesHistorico.getText().trim();
        String anoTexto = txtAnoHistorico.getText().trim();

        int mesFiltro = -1;
        int anoFiltro = -1;

        // Verificação do mês inserido (deve ser entre 01 e 12)
        boolean filtrarMes = !mesTexto.isEmpty();
        if (filtrarMes) {
            try {
                mesFiltro = Integer.parseInt(mesTexto);
                if (mesFiltro < 1 || mesFiltro > 12) {
                    JOptionPane.showMessageDialog(null, "Mês inválido. Insira um valor entre 01 e 12.", "Erro", JOptionPane.ERROR_MESSAGE);
                    return; // Interrompe a execução se o mês for inválido
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Mês inválido. Use o formato MM.", "Erro", JOptionPane.ERROR_MESSAGE);
                return;
            }
        }

        // Verificação do ano inserido
        boolean filtrarAno = !anoTexto.isEmpty();
        if (filtrarAno) {
            try {
                anoFiltro = Integer.parseInt(anoTexto);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Ano inválido. Use o formato aaaa.", "Erro", JOptionPane.ERROR_MESSAGE);
                return;
            }
        }

        boolean encontrouAlgumaTransacao = false;

        int contaId = contaAtual.getId(); // Obtém o ID da conta atual

        // Iterar pelas categorias de despesas
        for (Categoria categoria : contaAtual.getCategorias()) {
            for (Transacao transacao : categoria.getTransacoes()) {
                if (transacao.getData() != null) {
                    int anoTransacao = transacao.getData().getYear();
                    int mesTransacao = transacao.getData().getMonthValue();


                    // Verifica filtros de mês e ano
                    if ((filtrarMes && mesFiltro != mesTransacao) || (filtrarAno && anoFiltro != anoTransacao)) {
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


                    if ((filtrarMes && mesFiltro != mesTransacao) || (filtrarAno && anoFiltro != anoTransacao)) {
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
        limparFiltroHistorico = new javax.swing.JButton();
        contaHistorico = new javax.swing.JTextField();
        txtAnoHistorico = new javax.swing.JTextField();
        txtMesHistorico = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        menuHistorico = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();

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

        limparFiltroHistorico.setText("Limpar");
        limparFiltroHistorico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limparFiltroHistoricoActionPerformed(evt);
            }
        });

        txtMesHistorico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMesHistoricoActionPerformed(evt);
            }
        });

        jLabel1.setText("/");

        jLabel2.setText("Data:");

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/1485477024-menu_78574.png"))); // NOI18N
        jMenu2.setText("Menu");

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/3643769-building-home-house-main-menu-start_113416 (1).png"))); // NOI18N
        jMenuItem2.setText("Tela Principal");
        jMenu2.add(jMenuItem2);

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/4634994-cloud_122540 (1).png"))); // NOI18N
        jMenuItem1.setText("Contas");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/graph_progress_chart_charts_analytics_bars_icon_124175.png"))); // NOI18N
        jMenuItem3.setText("Graficos");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/category_icon_176162.png"))); // NOI18N
        jMenuItem4.setText("Categorias");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/4115235-exit-logout-sign-out_114030.png"))); // NOI18N
        jMenuItem5.setText("Sair");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        menuHistorico.add(jMenu2);

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
                                .addGap(13, 13, 13)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtMesHistorico, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtAnoHistorico, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnPesquisarHistorico)
                        .addComponent(txtMesHistorico)
                        .addComponent(jLabel2)
                        .addComponent(txtAnoHistorico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPesquisarHistoricoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarHistoricoActionPerformed
        String filtro = contaHistorico.getText().trim().toLowerCase();
        String index1 = txtAnoHistorico.getText().trim().toLowerCase();
        String index2 = txtMesHistorico.getText().trim().toLowerCase();

        if (index1.isEmpty() && index2.isEmpty() && filtro.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Pelo menos um filtro deve ser selecionado", "Mensagem", JOptionPane.PLAIN_MESSAGE);
        } else {
            carregarTabela(true); // Exibe a mensagem quando não houver resultados
        }
        
        
        


    }//GEN-LAST:event_btnPesquisarHistoricoActionPerformed

    private void limparFiltroHistoricoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limparFiltroHistoricoActionPerformed
        contaHistorico.setText("");
        txtAnoHistorico.setText("");
        txtMesHistorico.setText("");
        
    }//GEN-LAST:event_limparFiltroHistoricoActionPerformed

    private void txtMesHistoricoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMesHistoricoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMesHistoricoActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
        contaUsuarios.sairConta();
        controleTelas.getTelaLogin().setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
        controleTelas.getTelaCategoria().setVisible(true);
        System.out.println("oie");
        dispose();
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        controleTelas.getTelaGrafico().setVisible(true);
        System.out.println("oie");
        dispose();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        controleTelas.getTelaContas().setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
    private javax.swing.JButton btnPesquisarHistorico;
    private javax.swing.JTextField contaHistorico;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton limparFiltroHistorico;
    private javax.swing.JMenuBar menuHistorico;
    private javax.swing.JTable tblHistorico;
    private javax.swing.JTextField txtAnoHistorico;
    private javax.swing.JTextField txtMesHistorico;
    // End of variables declaration//GEN-END:variables
}