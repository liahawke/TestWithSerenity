package com.testwithbdd.serenity.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ListingPage extends AbstractPage {

    @FindBy(xpath = "//span[@class='cat-name']")
    private WebElement headingOfListingPage;

    /**
     * Constructor
     *
     * @param driver
     */
    public ListingPage(WebDriver driver) {
        super(driver);
    }

    /**
     * Click on product
     *
     * @param productName
     * @return Product Page
     */
    public void clickOnProduct(String productName) {
        getDriver().findElement(By.xpath("//a[contains(text(),'" + productName + "')]")).click();
    }
}
