package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.LogInOutPages;

public class LogInOutSteps {
    @Steps
    LogInOutPages logInOutPages;

    @When("I open login url")
    public void iOpenLoginUrl() {
        logInOutPages.openUrl();
    }

    @Then("I will go to login page")
    public void iWillGoToLoginPage() {
        logInOutPages.loginPageDisplayed();
    }

    @Given("I am in login page")
    public void iAmInLoginPage() {
        logInOutPages.openUrl();
    }

    @When("I input {string} email")
    public void iInputEmailEmail(String email) {
        logInOutPages.inputEmail(email);
    }

    @And("I input {string} password")
    public void iInputPasswordPassword(String pass) {
        logInOutPages.inputPassword(pass);
    }

    @And("I click login button")
    public void iClickLoginButton() {
        logInOutPages.clickLoginBtn();
    }

    @Then("I get {string} as result")
    public void iGetResult(String res) {
        if (res.equals("logged in")) {
            logInOutPages.loggedIn();
        }
        else {
            logInOutPages.getError();
        }
    }

    @Given("I am logged in to the website")
    public void iAmLoggedInToTheWebsite() {
        logInOutPages.openUrl();
        logInOutPages.inputEmail("thaur@mail.com");
        logInOutPages.inputPassword("thaurn");
        logInOutPages.clickLoginBtn();
    }

    @When("I click user logo")
    public void iClickUserLogo() {
        logInOutPages.clickUserIcon();

    }

    @And("I click logout button")
    public void iClickLogoutButton() {
        logInOutPages.clickLogoutBtn();
    }

    @Then("I am back to login page")
    public void iAmBackToLoginPage() {
        logInOutPages.loginPageDisplayed();
    }
}
