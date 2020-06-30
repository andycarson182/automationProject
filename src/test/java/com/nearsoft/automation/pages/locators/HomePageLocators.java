package com.nearsoft.automation.pages.locators;

import com.nearsoft.automation.pages.utils.LandingPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageLocators extends LandingPage {
    @FindBy(css = "#header > div:nth-child(3) > div > div > div:nth-child(3) > div > a")
    protected WebElement shoppingKart;
    @FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[2]/a")
    protected WebElement dressesTab;
    @FindBy(id= "header_logo")
    protected WebElement headerLogo;
    @FindBy(id= "search_query_top")
    protected WebElement srchBox;
    @FindBy(xpath = "//*[@id=\"index\"]/div[2]/ul/li[3]")
    protected  WebElement srchBoxOptions;
    @FindBy(xpath = "//*[@id=\'homefeatured\']/li[3]/div/div[1]/div/a[1]/img")
    protected  WebElement popularItem;
    @FindBy(xpath = "//*[@id=\'homefeatured\']/li[3]/div/div[2]/div[2]/a[1]")
    protected  WebElement popularItemclick;
    @FindBy(xpath = "//li[@class='step_current  first']")
    protected  WebElement summaryState;
    @FindBy(xpath = "//li[@class='step_done_last step_done first']")
    protected  WebElement doneSummaryState;
    @FindBy(xpath = "//li[@class='step_current second']")
    protected  WebElement signInState;
    @FindBy(xpath = "//*[@title='Close window']")
    protected  WebElement closePreview;
    @FindBy(xpath = "//*[@id=\'header\']/div[3]/div/div/div[3]/div/a")
    protected  WebElement cartPreview;
    @FindBy(xpath = "//*[@id=\"header\"]/div[3]/div/div/div[3]/div/div/div/div/dl/dt[1]/span/a")
    protected  WebElement cartPreviewRemoveItem;
    @FindBy(xpath = "//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a")
    protected WebElement cartProceedCheckOut;
    @FindBy(xpath = "//*[@id=\"center_column\"]/p[2]/a[1]")
    protected WebElement proceedCheckOut;



    public HomePageLocators(WebDriver driver){
        super(driver);
    }


}







//   driver.findElement(By.cssSelector("#header > div:nth-child(3) > div > div > div:nth-child(3) > div > a")).click();
//           String actualMsg = driver.findElement(By.xpath("//*[@class='alert alert-warning']")).getText();
//           String expected = "Your shopping cart is empty.";
//           Assert.assertEquals(actualMsg,expected, "Empty shopping message is not correct");
//           String expectedColour = "#208931";
//           WebElement summaryState = driver.findElement(By.xpath("//*[@id=\"order_step\"]/li[1]/span"));
//           String colour = summaryState.getCssValue("text-shadow");
//           System.out.println(colour);
//           String hexColor = Color.fromString(colour).asHex();
//           System.out.println(hexColor);
//           Assert.assertEquals(colour,expectedColour,"El Summary State colour is not correct");