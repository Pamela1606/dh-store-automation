package storeautomation.core.managepage.YourLogo.Dresses.CasualDresses.AddToCart;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import storeautomation.core.managepage.YourLogo.BasePage;
import storeautomation.core.utils.CommonEvents;

public class Payment extends BasePage {

    @FindBy(xpath = " //*[@id=\"HOOK_PAYMENT\"]/div[1]/div/p")
    private WebElement payByBank;

    public PayBank clickPayByBank() {
        CommonEvents.clickButton(payByBank);
        return new PayBank();
    }
}
