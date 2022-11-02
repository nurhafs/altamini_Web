package starter.pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

import java.util.Random;

public class RegisterPage extends PageObject {

    private By registerPage() {
        return By.xpath("//div/div[text()='Register']");
    }

    private By loginPage() {
        return By.xpath("//div/div[text()='Login']");
    }

    private By fieldFullName() {
        return By.xpath("//div[label[text() ='Nama Lengkap']]/input");
    }
    private By fieldEmail() {
        return By.xpath("//div[label[text() ='Email']]/input");
    }
    private By fieldPassword() {
        return By.xpath("//div[label[text() ='Password']]/input");
    }
    private By regisBtn() {
        return By.xpath("//button/span[text()='Register']");
    }

    private By warningIcon() {
        return By.xpath("//div/i");
    }

    public void openUrl() {
        openAt("/auth/register");
    }

    public void registerPageDisplayed() {
        $(registerPage()).isDisplayed();
    }

    public void loginPageDIsplayed() {
        $(loginPage()).isDisplayed();
    }

    public void inputFullName(String fullname) {
        $(fieldFullName()).type(fullname);
    }

    public void inputEmail(String email) {
        $(fieldEmail()).type(email);
    }

    public void inputPassword(String pass) {
        $(fieldPassword()).type(pass);
    }

    public void clickRegisterBtn() {
        $(regisBtn()).click();
    }

    public void getError() {
        $(warningIcon()).waitUntilVisible();
        $(warningIcon()).isDisplayed();
    }





}
