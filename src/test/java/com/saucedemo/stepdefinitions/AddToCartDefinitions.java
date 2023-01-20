package com.saucedemo.stepdefinitions;

import com.saucedemo.questions.CheckItemQuestion;
import com.saucedemo.questions.LoginQuestion;
import com.saucedemo.tasks.AddItemsTask;
import com.saucedemo.tasks.OrderByTask;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class AddToCartDefinitions {
    private Actor wilmer;
    @Before
    public void setUp(){
        OnStage.setTheStage(new OnlineCast());
        wilmer = OnStage.theActorCalled("wilmer");
    }
    @Given("add two items to the cart")
    public void addItemsToTheCart() {
        wilmer.attemptsTo(
                AddItemsTask.addItems()
        );
    }
    @When("click on cart then remove one item from the cart")
    public void clickOnCartThenRemoveOneItemFromTheCart() {
        wilmer.attemptsTo(
                AddItemsTask.clickCartRemoveItem()
        );
    }
    @Then("validate that the item is in the cart {string}")
    public void validateThatTheItemIsInTheCart(String item_Text) {
        wilmer.should(
                GivenWhenThen.seeThat(
                        CheckItemQuestion.isInTheCart(item_Text)
                )
        );
    }
}
