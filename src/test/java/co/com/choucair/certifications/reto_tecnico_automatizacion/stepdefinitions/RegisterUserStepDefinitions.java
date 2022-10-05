package co.com.choucair.certifications.reto_tecnico_automatizacion.stepdefinitions;

import co.com.choucair.certifications.reto_tecnico_automatizacion.tasks.RegisterUser;
import co.com.choucair.certifications.reto_tecnico_automatizacion.userinterface.HomePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class RegisterUserStepDefinitions {

   @Managed(driver = "chrome")
    private WebDriver myBrowser;
    private final Actor actor =  Actor.named("Tester");
    private final HomePage homePage = new HomePage(); // Instanciamos la clse HomePage quien tiene la Url de la pagina


    @Given("^the user enters the main page and clicks the Join today button$")
    public void theUserEntersTheMainPageAndClicksTheJoinTodayButton() {
        actor.can(BrowseTheWeb.with(myBrowser));
        actor.wasAbleTo(Open.browserOn(homePage));
    }
    @When("^The user enters all the required data in the fields of the form$")
    public void theUserEntersAllTheRequiredDataInTheFieldsOfTheForm() {
        actor.attemptsTo(RegisterUser.makesInformation());
    }

    @Then("^The user sees theirs username$")
    public void theUserSeesTheirsUsername() {

    }
}
