package pages;

import selectors.WebElementSelectors;
import selectors.WebElementShirtSelectors;
import utilis.Interactions;

public class BuyingShirtPage  extends BasePage implements WebElementSelectors, WebElementShirtSelectors {

    public BuyingShirtPage(Interactions driver) {
        super(driver);
    }

    public void clickOnTopsCategoryOfProductsButton() {
        driver.click(buttonTopsCategoryOfProductsSelector);
    }
    public void clickOnMediumSizeOfProductsButton() {
        driver.click(buttonMediumSizeOfProductsSelector);
    }
    public void clickOnOrangeColorOfProductsButton() {
        driver.click(buttonOrangeColorOfProductsSelector);
    }
    public void hoverOverOnTheShirtAndAddToCartFromDropdown() {
        driver.mouseOverElementAndClickOnSubElement(imageOfShirtFromList, buttonAddToCartSelectedShirtSelector);
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
