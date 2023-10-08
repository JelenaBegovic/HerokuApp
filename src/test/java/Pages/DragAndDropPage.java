package Pages;

import Base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DragAndDropPage extends BaseTest {

    public DragAndDropPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy (id = "column-a")
    public WebElement columnA;

    @FindBy (id = "column-b")
    public WebElement columnB;

    public void dragAndDropColumnA() {
        Actions actions = new Actions(driver);
        actions.dragAndDrop(columnA, columnB).build().perform();
    }
}
