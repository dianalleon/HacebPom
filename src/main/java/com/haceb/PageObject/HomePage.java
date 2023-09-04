package com.haceb.PageObject;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.annotations.findby.How;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

public class HomePage extends PageObject {

    @FindBy(how = How.XPATH, using = "//span[@class=\"icon-user\"]")
    public WebElementFacade txtPerfil;

    @FindBy(how = How.XPATH, using = "//a[@class='cdc-fire cdc-register']")
    public WebElementFacade txtRegistrar;

}
