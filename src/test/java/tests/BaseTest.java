package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.LoginPage;
import utilis.Interactions;

public class BaseTest {
    protected WebDriver driver;
    protected Interactions interactions;
    protected LoginPage loginPage;

    @BeforeEach
    public void setupTest() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        final String BASE_URL = "https://secure.procountor.com/";
        driver.get(BASE_URL);
        driver.manage().window().maximize();
        interactions = new Interactions(driver);
        loginPage = new LoginPage(interactions);
    }

    @AfterEach
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
