package starter.stepdefinitions;

import io.cucumber.java.en.*;
import net.thucydides.core.annotations.Steps;
import starter.pages.TransactionPages;

public class TransactionSteps {
    @Steps
    TransactionPages transactionPages;

    @Given("I am logged in")
    public void iAmLoggedIn() {
        transactionPages.loggedIn();
    }

    @And("I am in my filled cart page")
    public void iAmInMyFilledCartPage() {
        transactionPages.fillCart();
        transactionPages.goToCartPage();
    }

    @When("I click pay button")
    public void iClickPayButton() {
        transactionPages.clickPay();
    }

    @Then("I get redirected to my transaction list")
    public void iGetRedirectedToMyTransactionList() {
        transactionPages.transactionListDisplayed();
    }

    @Then("I get redirected to login page")
    public void iGetRedirectedToLoginPage() {
        transactionPages.loginPageDisplayed();
    }

    @When("I click my profile")
    public void iClickMyProfile() {
        transactionPages.userIconCLick();
    }

    @And("I click transaction button")
    public void iClickTransactionButton() {
        transactionPages.transactionMenuClick();
    }

    @Then("I get my transaction list")
    public void iGetMyTransactionList() {
        transactionPages.transactionListDisplayed();
    }
}
