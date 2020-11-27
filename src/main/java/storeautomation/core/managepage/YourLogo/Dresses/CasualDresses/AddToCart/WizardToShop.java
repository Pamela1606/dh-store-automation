package storeautomation.core.managepage.YourLogo.Dresses.CasualDresses.AddToCart;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import storeautomation.core.managepage.YourLogo.BasePage;
import storeautomation.core.utils.CommonEvents;
import storeautomation.core.utils.PropertyAccessor;

public class WizardToShop extends BasePage {
    @FindBy(xpath = " //*[@id=\"email\"]")
    private WebElement usernameInputField;

    @FindBy(xpath = " //*[@id=\"passwd\"]")
    private WebElement passwordInputField;

    @FindBy(xpath = " //*[@id=\"SubmitLogin\"]")
    private WebElement loginBtn;

    public SignIn setCredentials() {
        String username = PropertyAccessor.getInstance().getUser();
        String password = PropertyAccessor.getInstance().getPassword();
        CommonEvents.setInputField(usernameInputField, username);
        CommonEvents.setInputField(passwordInputField, password);
        CommonEvents.clickButton(loginBtn);
        return new SignIn();
    }
}
