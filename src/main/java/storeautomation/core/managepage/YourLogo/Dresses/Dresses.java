package storeautomation.core.managepage.YourLogo.Dresses;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import storeautomation.core.managepage.YourLogo.BasePage;
import storeautomation.core.managepage.YourLogo.Dresses.CasualDresses.CasualDresses;
import storeautomation.core.utils.CommonEvents;

public class Dresses extends BasePage {
    @FindBy(xpath = " //*[@id=\"subcategories\"]/ul/li[1]/h5/a")
    private WebElement linkCasualDresses;

    public CasualDresses clickCasualDresses(){
        CommonEvents.clickButton(linkCasualDresses);
        return new CasualDresses();
    }

}
