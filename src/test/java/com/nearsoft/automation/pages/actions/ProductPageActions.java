package com.nearsoft.automation.pages.actions;
import com.nearsoft.automation.pages.locators.ProductPageLocators;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class ProductPageActions extends ProductPageLocators {

    public ProductPageActions(WebDriver driver) {
        super(driver);
    }

    public void Validation_articleName() {
        String actualHeader = ChiffonDressHeader.getText();
        String expectedHeader = "Printed Chiffon Dress";
        Assert.assertEquals(actualHeader, expectedHeader, "Header Product name is not correct");
        System.out.println("Header Product name is correct: " + expectedHeader);
    }

    public void Validation_CategoriesPipe() {
        int index = 0;
        String expectedResult[] = {"Return to Home", "Women", "Dresses", "Summer Dresses"};
        List<String> listCategories = new ArrayList<>();
        for (WebElement stringCategories : categories) {

            String categorie = stringCategories.getAttribute("title");
            Assert.assertEquals(expectedResult[index], categorie, "Product Categories are not correct");
            index += 1;

            listCategories.add(categorie);

        }

        System.out.println("Categories are displayed as expected: " + listCategories );

    }
}