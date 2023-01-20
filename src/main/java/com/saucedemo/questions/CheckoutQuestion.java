package com.saucedemo.questions;

import com.saucedemo.userinterfaces.CartPage;
import com.saucedemo.userinterfaces.CheckOutPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class CheckoutQuestion implements Question<Boolean> {
    private final String validationText;
    public CheckoutQuestion(String validationText){
        this.validationText = validationText;
    }
    @Override
    public Boolean answeredBy(Actor actor) {
        return BrowseTheWeb.as(actor).find(CheckOutPage.TITLE_HP)
                .getText()
                .equals(validationText);
    }
    public static CheckoutQuestion checkoutComplete(String validationText){
        return new CheckoutQuestion(validationText);
    }
}
