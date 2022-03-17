package tests;

import org.junit.jupiter.api.Test;

public class HomePageTest extends BaseTest {


    @Test
    public void shouldReturnSuccessOfBuyProduct() {
        buyingDressesPage.fillValueOfDressesInSearchBox();
        buyingDressesPage.goToDressesResults();
        buyingDressesPage.clickOnButtonSortProductsBy();
        buyingDressesPage.clickOnPriceLowestFirstFromDropDownSortProductsBy();
        buyingDressesPage.hoverOverOnTheDressAndAddToCartFromDropdown();
        buyingDressesPage.clickOnButtonContinueShopping();
        buyingDressesPage.hoverOverOnMyShoppingCartAndCheckOutMyCart();
        buyingDressesPage.clickOnProceedToCheckoutButton();
        buyingDressesPage.fillEmailAddress();
        buyingDressesPage.clickOnButtonCreateAnAccount();
        createAccountPage.fillPersonalInformationToCreateAccount();
        createAccountPage.fillAddressInformationToCreateAccount();
        createAccountPage.clickOnRegisterButton();
        createAccountPage.clickOnProceedAfterFillPersonalData();
        createAccountPage.agreeToTermsOfService();
        createAccountPage.clickOnProceedAfterFillShippingData();
        createAccountPage.assertIfPaymentPanelIsDisplayed();
    }

    @Test
    public void shouldReturnInvalidPasswordAlertAfterTryingToCreateAccount() {
        buyingShirtPage.goToWomenCategoryPage();
        buyingShirtPage.clickOnTopsCategoryOfProductsButton();
        buyingShirtPage.clickOnMediumSizeOfProductsButton();
        buyingShirtPage.clickOnOrangeColorOfProductsButton();
        buyingShirtPage.hoverOverOnTheShirtAndAddToCartFromDropdown();
        buyingDressesPage.clickOnButtonContinueShopping();
        buyingDressesPage.hoverOverOnMyShoppingCartAndCheckOutMyCart();
        buyingDressesPage.clickOnProceedToCheckoutButton();
        buyingDressesPage.fillEmailAddress();
        buyingDressesPage.clickOnButtonCreateAnAccount();
        createAccountPage.inputPersonalInformationWithEmptyPassword();
        createAccountPage.inputAddressInformationWithTooLongMobilePhone();
        createAccountPage.clickOnRegisterButton();
        buyingShirtPage.checkIfRedBoxAlertIsDisplayed();
    }
    @Test
    public void shouldReturnSuccessOf() {
        summerSkirtPage.hoverOverOnWomenCategoryAndClickOnSubcategorySummerDresses();
        summerSkirtPage.setPriceRange();


    }

}
