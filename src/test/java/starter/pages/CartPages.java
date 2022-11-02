package starter.pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class CartPages extends PageObject {

    private By emptyNotification() { return By.xpath("//div/div[text()=' Order is empty! ']"); }

    private By productsInCart() { return By.xpath("//div/div[contains(@class, 'v-card')]"); }

    private By cartIcon() { return By.xpath("//i[contains(@class, 'fa-shopping-cart')]"); }

    private By minusBtn() { return By.xpath("//button/span[text()='-']"); }

    private By plusBtn() { return By.xpath("//button/span[text()='+']"); }

    private By quantityPanel() { return  By.xpath("//span[contains(@class, 'label-quantity')]"); }

    private By buyBtn() {
        return By.xpath("(//button/span[text()='Beli'])[1]");
    }

    private By cartNumberBadge(int qty) {
        return By.xpath("//span[text()=" + qty + "]");
    }

    public void openMainPageUrl() {
        openAt("/");
    }
    public void openCartUrl() {
        openAt("/order");
    }

    public void emptyCartDisplayed() {
        $(emptyNotification()).isDisplayed();
    }

    public void productsInCartDisplayed() {
        $(productsInCart()).isDisplayed();
    }

    public void clickCartIcon() {
        $(cartIcon()).click();
    }

    public void clickPlusBtn() {
        $(plusBtn()).click();
    }

    public void clickMinusBtn() {
        $(minusBtn()).click();
    }

    public void checkQtyPanel(String qty) {
        $(quantityPanel()).getText();
    }

    public void clickBuyBtn() {
        $(buyBtn()).click();
    }

    public void buyTwice() {
        $(buyBtn()).click();
        $(buyBtn()).click();
    }

    public void waitForCartBadge(int num) {
        waitForRenderedElements(cartNumberBadge(num));
    }

    public void cartNumberBadgeDisplayed() {
        $(cartNumberBadge(1)).isDisplayed();
    }
}
