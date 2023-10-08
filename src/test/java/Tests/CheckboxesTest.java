package Tests;

import Base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CheckboxesTest extends BaseTest {

    @BeforeMethod
    public void pageSetUp(){
        driver.navigate().to("https://the-internet.herokuapp.com/");
    }

    @Test
    public void verifyThatUserCanClickOnCheckboxes() {
        homePage.openElement("Checkboxes");
        checkboxPage.clickOnCheckbox();
        Assert.assertTrue(checkboxPage.verifyThatAllCheckboxesAreChecked());
    }

    @Test
    public void verifyThatUserCanUncheckCheckboxes() {
        homePage.openElement("Checkboxes");
        checkboxPage.uncheckCheckboxes();
        Assert.assertFalse(checkboxPage.verifyThatAllCheckboxesAreChecked());
    }
}
