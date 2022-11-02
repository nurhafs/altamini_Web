package starter.pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class TransactionPages extends PageObject {
    private By userIcon() {
        return By.xpath("//i[contains(@class, 'fa-user')]");
    }

    private By payBtn() {
        return By.xpath("//div/button/span[text()=' Bayar ']");
    }

    private By loginHeader() {
        return By.xpath("//div/div[text()='Login']");
    }

    private By fieldEmail() {
        return By.xpath("//div[label[text() ='Email']]/input");
    }
    private By fieldPassword() {
        return By.xpath("//div[label[text() ='Password']]/input");
    }
    private By loginBtn() {
        return By.xpath("//button/span[text()='Login']");
    }

    private By transactionsList() { return By.xpath("//h1[text()='Transactions']"); }

    private By transactionMenu() {return By.xpath("//div[text()=' Transaksi ']");}

    private By cartIcon() { return By.xpath("//i[contains(@class, 'fa-shopping-cart')]"); }

    public void openUrl() {
        openAt("/");
    }

    public void fillCart() {
        for (int i = 1; i < 3; i++) {
            $(By.xpath("(//div/button/span[text()='Beli'])[" + i + "]")).click();
        }
    }

    public void clickPay() {
        $(payBtn()).click();
    }

    public void transactionListDisplayed() {
        $(transactionsList()).isDisplayed();
    }

    public void loggedIn() {
        openAt("/auth/login");
        $(fieldEmail()).type("thaur@mail.com");
        $(fieldPassword()).type("thaurn");
        $(loginBtn()).click();
    }

    public void goToCartPage() {
        $(cartIcon()).click();
    }

    public void userIconCLick() {
        $(userIcon()).click();
    }

    public void transactionMenuClick() {
        $(transactionMenu()).click();
    }

    public void loginPageDisplayed() {
        $(loginHeader()).isDisplayed();
    }


}
