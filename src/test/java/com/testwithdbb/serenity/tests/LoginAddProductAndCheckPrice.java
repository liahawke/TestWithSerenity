package com.testwithdbb.serenity.tests;

import com.testwithbdd.serenity.steps.*;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.Pages;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

// Serenity runner
@RunWith(SerenityRunner.class)

public class LoginAddProductAndCheckPrice {
    // If you need you can use driver
    @Managed
    WebDriver driver;

    // Also you can use pages
    @ManagedPages
    Pages pages;

    // Steps also available
    @Steps
    HomePageSteps homePageSteps;

    // Steps also available
    @Steps
    LoginPageSteps loginPageSteps;

    // Steps also available
    @Steps
    AccountPageSteps accountPageSteps;

    // Steps also available
    @Steps
    ListingPageSteps listingPageSteps;

    // Steps also available
    @Steps
    ProductPageSteps prodcutPageSteps;

    // Steps also available
    @Steps
    CheckoutPageSteps checkoutPageSteps;

    /**
     * Open site and click the Python link
     */
    @Test
    public void testLoginAddProductCheckPrice() {
        homePageSteps.userOpensSiteAndGetsHomePage();
        homePageSteps.onHomePageUserClickSignInLinkAndGetsLoginPage();
        loginPageSteps.onLoginPageUserFillsInputDataClickSignInLinkAndGetsAccountPage();
        accountPageSteps.userVerifiesUsernameOnAccountPageAndClicksOnMenuItemAndGetsOnListingPage();
        listingPageSteps.userClicksOnSpecificProductAndGoesToProductPage();
        prodcutPageSteps.userChecksBreadcrumbsAndAddsProductToCartGoesToCheckoutPage();
        checkoutPageSteps.userIncreasesQuantityCheckPriceDeletesProductAndCheckTitle();
    }
}
