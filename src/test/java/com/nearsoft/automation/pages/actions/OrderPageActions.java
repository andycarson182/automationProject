package com.nearsoft.automation.pages.actions;

import com.nearsoft.automation.pages.locators.OrderPageLocators;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class OrderPageActions extends OrderPageLocators {
    public OrderPageActions(WebDriver driver){
        super(driver);
    }
    public void emptyAlertMessage(){
        String actualMsg = emptyKartAlertWarning.getText();
        String expected = "Your shopping cart is empty.";
        Assert.assertEquals(actualMsg,expected, "Empty shopping message is not correct");
        System.out.println("Empty Cart Alert Message is displayed as expected: " + expected);
    }

}
