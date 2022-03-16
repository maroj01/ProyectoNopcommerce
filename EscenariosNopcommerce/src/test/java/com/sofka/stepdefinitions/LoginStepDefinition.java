package com.sofka.stepdefinitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;

public class LoginStepDefinition {

    @Dado("que se ingresó al home de la tienda virtual")
    public void ingresarTiendaVirtual() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Cuando("me autentico con el email y password")
    public void autenticarElEmailPassword(String email , String password) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Entonces("se mostrará el mensaje de bienvenida")
    public void mostrarMensajeBienvenida() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Entonces("se mostrará la zona de compras")
    public void mostrarZonaCompras() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Cuando("me autentico con email (.*) y password (.*)")
    public void autenticarEmailPasswordErroneos(String email, String password) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Entonces("se mostrará el mensaje de error")
    public void mostrarMensajeError() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}


