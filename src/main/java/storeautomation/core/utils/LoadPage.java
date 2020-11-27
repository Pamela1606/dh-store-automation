package storeautomation.core.utils;


import storeautomation.core.customwebdriver.ManageDriver;
import storeautomation.core.managepage.YourLogo.YourLogo;

public class LoadPage {


    public static YourLogo cargaPagina() {
        ManageDriver.getInstance().getWebDriver()
                .navigate().to(PropertyAccessor.getInstance().getBaseUrl());
        return new YourLogo();
    }
}
