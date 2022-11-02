package starter.stepdefinitions;

import io.cucumber.java.en.*;
import net.thucydides.core.annotations.Steps;
import starter.pages.CartPages;

public class CartSteps {
    @Steps
    CartPages cartPages;

    @Given("I open homepage url")
    public void iOpenHomepageUrl() {
        cartPages.openMainPageUrl();
    }

    @When("I buy product")
    public void iBuyProduct() {
        cartPages.clickBuyBtn();
    }

    @And("I click cart logo")
    public void iClickCartLogo() {
        cartPages.clickCartIcon();
    }

    @Then("I see my cart filled with products")
    public void iSeeMyCartFilledWithProducts() {
        cartPages.productsInCartDisplayed();
    }

    @Then("I see my cart empty")
    public void iSeeMyCartEmpty() {
        cartPages.emptyCartDisplayed();
    }

    @And("I open cart page")
    public void iOpenCartPage() {
        cartPages.clickCartIcon();
    }

    @When("I click minus logo")
    public void iClickMinusLogo() {
        cartPages.clickMinusBtn();
    }

    @Then("The product is deleted from my cart")
    public void theProductIsDeletedFromMyCart() {
        cartPages.emptyCartDisplayed();
    }

    @When("I click plus logo")
    public void iClickPlusLogo() {
        cartPages.clickPlusBtn();
    }

    @Then("The quantity of product is added")
    public void theQuantityOfProductIsAdded() {
        cartPages.checkQtyPanel("2");
    }

    @Then("The quantity of product is reduced")
    public void theQuantityOfProductIsReduced() {
        cartPages.checkQtyPanel("1");
    }

    @And("I buy one of the products")
    public void iBuyOneOfTheProducts() {
        cartPages.openMainPageUrl();
        cartPages.clickBuyBtn();
    }

    @And("I buy two of the products")
    public void iBuyTwoOfTheProducts() {
        cartPages.openMainPageUrl();
        cartPages.buyTwice();
    }
}
