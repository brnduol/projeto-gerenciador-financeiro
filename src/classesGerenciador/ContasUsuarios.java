/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classesGerenciador;

import java.awt.List;

/**
 *
 * @author Bruno Eduardo <https://github.com/brnduol>
 */

public class ContasUsuarios {
    // Lista para armazenar os usuários
    private List<Usuario> usuarios;
    
    // Instância única (singleton)
    private static ContasUsuarios instancia;

    // Construtor privado para evitar instâncias externas
    private ContasUsuarios() {
        usuarios = new ArrayList<>();
    }

    // Método para obter a instância única
    public static ContasUsuarios getInstance() {
        if (instancia == null) {
            instancia = new ContasUsuarios();
        }
        return instancia;
    }

    // Método para criar uma nova conta
    public void criarConta(String nome, String senha, String email) {
        // Verifica se o e-mail já está cadastrado
        for (Usuario usuario : usuarios) {
            if (usuario.getEmail().equals(email)) {
                System.out.println("E-mail já cadastrado!");
                return;
            }
        }

        // Cria e adiciona um novo usuário
        Usuario novoUsuario = new Usuario(nome, senha, email);
        usuarios.add(novoUsuario);
        System.out.println("Conta criada com sucesso!");
    }

    // Método para autenticar um usuário
    public boolean entrarConta(String email, String senha) {
        for (Usuario usuario : usuarios) {
            if (usuario.getEmail().equals(email) && usuario.getSenha().equals(senha)) {
                System.out.println("Login bem-sucedido!");
                return true;
            }
        }
        System.out.println("E-mail ou senha incorretos.");
        return false;
    }

    // Método para listar todos os usuários (opcional, para testes)
    public void listarUsuarios() {
        if (usuarios.isEmpty()) {
            System.out.println("Nenhum usuário cadastrado.");
            return;
        }

        System.out.println("Usuários cadastrados:");
        for (Usuario usuario : usuarios) {
            System.out.println(usuario);
        }
    }
}