/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classesGerenciador;

import java.util.ArrayList;
import java.util.List;

/**
 * A classe `ContasUsuarios` gerencia a lista de usuários cadastrados no sistema,
 * permitindo a criação, autenticação e controle de sessão de usuários.
 * Implementa o padrão Singleton, garantindo que apenas uma instância dessa classe
 * exista durante a execução do programa.
 * 
 * @author Bruno Eduardo <https://github.com/brnduol>
 */
public class ContasUsuarios {
    private List<Usuario> usuarios; // Lista de usuários cadastrados no sistema.
    private Usuario usuarioAtual; // Usuário atualmente autenticado.

    private static ContasUsuarios instancia; // Instância única da classe (Singleton).

    // Construtor privado para impedir a criação de múltiplas instâncias.
    private ContasUsuarios() {
        usuarios = new ArrayList<>();
    }

    // Método Singleton para obter a instância única de `ContasUsuarios`.
    public static ContasUsuarios getInstance() {
        if (instancia == null) {
            instancia = new ContasUsuarios(); // Cria a instância única se ainda não existir.
        }
        return instancia;
    }

    // Método para criar um novo usuário no sistema.
    // Retorna `true` se o cadastro for bem-sucedido e `false` caso o e-mail já esteja cadastrado.
    public boolean criarConta(String nome, String senha, String email) {
        for (Usuario usuario : usuarios) {
            if (usuario.getEmail().equals(email)) { // Verifica se o e-mail já está cadastrado.
                System.out.println("E-mail já cadastrado!");
                return false;
            }
        }

        Usuario novoUsuario = new Usuario(nome, senha, email);
        usuarios.add(novoUsuario); // Adiciona o novo usuário à lista de usuários.
        System.out.println("Conta criada com sucesso!");
        return true;
    }

    // Método para autenticar um usuário no sistema.
    // Retorna `true` se o login for bem-sucedido e `false` caso contrário.
    public boolean entrarConta(String email, String senha) {
        for (Usuario usuario : usuarios) {
            if (usuario.getEmail().equals(email) && usuario.getSenha().equals(senha)) {
                System.out.println("Login bem-sucedido!");
                usuarioAtual = usuario; // Define o usuário autenticado.
                return true;
            }
        }
        System.out.println("E-mail ou senha incorretos.");
        return false;
    }

    // Retorna o usuário atualmente autenticado no sistema.
    public Usuario conta() {
        return usuarioAtual;
    }

    // Método para encerrar a sessão do usuário, removendo o usuário autenticado.
    public void sairConta() {
        usuarioAtual = null; // Define o usuário atual como `null`, efetivamente realizando o logout.
    }
}
