package com.nearsoft.automation.pages.locators;

import com.nearsoft.automation.pages.utils.LandingPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrderPageLocators extends LandingPage {
    @FindBy(xpath = "//*[@class='alert alert-warning']")
    protected WebElement emptyKartAlertWarning;

    public OrderPageLocators(WebDriver driver){
        super(driver);
    }


}
