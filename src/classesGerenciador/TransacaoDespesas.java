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
    private Categoria categoriaDespesa;
    private Usuario usuarioAtual; //Intancia do usuario atual, para conseguir manipular suas informações.

    public TransacaoDespesas(Carteira conta, int valor, LocalDate data, String descricao, Categoria categoriaDespesa) {
        usuarioAtual = ContasUsuarios.getInstance().conta();
        super(conta, valor*-1, data, descricao); // valor*-1: as despesas são tratadas como valores negativos no sistema para distinguir receitas (valores positivos) de despesas (valores negativos).
        this.categoriaDespesa = categoriaDespesa;
    }
    
    
    @Override
    public void atualizar(Carteira carteira){
        carteira.atualizarSaldo(valor);
    }
    
    @Override
    public void excluirTransacao() {
        categoriaDespesa.getTransacoes().remove(this);
        usuarioAtual.getTransacoes().remove(this);
        
    }

    @Override
    public void editarTransacao() {
        
    }

    public Categoria getCategoriaDespesa() {
        return categoriaDespesa;
    }

    @Override
    public String getTipo(){
        return "Despesa";
    }
    
    @Override
    public boolean pertenceCategoria(String categoria) {
        return this.categoriaDespesa.equals(categoria);
    }

    @Override
    public boolean pertenceOrigem(String origem) {
        return false;
    }

    @Override
    public void adicionarTransacao() {
        categoriaDespesa.getTransacoes().add(this);
        usuarioAtual.getTransacoes().add(this);
    
    }
    
    @Override
    public String getNome(){
        return categoriaDespesa.getNomeCategoria();
    }
}