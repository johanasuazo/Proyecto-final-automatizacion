package co.com.proyectofinal.screenplay.tasks;

import co.com.proyectofinal.screenplay.ui.ObjectContainer;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class EnterQuantity implements Task {

    private final Integer quantity;


    public EnterQuantity(Integer quantity) {
       this.quantity = quantity;
    }

    public static EnterQuantity number(Integer quantity) {
        return new EnterQuantity(quantity);
    }


    @Override
    @Step ("{0} buscar la cantidad parametrizada")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Clear.field(ObjectContainer.INPUT_QUANTITY),
                Enter.theValue(quantity.toString()).into(ObjectContainer.INPUT_QUANTITY),
                Click.on(ObjectContainer.BTN_UPDATE_CART));

    }
}
