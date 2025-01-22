/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classesGerenciador;

import java.time.LocalDate;

/**
 *
 * @author Bruno Eduardo <https://github.com/brnduol>
 */
public abstract class Transacao {
    private static int proximoId = 1;
    protected int id;
    protected Carteira conta;
    protected double valor;
    protected LocalDate data;
    protected String descricao;
    
    public Transacao(Carteira conta, double valor, LocalDate data, String descricao) {
        this.id = proximoId++; // Incrementa o valor de proximoId para que a próxima instância receba um identificador único e sequencial
        this.conta = conta;
        this.valor = valor;
        this.data = data;
        this.descricao = descricao;
    }
    public int getId() {
    return id;
    }

    public static int getProximoId() {
        return proximoId;
    }

    public Carteira getConta() {
        return conta;
    }

    public double getValor() {
        return valor;
    }

    public LocalDate getData() {
        return data;
    }

    public String getDescricao() {
        return descricao;
    }
    public abstract String getTipo();
    // Métodos abstratos 
    public abstract String getNome();
    
    public abstract void atualizar(Carteira conta);
    
    public abstract void adicionarTransacao();
    
    public abstract void excluirTransacao();
        
    public abstract void editarTransacao();
    
    public abstract boolean pertenceCategoria(String categoria);

    public abstract boolean pertenceOrigem(String origem);
    
    
}