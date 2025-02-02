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
    public OrigemRenda(String nome){
        this.id = proximoId++;
        this.nomeOrigemRenda = nome;
        this.transacoes = new ArrayList<>();
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
    
    public String getNomeOrigemRenda(){
        return nomeOrigemRenda;
    }

    public void setNomeOrigemRenda(String nomeOrigemRenda) {
        this.nomeOrigemRenda = nomeOrigemRenda;
    }

    
    
    


    
}
