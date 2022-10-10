package org.fasttrack.steps;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class OrdersSteps extends BaseSteps {

    @Step
    public void awaitingOrdersButton() {
        ordersPage.clickAwaitingOrdersButton();

    }

    @Step
    public void orderViewButton() {
        ordersPage.clickOrderViewButton();

    }

    @Step
    public void orderOnHoldButton() {
        ordersPage.clickOrderOnHoldButton();

    }

    @Step
    public void orderDropDownStatus(String status) {
        ordersPage.setOrderDropDownStatus(status);
    }

    @Step
    public void updateStatusButton() {
        ordersPage.clickUpdateStatusButton();

    }

    @Step
    public void checkOrderStatus() {
        Assert.assertEquals("On hold", ordersPage.getCheckOrderStatus());
    }

}

