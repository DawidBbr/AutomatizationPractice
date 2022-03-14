package pages;

import com.github.javafaker.Faker;
import selectors.WebElementSelectors;
import utilis.Interactions;

public class BuyingDressesPage extends BasePage implements WebElementSelectors {

    public BuyingDressesPage(Interactions interactions) {
        super(interactions);
    }

    public void fillValueOfDressesInSearchBox() {
        interactions.sendKeys(theMainSearchBoxSelector, "dresses");
    }
    public void goToDressesResults() {
        interactions.click(buttonSearchSelector);
    }
    public void clickOnButtonSortProductsBy() {
        interactions.click(buttonSelectProductBySelector);
    }
    public void clickOnPriceLowestFirstFromDropDownSortProductsBy() {
        interactions.click(fieldPriceLowestFirstFromDropDownSelectProductSelector);
    }
    public void hoverOverOnTheDressAndAddToCartFromDropdown() {
        interactions.hoverOverAndClickOnDropDownElement(imageOfDressFromListSelector, buttonAddToCartSelectedDressSelector);
    }
    public void clickOnButtonContinueShopping() {
        interactions.click(buttonContinueShoppingSelector);
    }
    public void hoverOverOnMyShoppingCartAndCheckOutMyCart() {
        interactions.refreshPage();
        interactions.hoverOverAndClickOnDropDownElement(buttonViewMyShoppingCartSelector, buttonCheckOutFromViewMyShoppingCartDropDownSelector);
    }
    public void clickOnProceedToCheckoutButton() {
        interactions.click(buttonProceedToCheckoutSelector);
    }
    public void fillEmailAddress() {
        Faker faker = new Faker();
        interactions.sendKeys(fieldEmailAddressSelector, faker.internet().emailAddress());
    }
    public void clickOnButtonCreateAnAccount() {
        interactions.click(buttonCreateAnAccountSelector);
    }
}
