package co.com.proyectofinal.screenplay.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features="src/test/resources/features/carrito_de_compras.feature",
        glue={"co.com.proyectofinal.screenplay.stepdefinitions","co.com.proyectofinal.screenplay.hooks"},
        snippets= CucumberOptions.SnippetType.CAMELCASE
)
public class ShoppingCartRunner {

}
