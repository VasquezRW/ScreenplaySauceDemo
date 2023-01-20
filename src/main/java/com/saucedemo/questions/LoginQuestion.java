package com.saucedemo.questions;

import com.saucedemo.userinterfaces.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class LoginQuestion implements Question<Boolean> {
    private final String validationText;
    public LoginQuestion(String validationText){
        this.validationText = validationText;
    }
    @Override
    public Boolean answeredBy(Actor actor) {
        return BrowseTheWeb.as(actor).find(HomePage.TITLE)
                .getText()
                .equals(validationText);
    }
    public static LoginQuestion isAtHomePage(String validationText){
        return new LoginQuestion(validationText);
    }
}
