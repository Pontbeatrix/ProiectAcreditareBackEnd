package org.fasttrack.features;

import org.fasttrack.utils.Constans;
import org.junit.Test;

public class OrdersTest extends BaseTest {

    @Test

    public void changeOrdersStatus() {
        loginSteps.setUserEmail(Constans.USER_EMAIl);
        loginSteps.setPassword(Constans.USER_PASS);
        loginSteps.clickLogin();
        ordersSteps.awaitingOrdersButton();
        ordersSteps.orderViewButton();
        ordersSteps.orderDropDownStatus("wc-on-hold");
        ordersSteps.updateStatusButton();

    }

    @Test
    public void checkOrderStatus() {
        loginSteps.setUserEmail(Constans.USER_EMAIl);
        loginSteps.setPassword(Constans.USER_PASS);
        loginSteps.clickLogin();
        ordersSteps.awaitingOrdersButton();
        ordersSteps.orderOnHoldButton();
        ordersSteps.checkOrderStatus();

    }
}
