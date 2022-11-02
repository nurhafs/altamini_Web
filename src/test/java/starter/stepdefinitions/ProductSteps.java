package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.ProductPages;

public class ProductSteps {
    @Steps
    ProductPages productPages;

    @Given("I open mainpage url")
    public void iOpenMainpageUrl() {
        productPages.openUrl();
    }

    @When("I open product url")
    public void iOpenProductUrl() {
        productPages.openUrl();
    }

    @Then("I get product list")
    public void iGetProductList() {
        productPages.productListDisplayed();
    }

    @When("I click select category")
    public void iClickSelectCategory() {
        productPages.clickSelectCategory();
    }

    @And("I click one of the category")
    public void iClickOneOfTheCategory() {
        productPages.clickOneCategory();
    }

    @Then("I can see products based on chosen category")
    public void iCanSeeProductsBasedOnChosenCategory() {
        productPages.filteredProductsDisplayed();
    }

    @When("I click beli in one product")
    public void iClickBeliInOneProduct() {
        productPages.clickBuy();
    }

    @Then("Product added to cart")
    public void productAddedToCart() {
        productPages.cartQtyBadgeDisplayed();
    }

    @When("I click detail on one of the products")
    public void iClickDetailOnOneOfTheProducts() {
        productPages.clickDetail();
    }

    @Then("I get the product details")
    public void iGetTheProductDetails() {
        productPages.productDetailDisplayed();
    }
}
