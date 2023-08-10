package com.amazon.tasks;

import com.amazon.interactions.ClickToCart;
import com.amazon.interactions.SelectQty;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ProductDetailsTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SelectQty.clickQty(),
                ClickToCart.click()
        );
    }

    public static ProductDetailsTask on(){
        return instrumented(ProductDetailsTask.class);
    }
}
