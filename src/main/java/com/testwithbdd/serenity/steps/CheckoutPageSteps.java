package com.testwithbdd.serenity.steps;

import com.testwithbdd.serenity.pages.CheckoutPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

public class CheckoutPageSteps extends ScenarioSteps {

    private static final long serialVersionUID = 7866685485336880676L;

    /**
     * Constructor
     *
     * @param pages
     */
    public CheckoutPageSteps(Pages pages) {
        super(pages);
    }

    /**
     * Get account page
     *
     * @return
     */
    private CheckoutPage onCheckoutPage() {
        return pages().get(CheckoutPage.class);
    }

    /**
     * User clicks + button
     */
    @Step("User increases quantity of product by clicking plus button ")
    public void userClicksPlusButton() {
        onCheckoutPage().clickPlusBtn();
    }

    /**
     * Check if total price was recalculated after changing product quantity
     */
    @Step("User checks if total price was recalculated after changing product quantity")
    public void userChecksIfTotalPriceWasRecalculated() {
        onCheckoutPage().checkPrice();
    }

    /**
     * Delete product from the card
     */
    @Step("User deletes product from the cart")
    public void userDeletesProductFromTheCart() {
        onCheckoutPage().deleteProduct();
    }


    /**
     * Check title on empty cart
     */
    @Step("User checks title on empty card")
    public void userChecksTitleOnEmptyCart() {
        onCheckoutPage().checkTitle();
    }


    @StepGroup
    public void userIncreasesQuantityCheckPriceDeletesProductAndCheckTitle() {
        userClicksPlusButton();
        userChecksIfTotalPriceWasRecalculated();
        userDeletesProductFromTheCart();
        userChecksTitleOnEmptyCart();
    }
}
