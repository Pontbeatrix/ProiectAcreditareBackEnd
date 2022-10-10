package org.fasttrack.steps;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class LoginSteps extends BaseSteps {


    @Step
    public void setUserEmail(String email) {
        loginPage.setEmailField(email);
    }

    @Step
    public void setPassword(String password) {
        loginPage.setPasswordField(password);
    }

    @Step
    public void clickLogin() {
        loginPage.clickLoginButton();
    }

    @Step
    public void verifyUserNotLoggedIn() {
        Assert.assertEquals("ERROR: The password you entered for the username admin is incorrect. Lost your password?", loginPage.getErrorMessage());
    }

    @Step
    public void doLogin(String email, String pass) {

        setUserEmail(email);
        setPassword(pass);
        clickLogin();
    }
}
