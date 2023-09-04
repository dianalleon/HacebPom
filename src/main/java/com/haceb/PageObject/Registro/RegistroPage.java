package com.haceb.PageObject.Registro;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.annotations.findby.How;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;

public class RegistroPage extends PageObject {
    @FindBy(how = How.ID, using = "vtexIdUI-custom-oauth")
    public WebElement btnIngresar;

    @FindBy(className = "gigya-screen-dialog-close")
    public WebElementFacade txtCerrarModalBloqueante;

    //campos del formulario
    @FindBy(how = How.XPATH, using = "//input[@id='gigya-loginID-51216659851706440']")
    public WebElementFacade txtCorreo;

    @FindBy(how = How.XPATH, using = "//input[@id='gigya-textbox-72173553995486780']")
    public WebElementFacade txtNombre;

    @FindBy(how = How.XPATH, using = "//input[@id='gigya-textbox-146410824335495100']")
    public WebElementFacade txtApellido;

    @FindBy(how = How.XPATH, using = "//input[@id='gigya-password-54061940132406190']")
    public WebElementFacade txtIngresarContrasena;

    @FindBy(how = How.XPATH, using = "//input[@id='gigya-password-142670944012194750']")
    public WebElementFacade txtConContrasena;

    @FindBy(how = How.XPATH, using = "//label[@for='gigya-checkbox-70031539084410860']//span[@class='gigya-label-text gigya-checkbox-text']")
    public WebElementFacade txtTerminos;

    @FindBy(how = How.XPATH, using = "//label[@for='gigya-multiChoice-0-98366419479004930']")
    public WebElementFacade txtAutorizo;

    @FindBy(how = How.XPATH, using = "//input[@value='REGISTRARME']")
    public WebElementFacade btnRegistrar;

}
