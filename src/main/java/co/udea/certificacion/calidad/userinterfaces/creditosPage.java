package co.udea.certificacion.calidad.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class creditosPage extends PageObject {

    public static final Target BOTONSIMULAR = Target.the("Boton para ir a simulador").locatedBy("/html/body/div[2]/div[2]/div/div[2]/div/div[6]/section/div[3]/section/div/div[1]/div[4]/div/div[2]/div/a[1]");
    public static final Target BOTONCONTINUAR = Target.the("Boton continuar a simular").located(By.id("boton-seleccion-tarjeta"));
}
