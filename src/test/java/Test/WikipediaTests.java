package Test;

import Pages.HomePage;
import Pages.ResultPage;
import Util.BaseTest.BaseTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class WikipediaTests extends BaseTest {

    @Test
    @Parameters({"TextToSearch"})
    public void searchTest(String textToSearch){
        HomePage home = loadFirstPage();
        ResultPage results = home.searchText(textToSearch);

        assertTrue(results.isTitleCorrect(textToSearch), "The title does not match");
    }
}
