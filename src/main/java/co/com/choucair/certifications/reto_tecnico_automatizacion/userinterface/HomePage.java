package co.com.choucair.certifications.reto_tecnico_automatizacion.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;


@DefaultUrl("https://www.utest.com/")
public class HomePage extends PageObject {

    // Realiza un mapeo del boton en este caso utiliza el nombre de la clase
    public static final Target REGISTER = Target.the("register").
            locatedBy("//a[@class=\"unauthenticated-nav-bar__sign-up\"]");

}
