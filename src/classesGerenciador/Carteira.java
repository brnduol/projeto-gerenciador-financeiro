/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classesGerenciador;

import java.util.ArrayList;
import java.util.List;

/**
 * A classe `Carteira` representa uma carteira financeira no sistema.
 * Cada carteira possui um identificador único, nome, saldo atual e uma lista de transações associadas.
 * Atribui IDs automaticamente para cada instância, usando uma variável estática.
 * 
 * @author Bruno Eduardo <https://github.com/brnduol>
 */
public class Carteira {
    private static int proximoId = 1; // Variável estática para controlar o próximo ID único a ser atribuído.
    private int id; // Identificador único de cada carteira.
    private String nome; // Nome da carteira.
    private int saldo; // Saldo atual da carteira.
    private List<Transacao> transacoes; // Lista de transações associadas à carteira.

    // Construtor vazio, necessário para casos onde a carteira será inicializada posteriormente.
    public Carteira() {}

    // Construtor principal, inicializa a carteira com nome e saldo. Gera automaticamente o ID único.
    public Carteira(String nome, int saldo) {
        this.id = proximoId++; // Atribui o próximo ID e incrementa para a próxima instância.
        this.nome = nome;
        this.saldo = saldo;
        this.transacoes = new ArrayList<>(); // Inicializa a lista de transações vazia.
    }

    // Métodos estáticos para obter e configurar o próximo ID único.
    public static int getProximoId() {
        return proximoId;
    }

    public static void setProximoId(int proximoId) {
        Carteira.proximoId = proximoId; // Permite redefinir o próximo ID, caso necessário.
    }

    // Métodos getters e setters para os atributos principais da classe.

    public int getId() {
        return id; // Retorna o identificador único da carteira.
    }

    public void setId(int id) {
        this.id = id; // Permite configurar manualmente o ID da carteira.
    }

    public String getNome() {
        return nome; // Retorna o nome da carteira.
    }

    public void setNome(String nome) {
        this.nome = nome; // Atualiza o nome da carteira.
    }

    public int getSaldo() {
        return saldo; // Retorna o saldo atual da carteira.
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo; // Permite atualizar diretamente o saldo da carteira.
    }

    // Adiciona uma transação à carteira. A transação também atualiza o saldo da carteira automaticamente.
    public void adicionarTransacao(Transacao transacao) {
        transacao.atualizar(this); // Atualiza o saldo da carteira com base na transação.
        transacoes.add(transacao); // Adiciona a transação à lista de transações.
    }

    // Remove uma transação da carteira com base no ID da transação fornecido.
    public void removerTransacao(int id) {
        for (int i = 0; i < transacoes.size(); i++) {
            if (transacoes.get(i).getId() == id) { // Verifica se o ID da transação corresponde ao informado.
                transacoes.remove(i); // Remove a transação encontrada.
                break; // Interrompe o loop após remover a transação.
            }
        }
    }

    // Atualiza o saldo da carteira somando ou subtraindo o valor fornecido.
    public void atualizarSaldo(int valor) {
        this.saldo += valor; // Ajusta o saldo da carteira.
    }
}
