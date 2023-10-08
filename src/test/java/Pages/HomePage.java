package Pages;

import Base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage extends BaseTest {
    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy (xpath = "/html/body/div[2]/div/ul")
    public WebElement allElements;

    public void openElement(String elementName) {
        List<WebElement> listOfElements = allElements.findElements(By.tagName("a"));
        for (int i = 0; i < listOfElements.size(); i++) {
            if (listOfElements.get(i).getText().equals(elementName)) {
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", listOfElements.get(i));
                listOfElements.get(i).click();
                break;
            }
        }
    }
}
