// Classe Categoria
package classesGerenciador;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Categoria {
    private static int proximoId = 1; // Variável estática para controlar o próximo ID disponível
    private int id;
    private String nomeCategoria;
    private List<Transacao> transacoes; // Armazena todas as transações relacionadas à categoria.

    // Construtor
    public Categoria(String nome) {
        this.id = proximoId++;
        this.nomeCategoria = nome;
        this.transacoes = new ArrayList<>();
    }

    // Getters e Setters
    public int getId() {
        return id;
    }

    public String getNomeCategoria() {
        return nomeCategoria;
    }

    public List<Transacao> getTransacoes() {
        return transacoes;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNomeCategoria(String nomeCategoria) {
        this.nomeCategoria = nomeCategoria;
    }
    
    

    // Método para criar uma nova categoria em uma instância de Usuario (contaAtual)
    public static Categoria criarCategoria(String nome, Usuario contaAtual) {
        for (Categoria categoria : contaAtual.getCategorias()) {
            if (categoria.getNomeCategoria().equalsIgnoreCase(nome)) {
                JOptionPane.showMessageDialog(null, "A categoria já existe: " + nome, "Erro", JOptionPane.ERROR_MESSAGE);
                return null;
            }
        }

        // Cria e adiciona a nova categoria na lista de categorias da contaAtual
        Categoria novaCategoria = new Categoria(nome);
        contaAtual.getCategorias().add(novaCategoria);

        // Mensagem de sucesso ao criar categoria
        JOptionPane.showMessageDialog(null, "Categoria criada com sucesso: " + nome, "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        return novaCategoria;
    }

    // Método para excluir categoria em uma instância de Usuario (contaAtual)
    public static void excluirCategoria(String nomeCategoria, Usuario contaAtual) {
        Categoria categoriaParaRemover = null;
        for (Categoria categoria : contaAtual.getCategorias()) {
            if (categoria.getNomeCategoria().equalsIgnoreCase(nomeCategoria)) {
                categoriaParaRemover = categoria;
                break;
            }
        }

        // Verifica se a categoria foi encontrada
        if (categoriaParaRemover == null) {
            JOptionPane.showMessageDialog(null, "Categoria não encontrada: " + nomeCategoria, "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Exclui todas as transações associadas à categoria
        for (Transacao transacao : categoriaParaRemover.getTransacoes()) {
            transacao.excluirTransacao(); // Chama o método de exclusão na transação
        }

        // Remove a categoria da lista de categorias
        contaAtual.getCategorias().remove(categoriaParaRemover);

        // Mensagem de sucesso
        JOptionPane.showMessageDialog(null, "Categoria excluída com sucesso: " + nomeCategoria, "Sucesso", JOptionPane.INFORMATION_MESSAGE);
    }
}
