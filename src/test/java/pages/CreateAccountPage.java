package pages;

import com.github.javafaker.Faker;
import enums.DayOfBirth;
import enums.MonthOfBirth;
import enums.State;
import enums.YearOfBirth;
import org.openqa.selenium.WebDriver;
import selectors.WebElementCreateAccountSelectors;
import utilis.YourAddress;
import utilis.YourPersonalInformation;

import static utilis.Interactions.*;

public class CreateAccountPage extends BasePage implements WebElementCreateAccountSelectors {
    public CreateAccountPage(WebDriver driver) {
        super(driver);
    }
    public void inputValidPersonalInformationToCreateAccount() {
        awaitUntilElementDisplayed(driver, fieldFirstNameSelector);
        YourPersonalInformation yourPersonalInformation = new YourPersonalInformation("Jan", "Kowalski",
                "password123");
        click(driver, buttonManGenderSelector);
        sendKeys(driver, fieldFirstNameSelector, yourPersonalInformation.getFirstName());
        sendKeys(driver, fieldLastNameSelector, yourPersonalInformation.getLastName());
        sendKeys(driver, fieldPasswordSelector, yourPersonalInformation.getPassword());
        click(driver, buttonDayOfBirthSelector);
        click(driver, getSelectDayOfBirthFromDropDownSelectors(DayOfBirth.DAY3));
        click(driver, buttonMonthOfBirthSelector);
        click(driver, getSelectMonthOfBirthFromDropDownSelectors(MonthOfBirth.AUGUST));
        click(driver, buttonYearOfBirthSelector);
        click(driver, getSelectYearOfBirthFromDropDownSelectors(YearOfBirth.BORNIN1993));
    }
    public void inputValidAddressInformationToCreateAccount() {
        awaitUntilElementDisplayed(driver, fieldAddressCompanySelector);
        Faker faker = new Faker();
        YourAddress yourAddress = new YourAddress(faker.company().name(), faker.address().streetName(),faker.address().buildingNumber(),
                faker.address().city(), faker.address().zipCode(),"Something", faker.phoneNumber().phoneNumber(),faker.address().streetName());
        sendKeys(driver, fieldAddressCompanySelector, yourAddress.getCompany());
        sendKeys(driver, fieldAddressStreetSelector, yourAddress.getAddressStreet());
        sendKeys(driver, fieldAddressBuildingSelector, yourAddress.getAddressBuilding());
        sendKeys(driver, fieldCitySelector, yourAddress.getCity());
        click(driver, buttonAddressStateSelector);
        click(driver,getSelectStateOfUsaFromDropDownSelectors(State.FLORIDA));
        sendKeys(driver,fieldPostalCodeSelector, yourAddress.getPostalCode());
        sendKeys(driver, fieldAdditionalInformationSelector, yourAddress.getAdditionalInformation());
        sendKeys(driver, fieldMobilePhoneSelector, yourAddress.getMobilePhone());
        clear(driver, fieldAddressForFutureReferenceSelector);
        sendKeys(driver, fieldAddressForFutureReferenceSelector, yourAddress.getReferenceAddress());
    }
    public void clickOnRegisterButton() {
        awaitUntilElementDisplayed(driver, buttonRegisterSelector);
        click(driver, buttonRegisterSelector);
    }
}
