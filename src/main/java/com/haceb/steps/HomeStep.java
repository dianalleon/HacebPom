package com.haceb.steps;

import com.haceb.PageObject.HomePage;
import com.haceb.utils.Metodos;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;
import org.openqa.selenium.WebDriver;

public class HomeStep {
    @Page
    HomePage homePage;

    @Page
    Metodos metodos;

    @Managed(driver = "chrome")
    WebDriver driver;

    @Step("Abre el navegador")
    public void abrirNavegador(){
        homePage.openUrl("https://www.haceb.com/");
    }

    @Step("Ir a Perfil y dar click en registrarse")
    public void clicRegistro(){
        metodos.realizarHover(homePage.txtPerfil);
        metodos.realizarHover(homePage.txtRegistrar);
        homePage.txtRegistrar.click();
    }
}
