package com.co.choucair.stepdefinitions;
import com.co.choucair.questions.DashboardTitle;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;

import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;


import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

public class SaucedemoLoginTestStepDefinitions {

    public Object SaucedemoLoginTest;

    public SaucedemoLoginTestStepDefinitions(Object saucedemoLoginTest) {
        SaucedemoLoginTest = saucedemoLoginTest;
    }

    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorInTheSpotlight().should(
                seeThat(DashboardTitle.value(), equalTo("Swag Labs"))
        );
    }

    @Given("Valida el login de usuario")
    public void valida_el_login_de_usuario() {
        OnStage.theActorCalled("Usuario").wasAbleTo(
                net.serenitybdd.screenplay.actions.Open.url("https://www.saucedemo.com/")
        );
    }

    @When("Usuario se autentica")
    public void usuarioSeAutentica(DataTable dataTable) {

        List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
        Map<String, String> row = data.get(0);

        String user = row.get("user");
        String pass = row.get("pass");
        
                System.out.println(user);
                System.out.println(pass);

        OnStage.theActorInTheSpotlight().attemptsTo(
                SaucedemoLoginTest.clone(user, pass)

        );
    }


    @Then("Valida el titulo  Swag Labs Products")
    public void valida_el_titulo_swag_labs_products(String expectedText) {
        OnStage.theActorInTheSpotlight().should(
                seeThat(DashboardTitle.value(), equalTo(expectedText))
        );
    }
}

