/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classesGerenciador;

/**
 *
 * @author Bruno Eduardo <https://github.com/brnduol>
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OrigemRenda {
    private static int proximoId = 1; // Variável estática para controlar o próximo ID disponível
    private int id; // ID único para cada OrigemRenda
    private List<Transacao> transacoes; // Lista de transações relacionadas a esta origem de renda

    // Construtor
    public OrigemRenda() {
        this.id = proximoId++; // Atribui o próximo ID disponível e incrementa a variável estática
        this.transacoes = new ArrayList<>(); // Inicializa a lista de transações
    }

    // Getters e Setters
    public int getId() {
        return id;
    }

    public List<Transacao> getTransacoes() {
        return transacoes;
    }

    // Método para excluir uma transação por ID
    public boolean excluirTransacao(int transacaoId) {
        return transacoes.removeIf(transacao -> transacao.getId() == transacaoId);
        // removeIf remove a transação cujo ID seja igual ao transacaoId fornecido
    }

    // Método para editar uma transação
    public boolean editarTransacao(int transacaoId, Transacao novaTransacao) {
        Optional<Transacao> transacaoExistente = transacoes.stream()
                .filter(transacao -> transacao.getId() == transacaoId)
                .findFirst();

        if (transacaoExistente.isPresent()) {
            int index = transacoes.indexOf(transacaoExistente.get());
            transacoes.set(index, novaTransacao);
            return true; // Retorna true se a transação foi editada com sucesso
        }
        return false; // Retorna false caso a transação não tenha sido encontrada
    }
}
