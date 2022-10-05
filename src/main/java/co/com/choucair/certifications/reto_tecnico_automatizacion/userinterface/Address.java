package co.com.choucair.certifications.reto_tecnico_automatizacion.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class Address {

    // Selecciona el campo ciudad
    public static final Target CITY = Target.the("city").
            locatedBy("//input[@id=\"city\"]");
    // Selecciona el campo codigo postal
    public static final Target ZIP = Target.the("zip").
            locatedBy("//input[@id=\"zip\"]");
    // Selecciona el campo de pais
    public static final Target COUNTRY = Target.the("operating_system").
            locatedBy("(//span[@class=\"btn btn-default form-control ui-select-toggle\"])[2]");
    // Elige el pais
    public static final Target CHOSEN_COUNTRY = Target.the("chosen_os").
            locatedBy("(//span[@class=\"ui-select-choices-row-inner\"])[52]");

    // Boton Next-Device
    public static final Target BTN_NEXTDEVICE = Target.the("btn_next_device").
            locatedBy("//a[@class=\"btn btn-blue pull-right\"]");



}
