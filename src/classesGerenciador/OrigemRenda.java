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
    private String nomeOrigemRenda;
    private List<Transacao> transacoes; // Lista de transações relacionadas a esta origem de renda

    // Construtor
    public OrigemRenda(String nomeOrigemRenda) {
        this.id = proximoId++; // Atribui o próximo ID disponível e incrementa a variável estática
        this.nomeOrigemRenda = nomeOrigemRenda;
        this.transacoes = new ArrayList<>(); // Inicializa a lista de transações
    }

    // Getters e Setters
    public int getId() {
        return id;
    }

    public List<Transacao> getTransacoes() {
        return transacoes;
    }
    public void addTransacao(Transacao transacao){
        transacoes.add(transacao);
    }


    public boolean excluirTransacao(int transacaoId) {
        return transacoes.removeIf(transacao -> transacao.getId() == transacaoId);

    }


    
}
