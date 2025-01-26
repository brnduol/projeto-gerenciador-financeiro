/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classesGerenciador;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 */
public class Categoria {
    private static int proximoId = 1; // Variável estática para controlar o próximo ID disponível
    private int id;
    private String nomeCategoria;
    private List<Transacao> transacoes; // Armazena todas as transações relacionadas a categoria.

    //Lista para armazenar todas as categorias criadas
    private static List<Categoria> listaCategorias = new ArrayList<>();
    
    //Construtor
    public Categoria() {
        this.transacoes = new ArrayList<>();
    }
    
    public Categoria(String nome) {
        this.id = proximoId++;
        this.nomeCategoria = nome;
        this.transacoes = new ArrayList<>();
    }

    // Getters e Setters
    public int getId() {
        return id;
    }
    public String getNomeCategoria(){
        return nomeCategoria;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public List<Transacao> getTransacoes() {
        return transacoes;
    }

    public static List<Categoria> getListaCategorias() {
        return listaCategorias;
    }
    
    
        
    //Método para criar uma nova categoria
    public static Categoria criarCategoria(String nome) {
        for (Categoria categoria : listaCategorias) {
            if (categoria.getNomeCategoria().equalsIgnoreCase(nome)) {
                 JOptionPane.showMessageDialog(null, "A categoria já existe: " + nome, "Erro", JOptionPane.ERROR_MESSAGE);
                 return null;
            }
        }
        
        //Adiciona e cria a nova categoria a lista se não encontrou nenhuma com o mesmo nome
        Categoria novaCategoria = new Categoria(nome);
        listaCategorias.add(novaCategoria);

        //Mensagem de sucesso ao criar categoria
        JOptionPane.showMessageDialog(null, "Categoria criada com sucesso: " + nome, "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        return novaCategoria;
            
    }
    //Método para excluir categoria 
    public static void excluirCategoria(String nomeCategoria) {
        // Encontra a categoria pelo nome
        Categoria categoriaParaRemover = null;
        for (Categoria categoria : listaCategorias) {
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
        listaCategorias.remove(categoriaParaRemover);

        // Mensagem de sucesso
        JOptionPane.showMessageDialog(null, "Categoria excluída com sucesso: " + nomeCategoria, "Sucesso", JOptionPane.INFORMATION_MESSAGE);
    }
}
