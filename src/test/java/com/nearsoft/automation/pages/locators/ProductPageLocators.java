package com.nearsoft.automation.pages.locators;
import com.nearsoft.automation.pages.utils.LandingPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ProductPageLocators extends LandingPage {

    @FindBy(xpath = "//*[@id=\"columns\"]/div[1]/a")
    protected List <WebElement> categories;
    @FindBy(xpath = "//*[@id=\"center_column\"]/div/div/div[3]/h1")
    protected WebElement ChiffonDressHeader;

    public ProductPageLocators(WebDriver driver){
        super(driver);
    }
}
