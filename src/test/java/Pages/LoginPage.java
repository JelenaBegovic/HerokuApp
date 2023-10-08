package Pages;

import Base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseTest {
    public LoginPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy (id = "username")
    public WebElement usernameField;

    public void inputUsername(String username) {
        usernameField.clear();
        usernameField.sendKeys(username);
    }

    @FindBy (id = "password")
    public WebElement passwordField;

    public void inputPassword(String password) {
        passwordField.clear();
        passwordField.sendKeys(password);
    }

    @FindBy (css = ".fa.fa-2x.fa-sign-in")
    public WebElement loginButton;

    public void clickOnLoginButton() {
        loginButton.click();
    }

    @FindBy (id = "flash-messages")
    WebElement message;

    public String getMessage() {
        return message.getText();
    }

    @FindBy (id = "flash")
    WebElement logoutMessage;

    public String getLogoutMessage() {
        return logoutMessage.getText();
    }
}
