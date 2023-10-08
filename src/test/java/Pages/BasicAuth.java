package Pages;

import Base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasicAuth extends BaseTest {
    public BasicAuth() {
        PageFactory.initElements(driver, this);
    }

    @FindBy (className = "example")
    public WebElement confirmmessage;

}
