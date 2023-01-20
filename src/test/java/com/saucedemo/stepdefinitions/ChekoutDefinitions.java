package com.saucedemo.stepdefinitions;

import com.saucedemo.questions.CheckItemQuestion;
import com.saucedemo.questions.CheckoutQuestion;
import com.saucedemo.tasks.AddItemsTask;
import com.saucedemo.tasks.CheckoutTask;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class ChekoutDefinitions {
    private Actor wilmer;
    @Before
    public void setUp(){
        OnStage.setTheStage(new OnlineCast());
        wilmer = OnStage.theActorCalled("wilmer");
    }
    @Given("click on the checkout button")
    public void clickOnTheCheckoutButton() {
        wilmer.attemptsTo(
                CheckoutTask.clickOnCheckout()
        );
    }
    @When("put in the fields the information {string} {string} {string} then click continue and finish")
    public void putInTheFieldsTheInformationThenClickContinueAndFinish(String firstName, String lastName, String zipCode) {
        wilmer.attemptsTo(
                CheckoutTask.fillInformationThenHitContiueFinish(firstName, lastName, zipCode)
        );
    }
    @Then("make sure we are on the checkout page {string}")
    public void makeSureWeAreOnTheCheckoutPage(String title) {
        wilmer.should(
                GivenWhenThen.seeThat(
                        CheckoutQuestion.checkoutComplete(title)
                )
        );
    }

}
