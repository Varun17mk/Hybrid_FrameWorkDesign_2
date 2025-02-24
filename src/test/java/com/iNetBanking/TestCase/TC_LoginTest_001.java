package com.iNetBanking.TestCase;

import com.iNetBanking.PageObjects.LoginPage;
import org.testng.annotations.Test;

public class TC_LoginTest_001 extends BaseClass {

    @Test
    public void loginTest(){
        driver.get(URL);

        LoginPage lp = new LoginPage(driver);

    }
}
