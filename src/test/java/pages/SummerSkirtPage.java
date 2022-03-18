package pages;

import selectors.WebElementSummerSkirtSelectors;
import utilis.Interactions;

public class SummerSkirtPage extends BasePage implements WebElementSummerSkirtSelectors {

    public SummerSkirtPage(Interactions interactions) {
        super(interactions);
    }
    public void hoverOverOnWomenCategoryAndClickOnSubcategorySummerDresses() {
        interactions.mouseOverElementAndClickOnSubElement(womenCategoryPageSelector, summerDressesSubcategoryOfWomenSelector);
    }
    public void setPriceRange() {
        interactions.scrollToVisibleOfElement(getSliderOfPriceRangeSelector(1));
        interactions.moveSlider(getSliderOfPriceRangeSelector(1),30,0);
    }

}
