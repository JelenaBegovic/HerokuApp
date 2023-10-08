package Tests;

import Base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FormAuthenticationTest extends BaseTest {

    public String validUsername = "tomsmith";
    public String validPassword = "SuperSecretPassword!";
    public String invalidUsername = "sjdbbfi";
    public String invalidPassword = "bcoeubiu";
    public String emptyUsername = "";
    public String emptyPassword = "";
    public String confirmMessage = "You logged into a secure area!\n" +
            "×";
    public String errorMessageUsername = "Your username is invalid!\n" +
            "×";
    public String errorMessagePassword = "Your password is invalid!\n" +
            "×";
    public String logoutMessage = "You logged out of the secure area!\n" +
            "×";

    @BeforeMethod
    public void pageSetUp() {
        driver.navigate().to("https://the-internet.herokuapp.com/");
    }

    @Test
    public void verifyThatUserCanLogInWithValidUsernameAndValidPassword() {
        homePage.openElement("Form Authentication");
        loginPage.inputUsername(validUsername);
        loginPage.inputPassword(validPassword);
        loginPage.clickOnLoginButton();
        Assert.assertEquals(confirmMessage, secureArea.getMessage());
        Assert.assertTrue(secureArea.logoutButton.isDisplayed());
    }
    @Test
    public void verifyThatUserCannotLogInWithInvalidUsernameAndValidPassword() {
        homePage.openElement("Form Authentication");
        loginPage.inputUsername(invalidUsername);
        loginPage.inputPassword(validPassword);
        loginPage.clickOnLoginButton();
        Assert.assertEquals(errorMessageUsername, loginPage.getMessage());
        Assert.assertTrue(loginPage.loginButton.isDisplayed());
    }
    @Test
    public void verifyThatUserCannotLogInWithValidUsernameAndInvalidPassword() {
        homePage.openElement("Form Authentication");
        loginPage.inputUsername(validUsername);
        loginPage.inputPassword(invalidPassword);
        loginPage.clickOnLoginButton();
        Assert.assertEquals(errorMessagePassword, loginPage.getMessage());
        Assert.assertTrue(loginPage.loginButton.isDisplayed());
    }
    @Test
    public void verifyThatUserCannotLogInWithEmptyUsernameAndValidPassword() {
        homePage.openElement("Form Authentication");
        loginPage.inputUsername(emptyUsername);
        loginPage.inputPassword(validPassword);
        loginPage.clickOnLoginButton();
        Assert.assertEquals(errorMessageUsername, loginPage.getMessage());
        Assert.assertTrue(loginPage.loginButton.isDisplayed());
    }
    @Test
    public void verifyThatUserCannotLogInWithValidUsernameAndEmptyPassword() {
        homePage.openElement("Form Authentication");
        loginPage.inputUsername(validUsername);
        loginPage.inputPassword(emptyPassword);
        loginPage.clickOnLoginButton();
        Assert.assertEquals(errorMessagePassword, loginPage.getMessage());
        Assert.assertTrue(loginPage.loginButton.isDisplayed());
    }
    @Test
    public void verifyThatUserCanLogout() {
        verifyThatUserCanLogInWithValidUsernameAndValidPassword();
        secureArea.clickOnLogoutButton();
        Assert.assertEquals(logoutMessage, loginPage.getLogoutMessage());
        Assert.assertTrue(loginPage.loginButton.isDisplayed());
    }

}
