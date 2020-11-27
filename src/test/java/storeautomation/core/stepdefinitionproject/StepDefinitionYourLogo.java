package storeautomation.core.stepdefinitionproject;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import storeautomation.core.managepage.YourLogo.Dresses.CasualDresses.AddToCart.*;
import storeautomation.core.managepage.YourLogo.Dresses.CasualDresses.CasualDresses;
import storeautomation.core.managepage.YourLogo.Dresses.CasualDresses.PrintedDresses;
import storeautomation.core.managepage.YourLogo.Dresses.Dresses;
import storeautomation.core.managepage.YourLogo.YourLogo;
import storeautomation.core.utils.LoadPage;

public class StepDefinitionYourLogo {
    private YourLogo yourlogo;
    private Dresses dresses;
    private CasualDresses casualDresses;
    private PrintedDresses printedDresses;
    private AddToCart addToCart;
    private ToCart toCart;
    private WizardToShop wizardToShop;
    private SignIn signIn;
    private Shipping shipping;
    private Payment payment;
    private PayBank payBank;
    private ConfirmMyOrder confirmMyOrder;

    @Given("^go YourLogo pagina cargada$")
    public void loadPageYourLogo() throws Throwable {
        yourlogo = LoadPage.cargaPagina();
    }

    @And("^Click Dresses link$")
    public void clickDressesLink() throws Throwable {
        dresses = yourlogo.clickDresses();
    }

    @And("^Click CasualDresses link$")
    public void clickCasualDressesLink() throws Throwable {
        casualDresses = dresses.clickCasualDresses();
    }

    @And("^Hover image link Casual Dresses$")
    public void clickImageLink() throws Throwable {
        printedDresses = casualDresses.clickHoverImage();
    }

    @And("^Add To Cart$")
    public void clickButtonAdd() throws Throwable {
        addToCart = printedDresses.clickButtonAdd();
    }

    @And("^Proceed to checkout$")
    public void clickButtonProceed() throws Throwable {
        toCart = addToCart.clickButtonProceed();
    }

    @And("^Wizard to shop$")
    public void clickWizardToShop() throws Throwable {
        wizardToShop = toCart.clickWizardToShop();
    }

    @And("^Authentication$")
    public void setMyCredentialsOnLoginPage() throws Throwable {
        signIn = wizardToShop.setCredentials();
    }

    @And("^Preeced Chechout$")
    public void clickButtonCheckout() throws Throwable {
        shipping = signIn.clickButtonCheckout();
    }

    @And("^Accept terms$")
    public void clickAcceptCheckout() throws Throwable {
        payment = shipping.clickAcceptCheckout();
    }

    @And("^Pay by Bank$")
    public void clickPayByBank() throws Throwable {
        payBank = payment.clickPayByBank();
    }

    @And("^Confirm my Order$")
    public void clickConfirmOrder() throws Throwable {
        confirmMyOrder = payBank.clickConfirmOrder();
    }
}
