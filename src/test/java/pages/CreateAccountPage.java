package pages;

import enums.DayOfBirth;
import enums.MonthOfBirth;
import enums.State;
import enums.YearOfBirth;
import org.openqa.selenium.WebDriver;
import selectors.WebElementCreateAccountSelectors;
import utilis.Interactions;
import utilis.YourAddress;
import utilis.YourPersonalInformation;

public class CreateAccountPage extends Interactions implements WebElementCreateAccountSelectors {

    public CreateAccountPage(WebDriver driver) {
        super(driver);
    }

    YourPersonalInformation personalData = new YourPersonalInformation.Builder()
            .firstName("Jan")
            .lastName("Kowalski")
            .password("Password123")
            .build();

    public void inputValidPersonalInformationToCreateAccount() {
        click(buttonManGenderSelector);
        sendKeys(fieldFirstNameSelector, personalData.getFirstName());
        sendKeys(fieldLastNameSelector, personalData.getLastName());
        sendKeys(fieldPasswordSelector, personalData.getPassword());
        click(buttonDayOfBirthSelector);
        click(getSelectDayOfBirthFromDropDownSelectors(DayOfBirth.DAY3));
        click(buttonMonthOfBirthSelector);
        click(getSelectMonthOfBirthFromDropDownSelectors(MonthOfBirth.AUGUST));
        click(buttonYearOfBirthSelector);
        click(getSelectYearOfBirthFromDropDownSelectors(YearOfBirth.BORNIN1993));
    }

    YourAddress address = new YourAddress.Builder()
            .company("SWMind")
            .addressStreet("Polna Street")
            .addressBuilding("167/6")
            .city("Michigan")
            .postalCode("23213")
            .additionalInformation("Something")
            .mobilePhone("223423413")
            .referenceAddress("Wiejska Street")
            .build();

    public void inputValidAddressInformationToCreateAccount() {
        sendKeys(fieldAddressCompanySelector, address.getCompany());
        sendKeys(fieldAddressStreetSelector, address.getAddressStreet());
        sendKeys(fieldAddressBuildingSelector, address.getAddressBuilding());
        sendKeys(fieldCitySelector, address.getCity());
        click(buttonAddressStateSelector);
        click(getSelectStateOfUsaFromDropDownSelectors(State.FLORIDA));
        sendKeys(fieldPostalCodeSelector, address.getPostalCode());
        sendKeys(fieldAdditionalInformationSelector, address.getAdditionalInformation());
        sendKeys(fieldMobilePhoneSelector, address.getMobilePhone());
        clear(fieldAddressForFutureReferenceSelector);
        sendKeys(fieldAddressForFutureReferenceSelector, address.getReferenceAddress());
    }
    public void clickOnRegisterButton() {
        click(buttonRegisterSelector);
    }
}
