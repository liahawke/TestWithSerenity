package com.testwithbdd.serenity.steps;

import com.testwithbdd.serenity.pages.ProductPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

public class ProductPageSteps extends ScenarioSteps {
    private static final long serialVersionUID = 3828965642245266952L;

    /**
     * Constructor
     *
     * @param pages
     */
    public ProductPageSteps(Pages pages) {
        super(pages);
    }

    /**
     * Get account page
     *
     * @return
     */
    private ProductPage onProductPage() {
        return pages().get(ProductPage.class);
    }

    /**
     * Check breadcrumbs
     */
    @Step("User checks breadcrumbs")
    public void userChecksBreadcrumbs() {
        onProductPage().checkBreadcrumbs(onProductPage().parseExpectedBreadcrumbs());
    }

    /**
     * Add to cart
     */
    @Step("User adds product to cart")
    public void userClicksAddToCartButtonAndGetsPopUp() {
        onProductPage().clickAddBtn();
    }

    /**
     * Proceed to checkout
     */
    @Step("User click on Proceed to checkout button and gets Checkout Page")
    public void userClicksProceedToCheckoutButtonAndGetsCheckoutPage() {
        onProductPage().clickCheckoutBtn();
    }


    @StepGroup
    public void userChecksBreadcrumbsAndAddsProductToCartGoesToCheckoutPage() {
        userChecksBreadcrumbs();
        userClicksAddToCartButtonAndGetsPopUp();
        userClicksProceedToCheckoutButtonAndGetsCheckoutPage();
    }
}
