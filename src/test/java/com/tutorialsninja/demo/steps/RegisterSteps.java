package com.tutorialsninja.demo.steps;

import com.tutorialsninja.demo.pages.MyAccountPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class RegisterSteps {
    @Then("Verify the text {string}")
    public void verifyTheText(String regHeading) {
        Assert.assertEquals(new MyAccountPage().getRegAccHeading(), regHeading, "Register page navigation failed");
    }

    @Then("Verify the Message Your Account Has Been Created!")
    public void verifyTheMessageYourAccountHasBeenCreated() {
        Assert.assertEquals(new MyAccountPage().getRegConfirmText(), "Your Account Has Been Created!", "Reg success msg not displayed");
    }

    @And("I click on continue button after register")
    public void iClickOnContinueButtonAfterRegister() {
        new MyAccountPage().clickOnContAfterRegButton();
    }

    @And("I register to ac using data: {string}, {string}, {string}, {string}, {string}, {string}")
    public void iRegisterToAcUsingData(String fName, String lName, String email, String mobile, String pwd, String cpwd) {
        new MyAccountPage().fillRegistrationData(fName, lName, email, mobile, pwd, cpwd);
    }
}
