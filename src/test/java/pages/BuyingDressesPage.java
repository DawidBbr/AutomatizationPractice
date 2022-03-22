package pages;

import selectors.WebElementSelectors;
import utilis.Interactions;

public class BuyingDressesPage extends BasePage implements WebElementSelectors {

    public BuyingDressesPage(Interactions interactions) {
        super(interactions);
    }

    public void clickOnButtonSortProductsBy() {
        driver.click(buttonSelectProductBySelector);
    }

    public void clickOnPriceLowestFirstFromDropDownSortProductsBy() {
        driver.click(fieldPriceLowestFirstFromDropDownSelectProductSelector);
    }

    public void hoverOverOnTheDressAndAddToCartFromDropdown() {
        driver.mouseOverElementAndClickOnSubElement(imageOfDressFromListSelector, buttonAddToCartSelectedDressSelector);
    }

    public void clickOnButtonContinueShopping() {
        driver.click(buttonContinueShoppingSelector);
    }

    public void hoverOverOnMyShoppingCartAndCheckOutMyCart() {
        driver.refreshPage();
        driver.mouseOverElementAndClickOnSubElement(buttonViewMyShoppingCartSelector, buttonCheckOutFromViewMyShoppingCartDropDownSelector);
    }

    public OrderProductPage clickOnProceedToCheckoutButton() {
        driver.click(buttonProceedToCheckoutSelector);
        return new OrderProductPage(driver);
    }
}
