/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classesGerenciador;

import java.util.List;

/**
 *
 * @author Bruno Eduardo <https://github.com/brnduol>
 */
public class Carteira {
    private static int proximoId = 1; // Variável estática para controlar o próximo ID disponível
    private int id; // ID único para cada OrigemRenda
    private String nome;
    private double saldo;
    private List<Transacao> transacoes;

    
    public Carteira(String nome, double saldo) {
        this.id = proximoId++; 
        this.nome = nome;
        this.saldo = saldo;
    }

    public static int getProximoId() {
        return proximoId;
    }

    public static void setProximoId(int proximoId) {
        Carteira.proximoId = proximoId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public void adicionarTransacao(Transacao transacao){
        transacao.atualizar(this);
        transacoes.add(transacao);
    }
    
    public void removerTransacao(int id){
        for (int i = 0; i < transacoes.size(); i++) {
            if (transacoes.get(i).getId() == id) {
                transacoes.remove(i);
                break;
            }
        }
    }
    public void atualizarSaldo(double valor){
        this.saldo += valor;
    }
    
}
