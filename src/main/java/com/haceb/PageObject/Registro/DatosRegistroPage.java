package com.haceb.PageObject.Registro;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.annotations.findby.How;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebElement;

import java.util.List;

public class DatosRegistroPage  extends PageObject {

    @FindBy(how = How.XPATH, using = "//form[@id='gigya-profile-form']//input[@id='gigya-textbox-153635908553265760']")
    public WebElementFacade txtCedula;

    @FindBy(how = How.ID, using = "gigya-dropdown-153944062160082270")
    public WebElementFacade txtGenero;

    @FindBy(how = How.XPATH, using = "//input[@id='gigya-textbox-29430652596742216']")
    public WebElementFacade txtFecha;

    @FindBy(how = How.XPATH, using = "//input[@value='Enviar']")
    public WebElementFacade btnEnviar;


}
