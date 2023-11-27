package co.com.proyectofinal.screenplay.stepdefinitions;

import co.com.proyectofinal.screenplay.questions.Verificy;
import co.com.proyectofinal.screenplay.tasks.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import org.hamcrest.Matchers;

import static co.com.proyectofinal.screenplay.hooks.TheActor.actor;

public class CarritoDeComprasStepDefinitions {

    @Given("el usuario ingrese a JPetStore")
    public void elUsuarioIngreseAJPetStore() {
        actor.attemptsTo(NavigateTo.theJPetStorePage());
    }

    @When("el usuario selecciona una categoria")
    public void elUsuarioSeleccionaUnaCategoria() {
        actor.attemptsTo(ClickCategory.clickear());
    }

    @And("el usuario selecciona un producto")
    public void elUsuarioSeleccionaUnProducto() {
        actor.attemptsTo(ClickProduct.clickear());
    }

    @And("el usuario da clic en Add to Cart")
    public void elUsuarioDaClicEnAddToCart() {
        actor.attemptsTo(ClicAddTo.cart());
    }


    @And("el usuario agrega la cantidad {int}")
    public void elUsuarioAgregaLaCantidad(int quantity) {
        actor.attemptsTo(EnterQuantity.number(quantity));
    }

    @And("el usuario da clic en proceed to checkout")
    public void elUsuarioDaClicEnProceedToCheckout() {
        actor.attemptsTo(ClickProceed.checkout());
    }

    @Then("el usuario deberia ver el login")
    public void elUsuarioDeberiaVerElLogin() {
        actor.should(GivenWhenThen.seeThat(Verificy.login(),Matchers.equalTo("Please enter your username and password.")));
    }


}

