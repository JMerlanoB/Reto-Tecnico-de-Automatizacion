package co.com.choucair.certifications.reto_tecnico_automatizacion.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class Complete {

    // Selecciona el Campo Password
    public static final Target PASSWORD = Target.the("password").
            locatedBy("//input[@id=\"password\"]");
    // Selecciona el Campo Confirm Password
    public static final Target CONFIRM_PASSWORD = Target.the("confirm_password").
            locatedBy("//input[@id=\"confirmPassword\"]");
    // Selecciona el check de terminos de uso
    public static final Target TERMS_OF_USE = Target.the("terms_of_use").
            locatedBy("//span[@class=\"checkmark signup-consent__checkbox error\"]");
    // Selecciona el check de privacidad y seguridad
    public static final Target TERMS_OF_PRIVACY = Target.the("terms_of_privacy").
            locatedBy("//span[@ng-class=\"{error: userForm.privacySetting.$error.required}\"]");

    // Selecciona boton complete setup
    public static final Target BTN_COMPLETE = Target.the("btn_complete").
            locatedBy("//a[@id=\"laddaBtn\"]");



}
