package com.vytrack.step_definitions;


import com.vytrack.pages.ContactsPage;
import com.vytrack.pages.LoginPage;
import com.vytrack.pages.ViewContactPage;
import com.vytrack.utilities.BrowserUtils;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

import java.util.Map;

public class ContactStepDefs {

    @When("I click on customer with email {string}")
    public void i_click_on_customer_with_email(String email) {
        ContactsPage contactsPage = new ContactsPage();
        contactsPage.waitForUIOverlay();
        contactsPage.getUserRow(email).click();
    }

    @Then("customer email should be {string} in the account page")
    public void customer_email_should_be_in_the_account_page(String expectedEmail) {
        String actual = new ViewContactPage().email.getText();
        Assert.assertEquals("Customer email did not match", expectedEmail, actual);
    }
    @Given("I login using these credentials")
    public void i_login_using_these_credentials(Map<String, String> loginInfo) {
        System.out.println(loginInfo);
        String username = loginInfo.get("Yourusername");
        String password = loginInfo.get("Yourpassword");
        System.out.println("username = "+ username);
        System.out.println("password = "+ password);
        new LoginPage().login(username,password);

    }


}