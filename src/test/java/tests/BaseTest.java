package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.BuyingShirtPage;
import pages.CreateAccountPage;
import pages.BuyingDressesPage;
import utilis.Interactions;

public class BaseTest {
    protected static final String BASE_URL = "http://automationpractice.com/index.php";
    protected WebDriver driver;
    protected Interactions interactions;
    protected BuyingDressesPage buyingDressesPage;
    protected CreateAccountPage createAccountPage;
    protected BuyingShirtPage buyingShirtPage;
    @BeforeEach
    public void setupTest() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get(BASE_URL);
        driver.manage().window().maximize();
        interactions = new Interactions(driver);
        buyingDressesPage = new BuyingDressesPage(interactions);
        createAccountPage = new CreateAccountPage(interactions);
        buyingShirtPage = new BuyingShirtPage(interactions);

    }

    @AfterEach
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
