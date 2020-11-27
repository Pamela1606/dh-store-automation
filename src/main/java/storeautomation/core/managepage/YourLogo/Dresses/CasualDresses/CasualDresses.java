package storeautomation.core.managepage.YourLogo.Dresses.CasualDresses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import storeautomation.core.customwebdriver.ManageDriver;
import storeautomation.core.managepage.YourLogo.BasePage;
import storeautomation.core.managepage.YourLogo.Dresses.Dresses;
import storeautomation.core.utils.CommonEvents;

import java.util.concurrent.TimeUnit;

public class CasualDresses extends BasePage {
    private String model;
    private String condition;
    private double quantity;
    private String size;
    private WebDriver driver;
    private ManageDriver webdriver=ManageDriver.getInstance();

    @FindBy(xpath = " //*[@id=\"center_column\"]/ul/li/div/div[1]/div")
    private WebElement linkCasualDresses;



    public PrintedDresses clickHoverImage() {
       CommonEvents.clickButton(linkCasualDresses);
        ManageDriver.getInstance().getWebDriver().switchTo().frame(ManageDriver.getInstance().getWebDriver().findElement((By.className("fancybox-iframe"))));

       return new PrintedDresses();

    }



}
