package co.com.choucair.certifications.reto_tecnico_automatizacion.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class Devices {

    // Selecciona el Campo Your Computer
    public static final Target COMPUTER = Target.the("computer").
            locatedBy("(//span[@class=\"btn btn-default form-control ui-select-toggle\"])[1]");
    // Elige el sistema operativo
    public static final Target OS = Target.the("os").
            locatedBy("(//span[@class=\"ui-select-choices-row-inner\"])[2]");
    // Selecciona el Campo version
    public static final Target VERSION = Target.the("version").
            locatedBy("(//span[@class=\"btn btn-default form-control ui-select-toggle\"])[2]");
    // Elige la version
    public static final Target OS_VERSION = Target.the("os_version").
            locatedBy("(//span[@class=\"ui-select-choices-row-inner\"])[2]");
    // Selecciona el campo idiomas
    public static final Target LANGUAGE = Target.the("language").
            locatedBy("(//span[@class=\"btn btn-default form-control ui-select-toggle\"])[3]");
    // Elige el Idioma
    public static final Target CHOSEN_LANGUAGE= Target.the("chosen_language").
            locatedBy("(//span[@class=\"ui-select-choices-row-inner\"])[38]");
    // Selecciona el Campo dispositivo movil
    public static final Target MOBILE_DEVICE = Target.the("mobile_device").
            locatedBy("(//span[@class=\"btn btn-default form-control ui-select-toggle\"])[4]");
    // Elige el Dispositivo movil
    public static final Target CHOSEN_DEVICE= Target.the("chosen_device").
            locatedBy("(//span[@class=\"ui-select-choices-row-inner\"])[3]");
    // Selecciona el Campo modelo de dispositivo
    public static final Target MODEL = Target.the("model").
            locatedBy("(//span[@class=\"btn btn-default form-control ui-select-toggle\"])[5]");
    // Elige el Modelo de dispositivo
    public static final Target CHOSEN_MODEL_DEVICE = Target.the("chosen_model_device").
            locatedBy("(//span[@class=\"ui-select-choices-row-inner\"])[1]");
    // Selecciona el Campo sistema operativo
    public static final Target OPERATING_SYSTEM = Target.the("chosen_operating_system").
            locatedBy("(//span[@class=\"btn btn-default form-control ui-select-toggle\"])[6]");
    // Elige el Sistema operativo
    public static final Target CHOSEN_OPERATING_SYSTEM= Target.the("chosen_os").
            locatedBy("(//span[@class=\"ui-select-choices-row-inner\"])[10]");
    // Selecciona el boton Last Step o Boton final
    public static final Target BTN_LAST_STEP= Target.the("btn_last_step").
            locatedBy("//a[@class=\"btn btn-blue pull-right\"]");

}
