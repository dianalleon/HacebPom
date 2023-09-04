package com.haceb.steps.AgregarProducto;

import com.haceb.PageObject.AgregarProducto.ProductoPage;
import com.haceb.models.ExcelServices;
import com.haceb.utils.EscrituraExcel;
import com.haceb.utils.Metodos;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.time.temporal.TemporalUnit;
import java.util.concurrent.TimeUnit;

public class ProductoStep {

    @Page
    ProductoPage productoPage;

    @Page
    Metodos metodos;


    @Step("Seleccionar producto aleatoriamente")
    public void productoAleatorio(){
        WebElement producto = metodos.seleccionarAleatoriamente(productoPage.listProductos);
        producto.click();
    }

    @Step("Seleccionar comprar e ir a pagar")
    public void clickComprarIrAPagar(){
        productoPage.txtVisualizarProducto.waitUntilVisible();
        ExcelServices.EscrituraExcel(productoPage.txtVisualizarProducto.getText(),1,8);
        productoPage.btnComprar.click();
        metodos.realizarHover(productoPage.btnComprar);
        productoPage.btnPagar.click();
    }


}
