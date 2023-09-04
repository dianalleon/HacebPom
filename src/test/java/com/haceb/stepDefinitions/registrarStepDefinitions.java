package com.haceb.stepDefinitions;

import com.haceb.steps.Registro.DatosRegistroStep;
import com.haceb.steps.HomeStep;
import com.haceb.steps.Registro.RegistroStep;
import com.haceb.steps.Registro.ValidarPerfilStep;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

public class registrarStepDefinitions {

    @Steps
    HomeStep homeStep;
    @Steps
    RegistroStep registroStep;
    @Steps
    DatosRegistroStep datosRegistroStep;
    @Steps
    ValidarPerfilStep validarPerfilStep;

    @Dado("que el usuario abre la aplicacion se dirige a mi perfil y da click en registrarte")
    public void queElUsuarioAbreLaAplicacionSeDirigeAMiPerfilYDaClickEnRegistrarte() {
        homeStep.abrirNavegador();
        homeStep.clicRegistro();
    }

    @Cuando("el usuario da click en ingresar a haceb y digita la informacion del formulario")
    public void elUsuarioDaClickEnIngresarAHacebYDigitaLaInformacionDelFormulario() {
        registroStep.registro();
        registroStep.envioDatos();
    }
    @Cuando("da click en terminos y  dando click en autorizo")
    public void daClickEnTerminosYDandoClickEnAutorizo() {
        registroStep.seleccionarCheck();
    }
    @Cuando("dando click en registrarme luego el usuario completa los campos complementarios")
    public void dandoClickEnRegistrarmeLuegoElUsuarioCompletaLosCamposComplementarios() {
        registroStep.clickRegistrarYDatos();
        datosRegistroStep.datosUsuario();
    }
    @Entonces("da click en enviar y se visualizara la informacion del perfil")
    public void daClickEnEnviarYSeVisualizaraLaInformacionDelPerfil() {
        validarPerfilStep.validarPerfil();
    }
}
