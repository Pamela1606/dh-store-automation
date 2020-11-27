package storeautomation.core.managepage.YourLogo.Dresses.CasualDresses.AddToCart;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import storeautomation.core.managepage.YourLogo.BasePage;
import storeautomation.core.utils.CommonEvents;

public class PayBank extends BasePage {

    @FindBy(xpath = " //*[@id=\"cart_navigation\"]/button")
    private WebElement confirmOrder;

    public ConfirmMyOrder clickConfirmOrder() {
        CommonEvents.clickButton(confirmOrder);
        return new ConfirmMyOrder();
    }
}
