/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classesGerenciador;

import java.util.ArrayList;
import java.util.List;

/**
 * A classe `Usuario` representa um usuário do sistema. 
 * Cada usuário possui um identificador único, nome, e-mail, senha, e diversas listas relacionadas às suas operações financeiras:
 * carteiras, categorias de despesas, origens de renda e transações. 
 * A classe inclui inicialização padrão de carteiras, categorias e origens de renda para facilitar a experiência do usuário.
 * 
 * @author Bruno Eduardo <https://github.com/brnduol>
 */
public class Usuario {
    private static int proximoId = 1; // Controle estático para geração de IDs únicos para cada usuário.
    private int id; // Identificador único de cada usuário.
    private String nome; // Nome do usuário.
    private String email; // E-mail do usuário.
    private String senha; // Senha do usuário.
    private List<Carteira> carteiras; // Lista de carteiras do usuário.
    private List<Categoria> categorias; // Lista de categorias de despesas padrão associadas ao usuário.
    private List<OrigemRenda> origemRendas; // Lista de origens de renda padrão associadas ao usuário.
    private List<Transacao> transacoes; // Lista de transações realizadas pelo usuário.

    // Construtor vazio, necessário para instâncias criadas sem parâmetros.
    public Usuario() {}

    // Construtor principal, inicializa o usuário com nome, senha e e-mail.
    public Usuario(String nome, String senha, String email) {
        this.id = proximoId++; // Atribui um ID único ao usuário.
        this.nome = nome;
        this.senha = senha;
        this.email = email;

        // Inicialização das listas que armazenam objetos relacionados ao usuário.
        this.carteiras = new ArrayList<>();
        this.categorias = new ArrayList<>();
        this.origemRendas = new ArrayList<>();
        this.transacoes = new ArrayList<>();

        // Adiciona uma carteira padrão ao usuário, com saldo inicial de zero.
        Carteira carteiraFixa = new Carteira("Carteira Padrão", 0);
        this.carteiras.add(carteiraFixa);

        // Adiciona categorias padrão associadas ao usuário.
        categorias.add(new Categoria("Alimentação"));
        categorias.add(new Categoria("Transporte"));
        categorias.add(new Categoria("Saúde"));
        categorias.add(new Categoria("Lazer"));
        System.out.println("Categorias criadas:");
        for (Categoria categoria : categorias) {
            System.out.println(categoria.getNomeCategoria());
        }

        // Adiciona origens de renda padrão associadas ao usuário.
        origemRendas.add(new OrigemRenda("Salário"));
        origemRendas.add(new OrigemRenda("Freelance"));
        origemRendas.add(new OrigemRenda("Investimentos"));
        origemRendas.add(new OrigemRenda("Aluguel"));
        System.out.println("Origens de renda criadas:");
        for (OrigemRenda origemRenda : origemRendas) {
            System.out.println(origemRenda.getNomeOrigemRenda());
        }
    }

    // Métodos getters para acessar os atributos do usuário.
    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }

    public List<Carteira> getCarteiras() {
        return carteiras;
    }

    public List<OrigemRenda> getOrigemRendas() {
        return origemRendas;
    }

    public List<Categoria> getCategorias() {
        return categorias;
    }

    public List<Transacao> getTransacoes() {
        return transacoes;
    }

    // Métodos setters para modificar os atributos do usuário.
    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setCarteiras(List<Carteira> carteiras) {
        this.carteiras = carteiras;
    }

    // Método para criar e adicionar uma nova carteira à lista de carteiras do usuário.
    public void criarCarteira(String nome, int saldo) {
        Carteira carteira = new Carteira(nome, saldo);
        carteiras.add(carteira);
    }

    // Método para adicionar uma transação a uma carteira específica.
    public void adicionarTrasacao(Carteira carteira, Transacao transacao) {
        carteira.adicionarTransacao(transacao);
    }
}
