package pages;

import com.github.javafaker.Faker;
import selectors.WebElementSelectors;
import utilis.Interactions;

public class BuyingDressesPage extends BasePage implements WebElementSelectors {

    public BuyingDressesPage(Interactions interactions) {
        super(interactions);
    }

    public void inputValueOfDressesInSearchBox() {
        interactions.sendKeys(theMainSearchBoxSelector, "dresses");
    }
    public void clickInSearchButton() {
        interactions.click(buttonSearchSelector);
    }
    public void clickOnButtonSortProductsBy() {
        interactions.click(buttonSelectProductBySelector);
    }
    public void clickOnPriceLowestFirstFromDropDownSortProductsBy() {
        interactions.click(fieldPriceLowestFirstFromDropDownSelectProductSelector);
    }
    public void hoverOverOnTheDressAndClickOnAddToCartFromDropdown() {
        interactions.hoverOverAndClickOnDropDownElement(imageOfDressFromListSelector, buttonAddToCartSelectedDressSelector);
    }
    public void clickOnButtonContinueShopping() {
        interactions.click(buttonContinueShoppingSelector);
    }
    public void hoverOverOnMyShoppingCartAndClickCheckOutFromDropDown() {
        interactions.refreshPage();
        interactions.hoverOverAndClickOnDropDownElement(buttonViewMyShoppingCartSelector, buttonCheckOutFromViewMyShoppingCartDropDownSelector);
    }
    public void clickOnProceedToCheckoutButton() {
        interactions.click(buttonProceedToCheckoutSelector);
    }
    public void inputEmailAddress() {
        Faker faker = new Faker();
        interactions.sendKeys(fieldEmailAddressSelector, faker.internet().emailAddress());
    }
    public void clickOnButtonCreateAnAccount() {
        interactions.click(buttonCreateAnAccountSelector);
    }
}
