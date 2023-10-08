package Pages;

import Base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddRemovePage extends BaseTest {
    public AddRemovePage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy (xpath = "/html/body/div[2]/div/div/button")
    public WebElement addElementButton;

    public void clickOnAddElementButton(int n) {
        for (int i = 0; i < n; i++) {
            addElementButton.click();
            numberOfAdd++;
            remainingDeletes.add(1);
        }
    }

    @FindBy (className = "added-manually")
    public WebElement deleteButton;

    public void clickOnDeleteButton(int n) {
        if (numberOfAdd >= n) {
            for (int i = 0; i < n; i++) {
                deleteButton.click();
                numberOfDelete++;
                remainingDeletes.remove(remainingDeletes.get(0));
            }
        } else {
            for (int i = 0; i < numberOfAdd; i++) {
                deleteButton.click();
                numberOfDelete++;
                remainingDeletes.remove(remainingDeletes.get(0));
            }
        }
    }
}
