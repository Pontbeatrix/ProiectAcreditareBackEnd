package org.fasttrack.features;

import org.fasttrack.utils.Constans;
import org.junit.Test;

public class CouponTest extends BaseTest {

    @Test
    public void addingAndCheckingNewPercentageCoupon() {
        loginSteps.setUserEmail(Constans.USER_EMAIl);
        loginSteps.setPassword(Constans.USER_PASS);
        loginSteps.clickLogin();
        homeSteps.woocommerceButton();
        couponSteps.categoryCouponButton();
        couponSteps.addNewCouponButton();
        couponSteps.addNewCouponCodeTitleField("voucher10");
        couponSteps.addNewCouponCodeDescriptionField("10 percent discount for each products");
        couponSteps.addNewCouponCodeAmountField("10");
        couponSteps.addNewCouponCodeExpiryDateField("2023-08-10");
        productSteps.inputNewProductPublishButton();
        couponSteps.addNewCouponDiscountSuccessMessage();
    }

    @Test
    public void addingAndCheckingNewFixedCartCoupon() {
        loginSteps.setUserEmail(Constans.USER_EMAIl);
        loginSteps.setPassword(Constans.USER_PASS);
        loginSteps.clickLogin();
        homeSteps.woocommerceButton();
        couponSteps.categoryCouponButton();
        couponSteps.addNewCouponButton();
        couponSteps.addNewCouponCodeTitleField("voucher20");
        couponSteps.addNewCouponCodeDescriptionField("20 fixed amount discount");
        couponSteps.addNewCouponDiscountTypeFixedCart("");
        couponSteps.addNewCouponCodeAmountField("20");
        couponSteps.addNewCouponCodeExpiryDateField("2023-09-10");
        productSteps.inputNewProductPublishButton();
        couponSteps.addNewCouponDiscountSuccessMessage();
    }

    @Test
    public void addingAndCheckingNewFixedProductCoupon() {
        loginSteps.setUserEmail(Constans.USER_EMAIl);
        loginSteps.setPassword(Constans.USER_PASS);
        loginSteps.clickLogin();
        homeSteps.woocommerceButton();
        couponSteps.categoryCouponButton();
        couponSteps.addNewCouponButton();
        couponSteps.addNewCouponCodeTitleField("voucher30");
        couponSteps.addNewCouponCodeDescriptionField("30 fixed product discount");
        couponSteps.addNewCouponDiscountTypeFixedProduct("");
        couponSteps.addNewCouponCodeAmountField("30");
        couponSteps.addNewCouponCodeExpiryDateField("2100-10-10");
        productSteps.inputNewProductPublishButton();
        couponSteps.addNewCouponDiscountSuccessMessage();
    }


}
