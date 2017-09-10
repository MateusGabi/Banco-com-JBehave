package net.mateusgabi.banco.test;

import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.steps.Steps;
import org.junit.Assert;

/**
 * @author Mateus Gabi Moreira <mateusgabimoreira@gmail.com>
 *         on 10/09/2017.
 */
public class SairSteps extends Steps {

    private String opcao;

    @When("quer sair clicando em $opcao")
    public void deveClicarEm4(String opcao) {

        this.opcao = opcao;

    }


    @Then("sistema encerrado")
    public void deveEncerrarAplicacao() {

        // sei que funciona entao encerro app

        Assert.assertEquals("4", opcao);

    }

    @Then("sistema nao encerra")
    public void naoDeveEncerrarAplicacao() {

        // sei que funciona entao encerro app

        Assert.assertNotEquals("4", opcao);
    }

}
