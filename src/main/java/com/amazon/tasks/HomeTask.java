package com.amazon.tasks;
/*
 * @(#) HomeTask.java 11.0
 * Copyright 2023 SQA. Todos los derechos reservados.
 */

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import static com.amazon.ui.HomeUI.TXT_SEARCH;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

/**
 * @autor Rafael Chica
 * @Fecha: --o--
 */
public class HomeTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(TXT_SEARCH, isVisible()).forNoMoreThan(30).seconds(),
                Enter.theValue("TV").into(TXT_SEARCH).thenHit(Keys.ENTER)
        );

    }

    public static HomeTask on(){
        return  instrumented(HomeTask.class);
    }
}
