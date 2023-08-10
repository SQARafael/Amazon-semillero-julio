package com.amazon.stepDefinitions;
/*
 * @(#) AddProductToCartStepDef.java 11.0
 * Copyright 2023 SQA. Todos los derechos reservados.
 */

import com.amazon.questions.ProductValidationQuestion;
import com.amazon.tasks.HomeTask;
import com.amazon.tasks.ProductDetailsTask;
import com.amazon.tasks.ProductsCatalogTask;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;

/**
 * @autor Rafael Chica
 * @Fecha: --o--
 */
public class AddProductToCartStepDef {
    @Before
    public void setStage(){
        setTheStage(new OnlineCast());
    }

    @Given("that user open page Amazon and search any product")
    public void thatUserOpenPageAmazonAndSearchAnyProduct() {
        theActorCalled("User").wasAbleTo(
                Open.url("https://www.amazon.com/"),
                HomeTask.on()
        );

    }
    @When("user click  on  product tittle and user click on add to cart")
    public void userClickOnProductTittleAndUserClickOnAddToCart() {
        theActorInTheSpotlight().attemptsTo(
                ProductsCatalogTask.on(),
                ProductDetailsTask.on()
        );

    }
    @Then("user can read the product name from excel")
    public void userCanReadTheProductNameFromExcel() {
        theActorInTheSpotlight().should(
                seeThat(
                        ProductValidationQuestion.from(), Matchers.equalTo(true)
                )
        );

    }
}
