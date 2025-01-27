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

        bntExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/1486564399-close_81512.png"))); // NOI18N
        bntExcluir.setText("Excluir");
        bntExcluir.setToolTipText("Exclua uma categoria criada");
        bntExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntExcluirActionPerformed(evt);
            }
        });

        bntCriar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/1486485557-add-create-new-more-plus_81188.png"))); // NOI18N
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

        bntEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/edit_icon-icons.com_52382.png"))); // NOI18N
        bntEditar.setText("Editar");
        bntEditar.setToolTipText("Clique para editar uma categoria");
        bntEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntEditarActionPerformed(evt);
            }
        });

        bntPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/xmag_search_find_export_locate_5984.png"))); // NOI18N
        bntPesquisar.setText("Pesquisar");
        bntPesquisar.setToolTipText("Pesquise a categoria pela data ");
        bntPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntPesquisarActionPerformed(evt);
            }
        });

        lblData.setText("Data");

        txtData.setToolTipText("Insira a data no formato dd/mm/yyyy");

        bntSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/accept_icon-icons.com_74428.png"))); // NOI18N
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
        jTextArea1.setText("Lista de Categorias Registradas disponível para gerenciamento");
        jScrollPane2.setViewportView(jTextArea1);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/1485477024-menu_78574.png"))); // NOI18N
        jMenu2.setText("Menu");
        jMenu2.setToolTipText("Navegue pelo menu para acessar as opções");

        jmPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/32officeicons-31_89708.png"))); // NOI18N
        jmPrincipal.setText("Tela Principal");
        jmPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmPrincipalActionPerformed(evt);
            }
        });
        jMenu2.add(jmPrincipal);

        jmContas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/shoppaymentorderbuy-23_icon-icons.com_73884.png"))); // NOI18N
        jmContas.setText("Contas");
        jmContas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmContasActionPerformed(evt);
            }
        });
        jMenu2.add(jmContas);

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
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(lblNome, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblData, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bntCriar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(bntPesquisar)
                                .addGap(42, 42, 42)
                                .addComponent(bntEditar)
                                .addGap(34, 34, 34)
                                .addComponent(bntExcluir)
                                .addGap(54, 54, 54)
                                .addComponent(bntSalvar))
                            .addComponent(jScrollPane2)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 717, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(lblData)
                    .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTipo))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bntCriar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bntPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bntExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bntSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bntEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(58, Short.MAX_VALUE))
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
        // Obter o valor da pesquisa
        String nomePesquisa = txtNome.getText().toLowerCase(); // Tornar a busca insensível a maiúsculas/minúsculas

        // Obter o modelo da tabela
        javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel) jTable1.getModel();

        // Percorrer a lista de categorias (não limpar a tabela, apenas mostrar as que coincidem)
        boolean encontrou = false; // Variável para verificar se encontrou alguma categoria

        // Percorrer todas as linhas da tabela
        for (int i = 0; i < model.getRowCount(); i++) {
            String nomeCategoria = model.getValueAt(i, 0).toString().toLowerCase();  // Obter o nome da categoria

            // Verificar se o nome da categoria contém a pesquisa
            if (nomeCategoria.contains(nomePesquisa)) {
                // Tornar a linha visível (por padrão, todas as linhas estarão visíveis)
                jTable1.setRowSelectionInterval(i, i);  // Seleciona a linha correspondente à pesquisa
                encontrou = true; // Encontrou ao menos uma categoria
            }
        }

        // Se não encontrar nenhuma categoria, mostrar uma mensagem
        if (!encontrou) {
            javax.swing.JOptionPane.showMessageDialog(this, "Nenhuma categoria encontrada com esse nome.");
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

        // Mensagem de confirmação
        javax.swing.JOptionPane.showMessageDialog(this, "Agora edite os dados e clique em 'Salvar' para aplicar as alterações.");

    }//GEN-LAST:event_bntEditarActionPerformed

    private void bntSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntSalvarActionPerformed
    // Obtém a linha selecionada na tabela
    int linhaSelecionada = jTable1.getSelectedRow();

    if (linhaSelecionada != -1) {  // Se uma linha foi selecionada
        // Obtém os valores dos campos
        String nome = txtNome.getText();
        String tipo = cmbTipo.getSelectedItem().toString();
        String data = txtData.getText();

        // Verifica se os campos não estão vazios
        if (!nome.isEmpty() && !data.isEmpty()) {
            javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel) jTable1.getModel();

            // Atualiza os dados na tabela, substituindo os valores da linha selecionada
            model.setValueAt(nome, linhaSelecionada, 0);  // Atualiza a coluna 0 (Nome)
            model.setValueAt(tipo, linhaSelecionada, 1);  // Atualiza a coluna 1 (Tipo)
            model.setValueAt(data, linhaSelecionada, 2);  // Atualiza a coluna 2 (Data)

            // Agora, vamos atualizar a instância da categoria em contaAtual
            String nomeCategoriaAntiga = (String) model.getValueAt(linhaSelecionada, 0);  // Nome antigo

            if (tipo.equals("receita")) {
                // Se for receita, atualiza na lista de origem de rendas
                for (OrigemRenda origemRenda : contaAtual.getOrigemRendas()) {
                    if (origemRenda.getNomeOrigemRenda().equalsIgnoreCase(nomeCategoriaAntiga)) {
                        // Atualiza o nome da origem de renda
                        origemRenda.setNomeOrigemRenda(nome);  // Modifica a instância
                        break;  // Interrompe o loop após encontrar e atualizar
                    }
                }
            } else if (tipo.equals("despesa")) {
                // Se for despesa, atualiza na lista de categorias
                for (Categoria categoria : contaAtual.getCategorias()) {
                    if (categoria.getNomeCategoria().equalsIgnoreCase(nomeCategoriaAntiga)) {
                        // Atualiza o nome da categoria de despesa
                        categoria.setNomeCategoria(nome);  // Modifica a instância
                        break;  // Interrompe o loop após encontrar e atualizar
                    }
                }
            }

            // Exibe uma mensagem de sucesso
            javax.swing.JOptionPane.showMessageDialog(this, "Dados atualizados com sucesso!");

        } else {
            // Se algum campo estiver vazio, exibe mensagem de erro
            javax.swing.JOptionPane.showMessageDialog(this, "Por favor, insira todos os dados para salvar.");
        }
    } else {
        // Se nenhuma linha foi selecionada, exibe mensagem de erro
        javax.swing.JOptionPane.showMessageDialog(this, "Selecione uma linha para editar para poder salvar.");
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
