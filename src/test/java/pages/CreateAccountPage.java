package pages;

import enums.DayOfBirth;
import enums.MonthOfBirth;
import enums.State;
import enums.YearOfBirth;
import selectors.WebElementCreateAccountSelectors;
import utilis.Interactions;
import utilis.AddressInformation;
import utilis.PersonalInformation;

public class CreateAccountPage extends BasePage implements WebElementCreateAccountSelectors {

    public CreateAccountPage(Interactions interactions) {
        super(interactions);
    }

    public PersonalInformation.PersonalInformationBuilder getBasePersonalInformationBuilder() {
        PersonalInformation.PersonalInformationBuilder personalData = new PersonalInformation.PersonalInformationBuilder()
                .firstName("Jan")
                .lastName("Kowalski")
                .password("Password123");
        return personalData;
    }

    public void inputPersonalInformationToCreateAccount() {
        PersonalInformation personalInformation = getBasePersonalInformationBuilder().build();
        interactions.click(buttonManGenderSelector);
        interactions.sendKeys(fieldFirstNameSelector, personalInformation.getFirstName());
        interactions.sendKeys(fieldLastNameSelector, personalInformation.getLastName());
        interactions.sendKeys(fieldPasswordSelector, personalInformation.getPassword());
        interactions.click(buttonDayOfBirthSelector);
        interactions.click(getSelectDayOfBirthFromDropDownSelectors(DayOfBirth.DAY3));
        interactions.click(buttonMonthOfBirthSelector);
        interactions.click(getSelectMonthOfBirthFromDropDownSelectors(MonthOfBirth.AUGUST));
        interactions.click(buttonYearOfBirthSelector);
        interactions.click(getSelectYearOfBirthFromDropDownSelectors(YearOfBirth.BORNIN1993));
    }

    public void inputPersonalInformationWithEmptyPassword() {
        PersonalInformation personalInformation = getBasePersonalInformationBuilder().password("").build();
        interactions.click(buttonManGenderSelector);
        interactions.sendKeys(fieldFirstNameSelector, personalInformation.getFirstName());
        interactions.sendKeys(fieldLastNameSelector, personalInformation.getLastName());
        interactions.sendKeys(fieldPasswordSelector, personalInformation.getPassword());
        interactions.click(buttonDayOfBirthSelector);
        interactions.click(getSelectDayOfBirthFromDropDownSelectors(DayOfBirth.DAY3));
        interactions.click(buttonMonthOfBirthSelector);
        interactions.click(getSelectMonthOfBirthFromDropDownSelectors(MonthOfBirth.AUGUST));
        interactions.click(buttonYearOfBirthSelector);
        interactions.click(getSelectYearOfBirthFromDropDownSelectors(YearOfBirth.BORNIN1993));
    }

    public AddressInformation.AddressInformationBuilder getBaseAddressInformationBuilder() {
        AddressInformation.AddressInformationBuilder addressData = new AddressInformation.AddressInformationBuilder()
                .company("SWMind")
                .addressStreet("Polna Street")
                .addressBuilding("167/6")
                .city("Michigan")
                .postalCode("23213")
                .additionalInformation("Something")
                .mobilePhone("667884335")
                .referenceAddress("Wiejska Street");
                return addressData;
    }

    public void inputAddressInformationToCreateAccount() {
        AddressInformation addressInformation = getBaseAddressInformationBuilder().build();
        interactions.sendKeys(fieldAddressCompanySelector, addressInformation.getCompany());
        interactions.sendKeys(fieldAddressStreetSelector, addressInformation.getAddressStreet());
        interactions.sendKeys(fieldAddressBuildingSelector, addressInformation.getAddressBuilding());
        interactions.sendKeys(fieldCitySelector, addressInformation.getCity());
        interactions.click(buttonAddressStateSelector);
        interactions.click(getSelectStateOfUsaFromDropDownSelectors(State.FLORIDA));
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
        interactions.click(getSelectStateOfUsaFromDropDownSelectors(State.FLORIDA));
        interactions.sendKeys(fieldPostalCodeSelector, addressInformation.getPostalCode());
        interactions.sendKeys(fieldAdditionalInformationSelector, addressInformation.getAdditionalInformation());
        interactions.sendKeys(fieldMobilePhoneSelector, addressInformation.getMobilePhone());
        interactions.clear(fieldAddressForFutureReferenceSelector);
        interactions.sendKeys(fieldAddressForFutureReferenceSelector, addressInformation.getReferenceAddress());
    }
    public void clickOnRegisterButton() {
        interactions.click(buttonRegisterSelector);
    }
}
