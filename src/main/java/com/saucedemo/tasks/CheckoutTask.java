package com.saucedemo.tasks;

import com.saucedemo.userinterfaces.CartPage;
import com.saucedemo.userinterfaces.CheckOutPage;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
public class CheckoutTask {
    public static Task clickOnCheckout() {
        return Task.where(
                Click.on(CartPage.CHECKOUT_BUTTON)
        );
    }
    public static Performable fillInformationThenHitContiueFinish(String firstName, String lastName, String zipCode) {
        return Task.where(
                Enter.theValue(firstName).into(CheckOutPage.INPUT_FIRSTNAME),
                Enter.theValue(lastName).into(CheckOutPage.INPUT_LASTNAME),
                Enter.theValue(zipCode).into(CheckOutPage.INPUT_ZIP).then(
                        Click.on(CheckOutPage.CONTINUE_BTN)).then(
                                Click.on(CheckOutPage.FINISH_BTN)
                )
        );
    }
}
