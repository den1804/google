package test.java.googleTest;

import org.testng.Assert;
import org.testng.annotations.Test;
public class GoogleTests extends BaseTest {
    @Test(dataProvider = "clickFirstLinkCheckTitleData")
    public void clickFirstLinkCheckTitle(String url, String searchWord) {
        googlePage.pageOpen(url);
        googlePage.search(searchWord);
        googlePage.clickFirstResult();
        Assert.assertTrue(driver.getTitle().toLowerCase().contains(searchWord),
                "Title does not contain " + searchWord);
    }
    @Test(dataProvider = "ExpectedDomainInResultPagesData")
    public void ExpectedDomainInResultPages(String url, String searchWord,
                                            String searchDomain, Integer perPages) {
        googlePage.pageOpen(url);
        googlePage.search(searchWord);
        Assert.assertTrue(
                googlePage.checkExpectedDomainInResultPages(searchDomain, perPages),
                "The domain does not exist in the search on these pages");
    }


}
