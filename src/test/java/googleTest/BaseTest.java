package googleTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
/**
 * Created by podde on 12.07.2017.
 */
public class BaseTest {
    protected static WebDriver driver;
    protected GooglePage page;
    @BeforeClass
    public void setupDriver() {
        System.setProperty("webdriver.chrome.driver",
                "C://Users/podde/IdeaProjects/google/chromedriver.exe");
        driver = new ChromeDriver();
        page = new GooglePage(driver);
    }
    @AfterClass
    public static void tearDown() {
        driver.quit();
    }
}
