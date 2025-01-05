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
public class TransacaoTransferencia extends Transacao {
    private Carteira conta;

    // Construtor
    public TransacaoTransferencia(int id, Carteira conta, double valor, LocalDate data, String descricao) {
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
    @Override
    public boolean pertenceCategoria(String categoria) {
        // Receitas não têm categoria, então sempre retorna falso
        return false;
    }

    @Override
    public boolean pertenceOrigem(String origem) {
        return false;
    }
    
    
}



