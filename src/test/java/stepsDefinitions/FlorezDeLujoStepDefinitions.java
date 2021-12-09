package stepsDefinitions;

import cucumber.api.java.en.*;
import steps.FlorezDeLujoSteps;
import java.io.IOException;

public class FlorezDeLujoStepDefinitions {

     FlorezDeLujoSteps florezDeLujoSteps = new FlorezDeLujoSteps();

     @Given("^que me encuentro en la pagina de FlorezDeLujo$")
     public void queMeEncuentroEnLaPaginaDeFlorezDeLujo() {
          florezDeLujoSteps.abrirPagina();
     }

     @When("^busque el producto$")
     public void busqueElProducto() throws IOException {
          florezDeLujoSteps.busquedaYValidacionDeProductos();

     }
     @When("^hacer pedido por whatsapp$")
     public void hacer_pedido_por_whatsapp() throws InterruptedException {
          florezDeLujoSteps.hacerPedido();
     }

     @Then("^podre ver producto en pantalla$")
     public void podreVerProductoEnPantalla() {
          florezDeLujoSteps.cerrarPagina();
     }
}
