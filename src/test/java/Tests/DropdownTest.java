package Tests;

import Base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DropdownTest extends BaseTest {

    @BeforeMethod
    public void pageSetUp() {
        driver.navigate().to("https://the-internet.herokuapp.com/");
        homePage.openElement("Dropdown");
    }

    @Test
    public void VerifyOption1() {
        dropdownPage.clickOnOption1();
        Assert.assertTrue(dropdownPage.option1Selected);
    }

    @Test
    public void VerifyOption2() {
        dropdownPage.clickOnOption2();
        Assert.assertTrue(dropdownPage.option2Selected);
    }
}
