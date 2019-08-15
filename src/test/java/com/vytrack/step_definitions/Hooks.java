package com.vytrack.step_definitions;

import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.Driver;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.util.concurrent.TimeUnit;

public class Hooks {

    @Before("@database")
    public void setUpDBCon(){
        System.out.println("Setting up DB connection");
    }
    @Before
    public void setUp(){
        System.out.println("Before hooks");
        Driver.get().get(ConfigurationReader.get("url"));
        Driver.get().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
    @After
    public void tearDown(Scenario scenario){
        System.out.println("After hooks");

        if (scenario.isFailed()){
            //take a screenshot
            final byte [] screenshot = ((TakesScreenshot)
                    Driver.get()).getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenshot, "image/png");
        }
        Driver.closeDriver();

    }
    @After("@database")
    public void tearDownConectoin(){
        System.out.println("Closing DB connection");
    }


}
