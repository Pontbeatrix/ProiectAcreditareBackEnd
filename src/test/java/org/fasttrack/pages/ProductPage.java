package org.fasttrack.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class ProductPage extends BasePage {
    @FindBy(css = "#menu-posts-product")
    private WebElementFacade productsButton;

    @FindBy(css = "a[href='post-new.php?post_type=product']")
    private WebElementFacade addNewProductButton;


    @FindBy(css = "#post-search-input")
    private WebElementFacade searchForProduct;

    @FindBy(css = "#search-submit")
    private WebElementFacade searchButton;

    @FindBy(css = "a[href='http://qa3.fasttrackit.org:8008/wp-admin/post.php?post=64&action=edit']")
    private WebElementFacade searchForHoodieProduct;

    @FindBy(css = "#_regular_price")
    private WebElementFacade modifyRegularPrice;

    @FindBy(css = "#_sale_price")
    private WebElementFacade modifySalePrice;

    @FindBy(css = ".button.button-primary.button-large")
    private WebElementFacade updateButton;

    @FindBy(css = ".wp-editor-container #content")
    private WebElementFacade inputProductDescription;

    @FindBy(css = "#title")
    private WebElementFacade inputNewProductName;

    @FindBy(css = "#content")
    private WebElementFacade inputNewProductDescription;

    @FindBy(css = "li .selectit #in-popular-product_cat-218")
    private WebElementFacade inputNewProductCategory;

    @FindBy(css = "#_tax_status")
    private WebElementFacade inputNewProductTaxStatus;

    @FindBy(css = "#_tax_class")
    private WebElementFacade inputNewProductTaxClass;

    @FindBy(css = "#new-tag-product_tag")
    private WebElementFacade inputNewProductTags;

    @FindBy(css = ".button.tagadd")
    private WebElementFacade tagsButton;

    @FindBy(css = "#set-post-thumbnail")
    private WebElementFacade inputNewProductSetImageButton;

    @FindBy(css = ".attachment.save-ready:nth-child(15)")
    private WebElementFacade inputNewProductSelectImage;

    @FindBy(css = ".button.media-button.button-primary")
    private WebElementFacade inputNewProductSelectImageApply;
    @FindBy(css = "#excerpt")
    private WebElementFacade inputNewProductShortDescription;

    @FindBy(css = "a[href='#inventory_product_data']")
    private WebElementFacade inputNewProductInventoryDataButton;

    @FindBy(css = "#_sku")
    private WebElementFacade inputNewProductInventoryDataSkuField;

    @FindBy(css = "#_manage_stock")
    private WebElementFacade inputNewProductInventoryManageStockRadioButton;

    @FindBy(css = "#_stock")
    private WebElementFacade inputNewProductInventoryStockQtyField;

    @FindBy(css = "#_backorders")
    private WebElementFacade inputNewProductInventoryAllowBackOrdersDD;

    @FindBy(css = "a[href='#shipping_product_data']")
    private WebElementFacade inputNewProductShippingDataButton;

    @FindBy(css = "#_weight")
    private WebElementFacade inputNewProductShippingWeightField;

    @FindBy(css = "#product_length")
    private WebElementFacade inputNewProductShippingLengthField;

    @FindBy(css = ".input-text.wc_input_decimal:nth-child(2)")
    private WebElementFacade inputNewProductShippingWidthField;

    @FindBy(css = ".input-text.wc_input_decimal:nth-child(3)")
    private WebElementFacade inputNewProductShippingHeightField;

    @FindBy(css = "a[href='#product_attributes']")
    private WebElementFacade inputNewProductAttributesDataButton;

    @FindBy(css = ".toolbar.toolbar-top .attribute_taxonomy")
    private WebElementFacade inputNewProductAttributesDDField;

    @FindBy(css = ".button.add_attribute")
    private WebElementFacade inputNewProductAttributeAddButton;

    @FindBy(css = ".button.plus.select_all_attributes")
    private WebElementFacade inputNewProductAttributeSelectAllSizeButton;

    @FindBy(css = ".button.save_attributes.button-primary")
    private WebElementFacade inputNewProductAttributeSaveButton;

    @FindBy(css = "div .postbox-container .submitbox .button-primary.button-large")
    private WebElementFacade inputNewProductPublishButton;

    @FindBy(css = ".iedit.author-self.level-0.post-3896.type-product .thumb.column-thumb")
    private WebElementFacade searchForTricouAlbProduct;

    @FindBy(css = ".iedit.author-self.post-3896.level-0 del .woocommerce-Price-amount.amount")
    private WebElementFacade regularPrice;

    @FindBy(css = ".iedit.author-self.post-3896.level-0 ins .woocommerce-Price-amount.amount")
    private WebElementFacade salePrice;

    @FindBy(css = ".updated.notice.notice-success.is-dismissible")
    private WebElementFacade checkProductUpdatedMessage;


    public void clickProductsButton() {
        clickOn(productsButton);
    }

    public void clickAddNewProductButton() {
        clickOn(addNewProductButton);
    }

    public void setSearchForProduct(String product) {
        typeInto(searchForProduct, product);
    }

    public void clickSearchButton() {
        clickOn(searchButton);
    }

    public void clickSearchForHoodieProduct() {
        clickOn(searchForHoodieProduct);
    }

    public void setModifyRegularPrice(String value) {
        typeInto(modifyRegularPrice, value);
    }

    public String getRegularPrice() {
        return regularPrice.getText();
    }

    public String getSalePrice() {
        return salePrice.getText();
    }


    public void setModifySalePrice(String value) {
        typeInto(modifySalePrice, value);
    }

    public void clickUpdateButton() {
        clickOn(updateButton);
    }

    public void setInputProductDescription(String text) {
        typeInto(inputProductDescription, text);
    }

    public void setInputNewProductName(String text) {
        typeInto(inputNewProductName, text);
    }

    public void setInputNewProductDescription(String text) {
        typeInto(inputNewProductDescription, text);
    }

    public String getInputNewProductDescripition() {
        return inputNewProductDescription.getText();
    }

    public void clickInputNewProductCategory() {
        clickOn(inputNewProductCategory);
    }

    public void setInputNewProductTaxStatus(String status) {
        inputNewProductTaxStatus.selectByValue("shipping");
    }

    public void setInputNewProductTaxClass(String status) {
        inputNewProductTaxClass.selectByValue("standard-rate");
    }

    public void setInputNewProductTags(String text) {
        typeInto(inputNewProductTags, text);
    }

    public void clickTagsButton() {
        clickOn(tagsButton);
    }

    public void clickInputNewProductSetImageButton() {
        clickOn(inputNewProductSetImageButton);
    }

    public void clickInputNewProductSelectImage() {
        clickOn(inputNewProductSelectImage);
    }

    public void clickInputNewProductSelectImageApply() {
        clickOn(inputNewProductSelectImageApply);
    }

    public void setInputNewProductShortDescription(String text) {
        typeInto(inputNewProductShortDescription, text);
    }


    public String getInputNewProductShortDescripition() {
        return inputNewProductShortDescription.getText();
    }

    public void clickInputNewProductInventoryDataButton() {
        clickOn((inputNewProductInventoryDataButton));
    }

    public void setInputNewProductInventoryDataSkuField(String text) {
        typeInto(inputNewProductInventoryDataSkuField, text);
    }

    public void clickInputNewProductInventoryManageStockRadioButton() {
        clickOn((inputNewProductInventoryManageStockRadioButton));
    }

    public void setInputNewProductInventoryStockQtyField(String text) {
        typeInto(inputNewProductInventoryStockQtyField, text);
    }

    public void setInputNewProductInventoryAllowBackOrdersDD(String backorder) {
        inputNewProductInventoryAllowBackOrdersDD.selectByValue("notify");
    }

    public void clickInputNewProductShippingDataButton() {
        clickOn((inputNewProductShippingDataButton));
    }

    public void setInputNewProductShippingWeightField(String weight) {
        typeInto(inputNewProductShippingWeightField, weight);
    }

    public void setInputNewProductShippingLengthField(String length) {
        typeInto(inputNewProductShippingLengthField, length);
    }

    public void setInputNewProductShippingWidthField(String width) {
        typeInto(inputNewProductShippingWidthField, width);
    }

    public void setInputNewProductShippingHeightField(String height) {
        typeInto(inputNewProductShippingHeightField, height);
    }

    public void clickInputNewProductAttributesDataButton() {
        clickOn((inputNewProductAttributesDataButton));
    }

    public void setInputNewProductAttributesDDField(String ddfield) {
        inputNewProductAttributesDDField.selectByValue("pa_size");
    }

    public void clickInputNewProductAttributeAddButton() {
        clickOn((inputNewProductAttributeAddButton));
    }

    public void clickInputNewProductAttributeSelectAllSizeButton() {
        clickOn((inputNewProductAttributeSelectAllSizeButton));
    }

    public void clickInputNewProductAttributeSaveButton() {
        clickOn((inputNewProductAttributeSaveButton));
    }

    public void clickInputNewProductPublishButton() {
        clickOn(inputNewProductPublishButton);
    }


    public void clickSearchForTricouAlbProduct() {
        clickOn(searchForTricouAlbProduct);
    }

    public String getCheckProductUpdatedMessage() {
        return checkProductUpdatedMessage.getText().replace(" View Product\nDismiss this notice.", "");
    }
}


