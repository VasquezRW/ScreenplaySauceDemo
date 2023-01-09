package com.saucedemo.questions;

import com.saucedemo.userinterfaces.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.By;

public class SaucedemoValidacionQuestion implements Question <String> {
    public static Question<String> Value(){
        return new SaucedemoValidacionQuestion();
    }

    @Override
    public String answeredBy(Actor actor) {
        return BrowseTheWeb.as(actor).find(By.xpath("//span[@class='title']")).getText();
    }
}
