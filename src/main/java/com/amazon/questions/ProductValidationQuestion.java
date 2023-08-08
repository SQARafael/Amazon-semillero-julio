package com.amazon.questions;
/*
 * @(#) ProductValidation.java 11.0
 * Copyright 2023 SQA. Todos los derechos reservados.
 */

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.amazon.ui.ProductDetails.LBL_NAME_PRODUCT;

/**
 * @autor Rafael Chica
 * @Fecha: --o--
 */
public class ProductValidationQuestion implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        WebElementFacade nameProduct = LBL_NAME_PRODUCT.resolveFor(actor);

        return nameProduct.isDisplayed();
    }

    public static Question<Boolean> from(){
        return new ProductValidationQuestion();
    }
}
