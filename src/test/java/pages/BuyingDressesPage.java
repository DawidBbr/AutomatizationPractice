package pages;

import com.github.javafaker.Faker;
import org.openqa.selenium.WebDriver;
import selectors.WebElementSelectors;
import utilis.Interactions;

public class BuyingDressesPage extends Interactions implements WebElementSelectors {
    public BuyingDressesPage(WebDriver driver) {
        super(driver);
    }
    public void inputValueOfDressesInSearchBox() {
        sendKeys(theMainSearchBoxSelector, "dresses");
    }
    public void clickInSearchButton() {
        click(buttonSearchSelector);
    }
    public void clickOnButtonSortProductsBy() {
        click(buttonSelectProductBySelector);
    }
    public void clickOnPriceLowestFirstFromDropDownSortProductsBy() {
        click(fieldPriceLowestFirstFromDropDownSelectProductSelector);
    }
    public void hoverOverOnTheDressAndClickOnAddToCartFromDropdown() {
        hoverOverAndClickOnDropDownElement(imageOfDressFromList, buttonAddToCartSelectedDress);
    }
    public void clickOnButtonContinueShopping() {
        click(buttonContinueShopping);
    }
    public void hoverOverOnMyShoppingCartAndClickCheckOutFromDropDown() {
        refreshPage();
        hoverOverAndClickOnDropDownElement(buttonViewMyShoppingCart, buttonCheckOutFromViewMyShoppingCartDropDownSelector);
    }
    public void clickOnProceedToCheckoutButton() {
        click(buttonProceedToCheckout);
    }
    public void inputEmailAddress() {
        Faker faker = new Faker();
        sendKeys(fieldEmailAddressSelector, faker.internet().emailAddress());
    }
    public void clickOnButtonCreateAnAccount() {
        click(buttonCreateAnAccount);
    }
}
