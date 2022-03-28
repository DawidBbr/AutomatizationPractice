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
        orderProductPage = createAccountPage.clickOnRegisterButton();
        createAccountPage.fillAddressInformationToCreateAccount();
        orderProductPage = createAccountPage.saveAddressInformation();
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
        buyingDressesPage = buyingShirtPage.hoverOverOnTheShirtAndAddToCartFromDropdown();
        buyingDressesPage.clickOnButtonContinueShopping();
        buyingDressesPage.hoverOverOnMyShoppingCartAndCheckOutMyCart();
        orderProductPage = buyingDressesPage.clickOnProceedToCheckoutButton();
        orderProductPage.fillEmailAddress();
        createAccountPage = orderProductPage.clickOnButtonCreateAnAccount();
        createAccountPage.inputPersonalInformationWithEmptyPassword();
        orderProductPage = createAccountPage.clickOnRegisterButton();
        orderProductPage.checkIfRedBoxAlertIsDisplayed();
    }

    @Test
    public void shouldReturnSuccessOfBuyDressAfterCompareWithAnother() {
        summerSkirtPage = homePage.mouseOverOnWomenCategoryAndClickOnSubcategorySummerDresses();
        summerSkirtPage.setPriceRange();
        summerSkirtPage.switchViewToList();
        summerSkirtPage.addToCompareLongSummerDress();
        summerSkirtPage.addToCompareKneeLengthSummerDress();
        summerSkirtPage.compareSelectedProducts();

    }

}
