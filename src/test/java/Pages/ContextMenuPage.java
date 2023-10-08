package Pages;

import Base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContextMenuPage extends BaseTest {

    public ContextMenuPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy (id = "hot-spot")
    public WebElement box;

    public void rightClickInTheBox() {
        Actions actions = new Actions(driver);
        actions.contextClick(box).perform();
    }
}
