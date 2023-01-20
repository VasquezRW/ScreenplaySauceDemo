package com.saucedemo.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class ItemPage extends PageObject  {
    public static final Target ITEM_2 = Target.the("Segundo Item").locatedBy("//button[@id='add-to-cart-sauce-labs-bike-light']");
    public static final Target CART_BUTTON = Target.the("Boton Carrito").locatedBy("//a[@class='shopping_cart_link']");

}
