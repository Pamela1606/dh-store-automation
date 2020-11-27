package storeautomation.core.managepage.YourLogo.Dresses.CasualDresses.AddToCart;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import storeautomation.core.managepage.YourLogo.BasePage;
import storeautomation.core.utils.CommonEvents;

public class Shipping extends BasePage {
    @FindBy(xpath = " //*[@id=\"uniform-cgv\"]")

    private WebElement acceptCheck;

    @FindBy(xpath = " //*[@id=\"form\"]/p/button")

    private WebElement checkout;



    public Payment clickAcceptCheckout() {
        //CommonEvents.forceWait(5000);
        CommonEvents.clickButton(acceptCheck);
        CommonEvents.clickButton(checkout);

        return new Payment();
    }

}
