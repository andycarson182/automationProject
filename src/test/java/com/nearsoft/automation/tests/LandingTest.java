package com.nearsoft.automation.tests;

import com.nearsoft.automation.pages.actions.DressPageActions;
import com.nearsoft.automation.pages.actions.HomePageActions;
import com.nearsoft.automation.pages.actions.OrderPageActions;
import com.nearsoft.automation.pages.actions.ProductPageActions;
import com.nearsoft.automation.pages.utils.LandingPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class LandingTest {
    public HomePageActions homepage;
    public OrderPageActions orderPage;
    public DressPageActions dressPage;
    public ProductPageActions productPage;
    public LandingPage utils;
    WebDriver driver;
    String baseURL = "http://automationpractice.com/";

    @BeforeTest
    public void launchBrowser(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get(baseURL);

    }

    @Test (priority = 0)
    //User can navigate to empty cart
    public void landing_EmptyShoppingCart() {
        orderPage = new OrderPageActions(driver);
        homepage = new HomePageActions(driver);
        homepage.clickShoppingKart();
        orderPage.emptyAlertMessage();
        homepage.summaryCurrentStateValidation();
        homepage.backHome();
    }

    @Test (priority = 1)
    //This test verify when user removes cart Items
    public void removingShoppingCartItems() throws InterruptedException {
        homepage = new HomePageActions(driver);
        dressPage = new DressPageActions(driver);
        homepage.clickDressTab();
        dressPage.selectListView();
        dressPage.selectItemDress();
        homepage.closePreviewWindow();
        homepage.backHome();
        homepage.selectPopularItem();
        homepage.closePreviewWindow();
        homepage.openCartPreviewList();
        homepage.removeItemPreviewList();

    }

    @Test (priority = 2)
    //This test verify when user adds items to shopping cart in Grid view
    public void landingDress_GridNavigation() {
        homepage = new HomePageActions(driver);
        dressPage = new DressPageActions(driver);
        homepage.clickDressTab();
        dressPage.selectGridView();
        dressPage.mouseOverDress();
        dressPage.selectGridDress();
        dressPage.productFrameValidation();
        dressPage.productMsgValidation();
        dressPage.shoppingCartProductNameVerification("Printed Dress");
        homepage.closePreviewWindow();
        homepage.backHome();
    }

    @Test (priority = 3)
    //This test verify when user adds items to shopping cart in List view
    public void landingDress_ListNavigation() {
        homepage = new HomePageActions(driver);
        dressPage = new DressPageActions(driver);
        homepage.clickDressTab();
        dressPage.selectListView();
        dressPage.selectItemDress();
        dressPage.productFrameValidation();
        dressPage.productMsgValidation();
        dressPage.shoppingCartProductNameVerification("Printed Summer Dress");
        homepage.closePreviewWindow();
        homepage.backHome();
    }

    @Test (priority = 4)
    //This test verify when user search Box Interaction
    public void searchBoxNavigation() {
        homepage = new HomePageActions(driver);
        dressPage = new DressPageActions(driver);
        productPage = new ProductPageActions(driver);
        homepage.typeSearchBox("Summer");
        homepage.srchBoxOptions();
        productPage.Validation_articleName();
        productPage.Validation_CategoriesPipe();

    }




    @Test (priority = 5)
    //This test verify second
    public void signInCurrentStateValidation() throws InterruptedException {
        homepage = new HomePageActions(driver);
        dressPage = new DressPageActions(driver);
        homepage.clickDressTab();
        dressPage.selectListView();
        dressPage.selectItemDress();
        homepage.clickCartProceedCheckOut();
        homepage.summaryCurrentStateValidation();
        homepage.clickProceedCheckOut();
        homepage.singInCurrentStateValidation();

    }


    @AfterTest
    public void tearDown(){
        driver.close();
    }



}
