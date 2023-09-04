package com.haceb.steps.Registro;

import com.haceb.PageObject.Registro.DatosRegistroPage;
import com.haceb.models.ExcelServices;
import com.haceb.utils.Metodos;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;

public class DatosRegistroStep {
    @Page
    DatosRegistroPage datosRegistroPage;

    @Page
    Metodos metodos;

    @Step("Digitar datos del formulario")
    public void datosUsuario(){
        String cedula = ExcelServices.leerDatos(ExcelServices.HOJA_USUARIOS_HACEB).get(0).get("Cedula");
        datosRegistroPage.txtCedula.type(cedula);

        datosRegistroPage.txtGenero.click();
        datosRegistroPage.txtGenero.selectByVisibleText("Femenino").click();

        String fecha = ExcelServices.leerDatos(ExcelServices.HOJA_USUARIOS_HACEB).get(0).get("Fecha");
        datosRegistroPage.txtFecha.type(fecha);

        datosRegistroPage.btnEnviar.click();
    }
}
