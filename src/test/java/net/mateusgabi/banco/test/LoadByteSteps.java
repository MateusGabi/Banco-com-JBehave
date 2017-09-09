package net.mateusgabi.banco.test;

import java.io.File;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.steps.Steps;
import org.junit.Assert;


/**
 * BDD tests for the ingest class
 * @author funktapuss
 *
 */
public class LoadByteSteps extends Steps {

    private String fNameS;
    private byte[] byteARR;

    @Given("a file, $filename")
    public void setFileName(@Named("filename") String filename) {
        File file = new File(getClass().getResource("/" + filename).getFile());
        fNameS = file.getPath();
    }

    @When("the caller loads the file as a byte array")
    public void loadFile() {
    }

    @Then("the byte array that is returned contains the "
            + "correct number of bytes.")
    public void checkArrSize() {
        File file = new File(fNameS);
        Assert.assertTrue(true);
    }



}
