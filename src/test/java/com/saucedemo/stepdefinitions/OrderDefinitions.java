package com.saucedemo.stepdefinitions;

import com.saucedemo.tasks.LoginTask;
import com.saucedemo.tasks.OrderByTask;
import com.saucedemo.tasks.CheckoutTask;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class OrderDefinitions {
    private Actor wilmer;
    @Before
    public void setUp(){
        OnStage.setTheStage(new OnlineCast());
        wilmer = OnStage.theActorCalled("wilmer");
    }
    @Given("the user click on the dropdown button")
    public void theUserClickOnTheDropdownButton() {
        wilmer.attemptsTo(
                OrderByTask.clickDropDown()
        );
    }
    @When("click on {string}")
    public void clickOn(String string) {
        wilmer.attemptsTo(
                OrderByTask.clickOption(string)
        );
    }
    @Then("validate the items are ordered correctly")
    public void validateTheItemsAreOrderedCorrectly() {
        System.out.println("PENDING IMPLEMENTATION");
    }
}