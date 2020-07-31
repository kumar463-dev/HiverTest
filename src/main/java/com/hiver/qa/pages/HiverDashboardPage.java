package com.hiver.qa.pages;

import com.hiver.qa.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HiverDashboardPage extends TestBase {


    @FindBy(xpath = "//*[contains(href='/app/sharedmailbox')]")
    WebElement sharedMailbox;

    @FindBy(xpath = "//*[@class='h-tcell h-h3 ']")
    WebElement mailbox;

    @FindBy(xpath = "//*[@text,'Auto Responder']")
    WebElement autoResponder;

    @FindBy(dir="ltr")
    WebElement textBox;

    @FindBy(xpath="//*[@for='checkbox-default-3']")
    WebElement switchToggle;

    @FindBy(xpath="//*[@class='h-primary-button']")
    WebElement saveButton;

    @FindBy(xpath = "//*[@text, 'Auto Responder text edited']")
    WebElement sucessMessage;

    public HiverDashboardPage(){
        PageFactory.initElements(driver, this);
    }

    public void clickSharedMailbox(){
        sharedMailbox.click();
        clickSharedMailbox();
    }

    public void clickAutoResponder(){
        autoResponder.click();
        clickAutoResponder();
    }

    public void enterData(){
        switchToggle.click();
        textBox.sendKeys("Hello");
        saveButton.click();
        enterData();
    }

    public String validateData(){
        sucessMessage.getText();
        validateData();
        return null;
    }



}
