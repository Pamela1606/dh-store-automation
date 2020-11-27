package storeautomation.core.managepage.YourLogo.Dresses.CasualDresses;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import storeautomation.core.managepage.YourLogo.BasePage;
import storeautomation.core.managepage.YourLogo.Dresses.CasualDresses.AddToCart.AddToCart;
import storeautomation.core.utils.CommonEvents;

public class PrintedDresses extends BasePage {

    //@FindBy(xpath = " //*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a")
    @FindBy(xpath = " //*[@id=\"add_to_cart\"]/button")

    private WebElement linkAddToCart;

    public AddToCart clickButtonAdd() {
        //webdriver.setImplicitTimeWait(ManageDriver.IMPLICIT_TIME_WAIT);
        //CommonEvents.forceWait(9000);
        //CommonEvents.waitWebElementIsVisible(linkAddToCart);
        CommonEvents.clickButton(linkAddToCart);
        return new AddToCart();
    }
}
