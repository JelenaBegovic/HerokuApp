package Base;

import Pages.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class BaseTest {
    public static WebDriver driver;
    public WebDriverWait wait;
    public HomePage homePage;
    public LoginPage loginPage;
    public SecureArea secureArea;
    public AddRemovePage addRemovePage;
    public int numberOfAdd = 0;
    public int numberOfDelete = 0;
    public List<Integer> remainingDeletes = new ArrayList<>();
    public JavaScriptAlerts javaScriptAlerts;
    public BasicAuth basicAuth;
    public CheckboxPage checkboxPage;
    public ContextMenuPage contextMenuPage;
    public DragAndDropPage dragAndDropPage;
    public DropdownPage dropdownPage;

    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        homePage = new HomePage();
        loginPage = new LoginPage();
        secureArea = new SecureArea();
        addRemovePage = new AddRemovePage();
        javaScriptAlerts = new JavaScriptAlerts();
        basicAuth = new BasicAuth();
        checkboxPage = new CheckboxPage();
        contextMenuPage = new ContextMenuPage();
        dragAndDropPage = new DragAndDropPage();
        dropdownPage = new DropdownPage();
    }
}
