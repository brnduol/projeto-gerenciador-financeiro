/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classesGerenciador;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Bruno Eduardo <https://github.com/brnduol>
 */
public class Usuario {
    private static int proximoId = 1;
    private int id;
    private String nome;
    private String email;
        private String senha;
    private List<Carteira> carteiras;
    private List<Balanco> balancos;
    private List<Categoria> categorias;
    private List<OrigemRenda> origemRendas;
    private List<Transacao> transacoes;
    
    
    public Usuario(String nome, String senha, String email) {
        this.id = proximoId++;
        this.nome = nome;
        this.senha = senha;
        this.email = email;
        
         // Inicializando as listas
        this.carteiras = new ArrayList<>();
        this.balancos = new ArrayList<>();
        this.categorias = new ArrayList<>();
        this.origemRendas = new ArrayList<>();
        this.transacoes = new ArrayList<>();
        
        // Criando e adicionando a carteira fixa para o usuário
        Carteira carteiraFixa = new Carteira("Carteira Padrão", 0); // Criando uma carteira padrão com saldo 0
        this.carteiras.add(carteiraFixa); // Adiciona a carteira à lista de carteiras
        
        // Criando 4 categorias padrão 
        categorias.add(new Categoria("Alimentação"));
        categorias.add(new Categoria("Transporte"));
        categorias.add(new Categoria("Saúde"));
        categorias.add(new Categoria("Lazer"));
        System.out.println("Categorias criadas:");
        for (Categoria categoria : categorias) {
            System.out.println(categoria.getNomeCategoria());
        }
  

        // Criando 4 origens de renda padrão 
        origemRendas.add(new OrigemRenda("Salário"));
        origemRendas.add(new OrigemRenda("Freelance"));
        origemRendas.add(new OrigemRenda("Investimentos"));
        origemRendas.add(new OrigemRenda("Aluguel"));
       System.out.println("Origens de renda criadas:");
        for (OrigemRenda origemRenda : origemRendas) {
            System.out.println(origemRenda.getNomeOrigemRenda());
        }

    }
    
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

    public List<Balanco> getBalanco() {
        return balancos;
    }
    
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
    public List<OrigemRenda> getOrigemRendas() {
            return origemRendas;
        }

    public List<Categoria> getCategorias() {
        return categorias;
    }
    
    public List<Transacao> getTransacoes(){
        return transacoes;
    }

    public void criarCarteira(String nome, int saldo){
        Carteira carteira = new Carteira(nome, saldo);
        carteiras.add(carteira);
    }
    public Balanco solicitarBalanco(int mes, int ano){
        for (Balanco balanco : balancos) {
            if (balanco.getMes() == mes && balanco.getAno() == ano){
                return balanco;
            }
        }
        return null;
    }
    
    public void adicionarTrasacao(Carteira carteira, Transacao transacao){
        carteira.adicionarTransacao(transacao);
    }

   
    
    
    
}
