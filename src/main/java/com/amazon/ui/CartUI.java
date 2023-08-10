package com.amazon.ui;

import net.serenitybdd.screenplay.targets.Target;

public class CartUI {

    public static Target LBL_NAME_PRODUCT=Target.the("Product title in cart")
        .locatedBy("//span[@class='a-truncate-cut']");

    public static Target TXT_QTY=Target.the("Products quantity in cart")
            .locatedBy("//span[@id='a-autoid-0-announce']/span[@class='a-dropdown-prompt']");

}
