package storeautomation.core.managepage.YourLogo.Dresses.CasualDresses.AddToCart;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import storeautomation.core.managepage.YourLogo.BasePage;
import storeautomation.core.managepage.YourLogo.Dresses.Dresses;
import storeautomation.core.utils.CommonEvents;

public class AddToCart extends BasePage {
    @FindBy(xpath = " //*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a")
    private WebElement addToCart;

    public ToCart clickButtonProceed() {
        CommonEvents.clickButton(addToCart);
        return new ToCart();
    }
}
