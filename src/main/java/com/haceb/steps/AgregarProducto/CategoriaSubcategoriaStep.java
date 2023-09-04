package com.haceb.steps.AgregarProducto;

import com.haceb.PageObject.AgregarProducto.CategoriaSubcategoriaPage;
import com.haceb.utils.Metodos;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;
import org.openqa.selenium.WebDriver;

public class CategoriaSubcategoriaStep {

    @Page
    CategoriaSubcategoriaPage categoriaSubcategoriaPage;
    @Page
    Metodos metodos;

    @Step("selecciona menu y la categoria")
    public void clicCategoria(){
        categoriaSubcategoriaPage.btnMenu.click();
        metodos.realizarHover(categoriaSubcategoriaPage.txtCategoria);
    }

    @Step("Seleccionar subCategoria aleatoriamente")
    public void subCategoria(){
        metodos.seleccionarAleatoriamente(categoriaSubcategoriaPage.listSubCategorias).click();
    }
}
