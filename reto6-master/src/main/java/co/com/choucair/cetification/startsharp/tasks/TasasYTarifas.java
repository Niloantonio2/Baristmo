package co.com.choucair.cetification.startsharp.tasks;

import co.com.choucair.cetification.startsharp.userinterfaces.BanismoPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class TasasYTarifas implements Task {


    public static TasasYTarifas paraPrestamos() {
        return Tasks.instrumented(TasasYTarifas.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(BanismoPage.BTN_TARIFAS,isVisible()).forNoMoreThan(30).seconds(),
                Click.on(BanismoPage.BTN_TARIFAS)
        );
    }
}
