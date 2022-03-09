package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.CreateAccountPage;
import pages.DressesPage;

public class BaseTest {
    protected static final String BASE_URL = "http://automationpractice.com/index.php";
    protected WebDriver driver;
    protected DressesPage dressesPage;
    protected CreateAccountPage createAccountPage;

    @BeforeEach
    public void setupTest() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get(BASE_URL);
        driver.manage().window().maximize();
        dressesPage = new DressesPage(driver);
        createAccountPage = new CreateAccountPage(driver);
    }

    @AfterEach
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
