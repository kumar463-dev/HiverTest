package com.hiver.qa.pages;

import com.hiver.qa.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends TestBase {

    @FindBy(xpath = "//input[@id='identifierId']")
    WebElement username;

    @FindBy(xpath= "//input[@name='password']")
    WebElement password;

    @FindBy(class="VfPpkd-RLmnJb")
    WebElement loginbtn;

    @FindBy(xpath= "//*[@id='hq-accounts-icon']")
    WebElement hiverIcon;


    public void GmailDashboardPage login(String un, String pwd){
        username.sendKeys(un);
        password.sendKeys(pwd);
        loginbtn.click();

        return new GmailDashboardPage();


        public LoginPage(){
            PageFactory.initElements(driver,this);
        }
    }

}
