package com.saucedemo.tasks;

import com.saucedemo.userinterfaces.LoginPage;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;

public class LoginTask {
    public static Task openWeb() {
        return Task.where(
                Open.url("https://www.saucedemo.com")
        );
    }
    public static Performable as(String user, String password) {
        return Task.where(
                Enter.theValue(user).into(LoginPage.USERNAME),
                Enter.theValue(password).into(LoginPage.PASSWORD).then(
                        Click.on(LoginPage.LOGIN_BUTTON))
        );
    }
}