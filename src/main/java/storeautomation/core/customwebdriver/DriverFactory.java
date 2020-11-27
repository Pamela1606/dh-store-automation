package storeautomation.core.customwebdriver;

import org.openqa.selenium.WebDriver;
import storeautomation.core.utils.BrowserType;

import java.util.HashMap;
import java.util.Map;

public class DriverFactory {
    private DriverFactory(){}

    public static WebDriver getManageDriver(BrowserType browserType){
        Map<BrowserType, CustomWebDriver> pickupDriver = new HashMap<>();
        pickupDriver.put(BrowserType.CHROME, new Chrome());
        pickupDriver.put(BrowserType.FIREFOX, new Firefox());

        return pickupDriver.get(browserType).generateWebDriver();
    }
}
