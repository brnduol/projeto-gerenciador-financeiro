/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classesGerenciador;

import java.util.ArrayList;
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
    public List<Integer> gerarBalanco(int mes) {
        int entrada = 0; // Soma de receitas
        int saida = 0;   // Soma de despesas (mantendo negativo)
        int balanco = 0; // Resultado final (entrada + saída)

        for (Transacao transacao : transacoes) {
            // Verifica se o mês da transação é igual ao mês fornecido
            if (transacao.getData().getMonthValue() == mes) {
                if (transacao.getValor() > 0) {
                    entrada += transacao.getValor(); // Somar receitas
                } else {
                    saida += transacao.getValor(); // Somar despesas (mantendo o valor negativo)
                }
            }
        }

        balanco = entrada + saida; // Calcula o balanço final

        // Retorna uma lista com entrada, saída e balanço
        List<Integer> resultado = new ArrayList<>();
        resultado.add(entrada);
        resultado.add(saida);
        resultado.add(balanco);

        return resultado;
    }

    // Método para gerar o balanço por categoria (baseado em mês e ano)
    public int gerarBalancoPorCategoria(String categoria, int mes, int ano) {
        int total = 0;
        for (Transacao transacao : transacoes) {
            // Verifica se a transação pertence à categoria e se o mês/ano correspondem
            if (transacao.pertenceCategoria(categoria) && 
                transacao.getData().getMonthValue() == mes && 
                transacao.getData().getYear() == ano) {
                total += transacao.getValor();
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
        return ano;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
       
    
  }
