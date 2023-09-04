package com.haceb.stepDefinitions;

import com.haceb.steps.AgregarProducto.CategoriaSubcategoriaStep;
import com.haceb.steps.AgregarProducto.ValidarProductoStep;
import com.haceb.steps.HomeStep;
import com.haceb.steps.AgregarProducto.ProductoStep;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;

import io.cucumber.java.pa.ਜਦੋਂ;
import net.thucydides.core.annotations.Steps;

public class agregarStepDefinitions {

    @Steps
    HomeStep homeStep;

    @Steps
    CategoriaSubcategoriaStep categoriaSubcategoriaStep;

    @Steps
    ProductoStep productoStep;

    @Steps
    ValidarProductoStep validarProductoStep;

    @Dado("que el usuario se dirige al menu desplegable y selecciona electrodomesticos de cocina")
    public void queElUsuarioSeDirigeAlMenuDesplegableYSeleccionaElectrodomesticosDeCocina() {
        homeStep.abrirNavegador();
        categoriaSubcategoriaStep.clicCategoria();
    }
    @Cuando("se selecciona una subcategoria aleatoriamente y se visualiza los productos")
    public void seSeleccionaUnaSubcategoriaAleatoriamenteYSeVisualizaLosProductos() {
        categoriaSubcategoriaStep.subCategoria();
    }
    @Cuando("da click aleatoriamente un producto y se observa los detalles del producto")
    public void daClickAleatoriamenteUnProductoYSeObservaLosDetallesDelProducto() {
        productoStep.productoAleatorio();
    }
    @Cuando("dando click en comprar y seleccionar ir a pagar")
    public void dandoClickEnComprarYSeleccionarIrAPagar() {
        productoStep.clickComprarIrAPagar();
    }
    @Entonces("el usuario visualiza su producto en el carrito")
    public void elUsuarioVisualizaSuProductoEnElCarrito() {
        validarProductoStep.validarProducto();
    }

}
