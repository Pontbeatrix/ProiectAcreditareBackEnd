package org.fasttrack.steps;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class HomeSteps extends BaseSteps {
    @Step
    public void checkWelcomeMessage() {
        Assert.assertEquals(("Welcome to WordPress!").toLowerCase(), homePage.getCheckWelcomeMessage().toLowerCase());
    }

    @Step
    public void woocommerceButton() {
        homePage.clickWoocommerceButton();
    }
}
