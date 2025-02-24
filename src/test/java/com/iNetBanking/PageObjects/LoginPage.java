package com.iNetBanking.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    WebDriver driver;
    public LoginPage(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(name = "uid")
    WebElement userIdLocator;

    @FindBy(name = "password")
    WebElement passwordLocator;

    @FindBy(name = "btnLogin")
    WebElement LoginButtonLocator;

    public void setUsername(String Uname){
        userIdLocator.sendKeys(Uname);
    }

    public void setPassword(String Password){
        passwordLocator.sendKeys(Password);
    }

    public void clickLogin(){
        LoginButtonLocator.click();
    }

}
