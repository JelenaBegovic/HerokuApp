package Tests;

import Base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BasicAuthTest extends BaseTest {

    @BeforeMethod
    public void pageSetUp() {
        driver.navigate().to("https://the-internet.herokuapp.com/");
    }

    @Test
    public void verifyThatUserCanLogin() {
        homePage.openElement("Basic Auth");
        driver.navigate().to("http://admin:admin@the-internet.herokuapp.com/basic_auth");
        Assert.assertTrue(basicAuth.confirmmessage.isDisplayed());
    }
}
