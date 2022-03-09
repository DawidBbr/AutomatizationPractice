package tests;

import org.junit.jupiter.api.Test;

public class HomePageTest extends BaseTest{

    @Test
    public void shouldReturnSuccessOfBuyProduct() {
        dressesPage.inputValueOfDressesInSearchBox();
        dressesPage.clickInSearchButton();
        dressesPage.clickOnButtonSortProductsBy();
        dressesPage.clickOnPriceLowestFirstFromDropDownSortProductsBy();
        dressesPage.hoverOverOnTheDressAndClickOnAddToCartFromDropdown();
        dressesPage.clickOnButtonContinueShopping();
        dressesPage.hoverOverOnMyShoppingCartAndClickCheckOutFromDropDown();
        dressesPage.clickOnProceedToCheckoutButton();
        dressesPage.inputEmailAddress();
        dressesPage.clickOnButtonCreateAnAccount();
        createAccountPage.inputValidPersonalInformationToCreateAccount();
        createAccountPage.inputValidAddressInformationToCreateAccount();
        createAccountPage.clickOnRegisterButton();

    }
}
