package com.haceb.steps.AgregarProducto;

import com.haceb.PageObject.AgregarProducto.ValidarProductoPage;
import com.haceb.models.ExcelServices;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;
import org.junit.Assert;

public class ValidarProductoStep {

    @Page
    ValidarProductoPage validarProductoPage;

    @Step("Validar el Perfil registrado")
    public void validarProducto(){
        Assert.assertEquals(validarProductoPage.txtProducto.getText(),
                ExcelServices.leerDatos(ExcelServices.HOJA_USUARIOS_HACEB).get(0).get("Producto"));
    }




}
