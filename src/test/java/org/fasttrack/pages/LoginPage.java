package org.fasttrack.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class LoginPage extends PageObject {

    @FindBy(id = "user_login")
    private WebElementFacade emailField;

    @FindBy(id = "user_pass")
    private WebElementFacade passwordField;

    @FindBy(id = "wp-submit")
    private WebElementFacade loginButton;

    @FindBy(id = "login_error")
    private WebElementFacade errorMessageElement;

    public void setEmailField(String value) {
        typeInto(emailField, value);
    }

    public void setPasswordField(String value) {
        typeInto(passwordField, value);
    }

    public void clickLoginButton() {
        clickOn(loginButton);
    }

    public String getErrorMessage() {
        return errorMessageElement.getText();
    }

}
