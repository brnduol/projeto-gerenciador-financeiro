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
public class TransacaoDespesas extends Transacao {
    private Carteira conta;

    public TransacaoDespesas(int id, Carteira conta, double valor, LocalDate data, String descricao) {
        super(id, conta, valor, data, descricao);
        this.conta = conta;
    }

    public void atualizar(Carteira conta){
    }
    
     @Override
    public void excluirTransacao() {
        
    }

    @Override
    public void editarTransacao() {
        
    }

    public Carteira getConta() {
        return conta;
    }

    public void setConta(Carteira conta) {
        this.conta = conta;
    }

    
    
    
}