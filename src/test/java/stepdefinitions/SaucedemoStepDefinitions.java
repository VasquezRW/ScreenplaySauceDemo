package stepdefinitions;

import com.saucedemo.questions.SaucedemoValidacionQuestion;
import com.saucedemo.tasks.IngresarCredencialesTask;
import com.saucedemo.userinterfaces.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.annotations.CastMember;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;

public class SaucedemoStepDefinitions {
    @Managed(driver = "chrome")
    private WebDriver driver;
    @CastMember
    private Actor wilmer = Actor.named("Wilmer");
    private HomePage homePage = new HomePage();

    //OnStage.setTheStage(new OnlineCast());
    @Given("que el usuario ingrese a la pagina web")
    public void queElUsuarioIngreseALaPaginaWeb() {
        wilmer.can(BrowseTheWeb.with(driver));
        wilmer.wasAbleTo(Open.browserOn(homePage));
    }
    @When("el usuario ingrese las credenciales {string} {string} y presione ingresar")
    public void elUsuarioIngreseLasCredenciales(String username, String password) {
        wilmer.wasAbleTo(
                IngresarCredencialesTask.login(username, password)
        );
    }
    @Then("validamos que estemos en la pagina principal {string}")
    public void validamosQueEstemosEnLaPaginaPrincipal(String title) {
        theActorInTheSpotlight().should(
                seeThat("Title", SaucedemoValidacionQuestion.Value(),equalTo(title))
        );
    }

}