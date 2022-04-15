package pages;

import selectors.WebElementSelectors;
import utilis.Interactions;

public class ProcountorPage extends BasePage implements WebElementSelectors {

    public ProcountorPage(Interactions driver) {
        super(driver);
    }
    public void acceptProcountorDemonstration() {
        driver.click(buttonOkInProcountorDemonstrationBoxSelector);
    }
    public void provideKeysToSearchEngine(String keys) {
        driver.sendKeys(searchEngineInputSelector, keys);
    }
    public ImportPage clickOnImportDataButtonFromDropDown() {
        driver.click(importDataButtonFromDropDownSelector);
        return new ImportPage(driver);
    }
}
