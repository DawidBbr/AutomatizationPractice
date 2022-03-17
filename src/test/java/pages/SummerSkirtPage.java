package pages;

import selectors.WebElementSummerSkirtSelectors;
import utilis.Interactions;

public class SummerSkirtPage extends BasePage implements WebElementSummerSkirtSelectors {

    public SummerSkirtPage(Interactions interactions) {
        super(interactions);
    }
    public void hoverOverOnWomenCategoryAndClickOnSubcategorySummerDresses() {
        interactions.hoverOverAndClickOnDropDownElement(womenCategoryPageSelector, summerDressesSubcategoryOfWomenSelector);
    }
    public void setPriceRange() {
        interactions.scrollPage(1000);
        interactions.moveSlider(getSliderOfPriceRangeSelector(1), 30);
        interactions.moveSlider(getSliderOfPriceRangeSelector(2), -30);
    }

}
