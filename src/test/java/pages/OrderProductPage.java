package pages;

import com.github.javafaker.Faker;
import selectors.WebElementCreateAccountSelectors;
import selectors.WebElementSelectors;
import utilis.Interactions;

public class OrderProductPage extends BasePage implements WebElementSelectors, WebElementCreateAccountSelectors {

    public OrderProductPage(Interactions interactions) {
        super(interactions);
    }
    public void fillEmailAddress() {
        Faker faker = new Faker();
        driver.sendKeys(fieldEmailAddressSelector, faker.internet().emailAddress());
    }
    public CreateAccountPage clickOnButtonCreateAnAccount() {
        driver.click(buttonCreateAnAccountSelector);
        return new CreateAccountPage(driver);
    }
    public void clickOnProceedAfterFillPersonalData() {
        driver.click(buttonProceedToCheckoutAfterFillPersonalDataSelector);
    }
    public void agreeToTermsOfService() {
        driver.click(buttonAgreeToTermsOfServiceSelector);
    }
    public void clickOnProceedAfterFillShippingData() {
        driver.click(buttonProceedToCheckoutAfterFillShippingDataSelector);
    }
    public void assertIfPaymentPanelIsDisplayed() {
        driver.awaitUntilElementDisplayed(paymentPanelSelector);
    }
    public void checkIfRedBoxAlertIsDisplayed() {
        driver.awaitUntilElementDisplayed(redBoxAlertSelector);
    }
}

