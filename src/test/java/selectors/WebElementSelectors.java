package selectors;

import org.openqa.selenium.By;

public interface WebElementSelectors {
    By theMainSearchBoxSelector = By.id("search_query_top");
    By buttonSearchSelector = By.xpath("//*[@name='submit_search']");
    By buttonSelectProductBySelector = By.id("uniform-selectProductSort");
    By fieldPriceLowestFirstFromDropDownSelectProductSelector = By.xpath("//*[@value='price:asc' and contains(text(),'Lowest first')]");
    By imageOfDressFromList = By.xpath("//*[@itemtype='http://schema.org/Product']//*[@src='http://automationpractice.com/img/p/2/0/20-home_default.jpg']");
    By buttonAddToCartSelectedDress = By.xpath("//*[@data-id-product='7']//*[text()='Add to cart']");
    By buttonContinueShopping = By.xpath("//*[@title='Continue shopping']");
    By buttonViewMyShoppingCart = By.xpath("//*[@title='View my shopping cart']");
    By buttonCheckOutFromViewMyShoppingCartDropDownSelector = By.xpath("//*[contains(text(),'Check out')]");
    By buttonProceedToCheckout = By.xpath("//*[text()='Proceed to checkout']");
    By fieldEmailAddressSelector = By.id("email_create");
    By buttonCreateAnAccount = By.id("SubmitCreate");

//    default By getSelectSelectorTypeFromDropDownSelector(Enum enum) {
//        return (By.xpath("//*[@id = something"+ enum.getValue() + ")]");
//    }
}
