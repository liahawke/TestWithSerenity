package com.testwithbdd.serenity.steps;

import com.testwithbdd.serenity.pages.ListingPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

public class ListingPageSteps extends ScenarioSteps {

    private static final long serialVersionUID = 9160519582191400L;

    /**
     * Constructor
     *
     * @param pages
     */
    public ListingPageSteps(Pages pages) {
        super(pages);
    }

    /**
     * Get account page
     *
     * @return
     */
    private ListingPage onListingPage() {
        return pages().get(ListingPage.class);
    }

    /**
     * Check on specific product
     */
    @Step("User clicks on specific product and gets product page")
    public void userClicksOnSpecificProductAndGetsProductPage() {
        onListingPage().clickOnProduct("Faded Short Sleeve T-shirts");
    }


    @StepGroup
    public void userClicksOnSpecificProductAndGoesToProductPage() {
        userClicksOnSpecificProductAndGetsProductPage();
    }
}
