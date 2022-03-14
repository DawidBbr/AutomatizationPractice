package pages;

import selectors.WebElementCreateAccountSelectors;
import utilis.AddressInformation;
import utilis.Interactions;
import utilis.PersonalInformation;

import static builders.AddressInformationBuilder.getBaseAddressInformationBuilder;
import static builders.PersonalInformationBuilder.getBasePersonalInformationBuilder;

public class CreateAccountPage extends BasePage implements WebElementCreateAccountSelectors {

    public CreateAccountPage(Interactions interactions) {
        super(interactions);
    }

    public void fillPersonalInformationToCreateAccount() {
        PersonalInformation personalInformation = getBasePersonalInformationBuilder().build();
        interactions.click(buttonManGenderSelector);
        interactions.sendKeys(fieldFirstNameSelector, personalInformation.getFirstName());
        interactions.sendKeys(fieldLastNameSelector, personalInformation.getLastName());
        interactions.sendKeys(fieldPasswordSelector, personalInformation.getPassword());
        interactions.click(buttonDayOfBirthSelector);
        interactions.click(getSelectDayOfBirthFromDropDownSelectors(personalInformation.getDayOfBirth()));
        interactions.click(buttonMonthOfBirthSelector);
        interactions.click(getSelectMonthOfBirthFromDropDownSelectors(personalInformation.getMonthOfBirth()));
        interactions.click(buttonYearOfBirthSelector);
        interactions.click(getSelectYearOfBirthFromDropDownSelectors(personalInformation.getYearOfBirth()));
    }

    public void inputPersonalInformationWithEmptyPassword() {
        PersonalInformation personalInformation = getBasePersonalInformationBuilder().password("").build();
        interactions.click(buttonManGenderSelector);
        interactions.sendKeys(fieldFirstNameSelector, personalInformation.getFirstName());
        interactions.sendKeys(fieldLastNameSelector, personalInformation.getLastName());
        interactions.sendKeys(fieldPasswordSelector, personalInformation.getPassword());
        interactions.click(buttonDayOfBirthSelector);
        interactions.click(getSelectDayOfBirthFromDropDownSelectors(personalInformation.getDayOfBirth()));
        interactions.click(buttonMonthOfBirthSelector);
        interactions.click(getSelectMonthOfBirthFromDropDownSelectors(personalInformation.getMonthOfBirth()));
        interactions.click(buttonYearOfBirthSelector);
        interactions.click(getSelectYearOfBirthFromDropDownSelectors(personalInformation.getYearOfBirth()));
    }

    public void fillAddressInformationToCreateAccount() {
        AddressInformation addressInformation = getBaseAddressInformationBuilder().build();
        interactions.sendKeys(fieldAddressCompanySelector, addressInformation.getCompany());
        interactions.sendKeys(fieldAddressStreetSelector, addressInformation.getAddressStreet());
        interactions.sendKeys(fieldAddressBuildingSelector, addressInformation.getAddressBuilding());
        interactions.sendKeys(fieldCitySelector, addressInformation.getCity());
        interactions.click(buttonAddressStateSelector);
        interactions.click(getSelectStateOfUsaFromDropDownSelectors(addressInformation.getState()));
        interactions.sendKeys(fieldPostalCodeSelector, addressInformation.getPostalCode());
        interactions.sendKeys(fieldAdditionalInformationSelector, addressInformation.getAdditionalInformation());
        interactions.sendKeys(fieldMobilePhoneSelector, addressInformation.getMobilePhone());
        interactions.clear(fieldAddressForFutureReferenceSelector);
        interactions.sendKeys(fieldAddressForFutureReferenceSelector, addressInformation.getReferenceAddress());
    }
    public void inputAddressInformationWithTooLongMobilePhone() {
        AddressInformation addressInformation = getBaseAddressInformationBuilder().mobilePhone("4553315563").build();
        interactions.sendKeys(fieldAddressCompanySelector, addressInformation.getCompany());
        interactions.sendKeys(fieldAddressStreetSelector, addressInformation.getAddressStreet());
        interactions.sendKeys(fieldAddressBuildingSelector, addressInformation.getAddressBuilding());
        interactions.sendKeys(fieldCitySelector, addressInformation.getCity());
        interactions.click(buttonAddressStateSelector);
        interactions.click(getSelectStateOfUsaFromDropDownSelectors(addressInformation.getState()));
        interactions.sendKeys(fieldPostalCodeSelector, addressInformation.getPostalCode());
        interactions.sendKeys(fieldAdditionalInformationSelector, addressInformation.getAdditionalInformation());
        interactions.sendKeys(fieldMobilePhoneSelector, addressInformation.getMobilePhone());
        interactions.clear(fieldAddressForFutureReferenceSelector);
        interactions.sendKeys(fieldAddressForFutureReferenceSelector, addressInformation.getReferenceAddress());
    }
    public void clickOnRegisterButton() {
        interactions.click(buttonRegisterSelector);
    }
    public void clickOnProceedAfterFillPersonalData() {
        interactions.click(buttonProceedToCheckoutAfterFillPersonalDataSelector);
    }
    public void agreeToTermsOfService() {
        interactions.click(buttonAgreeToTermsOfServiceSelector);
    }
    public void clickOnProceedAfterFillShippingData() {
        interactions.click(buttonProceedToCheckoutAfterFillShippingDataSelector);
    }
    public void assertIfPaymentPanelIsDisplayed() {
        interactions.awaitUntilElementDisplayed(paymentPanelSelector);
    }
}
