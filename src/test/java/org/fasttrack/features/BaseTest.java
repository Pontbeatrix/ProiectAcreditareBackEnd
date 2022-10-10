package org.fasttrack.features;


import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.fasttrack.steps.*;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class BaseTest {

    @Managed(uniqueSession = true)
    public WebDriver driver;

    @Steps

    protected HomeSteps homeSteps;
    @Steps
    protected LoginSteps loginSteps;

    @Steps
    protected ProductSteps productSteps;

    @Steps
    protected CommentSteps commentSteps;

    @Steps
    protected OrdersSteps ordersSteps;

    @Steps
    protected CouponSteps couponSteps;

    @Before
    public void init() {
        driver.manage().window().maximize();
        driver.get("http://qa3.fasttrackit.org:8008/wp-login.php");

    }
}
