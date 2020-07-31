package com.hiver.qa.pages;

import com.hiver.qa.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class GmailDashboardPage extends TestBase {



    Select drop = new Select(driver.findElement(By.className("hiver-accounts-dropdown")));

    WebElement dropSetting = drop.selectByVisibleText("Admin Panel");




}
