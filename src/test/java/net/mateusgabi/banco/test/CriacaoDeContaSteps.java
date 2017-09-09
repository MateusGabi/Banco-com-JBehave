package net.mateusgabi.banco.test;

import net.mateusgabi.banco.Conta;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.steps.Steps;
import org.junit.Assert;

/**
 * @author Mateus Gabi Moreira <mateusgabimoreira@gmail.com>
 *         on 09/09/2017.
 */
public class CriacaoDeContaSteps extends Steps {

    private Conta contaMock;

    private String nome;
    private Double saldo;

    @Given("a cliente chamado $nome")
    public void nullaCliente(String nome) {
        contaMock = null;

        this.nome = nome;
    }

    @When("quero criar conta com saldo $saldo")
    public void criouConta(String saldo) {
        Assert.assertNull(contaMock);

        try {
            this.saldo = Double.parseDouble(saldo);
        }
        catch (NumberFormatException ex){
            this.saldo = null;
        }
    }

    @Then("cria conta com saldo $saldo")
    public void criarClienteMock(double saldo) {
        contaMock = new Conta(this.nome, 222, this.saldo);

        Assert.assertNotNull(contaMock);

        //
        // não entendi o que é esse assertEqual com expected, actual, delta
        //
        Assert.assertEquals(150.0, this.saldo, saldo);
    }

    @Then("não cria conta, pois nome invalido")
    public void naoDeveCriarConta_NomeInvalido() {

        contaMock = new Conta(this.nome, 222, this.saldo);



        Assert.assertNull(contaMock);


    }

    @Then("não cria conta, saldo inválido")
    public void naoDeveCriarConta_SaldoInvalido() {

        try {
            contaMock = new Conta(this.nome, 222, this.saldo);
        } catch (Exception ex) {

        }


        Assert.assertNull(contaMock);

    }

    @Then("não cria conta, nome e saldo inválido")
    public void naoDeveCriarConta_NomeSaldoInvalido() {

        try {
            contaMock = new Conta(this.nome, 222, this.saldo);
        } catch (Exception ex) {

        }


        Assert.assertNull(contaMock);


    }

}
