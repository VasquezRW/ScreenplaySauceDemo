package com.saucedemo.tasks;

import com.saucedemo.userinterfaces.LogOutPage;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
public class LogoutTask {
    public static Task clickOnMenu() {
        return Task.where(
                Click.on(LogOutPage.MENU_BUTTON)
        );
    }
    public static Task clickOnLogout() {
        return Task.where(
                Click.on(LogOutPage.LOGOUT_BUTTON)
        );
    }
}
