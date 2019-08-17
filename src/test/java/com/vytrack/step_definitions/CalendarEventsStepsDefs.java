package com.vytrack.step_definitions;


import com.vytrack.pages.CalendarEventsPage;
import com.vytrack.utilities.BrowserUtils;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;
public class CalendarEventsStepsDefs {
    @When("I click on the View per page dropdown")
    public void i_click_on_the_View_per_page_dropdown() {
        CalendarEventsPage calendarEventsPage = new CalendarEventsPage();
        calendarEventsPage.waitForUIOverlay();
        calendarEventsPage.viewPerPageDropDown.click();
    }
    @Then("follow view per page options should be visible")
    public void follow_view_per_page_options_should_be_visible(List<String> expectedOptions) {
        System.out.println(expectedOptions);
        for (String expectedOption : expectedOptions) {
            System.out.println(expectedOption);
        }
        CalendarEventsPage calendarEventsPage = new CalendarEventsPage();
        List<String> actualOptions = BrowserUtils.getElementsText(calendarEventsPage.gridHeaders);
        Assert.assertEquals(expectedOptions,actualOptions);
    }
    @Then("table should have the following headers")
    public void table_should_have_the_following_headers(List<String> expectedHeaders) {
        System.out.println("### EXPECTED DATA ###");
        System.out.println("ecpectedHeaders.size()=" + expectedHeaders.size());
        for (String expectedHeader : expectedHeaders) {
            System.out.println(expectedHeader);
        }

        System.out.println("### Actual DATA ###");
        CalendarEventsPage calendarEventsPage = new CalendarEventsPage();
        for (WebElement gridHeader : calendarEventsPage.gridHeaders) {
            System.out.println(gridHeader.getText());
        }

        System.out.println("### ACTUAL DATA after clean uo ###");
        List<String> actualHeaders = new ArrayList<>();
        for (WebElement gridHeader : calendarEventsPage.gridHeaders) {
            if (!gridHeader.getText().isEmpty()) {
                actualHeaders.add(gridHeader.getText());
            }

            System.out.println(actualHeaders);
            Assert.assertEquals(expectedHeaders, actualHeaders);
        }




    }

}

