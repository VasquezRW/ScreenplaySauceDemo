package com.saucedemo.stepdefinitions;

import com.saucedemo.questions.LoginQuestion;
import com.saucedemo.tasks.LoginTask;
import com.saucedemo.userinterfaces.LoginPage;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class LoginDefinitions {
    private Actor wilmer;
    @Before
    public void setUp(){
        OnStage.setTheStage(new OnlineCast());
        wilmer = OnStage.theActorCalled("wilmer");
    }
    @Given("the user opens the website")
    public void theUserOpensTheWebsite() {
        wilmer.attemptsTo(
                LoginTask.openWeb()
        );
    }
    @When("the user types in {string} {string} and cick login")
    public void theUserTypesInAndCickLogin(String username, String password) {
        wilmer.attemptsTo(
                LoginTask.as(username, password)
        );
    }
    @Then("make sure the user is on the home page {string}")
    public void makeSureTheUserIsOnTheHomePage(String title) {
        wilmer.should(
                GivenWhenThen.seeThat(
                        LoginQuestion.isAtHomePage(title)
                )
        );
    }
}