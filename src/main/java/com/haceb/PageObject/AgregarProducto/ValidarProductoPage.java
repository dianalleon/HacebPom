package com.haceb.PageObject.AgregarProducto;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.annotations.findby.How;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ValidarProductoPage extends PageObject {
    @FindBy(how = How.XPATH, using = "//*[@class=\"product-name\"]")
    public WebElementFacade txtProducto;
}
