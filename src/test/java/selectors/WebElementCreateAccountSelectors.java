package selectors;

import enums.DayOfBirth;
import enums.MonthOfBirth;
import enums.State;
import enums.YearOfBirth;
import org.openqa.selenium.By;

public interface WebElementCreateAccountSelectors {
    By buttonManGenderSelector = By.id("uniform-id_gender1");
    By fieldFirstNameSelector = By.id("customer_firstname");
    By fieldLastNameSelector = By.id("customer_lastname");
    By fieldPasswordSelector = By.id("passwd");
    By buttonDayOfBirthSelector = By.id("uniform-days");
    By buttonMonthOfBirthSelector = By.id("uniform-months");
    By buttonYearOfBirthSelector = By.id("uniform-years");
    By fieldAddressCompanySelector = By.id("company");
    By fieldAddressStreetSelector = By.id("address1");
    By fieldAddressBuildingSelector = By.id("address2");
    By fieldCitySelector = By.id("city");
    By buttonAddressStateSelector = By.id("uniform-id_state");
    By fieldPostalCodeSelector = By.id("postcode");
    By fieldAdditionalInformationSelector = By.id("other");
    By fieldMobilePhoneSelector = By.id("phone_mobile");
    By fieldAddressForFutureReferenceSelector = By.id("alias");
    By buttonRegisterSelector = By.id("submitAccount");


    default By getSelectDayOfBirthFromDropDownSelectors(DayOfBirth dayOfBirth) {
        return(By.xpath("//*[@id='uniform-days']//*[(@value='" + dayOfBirth.getValue() + "')]"));
    }
    default By getSelectMonthOfBirthFromDropDownSelectors(MonthOfBirth monthOfBirth) {
        return(By.xpath("//*[@id='uniform-months']//*[(@value='" + monthOfBirth.getValue() + "')]"));
    }
    default By getSelectYearOfBirthFromDropDownSelectors(YearOfBirth yearOfBirth) {
        return(By.xpath("//*[@id='uniform-years']//*[(@value='" + yearOfBirth.getValue() + "')]"));
    }
    default By getSelectStateOfUsaFromDropDownSelectors(State state) {
        return (By.xpath("//*[@id='uniform-id_state']//*[contains(text(),'" + state.getValue() + "')]"));
    }

}
