package com.cydeo.step_definitions;

import com.cydeo.pages.BasePage;
import com.cydeo.pages.ViewOrderPage;
import com.cydeo.pages.WebTableLoginPage;
import com.cydeo.pages.WebTableOrderPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class WebTableOrder_StepDefinition {
WebTableLoginPage webTableLoginPage = new WebTableLoginPage();
BasePage basePage = new BasePage();
WebTableOrderPage webTableOrderPage = new WebTableOrderPage();
    Select select;
    ViewOrderPage viewOrderPage = new ViewOrderPage();
    @Given("user is already logged in and on order page")
    public void user_is_already_logged_in_and_on_order_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
        webTableLoginPage.login(ConfigurationReader.getProperty("username"),ConfigurationReader.getProperty("password"));
basePage.ordersButton.click();

    }
    @When("user selects product type {string}")
    public void user_selects_product_type(String string) {
        select = new Select(webTableOrderPage.productTypeDropdown);
        select.selectByVisibleText(string);
    }

    @Then("user enters quantity {int}")
    public void user_enters_quantity_2(Integer int1) {
    // webTableOrderPage.inputQuantity.clear();
webTableOrderPage.inputQuantity.sendKeys(Keys.BACK_SPACE);
     //webTableOrderPage.inputQuantity.sendKeys(String.valueOf(int1));
     webTableOrderPage.inputQuantity.sendKeys(int1 + "");

    }
    @Then("user enters customer name {string}")
    public void user_enters_customer_name(String string) {
webTableOrderPage.inputname.sendKeys(string);
    }
    @Then("user enters street {string}")
    public void user_enters_street(String string) {
webTableOrderPage.inputStreet.sendKeys(string);
    }
    @Then("user enters city {string}")
    public void user_enters_city(String string) {
webTableOrderPage.inputCity.sendKeys(string);
    }
    @Then("user enters state {string}")
    public void user_enters_state(String string) {
webTableOrderPage.inputState.sendKeys(string);
    }
    @Then("user enters zipcode {string}")
    public void user_enters_zipcode(String string) {
webTableOrderPage.inputZip.sendKeys(string);
    }
    @Then("user selects credit card type {string}")
    public void user_selects_credit_card_type(String string) {
//        for (WebElement each : webTableOrderPage.cardType) {
//            if(each.getAttribute("value").equalsIgnoreCase(string)){
//                each.click();
//            }
//        }
        BrowserUtils.clickRadioButton(webTableOrderPage.cardType,string);

    }
    @Then("user enters card card number {string}")
    public void user_enters_card_card_number(String string) {
webTableOrderPage.inputCardNo.sendKeys(string);
    }
    @Then("user enters expiry date {string}")
    public void user_enters_expiry_date(String string) {
webTableOrderPage.inputExpireDate.sendKeys(string);
    }
    @Then("user enters process order button")
    public void user_enters_process_order_button() {
     webTableOrderPage.processOrderButton.click();
    }
    @Then("user should see {string} in first row of the web table")
    public void user_should_see_in_first_row_of_the_web_table(String expectedCostumerName) {
String actualCostumerName = viewOrderPage.newCustomerCell.getText();
        Assert.assertEquals(expectedCostumerName,actualCostumerName);

    }
    @When("user enters quantity {string}")
    public void user_enters_quantity(String string) {
        webTableOrderPage.inputQuantity.sendKeys(Keys.BACK_SPACE);
        //webTableOrderPage.inputQuantity.sendKeys(String.valueOf(int1));
        webTableOrderPage.inputQuantity.sendKeys(string + "");

    }

}
