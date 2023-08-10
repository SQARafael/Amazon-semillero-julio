package com.amazon.ui;

import net.serenitybdd.screenplay.targets.Target;

public class CartSecondUI {
    public static Target TXT_GO_CART_SEC=Target.the("Go to cart")
            .locatedBy("//a[@href='/-/es/cart?ref_=sw_gtc']");
}
