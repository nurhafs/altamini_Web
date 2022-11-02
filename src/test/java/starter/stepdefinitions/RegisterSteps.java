package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.RegisterPage;

import java.util.Random;

public class RegisterSteps {
    @Steps
    RegisterPage registerPage;

//    @Given("I open register page")
//    public void i_open_register_page() {
//        registerPage.openUrl();
//    }

    @When("I open register page")
    public void iOpenRegisterPage() {
        registerPage.openUrl();
    }

    @When("I input full name")
    public void iInputFullName() {
        registerPage.inputFullName("Yaaa");
    }
//
//    @And("I input new email")
//    public void iInputNewEmail() {
//    }
//
    @And("I input password")
    public void iInputPassword() {
        registerPage.inputPassword("thaurn");
    }

    @And("I click register")
    public void iClickRegister() {
        registerPage.clickRegisterBtn();
    }

    @Then("I get empty form error")
    public void iGetEmptyFormError() {
        registerPage.getError();
    }

    @And("I input registered email")
    public void iInputRegisteredEmail() {
        registerPage.inputEmail("thaur@mail.com");
    }

    @Then("I get registered error")
    public void iGetRegisteredError() {
        registerPage.getError();
    }
//
    @When("I insert {string} as full name")
    public void iInsertFullnameAsFullName(String fullname) {
        registerPage.inputFullName(fullname);

    }

    @And("I insert {string} as email")
    public void iInsertEmailAsEmail(String email) {
        registerPage.inputEmail(email);
    }

    @And("I insert {string} as password")
    public void iInsertPasswordAsPassword(String password) {
        registerPage.inputPassword(password);
    }

    @Then("I get {string} error")
    public void iGetErrorError(String error) {
        registerPage.getError();
    }

    @Then("I will go to register page")
    public void i_will_go_to_register_page() {
        registerPage.registerPageDisplayed();
    }

    @And("I input new email")
    public void iInputNewEmail() {
        Random rand = new Random();
        String email = "mailer" + rand.nextInt() + "@mail.com";
        registerPage.inputEmail(email);
    }

    @Then("I am redirected to login page")
    public void iAmRedirectedToLoginPage() {
        registerPage.loginPageDIsplayed();
    }
}
