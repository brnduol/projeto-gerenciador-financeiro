/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classesGerenciador;

import java.time.LocalDate;

/**
 * Classe que representa uma transação de despesa.
 * Herda da classe Transacao e adiciona funcionalidades específicas para despesas.
 *
 * @author Bruno Eduardo <https://github.com/brnduol>
 */
public class TransacaoDespesas extends Transacao implements Atualizavel {
    private Categoria categoriaDespesa; 
    private Usuario usuarioAtual; 

    /**
     * Construtor da classe TransacaoDespesas.
     *
     * @param conta A carteira associada à transação.
     * @param valor O valor da transação (positivo, mas será tratado como negativo no sistema).
     * @param data A data da transação.
     * @param descricao A descrição da transação.
     * @param categoriaDespesa A categoria da despesa (ex: alimentação, transporte, etc.).
     */
    
    public TransacaoDespesas(){
        usuarioAtual = ContasUsuarios.getInstance().conta(); 
        super();
        this.categoriaDespesa = categoriaDespesa;
    }
    
    public TransacaoDespesas(Carteira conta, int valor, LocalDate data, String descricao, Categoria categoriaDespesa) {
        usuarioAtual = ContasUsuarios.getInstance().conta(); 
        super(conta, valor * -1, data, descricao); 
        this.categoriaDespesa = categoriaDespesa; 
    }

    /**
     * Atualiza o saldo da carteira com o valor da transação.
     * Como é uma despesa, o valor é negativo.
     */
    @Override
    public void atualizar(Carteira carteira) {
        categoriaDespesa.getTransacoes().add(this); 
        usuarioAtual.getTransacoes().add(this); 
        carteira.atualizarSaldo(valor); 
    }

    /**
     * Exclui a transação da lista de transações da categoria da despesa e do usuário atual.
     */
    @Override
    public void excluirTransacao() {
        categoriaDespesa.getTransacoes().remove(this); 
        usuarioAtual.getTransacoes().remove(this); 
        conta.atualizarSaldo(valor*-1);
    }

    /**
     * @param data A nova data da transação.
     * @param valor O novo valor da transação.
     * @param descricao A nova descrição da transação.
     */
    @Override
    public void editarTransacao(LocalDate data, int valor, String descricao) {
        this.valor = valor; 
        this.data = data; 
        this.descricao = descricao; 
    }

    /**
     * Retorna o tipo da transação.
     */
    @Override
    public String getTipo() {
        return "Despesa";
    }

    /**
     * Verifica se a transação pertence a uma categoria específica.
     *
     * @param categoria A categoria a ser verificada.
     * @return true se a categoria da transação for igual à categoria passada como parâmetro, false caso contrário.
     */
    @Override
    public boolean pertenceCategoria(String categoria) {
        return this.categoriaDespesa.equals(categoria); 
    }

    /**
     * Verifica se a transação pertence a uma origem específica.
     * Como despesas não têm origem, sempre retorna falso.
     */
    @Override
    public boolean pertenceOrigem(String origem) {
        return false; 
    }

    /**
     * Adiciona a transação à lista de transações da categoria da despesa e do usuário atual.
     */

    /**
     * Retorna o nome da categoria da despesa associada à transação.
     */
    @Override
    public String getNome() {
        return categoriaDespesa.getNomeCategoria();
    }
    
     /**
     * Retorna a categoria da despesa associada à transação.
     *
     * @return A categoria da despesa.
     */
    public Categoria getCategoriaDespesa() {
        return categoriaDespesa;
    }
}