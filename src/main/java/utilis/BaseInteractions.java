package utilis;

import org.openqa.selenium.WebDriver;

public abstract class BaseInteractions {
    protected WebDriver driver;

    public BaseInteractions(WebDriver driver) {
        this.driver = driver;
    }
}
