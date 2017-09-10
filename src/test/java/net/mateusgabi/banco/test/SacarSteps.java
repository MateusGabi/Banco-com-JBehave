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
public class SacarSteps extends Steps {

    private Conta contaMock;
    private String saque;

    @Given("um cliente com saldo $saldo")
    public void contaMock(double saldo) {
        this.contaMock = new Conta("Mock", 0000, saldo);
    }

    @When("quer realizar saque de $saque")
    public void saqueDe(String saque){
        this.saque = saque;
    }

    @When("limite atingido? $q")
    public void limiteAtingido(boolean q) {

        //
        // como??
        //


    }

    @Then("sistema realiza saque")
    public void realizaSaque() {

        //
        // como testar??
        //

        try {
            this.contaMock.sacar(Double.parseDouble(saque));
        } catch (Exception ex) {

            //
            // Forçamos erro
            //
            Assert.assertTrue(false);

            return;

        }


        //
        // Forçamos acerto
        //
        Assert.assertTrue(true);
    }


    @Then("sistema não realiza saque")
    public void naoRealizaSaque() {


        //
        // como testar??
        //



        try {
            this.contaMock.sacar(Double.parseDouble(saque));
        } catch (Exception ex) {

            //
            // Forçamos acerto
            //
            Assert.assertTrue(true);

            return;

        }


        //
        // Forçamos erro
        //
        Assert.assertTrue(false);
    }

}
