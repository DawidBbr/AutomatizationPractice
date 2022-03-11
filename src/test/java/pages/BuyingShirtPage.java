package pages;

import selectors.WebElementSelectors;
import selectors.WebElementShirtSelectors;
import utilis.Interactions;

public class BuyingShirtPage  extends BasePage implements WebElementSelectors, WebElementShirtSelectors {


    public BuyingShirtPage(Interactions interactions) {
        super(interactions);
    }

    public void clickOnWomenCategoryButtonInHomepage() {
        interactions.click(buttonTheMainWomenCategorySelector);
    }
    public void clickOnTopsCategoryOfProductsButton() {
        interactions.click(buttonTopsCategoryOfProductsSelector);
    }
    public void clickOnMediumSizeOfProductsButton() {
        interactions.click(buttonMediumSizeOfProductsSelector);
    }
    public void clickOnOrangeColorOfProductsButton() {
        interactions.click(buttonOrangeColorOfProductsSelector);
    }
    public void hoverOverOnTheShirtAndClickOnAddToCartFromDropdown() {
        interactions.hoverOverAndClickOnDropDownElement(imageOfShirtFromList, buttonAddToCartSelectedShirtSelector);
    }
    public void checkIfRedBoxAlertIsDisplayed() {
        interactions.isElementDisplayed(redBoxAlertSelector);
    }
}
