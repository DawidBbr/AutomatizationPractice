package selectors;

import org.openqa.selenium.By;

public interface WebElementSummerSkirtSelectors {
    By womenCategoryPageSelector = By.xpath("//a[@title='Women']");
    By summerDressesSubcategoryOfWomenSelector = By.xpath("//li[@class]//a[@title='Summer Dresses']");
    default By getSliderOfPriceRangeSelector(int numberOfSlider ) {
        return(By.xpath("//*[@class='ui-slider-handle ui-state-default ui-corner-all'][" + numberOfSlider + "]"));
    }
}
