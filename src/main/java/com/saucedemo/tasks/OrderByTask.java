package com.saucedemo.tasks;

import com.saucedemo.userinterfaces.HomePage;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
public class OrderByTask {
    public static Task clickDropDown() {
        return Task.where(
                Click.on(HomePage.DROP_DOWN)
        );
    }
    public static Performable clickOption(String option) {
        return Task.where(
                Click.on(HomePage.ORDER_OPTION)
        );
    }
}