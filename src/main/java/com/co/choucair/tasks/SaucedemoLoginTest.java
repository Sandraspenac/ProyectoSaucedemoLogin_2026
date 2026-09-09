package com.co.choucair.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;


public class SaucedemoLoginTest implements Task {
    private final String username;

    private final String password;



    public SaucedemoLoginTest(String username, String password) {

        this.username = username;

        this.password = password;

    }


    public static SaucedemoLoginTest conCredenciales(String username, String password)
    {
        return instrumented(

                SaucedemoLoginTest.class,

                username,

                password

        );

    }

    @Override

        public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(

                Enter.theValue("standard_user").into("#user-name"),

                Enter.theValue("secret_sauce").into("#password"),

                Click.on("#login-button")

        );

    }

}