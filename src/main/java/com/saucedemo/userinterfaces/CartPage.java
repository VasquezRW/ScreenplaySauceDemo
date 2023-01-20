package com.saucedemo.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CartPage extends PageObject{
    public static final By ITEM_TEXT = By.xpath("//div[contains(text(),'Sauce Labs Onesie')]");
    public static final Target CHECKOUT_BUTTON = Target.the("Checkout Button").locatedBy("//button[@id='checkout']");
    public static final Target REMOVE_ITEM = Target.the("Remove Item").locatedBy("//button[@id='remove-sauce-labs-bike-light']");
}