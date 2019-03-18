package com.testwithbdd.serenity.steps;

import com.testwithbdd.serenity.pages.HomePage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

public class HomePageSteps extends ScenarioSteps {

    private static final long serialVersionUID = 6585893923286680912L;

    /**
     * Constructor
     *
     * @param pages
     */
    public HomePageSteps(Pages pages) {
        super(pages);
    }

    /**
     * Get home page
     *
     * @return
     */
    private HomePage onHomePage() {
        return pages().get(HomePage.class);
    }

    /**
     * Open site
     */
    @Step("User opens site and gets Home page")
    public void userOpensSiteAndGetsHomePage() {
        onHomePage().openSite();
    }

    /**
     * Click Login link
     */
    @Step("On home page user clicks Sign In link and gets login page")
    public void onHomePageUserClickSignInLinkAndGetsLoginPage() {
        onHomePage().clickLoginLink();
    }

    @StepGroup
    public void openSiteAndClickLoginLink() {
        userOpensSiteAndGetsHomePage();
        onHomePageUserClickSignInLinkAndGetsLoginPage();
    }

}
