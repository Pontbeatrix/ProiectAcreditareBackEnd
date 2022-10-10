package org.fasttrack.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class OrdersPage extends PageObject {

    @FindBy(css = "a[href='http://qa3.fasttrackit.org:8008/wp-admin/edit.php?post_status=wc-processing&post_type=shop_order']")
    private WebElementFacade awaitingOrdersButton;

    @FindBy(css = ".order-view")
    private WebElementFacade orderViewButton;

    @FindBy(css = ".wc-on-hold")
    private WebElementFacade orderOnHoldButton;

    @FindBy(css = "#order_status")
    private WebElementFacade orderDropDownStatus;

    @FindBy(css = ".button.save_order")
    private WebElementFacade updateStatusButton;

    @FindBy(css = ".order-status.status-on-hold.tips")
    private WebElementFacade checkOrderStatus;


    public void clickAwaitingOrdersButton() {
        clickOn(awaitingOrdersButton);
    }

    public void clickOrderViewButton() {
        clickOn(orderViewButton);
    }

    public void clickOrderOnHoldButton() {
        clickOn(orderOnHoldButton);
    }

    public void setOrderDropDownStatus(String status) {
        orderDropDownStatus.selectByValue("wc-on-hold");
    }

    public void clickUpdateStatusButton() {
        clickOn(updateStatusButton);
    }

    public String getCheckOrderStatus() {
        return checkOrderStatus.getText();
    }
}
