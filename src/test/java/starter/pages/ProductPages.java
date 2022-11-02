package starter.pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class ProductPages extends PageObject {
    private By productList() {
        return By.xpath("//div[contains(@class, 'row align-stretch')]");
    }

    private By categoryDropdown() {
        return By.xpath("//div/div[contains(@role, 'button')]");
    }

    private By detailBtn() { return By.xpath("(//button/span[text()='Detail'])[1]"); }
    private By buyBtn() {
        return By.xpath("(//button/span[text()='Beli'])[1]");
    }

    private By category() {
        return By.xpath("//div[contains(@class, 'v-list-item')][1]");
    }

    private By productDetailHeader() { return By.xpath("//div/div[contains(@class, 'v-card')]/p[contains(@class, 'text-h4')]"); }
    private By cartNumberBadge() {
        return By.xpath("//span[text()=1]");
    }

    private By alertElement() { return By.xpath("//div/div[contains(@role, 'alert')]"); }

    public void openUrl() {
        openAt("/");
    }

    public void productListDisplayed() {
        $(productList()).isDisplayed();
    }



    public void clickSelectCategory() {
        $(categoryDropdown()).click();
    }

    public void clickOneCategory() {
        $(category()).click();
    }

    public void filteredProductsDisplayed() {
        $(alertElement()).isDisplayed();
    }

    public void clickBuy() {
        $(buyBtn()).click();
    }

    public void cartQtyBadgeDisplayed() {
        $(cartNumberBadge()).isDisplayed();
    }

    public void clickDetail() { $(detailBtn()).click(); }

    public void productDetailDisplayed() {
        $(productDetailHeader()).isDisplayed();
    }
}
