package org.fasttrack.pages;


import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://qa3.fasttrackit.org:8008/wp-login.php")
public class HomePage extends PageObject {


    @FindBy(css = ".welcome-panel-content > h2")
    private WebElementFacade checkWelcomeMessage;

    @FindBy(css = "#toplevel_page_woocommerce")
    private WebElementFacade woocommerceButton;


    public String getCheckWelcomeMessage() {
        return checkWelcomeMessage.getText();
    }

    public void clickWoocommerceButton() {
        clickOn(woocommerceButton);
    }


}




