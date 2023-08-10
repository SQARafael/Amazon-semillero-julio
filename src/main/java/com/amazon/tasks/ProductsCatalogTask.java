package com.amazon.tasks;
/*
 * @(#) ProductsCollectionsTask.java 11.0
 * Copyright 2023 SQA. Todos los derechos reservados.
 */

import com.amazon.interactions.CickRandom;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

/**
 * @autor Rafael Chica
 * @Fecha: --o--
 */
public class ProductsCatalogTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                CickRandom.click()
        );
    }

    public static ProductsCatalogTask on(){
        return instrumented(ProductsCatalogTask.class);
    }
}
