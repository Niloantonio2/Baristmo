package co.com.choucair.cetification.startsharp.stepdefinitions;

import co.com.choucair.cetification.startsharp.tasks.AbrirPagina;
import co.com.choucair.cetification.startsharp.tasks.AbrirPrestamo;
import co.com.choucair.cetification.startsharp.tasks.DescargarArchivo;
import co.com.choucair.cetification.startsharp.tasks.TasasYTarifas;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class BanistmoStep {

    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());

    }

    @Dado("que el usuario se encuentra en la pagina")
    public void queElUsuarioSeEncuentraEnLaPagina() {
        OnStage.theActorCalled("Nilo").wasAbleTo(AbrirPagina.starSharp());
    }

    @Cuando("el usuario ingresa a la opcion prestamo para autos")
    public void elUsuarioIngresaALaOpcionPrestamoParaAutos() {
        OnStage.theActorCalled("Nilo").attemptsTo(AbrirPrestamo.paraAuto());
    }
    @Cuando("hace click en Tasas y tarifas")
    public void haceClickEnTasasYTarifas() {
        OnStage.theActorCalled("Nilo").attemptsTo(TasasYTarifas.paraPrestamos());
    }
    @Cuando("descarga archivo pdf")
    public void descargaArchivoPdf() {
        OnStage.theActorCalled("Nilo").attemptsTo(DescargarArchivo.pdf());
    }
    @Entonces("prodra ver en el archivo toda nuestras tasas")
    public void prodraVerEnElArchivoTodaNuestrasTasas() {

    }
}
