package com.saucedemo.questions;

import com.saucedemo.userinterfaces.CartPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class CheckItemQuestion implements Question<Boolean> {
    private final String validationText;
    public CheckItemQuestion(String validationText){
        this.validationText = validationText;
    }
    @Override
    public Boolean answeredBy(Actor actor) {
        return BrowseTheWeb.as(actor).find(CartPage.ITEM_TEXT)
                .getText()
                .equals(validationText);
    }
    public static CheckItemQuestion isInTheCart(String validationText){
        return new CheckItemQuestion(validationText);
    }
}
