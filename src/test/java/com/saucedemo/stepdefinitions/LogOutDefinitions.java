package com.saucedemo.stepdefinitions;

import com.saucedemo.questions.CheckoutQuestion;
import com.saucedemo.questions.LogoutQuestion;
import com.saucedemo.tasks.CheckoutTask;
import com.saucedemo.tasks.LogoutTask;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class LogOutDefinitions {
    private Actor wilmer;
    @Before
    public void setUp(){
        OnStage.setTheStage(new OnlineCast());
        wilmer = OnStage.theActorCalled("wilmer");
    }
    @Given("click on the menu")
    public void clickOnTheMenu() {
        wilmer.attemptsTo(
                LogoutTask.clickOnMenu()
        );
    }
    @When("click on logout")
    public void clickOnLogout() {
        wilmer.attemptsTo(
                LogoutTask.clickOnLogout()
        );
    }
    @Then("validate that we are at the login page {string}")
    public void validateThatWeAreAtTheLoginPage(String loginText) {
        wilmer.should(
                GivenWhenThen.seeThat(
                        LogoutQuestion.isAtLoginPage(loginText)
                )
        );
    }


}
