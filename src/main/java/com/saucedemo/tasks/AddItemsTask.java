package com.saucedemo.tasks;

import com.saucedemo.userinterfaces.CartPage;
import com.saucedemo.userinterfaces.HomePage;
import com.saucedemo.userinterfaces.ItemPage;
import com.saucedemo.userinterfaces.LoginPage;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class AddItemsTask {
    public static Task addItems() {
        return Task.where(
                Click.on(HomePage.ITEM_1),
                Click.on(HomePage.ITEM_2_TXT),
                Click.on(ItemPage.ITEM_2)
        );
    }
    public static Task clickCartRemoveItem() {
        return Task.where(
                Click.on(ItemPage.CART_BUTTON),
                Click.on(CartPage.REMOVE_ITEM)
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