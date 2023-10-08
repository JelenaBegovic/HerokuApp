package Pages;

import Base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CheckboxPage extends BaseTest {
    public CheckboxPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy (xpath = "//input[@type='checkbox']")
    public List<WebElement> listOfCheckboxes;

    public void clickOnCheckbox() {
        for (int i = 0; i < listOfCheckboxes.size(); i++) {
            if (!listOfCheckboxes.get(i).isSelected()) {
                listOfCheckboxes.get(i).click();
            }
        }
    }

    public boolean verifyThatAllCheckboxesAreChecked() {
        for (int i = 0; i < listOfCheckboxes.size(); i++) {
            if (!listOfCheckboxes.get(i).isSelected()) {
                return false;
            }
        }
        return true;
    }

    public void uncheckCheckboxes() {
        for (int i = 0; i < listOfCheckboxes.size(); i++) {
            if (listOfCheckboxes.get(i).isSelected())
                listOfCheckboxes.get(i).click();
        }
    }



}
