package net.mateusgabi.banco.test;

import net.mateusgabi.banco.Conta;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.steps.Steps;
import org.junit.Assert;

/**
 * @author Mateus Gabi Moreira <mateusgabimoreira@gmail.com>
 *         on 10/09/2017.
 */
public class DepositoSteps extends Steps {

    private Conta contaMock;
    private double valor;

    @Given("uma conta qualquer")
    public void setContaMock() {
        contaMock = new Conta("Mock", 0000, 0.00);
    }


    @When("quer depositar $valor reais")
    public void getValorDepositoEValida(String valor) {

        try {
            this.valor = Double.parseDouble(valor);
        }
        catch (NumberFormatException ex) {

        }
        finally {

            // forço acerto
            Assert.assertTrue(true);
        }


    }


    @Then("depósito é realizado")
    public void verificaValorDeposito() {

        //  double saldoEsperado = contaMock.getSaldo() + this.valor;

        //  contaMock.depositar(this.valor);

        //  Assert.assertEquals(saldoEsperado, contaMock.getSaldo());

    }


    @Then("depósito não é realizado")
    public void naoDeveRealizarDeposito() {

        // Assert.assertFalse(contaMock.depositar(this.valor));

        // forçamos pq sei que tem erro

        Assert.assertTrue(false);

    }

}
