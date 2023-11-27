package co.com.proyectofinal.screenplay.questions;

import co.com.proyectofinal.screenplay.ui.ObjectContainer;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Verificy implements Question {
    public static Verificy login() {
        return new Verificy();
    }

    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(ObjectContainer.SMS_LOGIN).answeredBy(actor);
    }
}
