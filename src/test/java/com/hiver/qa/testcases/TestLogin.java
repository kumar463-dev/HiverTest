package com.hiver.qa.testcases;

import com.hiver.qa.base.TestBase;
import com.hiver.qa.pages.HiverDashboardPage;
import com.hiver.qa.pages.LoginPage;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestLogin extends TestBase {

    LoginPage loginPage;

    public TestLogin(){
        super();
    }


    @BeforeMethod
    public void setup(){
        initialization();
        loginPage = new LoginPage();

    }

    @Test
    public  void adminViaDropDown() {
        Select drop = new Select(authorityDropdown);
        drop.selectByIndex(1);
    }

    @Test
    public void navigateHiverDashboard(){
        HiverDashboardPage hiverDashboard = new HiverDashboardPage();
        hiverDashboard.clickSharedMailbox();
        hiverDashboard.clickAutoResponder();
        hiverDashboard.enterData();
        String text= hiverDashboard.validateData();
        Assert.assertEquals(text,"Auto Responder text edited");

    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
