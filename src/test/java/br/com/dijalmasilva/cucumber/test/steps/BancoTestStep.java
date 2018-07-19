package br.com.dijalmasilva.cucumber.test.steps;

import br.com.dijalmasilva.cucumber.model.Banco;
import br.com.dijalmasilva.cucumber.model.Conta;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class BancoTestStep {

    private Banco banco;
    private int totalContas;
    private Double totalDinheiro;

    @Dado("^que as contas sao do \"(.*?)\"$")
    public void que_as_contas_sao_do(String nome, List<Conta> contas) throws Throwable {
        banco = new Banco(nome, contas);
    }

    @Dado("^o calculo do total de contas criadas$")
    public void o_calculo_do_total_de_contas_criadas() throws Throwable {
        totalContas = banco.getTotalDeContas();
    }

    @Entao("^o total de contas e (\\d+)$")
    public void o_total_de_contas_e(int totalContasEsperado) throws Throwable {
        assertEquals("O cálculo do total de contas está incorreto",
                totalContasEsperado, totalContas);
    }

    @Dado("^o calculo do total de dinheiro$")
    public void o_calculo_do_total_de_dinheiro() throws Throwable {
        totalDinheiro = banco.getTotalDinheiro();
    }

    @Entao("^o total de dinheiro no banco e (\\d+)$")
    public void o_total_de_dinheiro_no_banco_e(Double totalDinheiroEsperado)
            throws Throwable {

        assertEquals("O cálculo do total de dinheiro no banco " + banco.getNome()
                        + " está incorreto",
                totalDinheiroEsperado, totalDinheiro);
    }
}
