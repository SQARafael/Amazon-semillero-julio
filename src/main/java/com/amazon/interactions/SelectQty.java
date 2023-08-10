package com.amazon.interactions;

import net.serenitybdd.core.pages.ListOfWebElementFacades;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;

import java.util.List;
import java.util.Random;

import static com.amazon.ui.ProductDetails.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SelectQty implements Interaction {

    public static int qty;

    @Override
    public <T extends Actor> void performAs(T actor) {
        TXT_QTY.resolveFor(actor).click();
        List<WebElementFacade> listQty = TXT_QTY_LIST.resolveAllFor(actor);
        Random random= new Random();
        int indexRandom= random.nextInt(listQty.size());
        qty = indexRandom + 1;
        listQty.get(indexRandom).click();
    }

    public static Performable clickQty(){
        return instrumented(SelectQty.class);
    }

}
