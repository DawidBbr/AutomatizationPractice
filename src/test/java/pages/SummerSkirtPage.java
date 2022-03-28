package pages;

import selectors.WebElementSummerSkirtSelectors;
import utilis.Interactions;

public class SummerSkirtPage extends BasePage implements WebElementSummerSkirtSelectors {

    public SummerSkirtPage(Interactions driver) {
        super(driver);
    }

    public void hoverOverOnWomenCategoryAndClickOnSubcategorySummerDresses() {
        driver.mouseOverElementAndClickOnSubElement(womenCategoryPageSelector, summerDressesSubcategoryOfWomenSelector);
    }

    public void setPriceRange() {
        driver.scrollToVisibleOfElement(getSliderOfPriceRangeSelector(1));
        driver.moveSlider(getSliderOfPriceRangeSelector(1), 30, 0);
    }

    public void switchViewToList() {
        driver.click(buttonListViewSelector);
    }

    public void addToCompareLongSummerDress() {
        driver.click(buttonAddToCompareLongSummerDressSelector);
    }

    public void addToCompareKneeLengthSummerDress() {
        driver.click(buttonAddToCompareKneeLengthSummerDressSelector);
    }

    public void compareSelectedProducts() {
        driver.click(buttonCompareSelectedProductsSelector);
    }



}



