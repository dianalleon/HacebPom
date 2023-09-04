package com.haceb.PageObject.AgregarProducto;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.annotations.findby.How;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.apache.xmlbeans.impl.xb.xsdschema.FieldDocument;
import org.openqa.selenium.WebElement;

import javax.xml.xpath.XPath;
import java.util.List;

public class ProductoPage extends PageObject {

    @FindBy(how = How.XPATH, using = "//div[@class=\"shelve-main\"]/ul/li//a[@class='shelve-link-name']")
    public  WebElement list;

    @FindBy(how = How.XPATH, using = "//div[@class=\"shelve-main\"]/ul/li//a[@class='shelve-link-name']")
    public List<WebElement> listProductos;

    @FindBy(how = How.XPATH, using = "//h1[@class='product__name visible-only-desktop']")
    public WebElementFacade txtVisualizarProducto;

    @FindBy(how = How.XPATH, using = "//div[@class='product__buy flex']//a[@class='btn btn-default buy-in-page-button'][normalize-space()='Comprar']")
    public WebElementFacade btnComprar;

    @FindBy(how = How.XPATH, using = "//a[normalize-space()='Ir a pagar']")
    public WebElementFacade btnPagar;







}
