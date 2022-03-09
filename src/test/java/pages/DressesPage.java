package pages;

import com.github.javafaker.Faker;
import org.openqa.selenium.WebDriver;
import selectors.WebElementSelectors;

import static utilis.Interactions.*;

public class DressesPage extends BasePage implements WebElementSelectors {
    public DressesPage(WebDriver driver) {
        super(driver);
    }
    public void inputValueOfDressesInSearchBox() {
        awaitUntilElementDisplayed(driver, theMainSearchBoxSelector);
        sendKeys(driver, theMainSearchBoxSelector, "dresses");
    }
    public void clickInSearchButton() {
        awaitUntilElementDisplayed(driver, buttonSearchSelector);
        click(driver, buttonSearchSelector);
    }
    public void clickOnButtonSortProductsBy() {
        awaitUntilElementDisplayed(driver, buttonSelectProductBySelector);
        click(driver, buttonSelectProductBySelector);
    }
    public void clickOnPriceLowestFirstFromDropDownSortProductsBy() {
        awaitUntilElementDisplayed(driver, fieldPriceLowestFirstFromDropDownSelectProductSelector);
        click(driver, fieldPriceLowestFirstFromDropDownSelectProductSelector);
    }
    public void hoverOverOnTheDressAndClickOnAddToCartFromDropdown() {
        awaitUntilElementDisplayed(driver, imageOfDressFromList);
        hoverOverAndClickOnDropDownElement(driver,imageOfDressFromList, buttonAddToCartSelectedDress);
    }
    public void clickOnButtonContinueShopping() {
        awaitUntilElementDisplayed(driver, buttonContinueShopping);
        click(driver, buttonContinueShopping);
    }
    public void hoverOverOnMyShoppingCartAndClickCheckOutFromDropDown() {
        awaitUntilElementDisplayed(driver, buttonViewMyShoppingCart);
        hoverOverAndClickOnDropDownElement(driver, buttonViewMyShoppingCart, buttonCheckOutFromViewMyShoppingCartDropDownSelector);
    }
    public void clickOnProceedToCheckoutButton() {
        awaitUntilElementDisplayed(driver, buttonProceedToCheckout);
        click(driver, buttonProceedToCheckout);
    }
    public void inputEmailAddress() {
        awaitUntilElementDisplayed(driver, fieldEmailAddressSelector);
        Faker faker = new Faker();
        sendKeys(driver, fieldEmailAddressSelector, faker.internet().emailAddress());
    }
    public void clickOnButtonCreateAnAccount() {
        awaitUntilElementDisplayed(driver, buttonCreateAnAccount);
        click(driver, buttonCreateAnAccount);
    }
}
