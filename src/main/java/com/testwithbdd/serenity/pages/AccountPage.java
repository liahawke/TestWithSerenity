package com.testwithbdd.serenity.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountPage  extends AbstractPage {

    // User name
    private final String USERNAME = "Lia Hawke";

    // Web Elements
    @FindBy(xpath = "//a[@title='View my customer account']")
    private WebElement userName;

    /**
     * Constructor
     *
     * @param driver
     */
    public AccountPage(WebDriver driver) {
        super(driver);

    }

    /** Verify username */
    public void verifyName() {
        Assert.assertEquals("User name is wrong", USERNAME, userName.getText());
    }
}