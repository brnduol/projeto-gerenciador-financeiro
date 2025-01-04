/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classesGerenciador;

import java.util.List;

public class Balanco {
    private int id;
    private int mes; // Representa o mês do balanço
    private int ano; // Representa o ano do balanço
    private List<Transacao> transacoes; // Lista de transações associadas ao balanço

    // Construtor
    public Balanco(int id, int mes, int ano, List<Transacao> transacoes) {
        this.id = id;
        this.mes = mes;
        this.ano = ano;
        this.transacoes = transacoes; // Recebe a lista de transações da classe que gerencia isso
    }

    // Método para gerar o balanço total (soma de todas as transações)
    public double gerarBalanco() {
        double total = 0.0;
        for (Transacao transacao : transacoes) {
            total += transacao.valor; // Receita positiva, despesa negativa
        }
        return total;
    }

    // Método para gerar o balanço por categoria
    public double gerarBalancoPorCategoria(String categoria) {
        double total = 0.0;
        for (Transacao transacao : transacoes) {
            if (transacao instanceof TransacaoReceita && ((TransacaoReceita) transacao).categoria.equals(categoria)) {
                total += transacao.valor;
            } else if (transacao instanceof TransacaoDespesas && ((TransacaoDespesas) transacao).Categoria.equals(categoria)) {
                total += transacao.valor;
            }
        }
        return total;
    }

    // Getters
    public int getId() {
        return id;
    }

    public int getMes() {
        return mes;
    }

    public int getAno() {
        return ano;
    }
        }
    }
}
