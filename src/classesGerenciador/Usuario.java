/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classesGerenciador;

import java.util.List;

/**
 *
 * @author Bruno Eduardo <https://github.com/brnduol>
 */
public class Usuario {

    
    private int id;
    private String nome;
    private String email;
    private String senha;
    private double limiteMensal;
    private List<Carteira> carteiras;
    private List<Balanco> balanco;
    public List<Categoria> categoria;
    
    public Usuario(String nome, String senha, String email) {
        this.nome = nome;
        this.senha = senha;
        this.email = email;
        
        
        
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

    public double getLimiteMensal() {
        return limiteMensal;
    }

    public List<Carteira> getCarteiras() {
        return carteiras;
    }

    public List<Balanco> getBalanco() {
        return balanco;
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

    public void setLimiteMensal(double limiteMensal) {
        this.limiteMensal = limiteMensal;
    }

    public void setCarteiras(List<Carteira> carteiras) {
        this.carteiras = carteiras;
    }

    public void setBalanco(List<Balanco> balanco) {
        this.balanco = balanco;
    }

    public List<Categoria> getCategoria() {
        return categoria;
    }

    public void setCategoria(List<Categoria> categoria) {
        this.categoria = categoria;
    }

   
    
    
    
}
