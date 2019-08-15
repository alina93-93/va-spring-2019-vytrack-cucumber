package com.vytrack.step_definitions;

import com.vytrack.pages.DashboardPage;
import com.vytrack.pages.VehiclesPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class NavigationMenuStepDefs {
    @When("I navigate to {string} {string}")
    public void i_navigate_to(String tab, String module) {
        System.out.println("tab is: "+tab);
        System.out.println("module is : "+module);

        new DashboardPage().selectMenuOption(tab,module);
    }

    @Then("default page number shoud be {int}")
    public void default_page_number_shoud_be(Integer int1) {
        System.out.println("int1: "+int1);
        String value = new VehiclesPage().pageCount.getAttribute("value");
        Integer actualPageNumber = Integer.parseInt(value);
        Assert.assertEquals(int1, actualPageNumber);
    }
    }
