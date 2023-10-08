package Pages;

import Base.BaseTest;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DropdownPage extends BaseTest {

    public boolean option1Selected;
    public boolean option2Selected;

    public DropdownPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy (id = "dropdown")
    public WebElement dropdownMenu;

    public void clickOnOption1() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].value='1'", dropdownMenu);
        option1Selected = true;
    }

    public void clickOnOption2() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].value='2'", dropdownMenu);
        option2Selected = true;
    }
}
