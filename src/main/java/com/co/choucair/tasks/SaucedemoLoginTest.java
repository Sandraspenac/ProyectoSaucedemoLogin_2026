package com.co.choucair.tasks;
import com.co.choucair.models.UserLoombokData;
import com.co.choucair.userinterfaces.SerenityLoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class SaucedemoLoginTest implements Task {

    private final UserLoombokData userLoombokData;

    public SaucedemoLoginTest(UserLoombokData userLoombokData) {

        this.userLoombokData = userLoombokData;
    }

    public static Performable SaucedemoLoginStep() {
        return SaucedemoLoginStep(null, null);
    }

    public static Performable SaucedemoLoginStep(String username, String password) {
        return null;
    }


    public <T extends Actor> void performAs() {
        performAs((T) null);
    }

    @Override

    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(

                WaitUntil.the(SerenityLoginPage.TXT_USER, isVisible())
                        .forNoMoreThan(30).seconds(),
                Enter.theValue(userLoombokData.getUser())
                        .into(SerenityLoginPage.TXT_USER),

                JavaScriptClick.on(SerenityLoginPage.BTN_SUBMIT),
                WaitUntil.the(SerenityLoginPage.TXT_VALIDATION, isVisible())

                        .forNoMoreThan(30).seconds()

        );

    }

}