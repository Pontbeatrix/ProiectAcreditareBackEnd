package org.fasttrack.features;

import org.fasttrack.utils.Constans;
import org.junit.Test;

public class LoginTest extends BaseTest {


    @Test
    public void loginWithValidCredentialsTest() {

        loginSteps.setUserEmail(Constans.USER_EMAIl);
        loginSteps.setPassword(Constans.USER_PASS);
        loginSteps.clickLogin();
        homeSteps.checkWelcomeMessage();

    }

    @Test
    public void loginWithInvalidPasswordTest() {
        loginSteps.setUserEmail(Constans.INVAlID_USER_EMAIl);
        loginSteps.setPassword(Constans.INVALID_USER_PASS);
        loginSteps.clickLogin();
        loginSteps.verifyUserNotLoggedIn();

    }
}
