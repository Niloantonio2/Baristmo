package co.com.choucair.cetification.startsharp.tasks;

import co.com.choucair.cetification.startsharp.userinterfaces.BanismoPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class AbrirPrestamo implements Task {

    public static AbrirPrestamo paraAuto() {
        return Tasks.instrumented(AbrirPrestamo.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(BanismoPage.BTN_X,isVisible()).forNoMoreThan(30).seconds(),
                Click.on(BanismoPage.BTN_X),
                WaitUntil.the(BanismoPage.BTN_PRODUCTO_Y_SERVICIOS,isVisible()).forNoMoreThan(30).seconds(),
                Click.on(BanismoPage.BTN_PRODUCTO_Y_SERVICIOS),
                WaitUntil.the(BanismoPage.BTN_PRESTAMO,isVisible()).forNoMoreThan(30).seconds(),
                Click.on(BanismoPage.BTN_PRESTAMO),
                WaitUntil.the(BanismoPage.BTN_PRESTAMO_AUTO,isVisible()).forNoMoreThan(30).seconds(),
                Click.on(BanismoPage.BTN_PRESTAMO_AUTO)
        );
    }
}
