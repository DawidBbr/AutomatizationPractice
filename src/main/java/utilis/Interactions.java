package utilis;

import org.awaitility.Awaitility;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class Interactions {

    protected WebDriver driver;

    public Interactions(WebDriver driver) {
        this.driver = driver;
    }

    public void awaitUntilElementDisplayed(By selector) {
        int TIMEOUT = 5;
        Awaitility.await().atMost(TIMEOUT, TimeUnit.SECONDS).ignoreExceptions().until(() -> driver.findElement(selector).isDisplayed());
    }

    public void click(By selector) {
        awaitUntilElementDisplayed(selector);
        driver.findElement(selector).click();
    }

    public void sendKeys(By selector, String keys) {
        awaitUntilElementDisplayed(selector);
        driver.findElement(selector).click();
        driver.findElement(selector).sendKeys(keys);
    }

    public void uploadFile(By selector) {
        awaitUntilElementDisplayed(selector);
        WebElement chooseFile = driver.findElement(selector);
        String currentDirectory = System.getProperty("user.dir");
        chooseFile.sendKeys(currentDirectory + "/exampleInvoice.csv");
    }

    public void scrollToVisibleOfElement(By selector) {
        awaitUntilElementDisplayed(selector);
        JavascriptExecutor scroll = ((JavascriptExecutor) driver);
        scroll.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(selector));
    }
}

