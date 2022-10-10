package org.fasttrack.features;

import org.fasttrack.utils.Constans;
import org.junit.Test;

public class ProductTest extends BaseTest {

    @Test
    public void checkFromProduct() {
        loginSteps.setUserEmail(Constans.USER_EMAIl);
        loginSteps.setPassword(Constans.USER_PASS);
        loginSteps.clickLogin();
        productSteps.productsButton();
        productSteps.setSearchForProduct("hoodie");
        productSteps.searchButton();
        productSteps.searchForHoodieProduct();
        productSteps.modifyRegularPrice("55");
        productSteps.modifySalePrice("45");
        productSteps.inputProductDescription("Vă prezentăm primul nostru hanorac cu glugă Essential, confecționat din material stretch cusut în patru direcții pentru mobilitate crescută care vă protejează, de asemenea, de intemperii datorită finisajelor rezistente la apă.");
        productSteps.updateButton();
        productSteps.checkProductUpdatedMessage();
    }

    @Test
    public void addNewProduct() {
        loginSteps.setUserEmail(Constans.USER_EMAIl);
        loginSteps.setPassword(Constans.USER_PASS);
        loginSteps.clickLogin();
        productSteps.productsButton();
        productSteps.addNewProductButton();
        productSteps.inputNewProductDescription("Tricou de calitate. Confectionat dintr-un material respirabil (bumbac), acesta ofera o mare libertate de miscare.");
        productSteps.inputNewProductCategory();
        productSteps.modifyRegularPrice("100");
        productSteps.modifySalePrice("95");
        productSteps.inputNewProductTaxStatus("");
        productSteps.inputNewProductTaxClass("");
        productSteps.inputNewProductTags("shirt");
        productSteps.tagsButton();
        productSteps.inputNewProductTags("t-shirt");
        productSteps.tagsButton();
        productSteps.inputNewProductShortDescription("Set 5 tricouri pentru barbati, femei, Alb");
        productSteps.inputNewProductInventoryDataButton();
        productSteps.inputNewProductInventoryDataSkuField("shirt34");
        productSteps.inputNewProductInventoryManageStockRadioButton();
        productSteps.InputNewProductInventoryStockQtyField("100");
        productSteps.inputNewProductInventoryAllowBackOrdersDD("");
        productSteps.inputNewProductShippingDataButton();
        productSteps.inputNewProductShippingWeightField("0.2");
        productSteps.inputNewProductShippingLengthField("60");
        productSteps.inputNewProductShippingWidthField("30");
        productSteps.inputNewProductShippingHeightField("0");
        productSteps.inputNewProductAttributesDataButton();
        productSteps.inputNewProductAttributesDDField("");
        productSteps.inputNewProductAttributeAddButton();
        productSteps.inputNewProductAttributeSelectAllSizeButton();
        productSteps.inputNewProductAttributeSaveButton();
        productSteps.inputNewProductSetImageButton();
        productSteps.inputNewProductSelectImage();
        productSteps.inputNewProductSelectImageApply();
        productSteps.inputNewProductName("Tricou Alb");
        productSteps.inputNewProductPublishButton();


    }

    @Test

    public void checkNewProductWasApplied() {
        loginSteps.setUserEmail(Constans.USER_EMAIl);
        loginSteps.setPassword(Constans.USER_PASS);
        loginSteps.clickLogin();
        productSteps.productsButton();
        productSteps.setSearchForProduct("tricou alb");
        productSteps.searchButton();
        productSteps.searchForTricouAlbProduct();
        productSteps.checkInputNewProductDescription();
        productSteps.checkInputNewProductShortDescription();

    }

    @Test
    public void checkNewProductRegularAndSalePrice() {
        loginSteps.setUserEmail(Constans.USER_EMAIl);
        loginSteps.setPassword(Constans.USER_PASS);
        loginSteps.clickLogin();
        productSteps.productsButton();
        productSteps.setSearchForProduct("tricou alb");
        productSteps.searchButton();
        productSteps.checkIfRegularPriceMatches();
        productSteps.checkIfSalePriceMatches();

    }
}
