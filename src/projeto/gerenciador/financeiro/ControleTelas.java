/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license/default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projeto.gerenciador.financeiro;

import telas.Cadastro1;
import telas.Login1;
import telas.TelaCategoria1;
import telas.TelaContas1;
import telas.TelaGrafico1;
import telas.TelaHistorico1;
import telas.TelaPrincipal1;
import telas.mini.TelaDetalhar;

/**
 * A classe `ControleTelas` gerencia todas as telas do sistema,
 * garantindo que cada uma seja instanciada apenas uma vez através do padrão Singleton.
 * Esse gerenciamento evita a criação repetitiva de objetos e melhora o desempenho da aplicação.
 *
 * @author Bruno Eduardo <https://github.com/brnduol>
 */
public class ControleTelas {
    private static ControleTelas instance; // Instância única da classe (Singleton).

    private Cadastro1 telaCadastro;
    private Login1 telaLogin;
    private TelaCategoria1 telaCategoria;
    private TelaContas1 telaContas;
    private TelaGrafico1 telaGrafico;
    private TelaHistorico1 telaHistorico;
    private TelaPrincipal1 telaPrincipal;
    private TelaDetalhar telaDetalhar;

    // Construtor privado para impedir a criação de múltiplas instâncias da classe.
    private ControleTelas() {}

    // Método Singleton para obter a instância única da classe.
    public static ControleTelas getInstance() {
        if (instance == null) {
            instance = new ControleTelas(); // Cria a instância única se ainda não existir.
        }
        return instance;
    }

    // Métodos que retornam as telas do sistema, criando-as apenas se necessário.


    // Retorna a tela de cadastro, instanciando-a caso ainda não tenha sido criada.
 
    public Cadastro1 getTelaCadastro() {
        if (telaCadastro == null) {
            telaCadastro = new Cadastro1();
        }
        return telaCadastro;
    }

 
    // Retorna a tela de login, instanciando-a caso ainda não tenha sido criada.
    
    public Login1 getTelaLogin() {
        if (telaLogin == null) {
            telaLogin = new Login1();
        }
        return telaLogin;
    }

    // Retorna a tela de categorias, instanciando-a caso ainda não tenha sido criada.
    
    public TelaCategoria1 getTelaCategoria() {
        if (telaCategoria == null) {
            telaCategoria = new TelaCategoria1();
        }
        return telaCategoria;
    }

    // Retorna a tela de contas, instanciando-a caso ainda não tenha sido criada.

    public TelaContas1 getTelaContas() {
        if (telaContas == null) {
            telaContas = new TelaContas1();
        }
        return telaContas;
    }

    // Retorna a tela de gráficos, instanciando-a caso ainda não tenha sido criada.

    public TelaGrafico1 getTelaGrafico() {
        if (telaGrafico == null) {
            telaGrafico = new TelaGrafico1();
        }
        return telaGrafico;
    }

    // Retorna a tela de histórico de transações, instanciando-a caso ainda não tenha sido criada.
    public TelaHistorico1 getTelaHistorico() {
        if (telaHistorico == null) {
            telaHistorico = new TelaHistorico1();
        }
        return telaHistorico;
    }

    // Retorna a tela principal do sistema, instanciando-a caso ainda não tenha sido criada.

    public TelaPrincipal1 getTelaPrincipal() {
        if (telaPrincipal == null) {
            telaPrincipal = new TelaPrincipal1();
        }
        return telaPrincipal;
    }

  
     // Retorna a tela de detalhes, instanciando-a caso ainda não tenha sido criada.

    public TelaDetalhar getTelaDetalhar() {
        if (telaDetalhar == null) {
            telaDetalhar = new TelaDetalhar();
        }
        return telaDetalhar;
    }
}
