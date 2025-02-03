/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classesGerenciador;

import java.time.LocalDate;

/**
 * Classe que representa uma transação de receita.
 * Herda da classe Transacao e adiciona funcionalidades específicas para receitas.
 *
 * @author Bruno Eduardo <https://github.com/brnduol>
 */
public class TransacaoReceita extends Transacao {
    private OrigemRenda origemRenda; 
    private Usuario usuarioAtual; 

    /**
     * @param conta A carteira associada à transação.
     * @param valor O valor da transação.
     * @param data A data da transação.
     * @param descricao A descrição da transação.
     * @param origemReceita A origem da receita (ex: salário, investimentos, etc.).
     */
    
    public TransacaoReceita() {
        usuarioAtual = ContasUsuarios.getInstance().conta(); 
        super();
        this.origemRenda = origemRenda; 
    }
    
    public TransacaoReceita(Carteira conta, int valor, LocalDate data, String descricao, OrigemRenda origemReceita) {
        usuarioAtual = ContasUsuarios.getInstance().conta(); // Obtém a instância do usuário atual.
        super(conta, valor, data, descricao); // Chama o construtor da classe pai (Transacao).
        this.origemRenda = origemReceita; 
    }
    
    
    /**
     * Retorna a origem da receita associada à transação.
     *
     * @return A origem da receita.
     */
    public OrigemRenda getOrigemReceita() {
        return origemRenda;
    }

    /**
     * Atualiza o saldo da carteira com o valor da transação.
     *
     * @param carteira A carteira que será atualizada.
     */
    @Override
    public void atualizar(Carteira carteira) {
        carteira.atualizarSaldo(valor); 
    }

    /**
     * Exclui a transação da lista de transações de origemRenda e de usuarioAtual.
     */
    @Override
    public void excluirTransacao() {
        origemRenda.getTransacoes().remove(this); 
        usuarioAtual.getTransacoes().remove(this); 
    }

    /**
     * Edita os detalhes da transação (valor, data e descrição).
     *
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
     * Verifica se a transação pertence a uma categoria específica.
     * Como receitas não têm categoria, sempre retorna falso.
     */
    @Override
    public boolean pertenceCategoria(String categoria) {
        return false; 
    }

    /**
     * Verifica se a transação pertence a uma origem específica.
     *
     * @param origem A origem a ser verificada.
     * @return true se a origem da transação for igual à origem passada como parâmetro, false caso contrário.
     */
    @Override
    public boolean pertenceOrigem(String origem) {
        return this.origemRenda.getNomeOrigemRenda().equals(origem); 
    }


    /**
     * Adiciona a transação à lista de transações da origem da receita e do usuário atual.
     */
    @Override
    public void adicionarTransacao() {
        origemRenda.getTransacoes().add(this); 
        usuarioAtual.getTransacoes().add(this); 
    }

    
    @Override
    public String getNome() {
        return origemRenda.getNomeOrigemRenda();
    }

    
    @Override
    public String getTipo() {
        return "Receita";
    }
    
    /**
     * Como receitas não têm categoria, este método não faz nada.
     */
    public void adicionarCategoria(Categoria categoria) {
    }
}