package utilis;

import com.github.javafaker.Faker;
import org.awaitility.Awaitility;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

public class Interactions {

    private final static int TIMEOUT = 5;

    public static void awaitUntilElementDisplayed(WebDriver driver, By selector) {
        Awaitility.await().atMost(TIMEOUT, TimeUnit.SECONDS).ignoreExceptions().until(() -> driver.findElement(selector).isDisplayed());
    }

    public static void click(WebDriver driver, By selector) {
        awaitUntilElementDisplayed(driver, selector);
        driver.findElement(selector).click();
    }

    public static void sendKeys(WebDriver driver, By selector, String keys) {
        awaitUntilElementDisplayed(driver, selector);
        driver.findElement(selector).click();
        driver.findElement(selector).sendKeys(keys);
    }

    public static void clear(WebDriver driver, By selector) {
        awaitUntilElementDisplayed(driver, selector);
        driver.findElement(selector).clear();
    }
    public static void clearByKeys(WebDriver driver,By selector){
        awaitUntilElementDisplayed(driver, selector);
        driver.findElement(selector).sendKeys(Keys.CONTROL , "a" ,Keys.DELETE);
    }

    public static boolean isElementDisplayed(WebDriver driver, By selector) {
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
    public static void hoverOverAndClickOnDropDownElement(WebDriver driver, By fieldToExpandSelector, By elementFromDropDownSelector) {
        awaitUntilElementDisplayed(driver, fieldToExpandSelector);
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(fieldToExpandSelector)).perform();
        awaitUntilElementDisplayed(driver, elementFromDropDownSelector);
        driver.findElement(elementFromDropDownSelector).click();
    }
}
