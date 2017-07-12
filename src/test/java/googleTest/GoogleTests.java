package googleTest;

import org.testng.Assert;
import org.testng.annotations.Test;
public class GoogleTests extends BaseTest {
    @Test
    public void clickFirstLinkCheckTitle() {
        page.pageOpen("https://google.com/ncr");
        page.search("automation");
        page.clickFirstResult();
        Assert.assertTrue(driver.getTitle().toLowerCase().contains("automation"));
    }
    @Test
    public void ExpectedDomainInResultPages() {
        page.pageOpen("https://google.com/ncr");
        page.search("automation");
        Assert.assertTrue(page.checkExpectedDomainInResultPages(
                "https://www.capgemini.com/how-we-work/automation-drive-0", 5));
    }


}
