package com.co.choucair.stepdefinitions;

import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.webdriver.SerenityWebdriverManager;
import org.junit.After;
import org.junit.Before;

import static java.sql.DriverManager.getDriver;

public class Hooks {
    @Before
    public void  SetThestage() {
        OnStage.setTheStage(new OnlineCast());
    }
    @After
    public void close(){
           getDriver().close();

        }

    private Hooks getDriver() {
        return null;
    }
}