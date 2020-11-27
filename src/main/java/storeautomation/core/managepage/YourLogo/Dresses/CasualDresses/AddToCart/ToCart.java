package storeautomation.core.managepage.YourLogo.Dresses.CasualDresses.AddToCart;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import storeautomation.core.managepage.YourLogo.BasePage;
import storeautomation.core.utils.CommonEvents;

public class ToCart extends BasePage {
    @FindBy(xpath = " //*[@id=\"center_column\"]/p[2]/a[1]")
    private WebElement shop;

    public WizardToShop clickWizardToShop() {
        CommonEvents.clickButton(shop);
        return new WizardToShop();
    }

}
