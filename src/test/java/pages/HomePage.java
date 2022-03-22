package pages;

import selectors.WebElementSelectors;
import selectors.WebElementSummerSkirtSelectors;
import utilis.Interactions;

public class HomePage extends BasePage implements WebElementSelectors, WebElementSummerSkirtSelectors {

    public HomePage(Interactions driver) {
        super(driver);
    }

    public void fillValueOfDressesInSearchBox() {
        driver.sendKeys(theMainSearchBoxSelector, "dresses");
    }
    public BuyingDressesPage goToDressesResults() {
        driver.click(buttonSearchSelector);
        return new BuyingDressesPage(driver);
    }
    public BuyingShirtPage goToWomenCategoryPage() {
        driver.click(buttonTheMainWomenCategorySelector);
        return new BuyingShirtPage(driver);
    }
    public SummerSkirtPage hoverOverOnWomenCategoryAndClickOnSubcategorySummerDresses() {
        driver.mouseOverElementAndClickOnSubElement(womenCategoryPageSelector, summerDressesSubcategoryOfWomenSelector);
        return new SummerSkirtPage(driver);
    }
}
