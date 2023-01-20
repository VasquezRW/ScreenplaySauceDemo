package com.saucedemo.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomePage {
    public static final By TITLE = By.xpath("//span[@class='title']");
    public static final Target DROP_DOWN = Target.the("Boton ordenar").locatedBy("//select[@class='product_sort_container']");
    public static final Target ORDER_OPTION = Target.the("OPTION").locatedBy("//option[@value='lohi']");
    public static final Target ITEM_1 = Target.the("Primer Item").locatedBy("//button[@id='add-to-cart-sauce-labs-onesie']");
    public static final Target ITEM_2_TXT = Target.the("Boton titulo 2ndo item").locatedBy("//a[@id='item_0_title_link']");
}
