package storeautomation.core.managepage.YourLogo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import storeautomation.core.customwebdriver.ManageDriver;


public abstract class BasePage {
    protected WebDriver webDriver;
    protected WebDriverWait webDriverWait;


    public BasePage() {
        webDriver = ManageDriver.getInstance().getWebDriver();
        webDriverWait = ManageDriver.getInstance().getWebDriverWait();
        PageFactory.initElements(webDriver, this);
    }
}

