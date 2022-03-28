package selectors;

import org.openqa.selenium.By;

public interface WebElementSummerSkirtSelectors {
    By womenCategoryPageSelector = By.xpath("//a[@title='Women']");
    By summerDressesSubcategoryOfWomenSelector = By.xpath("//li[@class]//a[@title='Summer Dresses']");
    By buttonListViewSelector = By.id("list");
    By buttonAddToCompareLongSummerDressSelector = By.xpath("//*[@class='add_to_compare' and @data-id-product='5']");
    By buttonAddToCompareKneeLengthSummerDressSelector = By.xpath("//*[@class='add_to_compare' and @data-id-product='6']");
    By buttonCompareSelectedProductsSelector = By.xpath("//*[@class='btn btn-default button button-medium bt_compare bt_compare']");
    By allInformationAboutComparingProductsSelector = By.id("product_comparison");
    default By getSliderOfPriceRangeSelector(int numberOfSlider ) {
        return(By.xpath("//*[@class='ui-slider-handle ui-state-default ui-corner-all'][" + numberOfSlider + "]"));
    }
}
