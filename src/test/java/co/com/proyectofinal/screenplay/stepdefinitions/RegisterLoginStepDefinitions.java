package co.com.proyectofinal.screenplay.stepdefinitions;

import co.com.proyectofinal.screenplay.tasks.ClickRegister;
import co.com.proyectofinal.screenplay.tasks.ClickSaveAccount;
import co.com.proyectofinal.screenplay.tasks.ClickSignIn;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

import static co.com.proyectofinal.screenplay.hooks.TheActor.actor;

public class RegisterLoginStepDefinitions {

    @When("el usuario de clic en Sign In")
    public void elUsuarioDeClicEnSignIn() {
        actor.attemptsTo(ClickSignIn.click());
    }

    @And("el usuario de clic en register now")
    public void elUsuarioDeClicEnRegisterNow() {
        actor.attemptsTo(ClickRegister.now());
    }


    @And("de clic en Save Account Information")
    public void deClicEnSaveAccountInformation() {
        actor.attemptsTo(ClickSaveAccount.information());
    }
}
