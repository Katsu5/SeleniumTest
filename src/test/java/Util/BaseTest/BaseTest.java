package Util.BaseTest;

import Pages.HomePage;
import Util.MyDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseTest {

    MyDriver driver;

    @BeforeMethod(alwaysRun = true)
    @Parameters({"browser", "url"})
    public void beforeMethod(String browser, String url){
        driver = new MyDriver(browser);
        driver.getDriver().manage().window().maximize();
        navegateTo(url);
    }

    private void navegateTo(String url) {
        driver.getDriver().get(url);
    }

    public HomePage loadFirstPage(){
        return new HomePage(driver.getDriver());
    }

    @AfterMethod()
    public void afterMethod(){
        driver.getDriver().close();
    }
}
