package tests;

import org.junit.jupiter.api.Test;

public class HomePageTest extends BaseTest {

    @Test
    public void shouldReturnSuccessOfBuyProduct() {
        homePage.fillValueOfDressesInSearchBox();
        buyingDressesPage = homePage.goToDressesResults();
        buyingDressesPage.clickOnButtonSortProductsBy();
        buyingDressesPage.clickOnPriceLowestFirstFromDropDownSortProductsBy();
        buyingDressesPage.hoverOverOnTheDressAndAddToCartFromDropdown();
        buyingDressesPage.clickOnButtonContinueShopping();
        buyingDressesPage.hoverOverOnMyShoppingCartAndCheckOutMyCart();
        orderProductPage = buyingDressesPage.clickOnProceedToCheckoutButton();
        orderProductPage.fillEmailAddress();
        createAccountPage = orderProductPage.clickOnButtonCreateAnAccount();
        createAccountPage.fillPersonalInformationToCreateAccount();
        createAccountPage.fillAddressInformationToCreateAccount();
        orderProductPage = createAccountPage.clickOnRegisterButton();
        orderProductPage.clickOnProceedAfterFillPersonalData();
        orderProductPage.agreeToTermsOfService();
        orderProductPage.clickOnProceedAfterFillShippingData();
        orderProductPage.assertIfPaymentPanelIsDisplayed();
    }

    @Test
    public void shouldReturnInvalidPasswordAlertAfterTryingToCreateAccount() {
        buyingShirtPage = homePage.goToWomenCategoryPage();
        buyingShirtPage.clickOnTopsCategoryOfProductsButton();
        buyingShirtPage.clickOnMediumSizeOfProductsButton();
        buyingShirtPage.clickOnOrangeColorOfProductsButton();
        buyingShirtPage.hoverOverOnTheShirtAndAddToCartFromDropdown();
        buyingShirtPage.clickOnButtonContinueShopping();
        buyingShirtPage.hoverOverOnMyShoppingCartAndCheckOutMyCart();
        orderProductPage = buyingDressesPage.clickOnProceedToCheckoutButton();
        orderProductPage.fillEmailAddress();
        createAccountPage = orderProductPage.clickOnButtonCreateAnAccount();
        createAccountPage.fillPersonalInformationToCreateAccount();
        createAccountPage.fillAddressInformationToCreateAccount();
        orderProductPage = createAccountPage.clickOnRegisterButton();
        orderProductPage.checkIfRedBoxAlertIsDisplayed();
    }
    @Test
    public void shouldReturnSuccessOfChangePrice() {
        summerSkirtPage = homePage.hoverOverOnWomenCategoryAndClickOnSubcategorySummerDresses();
        summerSkirtPage.setPriceRange();

    }

}
