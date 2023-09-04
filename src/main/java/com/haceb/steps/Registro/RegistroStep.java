package com.haceb.steps.Registro;

import com.haceb.PageObject.Registro.RegistroPage;
import com.haceb.models.ExcelServices;
import com.haceb.utils.Metodos;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class RegistroStep {

    @Page
    RegistroPage registroPage;

    @Page
    Metodos metodos;

    @Step("dar click en ingresar y envio de datos al formulario")
    public void registro(){
        WebDriverWait wait = new WebDriverWait(registroPage.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(registroPage.btnIngresar));

        wait.until(ExpectedConditions.visibilityOf(registroPage.txtCerrarModalBloqueante));
        registroPage.txtCerrarModalBloqueante.click();

        registroPage.btnIngresar.click();

        metodos.switchToPage(registroPage.getDriver(),1);
    }

    @Step("enviar datos en el primer formulario de registro")
    public void envioDatos(){
        String correo = ExcelServices.leerDatos(ExcelServices.HOJA_USUARIOS_HACEB).get(0).get("Correo");
        registroPage.txtCorreo.type(correo);

        String nombre = ExcelServices.leerDatos(ExcelServices.HOJA_USUARIOS_HACEB).get(0).get("Nombre");
        registroPage.txtNombre.type(nombre);

        String apellido = ExcelServices.leerDatos(ExcelServices.HOJA_USUARIOS_HACEB).get(0).get("Apellido");
        registroPage.txtApellido.type(apellido);

        String ingresarContrasena = ExcelServices.leerDatos(ExcelServices.HOJA_USUARIOS_HACEB).get(0).get("IngresoContrasena");
        registroPage.txtIngresarContrasena.type(ingresarContrasena);

        String contrasena = ExcelServices.leerDatos(ExcelServices.HOJA_USUARIOS_HACEB).get(0).get("Contrasena");
        registroPage.txtConContrasena.type(contrasena);
    }

    public void seleccionarCheck(){
        registroPage.txtTerminos.click();
        registroPage.txtAutorizo.click();
    }

    @Step("Dar click en ingresar")
    public void clickRegistrarYDatos(){
        registroPage.btnRegistrar.click();
    }

}
