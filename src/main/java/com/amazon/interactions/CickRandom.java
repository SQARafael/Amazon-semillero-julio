package com.amazon.interactions;
/*
 * @(#) CickRandom.java 11.0
 * Copyright 2023 SQA. Todos los derechos reservados.
 */

import com.amazon.utils.EscrituraExcel;
import lombok.Data;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;

import java.util.List;
import java.util.Random;

import static com.amazon.ui.ProductsCatalogUI.LBL_NAME_PRODUCTS;
import static net.serenitybdd.screenplay.Tasks.instrumented;

/**
 * @autor Rafael Chica
 * @Fecha: --o--
 */
public class CickRandom implements Interaction {
    private WebElementFacade element;

    @Override
    public <T extends Actor> void performAs(T actor) {
        List<WebElementFacade> listProducts = LBL_NAME_PRODUCTS.resolveAllFor(actor);
        Random random= new Random();
        int indexRandom= random.nextInt(listProducts.size());
        element=listProducts.get(indexRandom);

        EscrituraExcel.escrituraExcel(
                "src/main/resources/Data/Data.xlsx",
                listProducts.get(indexRandom).getText(),1,1);

        listProducts.get(indexRandom).click();
        
    }

    public static Performable click(){
        return instrumented(CickRandom.class);
    }
}
