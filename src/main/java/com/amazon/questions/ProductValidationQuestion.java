package com.amazon.questions;
/*
 * @(#) ProductValidation.java 11.0
 * Copyright 2023 SQA. Todos los derechos reservados.
 */

import com.amazon.utils.Data;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.amazon.ui.HomeUI.TXT_SEARCH;
import static com.amazon.ui.ProductDetails.LBL_NAME_PRODUCT;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

/**
 * @autor Rafael Chica
 * @Fecha: --o--
 */
public class ProductValidationQuestion implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        WebElementFacade nameProduct = LBL_NAME_PRODUCT.resolveFor(actor);
        WaitUntil.the(LBL_NAME_PRODUCT, isVisible()).forNoMoreThan(30).seconds();
        String x = Data.extractTo().get(0).get("Validation").toString();
        String y = nameProduct.getText();
        return Data.extractTo().get(0).get("Validation").toString().contains(nameProduct.getText());
    }

    public static Question<Boolean> from(){
        return new ProductValidationQuestion();
    }
}
