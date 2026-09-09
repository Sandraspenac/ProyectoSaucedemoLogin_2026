import io.cucumber.datatable.DataTable;

import java.util.Map;

public class SaucedemoLoginTest {

    private String user;

    private String pass;

// Constructor

    public SaucedemoLoginTest(String user, String pass) {

        this.user = user;

        this.pass = pass;

    }

// Método para obtener los datos del DataTable

    public static SaucedemoLoginTest setData(DataTable dataTable) {

        Map<String, String> row =

        dataTable.asMaps(String.class, String.class).get(0);

        return new SaucedemoLoginTest(

                row.get("user"),

                row.get("pass")

        );

    }

// Getters y Setters

    public String getUser() {

        return user;

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