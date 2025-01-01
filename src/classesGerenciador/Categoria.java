/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classesGerenciador;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lucia
 */
public class Categoria {
  private int id;
    private String descricao; // A descrição da categoria
    private List<Transacao> transacoes;

    // Construtor
    public Categoria(int id, String descricao) {
        this.id = id;
        this.descricao = descricao;
        this.transacoes = new ArrayList<>();
    }

    // Getters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<Transacao> getTransacoes() {
        return transacoes;
    }
}
