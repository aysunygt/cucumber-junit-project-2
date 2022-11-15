package com.cydeo.step_definitions;

import com.cydeo.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {


    @After
    public void teardownScenario(Scenario scenario){
        //System.out.println("It will closing browser using cucumber @After each scenario");

   if (scenario.isFailed()) {
       byte[] screenShot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
       scenario.attach(screenShot, "image/png", scenario.getName());
   }



      Driver.closeDriver();


    }
    // @Before
    //  public void setupScenario(){
    //      System.out.println("setting up browser using cucumber @Before each scenario");
//
    //  }

    // @Before (value = "@login" , order = 2)
    // public void setupForLogin(){

//if you want any code to run before any specific feature/scenario,
    //you can use value = @tagname to determine this
    //  }


    //@BeforeStep (value = "@student")
  //  public void setupScenarioStep(){

   //     System.out.println("before step");




    }


