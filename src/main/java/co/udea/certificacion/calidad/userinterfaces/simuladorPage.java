package co.udea.certificacion.calidad.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class simuladorPage extends PageObject {



    public static final Target BOTONRADIALSI = Target.the("Boton radial si a cuanto dinero necesitas").locatedBy("/html/body/div[2]/div[2]/div/div[2]/div/div[2]/section/div[3]/div[2]/app-root/div/app-solicitud-monto/section/form/mat-radio-group/mat-radio-button[1]/label/span[1]/span[1]");
    public static final Target INPUTMONTO = Target.the("Input de monto a prestar").located(By.id("valor-simulacion"));
    public static final Target INPUTMESES = Target.the("Input de meses de plazo").located(By.id("valor-plazo"));
    public static final Target INPUTFECHA = Target.the("Input de fecha de nacimiento").located(By.id("campo-fecha"));
}
