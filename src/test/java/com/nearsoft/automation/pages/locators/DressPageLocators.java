package com.nearsoft.automation.pages.locators;

import com.nearsoft.automation.pages.utils.LandingPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DressPageLocators extends LandingPage {


    @FindBy(xpath = "//*[@id= 'grid']")
    protected WebElement gridView;
    @FindBy(xpath = "//img[@title='Printed Dress']")
    protected WebElement mouseOverDress;
    @FindBy(xpath = "//*[@id=\"center_column\"]/ul/li[1]/div/div[2]/div[3]/a[1]")
    protected WebElement selectDress;
    @FindBy(xpath = "//div[@class='clearfix']/div[1]")
    protected WebElement productFrame;
    @FindBy(xpath = "//*[@id=\'layer_cart\']/div[1]/div[1]/h2")
    protected WebElement addedProductMsg;
    @FindBy(xpath = "//*[@id= 'list']")
    protected WebElement listView;
    @FindBy(xpath = "//*[@id=\"center_column\"]/ul/li[3]/div/div/div[3]/div/div[2]/a[1]/span")
    protected WebElement printedSummerDress;
    @FindBy(xpath = "//span[@id='layer_cart_product_title']")
    protected WebElement shoppingCartProductName;

    public DressPageLocators(WebDriver driver){
        super(driver);
    }


}
