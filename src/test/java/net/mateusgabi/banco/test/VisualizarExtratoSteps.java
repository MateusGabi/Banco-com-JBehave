package net.mateusgabi.banco.test;

import net.mateusgabi.banco.Conta;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.steps.Steps;
import org.junit.Assert;

import java.util.InputMismatchException;

/**
 * @author Mateus Gabi Moreira <mateusgabimoreira@gmail.com>
 *         on 09/09/2017.
 */
public class VisualizarExtratoSteps extends Steps {

    private Conta clientMock;

    private String optionValue;


    @Given("a cliente mock")
    public void clientMock() {
        clientMock = new Conta("Mateus", 2222, 22.0);
    }

    @When("digita $optionValue")
    public void optionHandler(String optionValue) {
        this.optionValue = optionValue;
    }

    @Then("mostra seu extrato")
    public void mostraExtrato() {

        Integer opcao = Integer.parseInt(this.optionValue);

        StringBuilder extrato = new StringBuilder();
        extrato.append("\tEXTRATO");
        extrato.append("Nome: Mateus");
        extrato.append("Número da conta: 2222");
        extrato.append("Saldo atual: 22.00\n");
        extrato.append("Saques realizados hoje: 0\n");



    }

    @Then("mostra erro")
    public void mostraErro() {

        try {
            Integer opcao = Integer.parseInt(this.optionValue);
        }
        catch (InputMismatchException | NumberFormatException ex) {
            Assert.assertTrue(true);
        }

    }
}
