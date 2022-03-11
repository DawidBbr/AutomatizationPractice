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
        createAccountPage.inputAddressInformationToCreateAccount();
        createAccountPage.clickOnRegisterButton();
    }
    @Test
    public void shouldReturnInvalidPasswordAlertAfterTryingToCreateAccount() {
        buyingShirtPage.clickOnWomenCategoryButtonInHomepage();
        buyingShirtPage.clickOnTopsCategoryOfProductsButton();
        buyingShirtPage.clickOnMediumSizeOfProductsButton();
        buyingShirtPage.clickOnOrangeColorOfProductsButton();
        buyingShirtPage.hoverOverOnTheShirtAndClickOnAddToCartFromDropdown();
        buyingDressesPage.clickOnButtonContinueShopping();
        buyingDressesPage.hoverOverOnMyShoppingCartAndClickCheckOutFromDropDown();
        buyingDressesPage.clickOnProceedToCheckoutButton();
        buyingDressesPage.inputEmailAddress();
        buyingDressesPage.clickOnButtonCreateAnAccount();
        createAccountPage.inputPersonalInformationWithEmptyPassword();
        createAccountPage.inputAddressInformationWithTooLongMobilePhone();
        createAccountPage.clickOnRegisterButton();
        buyingShirtPage.checkIfRedBoxAlertIsDisplayed();
    }

}
