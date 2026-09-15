package com.co.choucair.tasks;

import com.co.choucair.models.UserLoombokData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;


import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class SauceLogin extends Tasks   {
    private static final String TXT_USER = "standard_user" ;
    private static final String TXT_PASSWORD = "standard_user";
    private final UserLoombokData userLoombokData;


    public static Performable login() {
        return null;
    }

    public SauceLogin(UserLoombokData userLoombokData) {
        this.userLoombokData = userLoombokData;
    }



    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(

                WaitUntil.the(TXT_USER, isVisible())
                        .forNoMoreThan(30).seconds(),
                Enter.theValue(userLoombokData.getUser())
                        .into(TXT_USER),

                WaitUntil.the(TXT_PASSWORD, isVisible())
                        .forNoMoreThan(30).seconds()



        );

    }
}
