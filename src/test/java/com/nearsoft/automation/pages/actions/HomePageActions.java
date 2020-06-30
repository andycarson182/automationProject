package com.nearsoft.automation.pages.actions;

import com.nearsoft.automation.pages.locators.HomePageLocators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class HomePageActions extends HomePageLocators {
    private WebDriverWait wait = new WebDriverWait(driver,3);
    public HomePageActions(WebDriver driver){
        super(driver);
    }

    public void backHome(){headerLogo.click();}
    public void closePreviewWindow(){closePreview.click();}
    public void clickShoppingKart(){shoppingKart.click();}
    public void clickDressTab(){dressesTab.click();}
    public void typeSearchBox(String Srchtxt){
        srchBox.sendKeys(Srchtxt);
    }
    public void srchBoxOptions(){srchBoxOptions.click();}
    public void clickCartProceedCheckOut(){cartProceedCheckOut.click();}
    public void clickProceedCheckOut(){proceedCheckOut.click();}
    public void selectPopularItem(){
        Actions actions = new Actions(driver);
        actions.moveToElement(popularItem).perform();
        popularItemclick.click();
    }

    public void summaryCurrentStateValidation() {
        String color = summaryState.getCssValue("background");
        String expectedColor = "rgba(0, 0, 0, 0) linear-gradient(rgb(66, 184, 86) 0%, rgb(67, 171, 84) 100%) repeat scroll 0% 0% / auto padding-box border-box";
        Assert.assertEquals(color,expectedColor, "First Step Summary color is not correct");
        System.out.println("First Step Summary color is correct");
    }

    public void singInCurrentStateValidation() {
        String doneColor = "rgba(0, 0, 0, 0) linear-gradient(rgb(114, 113, 113) 0%, rgb(102, 102, 102) 100%) repeat scroll 0% 0% / auto padding-box border-box";
        String expectedColor = "rgba(0, 0, 0, 0) linear-gradient(rgb(66, 184, 86) 0%, rgb(67, 171, 84) 100%) repeat scroll 0% 0% / auto padding-box border-box";
        String doneStepColor = doneSummaryState.getCssValue("background");
        String color = signInState.getCssValue("background");
        Assert.assertEquals(doneStepColor, doneColor, "First Step Summary color is not correct");
        Assert.assertEquals(color, expectedColor, "Second Step Sign in color is not correct");
        System.out.println("The First State summary done color is correct");
        System.out.println("Second Step Sign In color is correct");

    }

    public void openCartPreviewList(){
        Actions actions = new Actions(driver);
        actions.moveToElement(cartPreview).perform();;
    }

    public void removeItemPreviewList() throws InterruptedException {
        cartPreviewRemoveItem.click();
        Thread.sleep(3000);
        String  cartProductItemNumber = driver.findElement(By.xpath("//*[@id='header']/div[3]/div/div/div[3]/div/a/span[1]")).getText();
        Assert.assertEquals(cartProductItemNumber,"1","Cart Count Items is incorrect ");
        System.out.println("Cart Count Items is correct, there is: " + cartProductItemNumber);
    }


}
