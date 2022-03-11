package selectors;

import org.openqa.selenium.By;

public interface WebElementShirtSelectors {
    By buttonTopsCategoryOfProductsSelector = By.xpath("//label[@for='layered_category_4']");
    By buttonMediumSizeOfProductsSelector = By.xpath("//label[@for='layered_id_attribute_group_2']");
    By buttonOrangeColorOfProductsSelector = By.id("layered_id_attribute_group_13");
    By imageOfShirtFromList = By.xpath("//*[@title='Faded Short Sleeve T-shirts']//*[@width='250']");
    By buttonAddToCartSelectedShirtSelector = By.xpath("//*[@title='Add to cart']");

}
