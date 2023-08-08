package com.amazon.ui;
/*
 * @(#) ProductDetails.java 11.0
 * Copyright 2023 SQA. Todos los derechos reservados.
 */

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

/**
 * @autor Rafael Chica
 * @Fecha: --o--
 */
public class ProductDetails {
    public static Target LBL_NAME_PRODUCT=Target.the("Product detail")
            .located(By.id("productTitle"));
}
