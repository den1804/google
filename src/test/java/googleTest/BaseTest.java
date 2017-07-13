package test.java.googleTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;

/**
 * Created by podde on 12.07.2017.
 */
public class BaseTest {
    protected static WebDriver driver;
    protected GooglePage googlePage;
    @BeforeClass
    public void setupDriver() {
        System.setProperty("webdriver.chrome.driver",
                "C://Users/podde/IdeaProjects/google/chromedriver.exe");
        driver = new ChromeDriver();
        googlePage = new GooglePage(driver);
    }
    @DataProvider
    public Object[][] clickFirstLinkCheckTitleData() {
        return new Object[][]{
                new Object[]{"https://google.com/ncr", "automation"},
                new Object[]{"https://google.com/ncr", "selenium"},
        };
    }
    @DataProvider
    public Object[][] ExpectedDomainInResultPagesData() {
        return new Object[][]{
                new Object[]{"https://google.com/ncr", "automation",
                        "https://www.capgemini.com/how-we-work/automation-drive-0", 5}
        };
    }
    @AfterClass
    public static void tearDown() {
        driver.quit();
    }
}
