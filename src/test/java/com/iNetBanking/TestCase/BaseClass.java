package com.iNetBanking.TestCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
    public String URL = "https://demo.guru99.com/V1/index.php";
    public String userName = "mngr26593";
    public String passWord = "123Abc@";
    public WebDriver driver;

    @BeforeClass
    public void setUp(){
        driver= new ChromeDriver();
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}
