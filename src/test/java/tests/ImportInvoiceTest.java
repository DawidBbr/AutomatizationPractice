package tests;

import org.junit.jupiter.api.Test;
import pages.ImportPage;
import pages.ProcountorPage;

public class ImportInvoiceTest extends BaseTest {
    private ImportPage importPage;
    private ProcountorPage procountorPage;

    @Test
    public void shouldReturnSuccessOfBuyProduct() {
        //given
        procountorPage = loginPage.loginUserToProcountor();
        procountorPage.acceptProcountorDemonstration();
        procountorPage.provideKeysToSearchEngine("Import Data");
        importPage = procountorPage.clickOnImportDataButtonFromDropDown();
        importPage.clickOnImportTypeButton();
        importPage.clickImportInvoicesFromDropDownImportType();
        importPage.clickSelectFileButton();

        //when
        importPage.importFile();
        importPage.clickContinueButtonAfterImportFile();
        importPage.clickContinueButtonToGetImportInvoicesPhase();
        importPage.clickSaveButton();
        importPage.agreeToSearchImportedInvoices();

        //then
        importPage.assertResultImportedInvoicesIsDisplayed();
    }
}
