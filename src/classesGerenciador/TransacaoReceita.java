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
    private String categoria;

    
    public TransacaoReceita(int id, Carteira conta, double valor, LocalDate data, String descricao, String categoria) {
        super(id, conta, valor, data, descricao);
        this.categoria = categoria;
    }

    public void atualizar(Carteira conta){
    }
    
    public void adicionarCategoria(Categoria categoria){
        
    }
    
     @Override
    public void excluirTransacao() {
        
    }

    @Override
    public void editarTransacao() {
        
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
    
}
