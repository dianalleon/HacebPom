package com.haceb.steps.Registro;

import com.haceb.PageObject.Registro.ValidarPerfilPage;
import com.haceb.models.ExcelServices;
import com.haceb.utils.Metodos;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ValidarPerfilStep {

    @Page
    ValidarPerfilPage validarPerfilPage;

    @Page
    Metodos metodos;

    @Step("Validar el Perfil registrado")
    public void validarPerfil(){
        metodos.switchToPage(validarPerfilPage.getDriver(),0);

        WebDriverWait wait = new WebDriverWait(validarPerfilPage.getDriver(), Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOf(validarPerfilPage.txtUsuario));

        Assert.assertEquals(validarPerfilPage.txtUsuario.getText(),
                ExcelServices.leerDatos(ExcelServices.HOJA_USUARIOS_HACEB).get(0).get("Nombre")+"!" );
    }
}
