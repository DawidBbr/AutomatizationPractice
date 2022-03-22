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
        driver.click(buttonManGenderSelector);
        driver.sendKeys(fieldFirstNameSelector, personalInformation.getFirstName());
        driver.sendKeys(fieldLastNameSelector, personalInformation.getLastName());
        driver.sendKeys(fieldPasswordSelector, personalInformation.getPassword());
        driver.click(buttonDayOfBirthSelector);
        driver.click(getSelectDayOfBirthFromDropDownSelectors(personalInformation.getDayOfBirth()));
        driver.click(buttonMonthOfBirthSelector);
        driver.click(getSelectMonthOfBirthFromDropDownSelectors(personalInformation.getMonthOfBirth()));
        driver.click(buttonYearOfBirthSelector);
        driver.click(getSelectYearOfBirthFromDropDownSelectors(personalInformation.getYearOfBirth()));
    }

    public void inputPersonalInformationWithEmptyPassword() {
        PersonalInformation personalInformation = getBasePersonalInformationBuilder().password("").build();
        driver.click(buttonManGenderSelector);
        driver.sendKeys(fieldFirstNameSelector, personalInformation.getFirstName());
        driver.sendKeys(fieldLastNameSelector, personalInformation.getLastName());
        driver.sendKeys(fieldPasswordSelector, personalInformation.getPassword());
        driver.click(buttonDayOfBirthSelector);
        driver.click(getSelectDayOfBirthFromDropDownSelectors(personalInformation.getDayOfBirth()));
        driver.click(buttonMonthOfBirthSelector);
        driver.click(getSelectMonthOfBirthFromDropDownSelectors(personalInformation.getMonthOfBirth()));
        driver.click(buttonYearOfBirthSelector);
        driver.click(getSelectYearOfBirthFromDropDownSelectors(personalInformation.getYearOfBirth()));
    }

    public void fillAddressInformationToCreateAccount() {
        AddressInformation addressInformation = getBaseAddressInformationBuilder().build();
        driver.sendKeys(fieldAddressCompanySelector, addressInformation.getCompany());
        driver.sendKeys(fieldAddressStreetSelector, addressInformation.getAddressStreet());
        driver.sendKeys(fieldAddressBuildingSelector, addressInformation.getAddressBuilding());
        driver.sendKeys(fieldCitySelector, addressInformation.getCity());
        driver.click(buttonAddressStateSelector);
        driver.click(getSelectStateOfUsaFromDropDownSelectors(addressInformation.getState()));
        driver.sendKeys(fieldPostalCodeSelector, addressInformation.getPostalCode());
        driver.sendKeys(fieldAdditionalInformationSelector, addressInformation.getAdditionalInformation());
        driver.sendKeys(fieldMobilePhoneSelector, addressInformation.getMobilePhone());
        driver.clear(fieldAddressForFutureReferenceSelector);
        driver.sendKeys(fieldAddressForFutureReferenceSelector, addressInformation.getReferenceAddress());
    }
    public void inputAddressInformationWithTooLongMobilePhone() {
        AddressInformation addressInformation = getBaseAddressInformationBuilder().mobilePhone("4553315563").build();
        driver.sendKeys(fieldAddressCompanySelector, addressInformation.getCompany());
        driver.sendKeys(fieldAddressStreetSelector, addressInformation.getAddressStreet());
        driver.sendKeys(fieldAddressBuildingSelector, addressInformation.getAddressBuilding());
        driver.sendKeys(fieldCitySelector, addressInformation.getCity());
        driver.click(buttonAddressStateSelector);
        driver.click(getSelectStateOfUsaFromDropDownSelectors(addressInformation.getState()));
        driver.sendKeys(fieldPostalCodeSelector, addressInformation.getPostalCode());
        driver.sendKeys(fieldAdditionalInformationSelector, addressInformation.getAdditionalInformation());
        driver.sendKeys(fieldMobilePhoneSelector, addressInformation.getMobilePhone());
        driver.clear(fieldAddressForFutureReferenceSelector);
        driver.sendKeys(fieldAddressForFutureReferenceSelector, addressInformation.getReferenceAddress());
    }
    public OrderProductPage clickOnRegisterButton() {
        driver.click(buttonRegisterSelector);
        return new OrderProductPage(driver);
    }

}
