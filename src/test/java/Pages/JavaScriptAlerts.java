package Pages;

import Base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JavaScriptAlerts extends BaseTest {
    public JavaScriptAlerts() {
        PageFactory.initElements(driver, this);
    }

    @FindBy (xpath = "/html/body/div[2]/div/div/ul/li[1]/button")
    public WebElement clickForJSAlert;

    public void clickOnClickForJSAlert() {
        clickForJSAlert.click();
    }

    @FindBy (xpath = "/html/body/div[2]/div/div/ul/li[2]/button")
    public WebElement clickForJSConfirm;

    public void clickOnClickForJSConfirm() {
        clickForJSConfirm.click();
    }

    @FindBy (xpath = "/html/body/div[2]/div/div/ul/li[3]/button")
    public WebElement clickForJSPrompt;

    public void clickOnClickForJSPrompt() {
        clickForJSPrompt.click();
    }

    @FindBy (id = "result")
    public WebElement message;

    public String  getMessage() {
        return message.getText();
    }

}
