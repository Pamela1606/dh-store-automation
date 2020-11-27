package storeautomation.core.utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import storeautomation.core.customwebdriver.ManageDriver;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.List;

public class CommonEvents {
    /**
     * This method set text content to web element.
    */
    public static void setInputField(WebElement webElement, String content) {
        ManageDriver.getInstance().getWebDriverWait().until(ExpectedConditions.visibilityOf(webElement));
        webElement.clear();
        webElement.sendKeys(content);
    }

    /**
     * This method perform a click action in a web element.
     */
    public static void clickButton(WebElement webElement) {
        ManageDriver.getInstance().getWebDriverWait().until(ExpectedConditions.elementToBeClickable(webElement));
        webElement.click();
    }

    /**
     * This method perform a click in a non visible element in the UI.
     */
    public static void jsClickElement(WebElement webElement) {
        ((JavascriptExecutor) ManageDriver.getInstance().getWebDriver())
                .executeScript("arguments[0].click();", webElement);
    }

    /**
     * This method verifies if a web element is visible.
     */
     public static boolean isVisible(WebElement webElement) {
        try {
            return webElement.isDisplayed();
        } catch (NoSuchElementException e) {
            System.out.println("Element do not exits.");
            return false;
        }
    }

    /**
     * This method verifies if a web element is visible.
     */
    public static boolean isPresent(WebElement webElement) {
        try {
            return webElement.isEnabled();
        } catch (NoSuchElementException e) {
            System.out.println("Element do not exits.");
            return false;
        }
    }

    public static void forceWait(int timeMilliSeconds) {
        try {
            //logger.info(FORCE_WAIT, timeMilliSeconds);
            Thread.sleep(timeMilliSeconds);
            System.out.println("Esperando: ");
        } catch (InterruptedException e) {
            StringWriter errors = new StringWriter();
            e.printStackTrace(new PrintWriter(errors));
            //logger.debug(Event.class.getSimpleName().concat("-noUseThisWait [method]- Exception Error:").concat(errors.toString()));
        }
    }

    public static void waitWebElementIsVisible(WebElement webElement) {
        ManageDriver.getInstance().getWebDriverWait().until(ExpectedConditions.visibilityOf(webElement));
    }

    /**
     * This method perform a search in a WebElement list based on a content string parameter.
     */
    public static WebElement findWebElement(List<WebElement> elements, String content) {
        return elements.stream()
                .filter(element -> content.equals(element.getText()))
                .findAny()
                .orElse(null);
    }

    /**
     * This method return the text content of a WebElement.
     */
    public static String getTextContent(WebElement webElement) {
        ManageDriver.getInstance().getWebDriverWait().until(ExpectedConditions.visibilityOf(webElement));
        return webElement.getText();
    }

    /**
     * This method get title of current page.
     */
    public static String getPageTitle() {
        return ManageDriver.getInstance().getWebDriver().getTitle();
    }

    /**
     * This method press enter key to web element.
    */
    public static void pressEnterKey(WebElement webElement) {
        webElement.sendKeys(Keys.ENTER);
    }

    public static void hoverOnElement(WebElement webElement){
        Actions actions = new Actions(ManageDriver.getInstance().getWebDriver());
        actions.moveToElement(webElement).perform();
    }

    public static void selectElement(WebElement webElement, String arg0){
        Select drpList = new Select(webElement);
        drpList.selectByVisibleText(arg0);
    }
}
