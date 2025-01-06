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
    private int id;
    private String nomeCategoria;
    private List<Transacao> transacoes; // Lista de objetos Transacão, vai armazenar todas as transações relacionadas a esta categoria.

    // Construtor
    public Categoria(int id, String nomeCategoria) {
        this.id = id;
        this.nomeCategoria = nomeCategoria;
        this.transacoes = new ArrayList<>(); // Garante que a lista de transações seja criada quando uma nova categoria for criada.
    }

    // Getters e Setters
    public int getId() {
        return id;
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
}
