package pages;

import selectors.WebElementSelectors;
import utilis.Interactions;
import utilis.LoginData;

public class LoginPage extends BasePage implements WebElementSelectors {

    public LoginPage(Interactions driver) {
        super(driver);
    }

    public ProcountorPage loginUserToProcountor() {
        LoginData loginData = new LoginData("tutustuja123", "Tutustuja");
        driver.sendKeys(fieldUserNameSelector, loginData.getUserName());
        driver.sendKeys(fieldPasswordSelector, loginData.getPassword());
        driver.scrollToVisibleOfElement(buttonLoginSelector);
        driver.click(buttonLoginSelector);
        return new ProcountorPage(driver);
    }
}
