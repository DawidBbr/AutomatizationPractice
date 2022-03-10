package utilis;

import org.awaitility.Awaitility;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

public class Interactions extends BaseInteractions {

    private final int TIMEOUT = 5;

    public Interactions(WebDriver driver) {
        super(driver);
    }
    public void awaitUntilElementDisplayed(By selector) {
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
    public void clear(By selector) {
        awaitUntilElementDisplayed(selector);
        driver.findElement(selector).clear();
    }
    public void clearByKeys(By selector){
        awaitUntilElementDisplayed(selector);
        driver.findElement(selector).sendKeys(Keys.CONTROL , "a" ,Keys.DELETE);
    }
    public boolean isElementDisplayed(By selector) {
        boolean elementPresent = false;
        try {
            if (driver.findElement(selector).isDisplayed()) {
                elementPresent = true;
            }
        } catch (NoSuchElementException e) {
            System.out.println("Element is not present" + e);
        }
        return elementPresent;
    }
    public void hoverOverAndClickOnDropDownElement(By fieldToExpandSelector, By elementFromDropDownSelector) {
        awaitUntilElementDisplayed(fieldToExpandSelector);
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(fieldToExpandSelector)).perform();
        awaitUntilElementDisplayed(elementFromDropDownSelector);
        driver.findElement(elementFromDropDownSelector).click();
    }
    public void refreshPage() {
        JavascriptExecutor method = ((JavascriptExecutor) driver);
        method.executeScript("document.location.reload()");
    }
    public void scrollDownPage() {
        JavascriptExecutor scroll = ((JavascriptExecutor)driver);
        scroll.executeScript("window.scrollBy(0, 250)");
    }
    public void scrollUpPage() {
        JavascriptExecutor scroll = ((JavascriptExecutor)driver);
        scroll.executeScript("window.scrollBy(0, -250)");
    }
    public void scrollToBottomOfPage() {
        JavascriptExecutor scroll = ((JavascriptExecutor)driver);
        scroll.executeScript("window.scrollTo(0, document.body.scrollHeight)");
    }

}

