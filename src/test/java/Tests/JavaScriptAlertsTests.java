package Tests;

import Base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class JavaScriptAlertsTests extends BaseTest {
    public String emptyPrompt = "";
    public String prompt = "bhjb";

    @BeforeMethod
    public void pageSetUp() {
        driver.navigate().to("https://the-internet.herokuapp.com/");
    }

    @Test
    public void verifyJavaScriptAlertButton() {
        homePage.openElement("JavaScript Alerts");
        javaScriptAlerts.clickOnClickForJSAlert();
        driver.switchTo().alert().accept();
        Assert.assertEquals(javaScriptAlerts.getMessage(), "You successfully clicked an alert");
    }

    @Test
    public void verifyJavaScriptConfirmButtonCancel() {
        homePage.openElement("JavaScript Alerts");
        javaScriptAlerts.clickOnClickForJSConfirm();
        driver.switchTo().alert().dismiss();
        Assert.assertEquals(javaScriptAlerts.getMessage(), "You clicked: Cancel");
    }
    @Test
    public void verifyJavaScriptConfirmButtonOK() {
        homePage.openElement("JavaScript Alerts");
        javaScriptAlerts.clickOnClickForJSConfirm();
        driver.switchTo().alert().accept();
        Assert.assertEquals(javaScriptAlerts.getMessage(), "You clicked: Ok");
    }

    @Test
    public void verifyJavaScriptPromptButton() {
        homePage.openElement("JavaScript Alerts");
        javaScriptAlerts.clickOnClickForJSPrompt();
        driver.switchTo().alert().sendKeys(prompt);
        driver.switchTo().alert().accept();
        Assert.assertEquals(javaScriptAlerts.getMessage(), "You entered: " + prompt);
    }
    @Test
    public void verifyJavaScriptPromptButtonWithEmptyInput() {
        homePage.openElement("JavaScript Alerts");
        javaScriptAlerts.clickOnClickForJSPrompt();
        driver.switchTo().alert().sendKeys(emptyPrompt);
        driver.switchTo().alert().accept();
        Assert.assertEquals(javaScriptAlerts.getMessage(), "You entered:");
    }
}
