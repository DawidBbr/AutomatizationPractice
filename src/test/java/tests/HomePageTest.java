package tests;

import org.junit.jupiter.api.Test;

public class HomePageTest extends BaseTest{

    @Test
    public void shouldReturnSuccessOfBuyProduct() {
        buyingDressesPage.inputValueOfDressesInSearchBox();
        buyingDressesPage.clickInSearchButton();
        buyingDressesPage.clickOnButtonSortProductsBy();
        buyingDressesPage.clickOnPriceLowestFirstFromDropDownSortProductsBy();
        buyingDressesPage.hoverOverOnTheDressAndClickOnAddToCartFromDropdown();
        buyingDressesPage.clickOnButtonContinueShopping();
        buyingDressesPage.hoverOverOnMyShoppingCartAndClickCheckOutFromDropDown();
        buyingDressesPage.clickOnProceedToCheckoutButton();
        buyingDressesPage.inputEmailAddress();
        buyingDressesPage.clickOnButtonCreateAnAccount();
        createAccountPage.inputPersonalInformationToCreateAccount();
        createAccountPage.inputValidAddressInformationToCreateAccount();
        createAccountPage.clickOnRegisterButton();
    }

}
