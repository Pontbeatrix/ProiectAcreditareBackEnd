package org.fasttrack.steps;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class ProductSteps extends BaseSteps {

    @Step
    public void productsButton() {
        productPage.clickProductsButton();

    }

    @Step
    public void addNewProductButton() {
        productPage.clickAddNewProductButton();

    }

    @Step
    public void setSearchForProduct(String product) {
        productPage.setSearchForProduct(product);
    }

    @Step
    public void searchButton() {
        productPage.clickSearchButton();

    }

    @Step
    public void searchForHoodieProduct() {
        productPage.clickSearchForHoodieProduct();
    }

    @Step
    public void modifyRegularPrice(String value) {
        productPage.setModifyRegularPrice(value);
    }

    @Step
    public void checkIfSalePriceMatches() {
        Assert.assertEquals(("95,00 lei"), productPage.getSalePrice());
    }

    @Step
    public void checkIfRegularPriceMatches() {
        Assert.assertEquals(("100,00 lei"), productPage.getRegularPrice());
    }

    @Step
    public void modifySalePrice(String value) {
        productPage.setModifySalePrice(value);
    }


    @Step
    public void updateButton() {
        productPage.clickUpdateButton();
    }

    @Step
    public void inputProductDescription(String text) {
        productPage.setInputProductDescription(text);
    }

    @Step
    public void inputNewProductName(String text) {
        productPage.setInputNewProductName(text);
    }

    @Step
    public void inputNewProductDescription(String text) {
        productPage.setInputNewProductDescription(text);
    }

    @Step
    public void checkInputNewProductDescription() {
        Assert.assertEquals(("Tricou de calitate. Confectionat dintr-un material respirabil (bumbac), acesta ofera o mare libertate de miscare.").toLowerCase(), productPage.getInputNewProductDescripition().toLowerCase());
    }

    @Step
    public void inputNewProductCategory() {
        productPage.clickInputNewProductCategory();
    }

    @Step
    public void inputNewProductTaxStatus(String status) {
        productPage.setInputNewProductTaxStatus(status);
    }

    @Step
    public void inputNewProductTaxClass(String status) {
        productPage.setInputNewProductTaxClass(status);
    }

    @Step
    public void inputNewProductTags(String tag) {
        productPage.setInputNewProductTags(tag);
    }

    @Step
    public void tagsButton() {
        productPage.clickTagsButton();
    }

    @Step
    public void inputNewProductSetImageButton() {
        productPage.clickInputNewProductSetImageButton();
    }

    @Step
    public void inputNewProductSelectImage() {
        productPage.clickInputNewProductSelectImage();
    }

    @Step
    public void inputNewProductSelectImageApply() {
        productPage.clickInputNewProductSelectImageApply();
    }

    @Step
    public void inputNewProductShortDescription(String text) {
        productPage.setInputNewProductShortDescription(text);
    }

    @Step
    public void checkInputNewProductShortDescription() {
        Assert.assertEquals(("Set 5 tricouri pentru barbati, femei, Alb").toLowerCase(), productPage.getInputNewProductShortDescripition().toLowerCase());
    }

    @Step
    public void inputNewProductInventoryDataButton() {
        productPage.clickInputNewProductInventoryDataButton();
    }

    @Step
    public void inputNewProductInventoryDataSkuField(String sku) {
        productPage.setInputNewProductInventoryDataSkuField(sku);
    }

    @Step
    public void inputNewProductInventoryManageStockRadioButton() {
        productPage.clickInputNewProductInventoryManageStockRadioButton();
    }

    @Step
    public void InputNewProductInventoryStockQtyField(String qty) {
        productPage.setInputNewProductInventoryStockQtyField(qty);
    }

    @Step
    public void inputNewProductInventoryAllowBackOrdersDD(String backorder) {
        productPage.setInputNewProductInventoryAllowBackOrdersDD(backorder);
    }

    @Step
    public void inputNewProductShippingDataButton() {
        productPage.clickInputNewProductShippingDataButton();
    }

    @Step
    public void inputNewProductShippingWeightField(String weight) {
        productPage.setInputNewProductShippingWeightField(weight);
    }

    @Step
    public void inputNewProductShippingLengthField(String length) {
        productPage.setInputNewProductShippingLengthField(length);
    }

    @Step
    public void inputNewProductShippingWidthField(String width) {
        productPage.setInputNewProductShippingWidthField(width);
    }

    @Step
    public void inputNewProductShippingHeightField(String height) {
        productPage.setInputNewProductShippingHeightField(height);
    }

    @Step
    public void inputNewProductAttributesDataButton() {
        productPage.clickInputNewProductAttributesDataButton();
    }

    @Step
    public void inputNewProductAttributesDDField(String ddfield) {
        productPage.setInputNewProductAttributesDDField("pa_size");
    }

    @Step
    public void inputNewProductAttributeAddButton() {
        productPage.clickInputNewProductAttributeAddButton();
    }

    @Step
    public void inputNewProductAttributeSelectAllSizeButton() {
        productPage.clickInputNewProductAttributeSelectAllSizeButton();
    }

    @Step
    public void inputNewProductAttributeSaveButton() {
        productPage.clickInputNewProductAttributeSaveButton();
    }

    @Step
    public void inputNewProductPublishButton() {
        productPage.clickInputNewProductPublishButton();
    }

    @Step
    public void searchForTricouAlbProduct() {
        productPage.clickSearchForTricouAlbProduct();
    }

    @Step
    public void checkProductUpdatedMessage() {
        String expected = "Product updated.";
        String actual = productPage.getCheckProductUpdatedMessage();
        Assert.assertEquals(expected, actual);

    }
}
