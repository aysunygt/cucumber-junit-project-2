package com.cydeo.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EatingCucumber {
    @Given("John is hungry")
    public void john_is_hungry() {
        System.out.println("it is Given");

    }
    @When("he eats some cucumber")
    public void he_eats_some_cucumber() {
        System.out.println("it is When");
    }
    @Then("he will be full")
    public void he_will_be_full() {
        System.out.println("it is Then");
    }
}
