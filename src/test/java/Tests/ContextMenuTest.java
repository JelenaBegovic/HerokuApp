package Tests;

import Base.BaseTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ContextMenuTest extends BaseTest {

    @BeforeMethod
    public void pageSetUp() {
        driver.navigate().to("https://the-internet.herokuapp.com/");
    }

    @Test
    public void verifyThatRightClickWillOpenJSAlert() {
        homePage.openElement("Context Menu");
        contextMenuPage.rightClickInTheBox();
        driver.switchTo().alert().accept();
    }
}
