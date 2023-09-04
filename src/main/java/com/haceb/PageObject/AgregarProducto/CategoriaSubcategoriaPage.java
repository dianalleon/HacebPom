package com.haceb.PageObject.AgregarProducto;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.annotations.findby.How;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CategoriaSubcategoriaPage extends PageObject {

    @FindBy(how = How.XPATH, using = "//img[@alt='Electrodomésticos Haceb']")
    public WebElementFacade btnMenu;

    @FindBy(how = How.XPATH, using = "//a[@title='Electrodomésticos de cocina']")
    public WebElementFacade txtCategoria;

    @FindBy(how = How.XPATH, using = "//li[@class='has-children cocina-line']//li[@class='no-has-children']")
    public List<WebElement> listSubCategorias;
}
