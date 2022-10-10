package org.fasttrack.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class CouponPage extends PageObject {

    @FindBy(css = "a[href='edit.php?post_type=shop_coupon']")
    private WebElementFacade categoryCouponButton;

    @FindBy(css = ".page-title-action")
    private WebElementFacade addNewCouponButton;

    @FindBy(css = "#titlewrap #title")
    private WebElementFacade addNewCouponCodeTitleField;

    @FindBy(css = "#woocommerce-coupon-description")
    private WebElementFacade addNewCouponCodeDescriptionField;

    @FindBy(css = "#coupon_amount")
    private WebElementFacade addNewCouponCodeAmountField;

    @FindBy(css = "#expiry_date")
    private WebElementFacade addNewCouponCodeExpiryDateField;

    @FindBy(css = ".select.short")
    private WebElementFacade addNewCouponDiscountTypeDropDown;

    @FindBy(css = "#message")
    private WebElementFacade addNewCouponDiscountSuccessMessage;


    public void clickCategoryCouponButton() {
        clickOn(categoryCouponButton);
    }

    public void clickAddNewCouponButton() {
        clickOn(addNewCouponButton);
    }

    public void setAddNewCouponCodeTitleField(String text) {
        typeInto(addNewCouponCodeTitleField, text);
    }

    public void setAddNewCouponCodeDescriptionField(String text) {
        typeInto(addNewCouponCodeDescriptionField, text);
    }

    public void setAddNewCouponCodeAmountField(String text) {
        typeInto(addNewCouponCodeAmountField, text);
    }

    public void setAddNewCouponCodeExpiryDateField(String text) {
        typeInto(addNewCouponCodeExpiryDateField, text);
    }

    public void setAddNewCouponDiscountTypeFixedCart(String type) {
        addNewCouponDiscountTypeDropDown.selectByValue("fixed_cart");
    }

    public void setAddNewCouponDiscountTypeFixedProduct(String type) {
        addNewCouponDiscountTypeDropDown.selectByValue("fixed_product");
    }

    public String getAddNewCouponDiscountSuccessMessage() {
        return addNewCouponDiscountSuccessMessage.getText().replace("\nDismiss this notice.", "");
    }
}