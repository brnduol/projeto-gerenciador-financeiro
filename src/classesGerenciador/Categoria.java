/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classesGerenciador;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author lucia
 */
public class Categoria {
    private static int proximoId = 1; // Variável estática para controlar o próximo ID disponível
    private int id;
    private String nomeCategoria;
    private List<Transacao> transacoes; // Lista de objetos Transacão, vai armazenar todas as transações relacionadas a esta categoria.

     // Lista estática para armazenar todas as categorias criadas
    private static List<Categoria> listaCategorias = new ArrayList<>();
    
    // Construtor
    public Categoria() {
        this.transacoes = new ArrayList<>();
         // Garante que a lista de transações seja criada quando uma nova categoria for criada.
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
     // Método para excluir uma transação por ID
    public boolean excluirTransacao(int transacaoId) {
        return transacoes.removeIf(transacao -> transacao.getId() == transacaoId); // garante que a lista de transações seja criada quando uma nova categoria for criada.
        //removeIf vai remover a transação cujo id seja igual ao transacaoId fornecido.
    }

     // Método para editar uma transação
    public boolean editarTransacao(int transacaoId, Transacao novaTransacao) {
        // Esse método edita uma transação existente na lista, 
        // buscando-a pelo ID.
        Optional<Transacao> transacaoExistente = transacoes.stream()
                .filter(transacao -> transacao.getId() == transacaoId)
                .findFirst();
        
        // Se a transação for encontrada, 
        if (transacaoExistente.isPresent()) {
            // ela é substituída pela nova transação fornecida.
            int index = transacoes.indexOf(transacaoExistente.get());
            transacoes.set(index, novaTransacao);
            return true; // Retorna true se a transação foi editada com sucesso, 
        }
         return false; // e false caso a transação não tenha sido encontrada.
    }
   
        //Método para adicionar uma transação a categoria
        public void adicionarTransacao(Transacao transacao) {
            this.transacoes.add(transacao);
        }
    
        
        // Método para criar uma nova categoria
        public static Categoria criarCategoria(String nome) {
            // Verifica se uma categoria com o mesmo nome já existe
            Optional<Categoria> categoriaExistente = listaCategorias.stream()
                    .filter(categoria -> categoria.getNomeCategoria().equalsIgnoreCase(nome))
                    .findFirst();

            if (categoriaExistente.isPresent()) {
                System.out.println("Categoria já existe: " + nome);
                return null; // Retorna nulo caso já exista
            }

            // Cria e adiciona a nova categoria à lista
            Categoria novaCategoria = new Categoria(nome);
            listaCategorias.add(novaCategoria);
            System.out.println("Categoria criada com sucesso: " + nome);
            return novaCategoria;
        }
}
