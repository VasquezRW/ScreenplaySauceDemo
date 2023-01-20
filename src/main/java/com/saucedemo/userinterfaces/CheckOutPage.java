package com.saucedemo.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CheckOutPage extends PageObject {
    public static final By TITLE_HP = By.xpath("//span[@class='title']");

    public static final Target INPUT_FIRSTNAME = Target.the("Primer Nombre").locatedBy("//input[@id='first-name']");
    public static final Target INPUT_LASTNAME = Target.the("Apellido").locatedBy("//input[@id='last-name']");
    public static final Target INPUT_ZIP = Target.the("Apellido").locatedBy("//input[@id='postal-code']");
    public static final Target CONTINUE_BTN = Target.the("Boton Continue").locatedBy("//input[@id='continue']");
    public static final Target FINISH_BTN = Target.the("Boton Finish").locatedBy("//button[@id='finish']");

}