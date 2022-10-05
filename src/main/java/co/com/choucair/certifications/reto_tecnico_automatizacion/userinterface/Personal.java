package co.com.choucair.certifications.reto_tecnico_automatizacion.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class Personal {

    // Selecciona el Campo Primer Nombre
    public static final Target FIRSTNAME = Target.the("firstname").
            locatedBy("//input[@id=\"firstName\"]");

    // Selecciona el Campo Apellido
    public static final Target LASTNAME = Target.the("lastname").
            locatedBy("//input[@id=\"lastName\"]");

    // Selecciona el Campo Correo electróico
    public static final Target EMAIL = Target.the("email").
            locatedBy("//input[@id=\"email\"]");

    // Selecciona el Campo Mes de Nacimiento
    public static final Target BIRTHMONTH = Target.the("birthMonth").
            locatedBy("//select[@id=\"birthMonth\"]");

    // Selecciona el Campo Dia de Nacimiento
    public static final Target BIRTHDAY = Target.the("birthDay").
            locatedBy("//select[@id=\"birthDay\"]");

    // Selecciona el Campo Año de Nacimiento
    public static final Target BIRTHYEAR = Target.the("birthYear").
            locatedBy("//select[@id=\"birthYear\"]");

    // Selecciona el Boton Next Location
    public static final Target BTN_NEXTLOCATION = Target.the("btn_next_location").
            locatedBy("//a[@class=\"btn btn-blue\"]");


}
