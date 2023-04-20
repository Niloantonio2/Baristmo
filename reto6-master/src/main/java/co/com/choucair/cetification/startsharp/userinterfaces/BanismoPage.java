package co.com.choucair.cetification.startsharp.userinterfaces;


import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://www.banistmo.com/wps/portal/banistmo/personas/")
public class BanismoPage extends PageObject {
    public static final Target BTN_X = Target.the("boton cerrar aviso de privacidad").located(By.id("btn-aceptar-cookies"));
    public static final Target BTN_PRODUCTO_Y_SERVICIOS = Target.the("boton productos y servicios").located(By.xpath("//*[@id=\"navbar-collapse-grid\"]/ul/li[3]"));
    public static final Target BTN_PRESTAMO = Target.the("boton prestamo").located(By.xpath("//a[normalize-space()='Préstamos']"));
    public static final Target BTN_PRESTAMO_AUTO = Target.the("boton prestamo").located(By.xpath("(//a[@title=\"Préstamos de Auto\"])[1]"));
    public static final Target BTN_TARIFAS = Target.the("boton prestamo").located(By.xpath("(//*[@id=\"filialTabs\"]/li[4]/a"));
    public static final Target BTN_DESCARGAR_PDF = Target.the("boton prestamo").located(By.xpath("(//*[@id=\"tab4\"]/table/tbody/tr[2]/td[2]/span/a/img"));

}
