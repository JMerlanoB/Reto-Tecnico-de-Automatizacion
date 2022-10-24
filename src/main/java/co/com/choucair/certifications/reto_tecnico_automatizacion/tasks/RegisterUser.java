package co.com.choucair.certifications.reto_tecnico_automatizacion.tasks;

import co.com.choucair.certifications.reto_tecnico_automatizacion.userinterface.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import org.openqa.selenium.Keys;

import static net.serenitybdd.screenplay.Tasks.instrumented;



public class RegisterUser implements Task {
    // Acciones
    @Override
    public <T extends Actor> void performAs(T actor) {
        // Tereas a realizar por el actor
        actor.attemptsTo(
        Click.on(HomePage.REGISTER),
                SendKeys.of("Jonh").into(Personal.FIRSTNAME),
                SendKeys.of("Doe").into(Personal.LASTNAME),
                SendKeys.of("example@mail.com").into(Personal.EMAIL),
                SendKeys.of("March").into(Personal.BIRTHMONTH),
                SendKeys.of("15").into(Personal.BIRTHDAY),
                SendKeys.of("1999").into(Personal.BIRTHYEAR),
                Click.on(Personal.LANGUAGE),
                Enter.theValue("Spanish").into(Personal.LANGUAGE).thenHit(Keys.ENTER),
                Click.on(Personal.BTN_NEXTLOCATION),

                // Pagina de Address
                SendKeys.of("Barranquilla").into(Address.CITY),
                Hit.the(Keys.ARROW_DOWN).into(Address.CITY),
                Hit.the(Keys.ENTER).into(Address.CITY),
                SendKeys.of("110011").into(Address.ZIP),
                Click.on(Address.COUNTRY),
                Click.on(Address.BTN_NEXTDEVICE),

                // Página de Device
                Click.on(Devices.COMPUTER),
                Click.on(Devices.OS),
                Click.on(Devices.VERSION),
                Click.on(Devices.OS_VERSION),
                Click.on(Devices.LANGUAGE),
                Click.on(Devices.CHOSEN_LANGUAGE),
                Click.on(Devices.MOBILE_DEVICE),
                Click.on(Devices.CHOSEN_DEVICE),
                Click.on(Devices.MODEL),
                Click.on(Devices.CHOSEN_MODEL_DEVICE),
                Click.on(Devices.OPERATING_SYSTEM),
                Click.on(Devices.CHOSEN_OPERATING_SYSTEM),
                Click.on(Devices.BTN_LAST_STEP),

                // Pagina de Complete
                SendKeys.of("1An1f5&#M6ngse").into(Complete.PASSWORD),
                SendKeys.of("1An1f5&#M6ngse").into(Complete.CONFIRM_PASSWORD),
                Click.on(Complete.TERMS_OF_USE),
                Click.on(Complete.TERMS_OF_PRIVACY),
                Click.on(Complete.BTN_COMPLETE)


        );
    }

    public static RegisterUser makesInformation(){
        return instrumented(RegisterUser.class);
    }
}
