package com.saucedemo.questions;

import com.saucedemo.userinterfaces.HomePage;
import com.saucedemo.userinterfaces.LoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class LogoutQuestion implements Question<Boolean> {
    private final String validationText;
    public LogoutQuestion(String validationText){
        this.validationText = validationText;
    }
    @Override
    public Boolean answeredBy(Actor actor) {
        System.out.println(BrowseTheWeb.as(actor).find(LoginPage.LOGIN_BUTTON)
                .getTextValue().toUpperCase());
        return BrowseTheWeb.as(actor).find(LoginPage.LOGIN_BUTTON)
                .getTextValue().toUpperCase()
                .equals(validationText);
    }
    public static LogoutQuestion isAtLoginPage(String validationText){
        return new LogoutQuestion(validationText);
    }
}
