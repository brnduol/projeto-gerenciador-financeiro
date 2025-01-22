/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
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
 *
 * @author Bruno Eduardo <https://github.com/brnduol>
 */
public class ControleTelas {
    private static ControleTelas instance;

    private Cadastro1 telaCadastro;
    private Login1 telaLogin;
    private TelaCategoria1 telaCategoria;
    private TelaContas1 telaContas;
    private TelaGrafico1 telaGrafico;
    private TelaHistorico1 telaHistorico;
    private TelaPrincipal1 telaPrincipal;
    private TelaDetalhar telaDetalhar;

    // Construtor privado para evitar instâncias externas
    private ControleTelas() {}

    // Método para obter a única instância do gerenciador
    public static ControleTelas getInstance() {
        if (instance == null) {
            instance = new ControleTelas();
        }
        return instance;
    }

    // Métodos para retornar as telas, criando-as se necessário
    public Cadastro1 getTelaCadastro() {
        if (telaCadastro == null) {
            telaCadastro = new Cadastro1();
        }
        return telaCadastro;
    }

    public Login1 getTelaLogin() {
        if (telaLogin == null) {
            telaLogin = new Login1();
        }
        return telaLogin;
    }

    public TelaCategoria1 getTelaCategoria() {
        if (telaCategoria == null) {
            telaCategoria = new TelaCategoria1();
        }
        return telaCategoria;
    }

    public TelaContas1 getTelaContas() {
        if (telaContas == null) {
            telaContas = new TelaContas1();
        }
        return telaContas;
    }

    public TelaGrafico1 getTelaGrafico() {
        if (telaGrafico == null) {
            telaGrafico = new TelaGrafico1();
        }
        return telaGrafico;
    }

    public TelaHistorico1 getTelaHistorico() {
        if (telaHistorico == null) {
            telaHistorico = new TelaHistorico1();
        }
        return telaHistorico;
    }

    public TelaPrincipal1 getTelaPrincipal() {
        if (telaPrincipal == null) {
            telaPrincipal = new TelaPrincipal1();
        }
        return telaPrincipal;
    }
    public TelaDetalhar getTelaDetalhar() {
        if (telaDetalhar == null) {
            telaDetalhar = new TelaDetalhar();
        }
        return telaDetalhar;
    }
}

