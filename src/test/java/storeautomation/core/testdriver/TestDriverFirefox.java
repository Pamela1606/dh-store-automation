package storeautomation.core.testdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestDriverFirefox {
    public static void main(String[] args) {
        WebDriver testdriverFF = new FirefoxDriver();
        testdriverFF.get("https://mvnrepository.com/artifact/info.cukes/cucumber-java");
    }
}

