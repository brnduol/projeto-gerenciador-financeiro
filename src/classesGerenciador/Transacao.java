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
public abstract class Transacao {
    protected int id;
    protected Carteira conta;
    protected double valor;
    protected LocalDate data;
    protected String descricao;
    
    public abstract void excluirTransacao();
        
    public abstract void editarTransacao();
    
    
}