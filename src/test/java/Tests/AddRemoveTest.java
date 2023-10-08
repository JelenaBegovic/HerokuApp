package Tests;

import Base.BaseTest;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddRemoveTest extends BaseTest {

    @BeforeMethod
    public void pageSetUp() {
        driver.navigate().to("https://the-internet.herokuapp.com/");
    }

    @Test
    public void verifyAddingElements() {
        homePage.openElement("Add/Remove Elements");
        addRemovePage.clickOnAddElementButton(6);
        Assert.assertTrue(addRemovePage.deleteButton.isDisplayed());
    }

    @Test
    public void verifyDeletingElements() {
        verifyAddingElements();
        addRemovePage.clickOnDeleteButton(4);
        Assert.assertEquals(addRemovePage.numberOfAdd-addRemovePage.numberOfDelete, addRemovePage.remainingDeletes.size());
    }

}
