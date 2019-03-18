package com.testwithbdd.serenity.pages;

import com.testwithbdd.serenity.base.ClothesCategories;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class  AbstractPage extends PageObject {

    // Web Elements
    @FindBy(xpath = "//a[@title='Log in to your customer account']")
    private WebElement loginLink;

    @FindBy(xpath = "//div[@id='block_top_menu']/ul/li/a[@title='T-shirts']")
    public WebElement tshirtsTitle;

    // Instance of ClothesCategories
    ClothesCategories clothes;

    /**
     * Wait till element is visible
     *
     * @param element
     */
    public void waitTillElementIsVisible(WebDriver driver, WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    /**
     * Wait till element be clikable
     *
     * @param element
     */
    public void waitTillTextAppears(WebDriver driver, WebElement element, String expectedText) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.textToBePresentInElementValue(element, expectedText));
    }


    /**
     * Constructor
     *
     * @param driver
     */
    public AbstractPage(WebDriver driver) {
        super(driver);
    }

    /**
     * Click on Sign in link
     *
     * @return Login Page
     */
    public void clickLoginLink() {
        loginLink.click();
    }

    /** Click on Dresses link */
    public void clickOnMenuLink() {
        tshirtsTitle.click();
    }

    /**
     * Maximize window and open site
     */
    public void openSite() {
        getDriver().manage().window().maximize();
        getDriver().get("http://automationpractice.com/index.php");
    }
}
