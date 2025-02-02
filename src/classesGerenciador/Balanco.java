/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classesGerenciador;

import java.util.ArrayList;
import java.util.List;
//Classe responsável por calcular o balanço financeiro com base nas transações
public class Balanco {

    // Método para gerar o balanço total (soma de todas as transações)
    public static  List<Integer> gerarBalanco(int mes, int ano, List<Transacao> transacoes) {
        int entrada = 0; // Soma de receitas
        int saida = 0;   // Soma de despesas (mantendo negativo)
        int balanco = 0; // Resultado final (entrada + saída)

        for (Transacao transacao : transacoes) {
            // Verifica se o mês da transação é igual ao mês fornecido
            if ((transacao.getData().getMonthValue() == mes) && transacao.getData().getYear() == ano) {
                if (transacao.getValor() > 0) {
                    entrada += transacao.getValor(); // Somar receitas
                } else {
                    saida += transacao.getValor(); // Somar despesas (mantendo o valor negativo)
                }
            }
        }

        balanco = entrada + saida; // Calcula o balanço final

        // Cria uma dinâmica para armazenar os resultados. 
        List<Integer> resultado = new ArrayList<>();
        resultado.add(entrada);
        resultado.add(saida);
        resultado.add(balanco);

        return resultado;
    }

    // Método para gerar o balanço por categoria (baseado em mês e ano)
    public static  int gerarBalancoPorCategoria(String categoria, int mes, int ano, List<Transacao> transacoes) { //retorna o total do balanço financeiro de uma categoria específic
        int total = 0; //variável para armazenar o total de transações filtradas
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

  }
