package org.fasttrack.steps;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class CouponSteps extends BaseSteps {

    @Step
    public void categoryCouponButton() {
        couponPage.clickCategoryCouponButton();
    }

    @Step
    public void addNewCouponButton() {
        couponPage.clickAddNewCouponButton();
    }

    @Step
    public void addNewCouponCodeTitleField(String text) {
        couponPage.setAddNewCouponCodeTitleField(text);
    }

    @Step
    public void addNewCouponCodeDescriptionField(String text) {
        couponPage.setAddNewCouponCodeDescriptionField(text);
    }

    @Step
    public void addNewCouponCodeAmountField(String text) {
        couponPage.setAddNewCouponCodeAmountField(text);
    }

    @Step
    public void addNewCouponCodeExpiryDateField(String text) {
        couponPage.setAddNewCouponCodeExpiryDateField(text);
    }

    @Step
    public void addNewCouponDiscountTypeFixedCart(String text) {
        couponPage.setAddNewCouponDiscountTypeFixedCart("fixed_cart");
    }

    @Step
    public void addNewCouponDiscountTypeFixedProduct(String text) {
        couponPage.setAddNewCouponDiscountTypeFixedProduct("fixed_product");
    }

    @Step
    public void addNewCouponDiscountSuccessMessage() {
        String expected = "Coupon updated.";
        String actual = couponPage.getAddNewCouponDiscountSuccessMessage();
        Assert.assertEquals(expected, actual);
    }

}


