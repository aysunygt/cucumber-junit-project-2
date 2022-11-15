package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WebTableLoginPage {

    public WebTableLoginPage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(name="username")
    public WebElement usernameBox;

    @FindBy(name="password")
    public WebElement passwordBox;

    @FindBy(xpath ="//button[@type='submit']")
    public WebElement loginButton;

    /**
     * this method will accept username and password and login to app
     * @param username
     * @param password
     */
    public void login(String username,String password){
        usernameBox.sendKeys(username);
        passwordBox.sendKeys(password);
        loginButton.click();



    }





}
