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

public class ContasUsuarios {
    private List<Usuario> usuarios;
    private Usuario usuarioAtual;
    
 
    private static ContasUsuarios instancia;


    private ContasUsuarios() {
        usuarios = new ArrayList<>();
        Usuario usuario = new Usuario("adm", "123", "adm@email.com");
        usuarios.add(usuario);
    }


    public static ContasUsuarios getInstance() {
        if (instancia == null) {
            instancia = new ContasUsuarios();
        }
        return instancia;
    }


    public boolean criarConta(String nome, String senha, String email) {
  
        for (Usuario usuario : usuarios) {
            if (usuario.getEmail().equals(email)) {
                System.out.println("E-mail já cadastrado!");
                return false;
            }
        }


        Usuario novoUsuario = new Usuario(nome, senha, email);
        usuarios.add(novoUsuario);
        System.out.println("Conta criada com sucesso!");
        return true;
    }


    public boolean entrarConta(String email, String senha) {
        for (Usuario usuario : usuarios) {
            if (usuario.getEmail().equals(email) && usuario.getSenha().equals(senha)) {
                System.out.println("Login bem-sucedido!");
                usuarioAtual = usuario;
                conta();
                return true;
            }
        }
        System.out.println("E-mail ou senha incorretos.");
        return false;
    }
    
    public Usuario conta(){
        return usuarioAtual;
    }
    
    public void sairConta(){
        usuarioAtual = null;
    }

}