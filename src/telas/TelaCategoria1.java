/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package telas;

import classesGerenciador.Categoria;
import classesGerenciador.ContasUsuarios;
import classesGerenciador.OrigemRenda;
import classesGerenciador.Usuario;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import projeto.gerenciador.financeiro.ControleTelas;

/**
 *
 * @author Bruno Eduardo <https://github.com/brnduol>
 */
public class TelaCategoria1 extends javax.swing.JFrame {
    private ContasUsuarios contaUsuarios;
    private Usuario contaAtual;
    private ControleTelas controleTelas;
    

    /**
     * Creates new form TelaCategoria1
     */
    public TelaCategoria1() {
        contaUsuarios = ContasUsuarios.getInstance();
        contaAtual = contaUsuarios.conta();
        controleTelas = ControleTelas.getInstance();
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
        lblNome = new javax.swing.JLabel();
        lblTipo = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        cmbTipo = new javax.swing.JComboBox<>();
        bntExcluir = new javax.swing.JButton();
        bntCriar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        bntEditar = new javax.swing.JButton();
        bntPesquisar = new javax.swing.JButton();
        lblData = new javax.swing.JLabel();
        txtData = new javax.swing.JTextField();
        bntSalvar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jmPrincipal = new javax.swing.JMenuItem();
        jmContas = new javax.swing.JMenuItem();
        jmHistorico = new javax.swing.JMenuItem();
        jmGraficos = new javax.swing.JMenuItem();
        jmSair = new javax.swing.JMenuItem();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 289, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 255, 255));

        lblNome.setText("Nome:");

        lblTipo.setText("Tipo:");

        txtNome.setToolTipText("Insira o nome da categoria");
        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });

        cmbTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Despesa", "Receita" }));
        cmbTipo.setToolTipText("Selecione o tipo da categoria");
        cmbTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbTipoActionPerformed(evt);
            }
        });

        bntExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/trash-48_45241.png"))); // NOI18N
        bntExcluir.setText("Excluir");
        bntExcluir.setToolTipText("Exclua uma categoria criada");
        bntExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntExcluirActionPerformed(evt);
            }
        });

        bntCriar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/hand_cursor-48_44849.png"))); // NOI18N
        bntCriar.setText("Criar");
        bntCriar.setToolTipText("Clique para criar uma categoria");
        bntCriar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntCriarActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nome", "Tipo", "Data"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        bntEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Create_New_icon-icons.com_55937.png"))); // NOI18N
        bntEditar.setText("Editar");
        bntEditar.setToolTipText("Clique para editar o nome da categoria");
        bntEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntEditarActionPerformed(evt);
            }
        });

        bntPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/feature_search_outline_icon_139039 (1).png"))); // NOI18N
        bntPesquisar.setText("Pesquisar");
        bntPesquisar.setToolTipText("Pesquise a categoria pela data ");
        bntPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntPesquisarActionPerformed(evt);
            }
        });

        lblData.setText("Data:");

        txtData.setToolTipText("Insira a data no formato dd/mm/yyyy");

        bntSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/checked_checkbox-48_44484 (1).png"))); // NOI18N
        bntSalvar.setText("Salvar");
        bntSalvar.setToolTipText("Salve as alterações feita após a edição");
        bntSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntSalvarActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("Existem categorias padrão já criadas para facilitar a organização. As receitas incluem: Salário, Freelance, Investimentos e Aluguel. \nJá as despesas são categorizadas como Alimentação, Transporte, Saúde e Lazer.");
        jScrollPane2.setViewportView(jTextArea1);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/1485477024-menu_78574.png"))); // NOI18N
        jMenu2.setText("Menu");
        jMenu2.setToolTipText("Navegue pelo menu para acessar as opções");

        jmPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/3643769-building-home-house-main-menu-start_113416 (1).png"))); // NOI18N
        jmPrincipal.setText("Tela Principal");
        jmPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmPrincipalActionPerformed(evt);
            }
        });
        jMenu2.add(jmPrincipal);

        jmContas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/4634994-cloud_122540 (1).png"))); // NOI18N
        jmContas.setText("Contas");
        jmContas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmContasActionPerformed(evt);
            }
        });
        jMenu2.add(jmContas);

        jmHistorico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/historical_3107.png"))); // NOI18N
        jmHistorico.setText("Historico");
        jmHistorico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmHistoricoActionPerformed(evt);
            }
        });
        jMenu2.add(jmHistorico);

        jmGraficos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/graph_progress_chart_charts_analytics_bars_icon_124175.png"))); // NOI18N
        jmGraficos.setText("Graficos");
        jmGraficos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmGraficosActionPerformed(evt);
            }
        });
        jMenu2.add(jmGraficos);

        jmSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/4115235-exit-logout-sign-out_114030.png"))); // NOI18N
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 717, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblNome, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblData, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cmbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(bntSalvar)
                                .addGap(51, 51, 51)
                                .addComponent(bntPesquisar)
                                .addGap(21, 21, 21)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator2)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator3)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 753, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(bntExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(42, 42, 42)
                                        .addComponent(bntCriar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(48, 48, 48)
                                        .addComponent(bntEditar)))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNome))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblData)
                    .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTipo)
                    .addComponent(cmbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bntExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bntCriar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bntEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bntSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bntPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void bntCriarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntCriarActionPerformed
        // Obter os valores dos campos
        String nome = txtNome.getText();
        String tipo = cmbTipo.getSelectedItem().toString();
        String data = txtData.getText();  // Obter a data inserida no campo

        // Verificar se o campo nome está vazio
        if (nome.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Por favor, insira um nome.");
            return;
        }

        // Verificar se a data está no formato correto
        java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("dd/MM/yyyy");
        sdf.setLenient(false); // Impede datas inválidas, como 31/02/2025
        try {
            // Tenta converter a data
            sdf.parse(data);
        } catch (java.text.ParseException e) {
            // Se ocorrer um erro, significa que a data está no formato errado
            javax.swing.JOptionPane.showMessageDialog(this, "Por favor, insira a data no formato dd/MM/yyyy.");
            return;
        }
        
        
        // Verificar se o tipo de categoria é "receita" ou "despesa"
    if (tipo.equalsIgnoreCase("receita")) {
        // Verificar se a receita já existe
        if (contaAtual != null && contaAtual.getOrigemRendas() != null) {
            for (OrigemRenda origem : contaAtual.getOrigemRendas()) {
                if (origem.getNomeOrigemRenda().equalsIgnoreCase(nome)) {
                    javax.swing.JOptionPane.showMessageDialog(this, "A origem de renda já existe.", "Aviso", javax.swing.JOptionPane.WARNING_MESSAGE);
                    return;
                }
            }
        }
        
        // Criar e adicionar a nova origem de renda
        OrigemRenda novaOrigemRenda = new OrigemRenda(nome);
        if (novaOrigemRenda != null) {
            contaAtual.getOrigemRendas().add(novaOrigemRenda);
            // Inserir na tabela
            javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel) jTable1.getModel();
            model.insertRow(0,new Object[]{nome, tipo, data});
            // Limpar os campos
            txtNome.setText("");
            cmbTipo.setSelectedIndex(0);
            txtData.setText("");
            // Mensagem de sucesso
            javax.swing.JOptionPane.showMessageDialog(this, "Origem de renda adicionada com sucesso!");
        }
       
      } else if (tipo.equalsIgnoreCase("despesa")) {
        // Verificar se a categoria já existe
        if (contaAtual != null && contaAtual.getCategorias() != null) {
            for (Categoria categoria : contaAtual.getCategorias()) {
                if (categoria.getNomeCategoria().equalsIgnoreCase(nome)) {
                    javax.swing.JOptionPane.showMessageDialog(this, "A categoria de despesa já existe.", "Aviso", javax.swing.JOptionPane.WARNING_MESSAGE);
                    return;
                }
            }
        }
        
        // Criar a nova categoria de despesa
        Categoria novaCategoria = new Categoria(nome);
        if (novaCategoria != null) {
            contaAtual.getCategorias().add(novaCategoria);
            // Inserir na tabela
            javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel) jTable1.getModel();
            model.insertRow(0,new Object[]{nome, tipo, data});
            // Limpar os campos
            txtNome.setText("");
            cmbTipo.setSelectedIndex(0);
            txtData.setText("");
            // Mensagem de sucesso
            javax.swing.JOptionPane.showMessageDialog(this, "Categoria de despesa adicionada com sucesso!");
        }
        
     } else {
        // Se o tipo não for nem "receita" nem "despesa", exibe um erro
        javax.swing.JOptionPane.showMessageDialog(this, "Tipo inválido. Por favor, selecione entre 'despesa' ou 'receita'.", "Erro", javax.swing.JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_bntCriarActionPerformed

    private void cmbTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbTipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbTipoActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void bntExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntExcluirActionPerformed
        // Verificar se uma linha foi selecionada na tabela
    int selectedRow = jTable1.getSelectedRow();

    if (selectedRow != -1) {
        // Obter o modelo da tabela
        javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel) jTable1.getModel();

        // Obter o nome da categoria da primeira coluna da linha selecionada
        String nomeCategoria = (String) model.getValueAt(selectedRow, 0);

        // Remover a linha da tabela
        model.removeRow(selectedRow);

        // Remover a categoria da lista de categorias de contaAtual
        if (contaAtual != null && contaAtual.getCategorias() != null) {
            // Procurar e remover a categoria com o nome correspondente
            for (Categoria categoria : contaAtual.getCategorias()) {
                if (categoria.getNomeCategoria().equalsIgnoreCase(nomeCategoria)) {
                    contaAtual.getCategorias().remove(categoria);
                    break; // Interromper o loop após remover a categoria
                }
            }
        }

        // Mensagem de sucesso
        javax.swing.JOptionPane.showMessageDialog(this, "Categoria excluída com sucesso!");
    } else {
        // Caso não tenha linha selecionada
        javax.swing.JOptionPane.showMessageDialog(this, "Por favor, selecione uma categoria para excluir.");
    }

    }//GEN-LAST:event_bntExcluirActionPerformed

    private void jmPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmPrincipalActionPerformed
        // Abrir a tela principal
        controleTelas.getTelaPrincipal().setVisible(true);
        this.dispose(); // Fecha a tela atual
    }//GEN-LAST:event_jmPrincipalActionPerformed

    private void jmContasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmContasActionPerformed
        // Abrir a tela principal
        controleTelas.getTelaContas().setVisible(true);
        this.dispose(); // Fecha a tela atual
    }//GEN-LAST:event_jmContasActionPerformed

    private void jmHistoricoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmHistoricoActionPerformed
        // Abrir a tela de histórico
        controleTelas.getTelaHistorico().setVisible(true);
        this.dispose(); // Fecha a tela atual
    }//GEN-LAST:event_jmHistoricoActionPerformed

    private void jmGraficosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmGraficosActionPerformed
        // Abrir a tela de gráficos
        controleTelas.getTelaGrafico().setVisible(true);
        this.dispose(); // Fecha a tela atual
    }//GEN-LAST:event_jmGraficosActionPerformed

    private void jmSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmSairActionPerformed
        // Voltar para a tela principal ao clicar em "Sair"
        contaUsuarios.sairConta();
        controleTelas.getTelaLogin().setVisible(true);
        dispose();
        
    }//GEN-LAST:event_jmSairActionPerformed

    private void bntPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntPesquisarActionPerformed
    // Obter a data da pesquisa do campo de texto
    String dataPesquisa = txtData.getText().trim();

    // Verificar se o campo de data está vazio
    if (dataPesquisa.isEmpty()) {
        // Exibir uma mensagem informando ao usuário para inserir uma data
        javax.swing.JOptionPane.showMessageDialog(this, "Por favor, insira uma data para pesquisar.", "Aviso", javax.swing.JOptionPane.WARNING_MESSAGE);
        return; // Interrompe a execução do método, impedindo a pesquisa
    }

    // Obter o modelo da tabela
    javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel) jTable1.getModel();

    // Variável para verificar se encontrou algum registro
    boolean encontrou = false;

    // Percorrer todas as linhas da tabela
    for (int i = 0; i < model.getRowCount(); i++) {
        // Obter a data da tabela (ajustar o índice da coluna conforme necessário)
        String dataTabela = model.getValueAt(i, 2).toString().trim(); // Supondo que a data está na 3ª coluna (índice 2)

        // Verificar se a data na tabela corresponde à pesquisa
        if (dataTabela.equals(dataPesquisa)) {
            // Selecionar a linha correspondente
            jTable1.setRowSelectionInterval(i, i);
            encontrou = true;
            break; // Encerra o loop assim que encontrar a correspondência
        }
    }

    // Se não encontrar nenhum registro, mostrar uma mensagem
    if (!encontrou) {
        javax.swing.JOptionPane.showMessageDialog(this, "Nenhuma transação encontrada com essa data.");
    }
    }//GEN-LAST:event_bntPesquisarActionPerformed

    private void bntEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntEditarActionPerformed
        // Obter os valores dos campos
        String nome = txtNome.getText();
        String tipo = cmbTipo.getSelectedItem().toString();
        String data = txtData.getText();

        // Verificar se a linha está selecionada
        int linhaSelecionada = jTable1.getSelectedRow();
        if (linhaSelecionada == -1) {
            javax.swing.JOptionPane.showMessageDialog(this, "Por favor, selecione uma categoria para editar.");
            return;
        }

        // Carregar os dados da linha selecionada nos campos de edição
        txtNome.setText(jTable1.getValueAt(linhaSelecionada, 0).toString());
        cmbTipo.setSelectedItem(jTable1.getValueAt(linhaSelecionada, 1).toString());
        txtData.setText(jTable1.getValueAt(linhaSelecionada, 2).toString());
        
        // Desabilitar os campos que não podem ser editados
        cmbTipo.setEnabled(false);  // Desabilitar o campo de tipo (cmbTipo)
        txtData.setEnabled(false);  // Desabilitar o campo de data (txtData)

        // Habilitar apenas o campo de nome para edição
        txtNome.setEnabled(true);


        // Mensagem de confirmação
        javax.swing.JOptionPane.showMessageDialog(this, "Agora edite os dados e clique em 'Salvar' para aplicar as alterações.");

    }//GEN-LAST:event_bntEditarActionPerformed

    private void bntSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntSalvarActionPerformed
    // Obter os valores dos campos
    String nome = txtNome.getText().trim();  // Remover espaços extras
    String tipo = cmbTipo.getSelectedItem().toString().trim();  // Remover espaços extras
    String data = txtData.getText().trim();  // Remover espaços extras

    // Verificar se a linha está selecionada
    int linhaSelecionada = jTable1.getSelectedRow();
    if (linhaSelecionada == -1) {
        javax.swing.JOptionPane.showMessageDialog(this, "Por favor, selecione uma categoria ou origem de renda para editar.");
        return;
    }

    // Obter a instância do usuário atual (contaAtual)
    Usuario contaAtual = ContasUsuarios.getInstance().conta();

    boolean atualizado = false; // Flag para verificar se a atualização foi realizada

    // Lógica para "Receita" (Origem de Renda)
    if (tipo.equalsIgnoreCase("receita")) {
        // Percorrer as origens de renda e tentar encontrar a origem de renda com o nome atual da linha da tabela
        for (OrigemRenda origem : contaAtual.getOrigemRendas()) {
            // Comparando o nome da origem de renda selecionada com o nome na lista de origem de rendas
            if (origem.getNomeOrigemRenda().equalsIgnoreCase(jTable1.getValueAt(linhaSelecionada, 0).toString())) {
                origem.setNomeOrigemRenda(nome); // Atualiza o nome da origem de renda

                // Atualiza a tabela
                javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel) jTable1.getModel();
                model.setValueAt(nome, linhaSelecionada, 0); // Atualiza o nome na tabela
                model.setValueAt(tipo, linhaSelecionada, 1); // Atualiza o tipo na tabela
                model.setValueAt(data, linhaSelecionada, 2); // Atualiza a data na tabela
                atualizado = true; // Marca como atualizado
                break;
            }
        }

        // Se a origem de renda não foi encontrada
        if (!atualizado) {
            javax.swing.JOptionPane.showMessageDialog(this, "Origem de Renda não encontrada para edição.");
        }
    } 
    
    // Lógica para "Despesa" (Categoria)
    else if (tipo.equalsIgnoreCase("despesa")) {
        // Percorrer as categorias e tentar encontrar a categoria com o nome atual da linha da tabela
        for (Categoria categoria : contaAtual.getCategorias()) {
            // Comparando o nome da categoria selecionada com o nome na lista de categorias
            if (categoria.getNomeCategoria().equalsIgnoreCase(jTable1.getValueAt(linhaSelecionada, 0).toString())) {
                categoria.setNomeCategoria(nome); // Atualiza o nome da categoria

                // Atualiza a tabela
                javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel) jTable1.getModel();
                model.setValueAt(nome, linhaSelecionada, 0); // Atualiza o nome na tabela
                model.setValueAt(tipo, linhaSelecionada, 1); // Atualiza o tipo na tabela
                model.setValueAt(data, linhaSelecionada, 2); // Atualiza a data na tabela
                atualizado = true; // Marca como atualizado
                break;
            }
        }

        // Se a categoria não foi encontrada
        if (!atualizado) {
            javax.swing.JOptionPane.showMessageDialog(this, "Categoria não encontrada para edição.");
        }
    }

    // Verificar se a atualização foi realizada
    if (atualizado) {
        // Mensagem de sucesso
        javax.swing.JOptionPane.showMessageDialog(this, "Dados atualizados com sucesso!");

        // Limpar os campos após salvar
        txtNome.setText("");
        cmbTipo.setSelectedIndex(0);
        txtData.setText("");

        // Reabilitar os campos após salvar
        cmbTipo.setEnabled(true);
        txtData.setEnabled(true);
    }
    }//GEN-LAST:event_bntSalvarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCategoria1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCategoria1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCategoria1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCategoria1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCategoria1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntCriar;
    private javax.swing.JButton bntEditar;
    private javax.swing.JButton bntExcluir;
    private javax.swing.JButton bntPesquisar;
    private javax.swing.JButton bntSalvar;
    private javax.swing.JComboBox<String> cmbTipo;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JMenuItem jmContas;
    private javax.swing.JMenuItem jmGraficos;
    private javax.swing.JMenuItem jmHistorico;
    private javax.swing.JMenuItem jmPrincipal;
    private javax.swing.JMenuItem jmSair;
    private javax.swing.JLabel lblData;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JTextField txtData;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
