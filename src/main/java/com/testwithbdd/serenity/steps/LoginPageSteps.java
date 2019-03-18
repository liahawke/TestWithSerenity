package com.testwithbdd.serenity.steps;

import com.testwithbdd.serenity.pages.LoginPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

public class LoginPageSteps extends ScenarioSteps {


    private static final long serialVersionUID = 7799995717992668106L;

    /**
     * Constructor
     *
     * @param pages
     */
    public LoginPageSteps(Pages pages) {
        super(pages);
    }

    /**
     * Get login page
     *
     * @return
     */
    private LoginPage onLoginPage() {
        return pages().get(LoginPage.class);
    }


    /**
     * User fills input data and click Login button
     */
    @Step("On login page user fills input data, clicks login button and gets account page")
    public void onLoginPageUserFillsInputDataClickSignInLinkAndGetsAccountPage() {
        onLoginPage().fillInputOnLoginPage();
    }

    @StepGroup
    public void openLoginPageAndFillData() {
        onLoginPageUserFillsInputDataClickSignInLinkAndGetsAccountPage();
    }
}
