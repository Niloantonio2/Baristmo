package co.com.choucair.cetification.startsharp.tasks;

import co.com.choucair.cetification.startsharp.userinterfaces.BanismoPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class DescargarArchivo implements Task {

    public static DescargarArchivo pdf() {
        return Tasks.instrumented(DescargarArchivo.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(WaitUntil.the(BanismoPage.BTN_DESCARGAR_PDF,isVisible()).forNoMoreThan(30).seconds(),
                Click.on(BanismoPage.BTN_DESCARGAR_PDF)
        );
    }
}
