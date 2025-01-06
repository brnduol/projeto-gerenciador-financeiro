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
    private String categoriaDespesa;

    public TransacaoDespesas(Carteira conta, double valor, LocalDate data, String descricao, String categoriaDespesa) {
        super(conta, valor*-1, data, descricao);
        this.categoriaDespesa = categoriaDespesa;
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

    public String getCategoriaDespesa() {
        return categoriaDespesa;
    }

    public void setCategoriaDespesa(String categoriaDespesa) {
        this.categoriaDespesa = categoriaDespesa;
    }
    @Override
    public boolean pertenceCategoria(String categoria) {
        return this.categoriaDespesa.equals(categoria);
    }

    @Override
    public boolean pertenceOrigem(String origem) {
        return false;
    }

    
}