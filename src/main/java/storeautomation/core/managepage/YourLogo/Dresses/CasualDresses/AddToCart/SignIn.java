package storeautomation.core.managepage.YourLogo.Dresses.CasualDresses.AddToCart;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import storeautomation.core.managepage.YourLogo.BasePage;
import storeautomation.core.utils.CommonEvents;

public class SignIn extends BasePage {

    @FindBy(xpath = " //*[@id=\"center_column\"]/form/p/button")
    private WebElement buttoncheck;

    public Shipping clickButtonCheckout() {
        CommonEvents.clickButton(buttoncheck);
        return new Shipping();
    }
}
