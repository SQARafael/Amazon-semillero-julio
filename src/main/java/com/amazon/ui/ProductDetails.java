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
    public static Target TXT_QTY=Target.the("Product quantity")
            .locatedBy("//div[@class='a-row a-spacing-base']/*/span[@class='a-dropdown-container']");

    public static Target TXT_QTY_LIST=Target.the("List of qty")
            .locatedBy("//select[@id='quantity']/option");


    public static Target TXT_ADD_CART=Target.the("Add product to cart")
            .locatedBy("//span[@class='a-button-inner']//input[@id='add-to-cart-button']");

    public static Target TXT_GO_CART=Target.the("Add product to cart")
            .locatedBy("//span[@id='attach-sidesheet-view-cart-button']/*/input[@class='a-button-input']");

}
