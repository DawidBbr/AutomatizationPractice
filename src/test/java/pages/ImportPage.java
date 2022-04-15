package pages;

import selectors.WebElementSelectors;
import utilis.Interactions;

public class ImportPage extends BasePage implements WebElementSelectors {

    public ImportPage(Interactions driver) {
        super(driver);
    }

    public void clickOnImportTypeButton() {
        driver.click(buttonImportTypeSelector);
    }

    public void clickImportInvoicesFromDropDownImportType() {
        driver.click(buttonImportInvoicesFromDropDownImportTypeSelector);
    }

    public void clickSelectFileButton() {
        driver.click(selectFileButtonSelector);
    }

    public void importFile() {
        driver.uploadFile(chooseFileButtonSelector);
    }

    public void clickContinueButtonAfterImportFile() {
        driver.click(buttonContinueInImportFileBoxSelector);
    }

    public void clickContinueButtonToGetImportInvoicesPhase() {
        driver.click(buttonContinueAfterImportFileSelector);
    }

    public void clickSaveButton() {
        driver.click(buttonSaveFileCSVSelector);
    }

    public void agreeToSearchImportedInvoices() {
        driver.click(buttonConfirmingReadinessToImportSelector);
    }

    public void assertResultImportedInvoicesIsDisplayed() {
        driver.awaitUntilElementDisplayed(resultRowOfImportedInvoicesSelector);
    }

}
