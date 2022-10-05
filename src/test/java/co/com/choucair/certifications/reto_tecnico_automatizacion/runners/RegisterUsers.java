package co.com.choucair.certifications.reto_tecnico_automatizacion.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/register_users.feature",
        glue = "co.com.choucair.certifications.reto_tecnico_automatizacion.stepdefinitions",
        tags = "@EscenarioPrincipal",
        snippets = SnippetType.CAMELCASE)

public class RegisterUsers {
}
