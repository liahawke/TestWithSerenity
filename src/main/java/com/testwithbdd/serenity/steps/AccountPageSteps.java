package com.testwithbdd.serenity.steps;

import com.testwithbdd.serenity.pages.AccountPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

public class AccountPageSteps extends ScenarioSteps {

    private static final long serialVersionUID = -4207201556181164805L;

    /**
     * Constructor
     *
     * @param pages
     */
    public AccountPageSteps(Pages pages) {
        super(pages);
    }

    /**
     * Get account page
     *
     * @return
     */
    private AccountPage onAccountPage() {
        return pages().get(AccountPage.class);
    }

    /**
     * Check username
     */
    @Step("User verifies username")
    public void userVerifiesUserName() {
        onAccountPage().verifyName();
    }

    /**
     * Click menu item
     */
    @Step("User clicks on menu item and gets to Product Listing Page")
    public void userClicksOnMenuAndGetsOnListingPage() {
        onAccountPage().clickOnMenuLink();
    }


    @StepGroup
    public void userVerifiesUsernameOnAccountPageAndClicksOnMenuItemAndGetsOnListingPage() {
        userVerifiesUserName();
        userClicksOnMenuAndGetsOnListingPage();
    }
}
