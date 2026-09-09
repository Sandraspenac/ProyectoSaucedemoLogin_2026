package com.co.choucair.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SaucedemoLoginTest implements Task {

    private final String username;
    private final String password;

    // Constructor
    public SaucedemoLoginTest(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public static SaucedemoLoginTest conCredenciales(String username, String password) {
        return instrumented(SaucedemoLoginTest.class, username, password);
    }

    // Definición de los Targets
    public static final Target TXT_USER = Target.the("campo usuario")
            .located(By.id("#user-name//*[@id=\"login-button\"]"));
    public static final Target TXT_PASS = Target.the("campo contraseña")
            .located(By.id("//*[@id=\"password\"]"));
    public static final Target BTN_LOGIN = Target.the("botón login")
            .located(By.id("//*[@id=\"login-button\"]"));


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(u).into(TXT_USER),
                Enter.theValue(password).into(TXT_PASS),
                Click.on(BTN_LOGIN)
        );
    }
}


