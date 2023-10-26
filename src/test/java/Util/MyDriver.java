package Util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MyDriver {
    private WebDriver driver;

    //Constructor

    public MyDriver(String browser) {
        if("firefox".equals(browser)){
            this.driver = new FirefoxDriver();
        }
        else{
            String path= System.getProperty("user.dir");
            System.setProperty("webdriver.chrome.driver",path+"\\drivers\\chromedriver.exe");
            this.driver= new ChromeDriver();
        }
    }

    public WebDriver getDriver() {
        return driver;
    }
}
