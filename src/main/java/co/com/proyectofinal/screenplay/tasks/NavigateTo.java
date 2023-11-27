package co.com.proyectofinal.screenplay.tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class NavigateTo {

    public static Performable theJPetStorePage(){
        return Task.where("{0} opens the JpetStore Page",
                Open.browserOn().thePageNamed("home.page")
                );
    }
}
