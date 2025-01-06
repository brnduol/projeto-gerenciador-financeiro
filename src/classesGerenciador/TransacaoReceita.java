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
public class TransacaoReceita extends Transacao {
    private String origemReceita;

    
    public TransacaoReceita(Carteira conta, double valor, LocalDate data, String descricao, String origemReceita) {
        super(conta, valor, data, descricao);
        this.origemReceita = origemReceita;
    }

    @Override
    public void atualizar(Carteira carteira){
        carteira.atualizarSaldo(valor);
    }
    
    @Override
    public void excluirTransacao() {
        
    }

    @Override
    public void editarTransacao() {
        
    }
    
    @Override
    public boolean pertenceCategoria(String categoria) {
        // Receitas não têm categoria, então sempre retorna falso
        return false;
    }

    @Override
    public boolean pertenceOrigem(String origem) {
        return this.origemReceita.equals(origem); // compara a string armazenada no atributo origemReceita (que pertence ao objeto atual) com a string recebida como parâmetro origem.
    }
    
    public void adicionarCategoria(Categoria categoria){
        
    }
    
    public String getOrigemReceita() {
        return origemReceita;
    }

    public void setOrigemReceita(String categoria) {
        this.origemReceita = categoria;
    }
}