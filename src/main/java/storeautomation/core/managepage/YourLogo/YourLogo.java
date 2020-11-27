package storeautomation.core.managepage.YourLogo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import storeautomation.core.managepage.YourLogo.Dresses.CasualDresses.CasualDresses;
import storeautomation.core.managepage.YourLogo.Dresses.Dresses;
import storeautomation.core.utils.CommonEvents;

public class YourLogo extends BasePage {


    @FindBy(xpath = " //*[@id=\"block_top_menu\"]/ul/li[2]/a")
    private WebElement linkDresses;


    public Dresses clickDresses() {
        CommonEvents.clickButton(linkDresses);
        return new Dresses();
    }
}
