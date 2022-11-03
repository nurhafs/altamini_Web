package starter.pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class LogInOutPages extends PageObject {
    private By loginHeader() {
        return By.xpath("//div/div[text()='Login']");
    }
    private By userIcon() {
        return By.xpath("//i[contains(@class, 'fa-user')]");
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

    private By warningIcon() {
        return By.xpath("//div/i");
    }
    private By emailRequired() { return By.xpath("//div[text()=' email is required ']"); }
    private By passwordRequired() { return By.xpath("//div[text()=' password is required ']"); }

    private By logoutBtn() { return By.xpath("//div[text()=' Logout ']"); }


    public void openUrl() {
        openAt("/auth/login");
    }
    public void loginPageDisplayed() {
        $(loginHeader()).isDisplayed();
    }
    public void inputEmail(String email) {
        $(fieldEmail()).type(email);
    }

    public void inputPassword(String pass) {
        $(fieldPassword()).type(pass);
    }

    public void clickLoginBtn() {
        $(loginBtn()).click();
    }

    public void getError() {
        $(warningIcon()).waitUntilPresent();
        $(warningIcon()).isDisplayed();
    }

    public void loggedIn() {
        $(userIcon()).isDisplayed();
    }

    public void clickUserIcon() {
        $(userIcon()).click();
    }

    public void clickLogoutBtn() {
        $(logoutBtn()).click();
    }

    public void emailError() {
        $(emailRequired()).isDisplayed();
    }

    public void passwordError() {
        $(passwordRequired()).isDisplayed();
    }

}
