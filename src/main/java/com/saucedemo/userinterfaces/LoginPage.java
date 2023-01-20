package com.saucedemo.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.saucedemo.com")
public class LoginPage extends PageObject {
    public static final Target USERNAME = Target.the("Boton ordenar").locatedBy("//input[@id='user-name']");
    public static final Target PASSWORD = Target.the("Boton ordenar").locatedBy("//input[@id='password']");
    public static final Target LOGIN_BUTTON = Target.the("Boton ordenar").locatedBy("//input[@id='login-button']");

}
