package co.com.proyectofinal.screenplay.tasks;

import co.com.proyectofinal.screenplay.ui.ObjectContainer;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class ClickCategory implements Task {

    public static ClickCategory clickear() {
        return Tasks.instrumented(ClickCategory.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(ObjectContainer.DOG_CATEGORY));
    }
}
