package com.amazon.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.amazon.ui.ProductDetails.TXT_ADD_CART;
import static com.amazon.ui.ProductDetails.TXT_GO_CART;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ClickToCart implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        TXT_ADD_CART.resolveFor(actor).click();
        WaitUntil.the(TXT_GO_CART, isVisible()).forNoMoreThan(8).seconds();
        TXT_GO_CART.resolveFor(actor).click();
    }

    public static Performable click(){
        return instrumented(ClickToCart.class);
    }
}
