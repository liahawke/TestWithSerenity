package com.testwithbdd.serenity.pages;

import com.testwithbdd.serenity.utils.YamlParser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends AbstractPage {

    // Web elements
    @FindBy(xpath = "//input[@id='email']")
    private WebElement loginInput;

    @FindBy(xpath = "//input[@id='passwd']")
    private WebElement passwordInput;

    @FindBy(xpath = "//button[@id='SubmitLogin']/span")
    private WebElement loginBtn;

    /**
     * Constructor
     *
     * @param driver
     */
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    /** Login form */
    public void fillInputOnLoginPage() {
        loginInput.sendKeys(YamlParser.getYamlData().getEmail());
        passwordInput.sendKeys(YamlParser.getYamlData().getPassword());
        loginBtn.click();
    }
}