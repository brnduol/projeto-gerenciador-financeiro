/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classesGerenciador;

import java.util.ArrayList;
import java.util.List;

/**
 * A classe `OrigemRenda` representa uma fonte de renda no sistema financeiro.
 * Cada origem de renda possui um identificador único, um nome, e uma lista de transações associadas.
 * Essa classe permite gerenciar as transações vinculadas à origem de renda, oferecendo métodos para
 * adicionar ou excluir transações.
 * 
 * @author Bruno Eduardo <https://github.com/brnduol>
 */
public class OrigemRenda {
    private static int proximoId = 1; // Variável estática para gerar IDs únicos para cada origem de renda.
    private int id; // Identificador único para cada instância de OrigemRenda.
    private String nomeOrigemRenda; // Nome da origem de renda (ex.: Salário, Freelance, etc.).
    private List<Transacao> transacoes; // Lista de transações associadas a esta origem de renda.

    // Construtor que inicializa a origem de renda com um nome e um ID único.
    // Também inicializa a lista de transações como vazia.
    public OrigemRenda(String nome) {
        this.id = proximoId++; // Atribui o próximo ID disponível e incrementa o contador.
        this.nomeOrigemRenda = nome;
        this.transacoes = new ArrayList<>(); // Inicializa a lista de transações.
    }

    // Retorna o identificador único desta origem de renda.
    public int getId() {
        return id;
    }

    // Retorna a lista de transações associadas a esta origem de renda.
    public List<Transacao> getTransacoes() {
        return transacoes;
    }

    // Adiciona uma transação à lista de transações desta origem de renda.
    public void addTransacao(Transacao transacao) {
        transacoes.add(transacao); // Adiciona a transação à lista.
    }

    // Remove uma transação da lista com base no identificador (ID) da transação.
    // Retorna `true` se a transação foi encontrada e removida, ou `false` caso contrário.
    public boolean excluirTransacao(int transacaoId) {
        return transacoes.removeIf(transacao -> transacao.getId() == transacaoId); // Remove a transação com ID correspondente.
    }

    // Retorna o nome da origem de renda.
    public String getNomeOrigemRenda() {
        return nomeOrigemRenda;
    }

    // Atualiza o nome desta origem de renda.
    public void setNomeOrigemRenda(String nomeOrigemRenda) {
        this.nomeOrigemRenda = nomeOrigemRenda;
    }
}
