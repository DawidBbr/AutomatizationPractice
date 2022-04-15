package selectors;

import org.openqa.selenium.By;

public interface WebElementSelectors {
    By fieldUserNameSelector = By.id("LocalizableTextField_CH_LOGINNAME");
    By fieldPasswordSelector = By.id("LocalizableUIPasswordField_CH_PASSWORD");
    By buttonLoginSelector = By.id("LoginPageButton_BUTTON_NEXT");
    By buttonOkInProcountorDemonstrationBoxSelector = By.id("GuiButton_OK");
    By searchEngineInputSelector = By.id("SearchParameterTextField");
    By importDataButtonFromDropDownSelector = By.id("UIButton_Management----em-class--match--Import-data--em-");
    By buttonImportTypeSelector = By.id("GuiChoice_CH_IMPORTTYPE");
    By buttonImportInvoicesFromDropDownImportTypeSelector = By.xpath("//*[contains(text(),'Import invoices')]");
    By selectFileButtonSelector = By.id("AButton_SELECT_FILE_");
    By chooseFileButtonSelector = By.xpath("//*[@class='gwt-FileUpload']");
    By buttonContinueInImportFileBoxSelector = By.id("GuiButton_CONTINUE");
    By buttonContinueAfterImportFileSelector = By.id("AButton_CONTINUE");
    By buttonSaveFileCSVSelector = By.id("AButton_SAVE_");
    By buttonConfirmingReadinessToImportSelector = By.id("GuiButton_YES");
    By resultRowOfImportedInvoicesSelector = By.xpath("//*[@class='v-grid-row v-grid-row-focused v-grid-row-has-data v-grid-row-selected']");
}
