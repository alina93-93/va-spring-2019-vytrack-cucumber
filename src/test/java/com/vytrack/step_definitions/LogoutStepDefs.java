package com.vytrack.step_definitions;

import com.vytrack.pages.DashboardPage;
import com.vytrack.pages.LoginPage;
import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.Driver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

import java.sql.SQLOutput;

public class LogoutStepDefs {

    @Given("I login as a {string}")
    public void i_login_as_a(String userType) {

        System.out.println(userType);
        String username = null;
        String password = null;
        if (userType.equals("driver")){
            username = ConfigurationReader.get("driver_username");
            password = ConfigurationReader.get("driver_password");
        }else if (userType.equals("sales manager")){
            username = ConfigurationReader.get("salesmanager_username");
            password = ConfigurationReader.get("salesmanager_password");
        }else if (userType.equals("store manager")){
            username = ConfigurationReader.get("storemanager_username");
            password = ConfigurationReader.get("storemanager_password");
        }
        System.out.println("username: "+username);
        System.out.println("password: "+password);
        new LoginPage().login(username,password);
    }
    @When("I logout")
    public void i_logOut(){
                new DashboardPage().logOut();
    }

    @Then("the page title should be {string}")
    public void thePageTitleShouldBe(String expectedTitle) {
        String actual = Driver.get().getTitle();
        Assert.assertEquals(expectedTitle, actual);
    }
}
