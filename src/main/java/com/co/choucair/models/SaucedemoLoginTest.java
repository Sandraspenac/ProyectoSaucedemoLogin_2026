package com.co.choucair.models;
import io.cucumber.datatable.DataTable;

import java.util.List;
import java.util.Map;


public class SaucedemoLoginTest {

    private String user;

    private String pass;




    public static setData(DataTable dataTable){
        List<Map<String,String>> data = dataTable.asMaps(String.class, String.class);

        String user = data.get(0).get("user");
        String pass = data.get(0).get("pass");
            }


    public SaucedemoLoginTest() {

    }

    public SaucedemoLoginTest(String user, String pass) {

        this.user = user;

        this.pass = pass;

    }

    public String getUser() {

        return user;

    }

    public void setUser(String user) {

        this.user = user;

    }

    public String getPass() {

        return pass;

    }

    public void setPass(String pass) {

        this.pass = pass;

    }

}