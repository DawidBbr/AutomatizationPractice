package selectors;

import org.openqa.selenium.By;

public interface WebElementSelectors {
    By theMainSearchBoxSelector = By.id("search_query_top");
    By buttonSearchSelector = By.xpath("//*[@name='submit_search']");
    By buttonSelectProductBySelector = By.id("uniform-selectProductSort");
    By fieldPriceLowestFirstFromDropDownSelectProductSelector = By.xpath("//*[@value='price:asc' and contains(text(),'Lowest first')]");
    By imageOfDressFromListSelector = By.xpath("//*[@title='Printed Chiffon Dress']//*[@width='250']");
    By buttonAddToCartSelectedDressSelector = By.xpath("//*[@data-id-product='7']//*[text()='Add to cart']");
    By buttonContinueShoppingSelector = By.xpath("//*[@title='Continue shopping']");
    By buttonViewMyShoppingCartSelector = By.xpath("//*[@title='View my shopping cart']");
    By buttonCheckOutFromViewMyShoppingCartDropDownSelector = By.id("button_order_cart");
    By buttonProceedToCheckoutSelector = By.xpath("//*[@class='button btn btn-default standard-checkout button-medium']");
    By fieldEmailAddressSelector = By.id("email_create");
    By buttonCreateAnAccountSelector = By.id("SubmitCreate");
    By buttonTheMainWomenCategorySelector = By.xpath("//a[@title='Women']");
    By redBoxAlertSelector = By.xpath("//*[@class='alert alert-danger']");

}
