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
    private List<Transacao> transacoes;

    // Construtor
    public Categoria(int id, String descricao) {
        this.id = id;
        this.transacoes = new ArrayList<>();
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
        return transacoes.removeIf(transacao -> transacao.getId() == transacaoId);
    }

    // Método para editar uma transação
    public boolean editarTransacao(int transacaoId, Transacao novaTransacao) {
        Optional<Transacao> transacaoExistente = transacoes.stream()
                .filter(transacao -> transacao.getId() == transacaoId)
                .findFirst();

        if (transacaoExistente.isPresent()) {
            int index = transacoes.indexOf(transacaoExistente.get());
            transacoes.set(index, novaTransacao);
            return true;
        }
         return false;
    }
}
