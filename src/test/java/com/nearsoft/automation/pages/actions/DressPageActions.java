package com.nearsoft.automation.pages.actions;

import com.nearsoft.automation.pages.locators.DressPageLocators;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class DressPageActions extends DressPageLocators {

    public DressPageActions(WebDriver driver){
        super(driver);
    }
    private WebDriverWait wait = new WebDriverWait(driver,3);

    public void selectGridView(){gridView.click();}
    public void selectListView(){listView.click();}
    public void selectGridDress(){selectDress.click();}
    public void selectItemDress(){printedSummerDress.click();}

    public void mouseOverDress(){
        Actions actions = new Actions(driver);
        actions.moveToElement(mouseOverDress).perform();
    }


    public void productFrameValidation(){
        productFrame.isDisplayed();
        System.out.println("Product added frame is displayed");
    }

    public void productMsgValidation(){
        wait.until(ExpectedConditions.visibilityOf(addedProductMsg));
        String actualMsg = addedProductMsg.getText();
        String expectedMsg = "Product successfully added to your shopping cart";
        Assert.assertEquals(actualMsg,expectedMsg,"Product added Message is not correct");
        System.out.println("Shopping Cart Product Name is correct " + expectedMsg);

    }
    public void shoppingCartProductNameVerification(String productName){
        wait.until(ExpectedConditions.visibilityOf(shoppingCartProductName));
        String actualMsg = shoppingCartProductName.getText();
        Assert.assertEquals(actualMsg,productName,"Product Kart Name is not correct");
        System.out.println("Shopping Cart Product Name is correct " + productName);

    }

}
