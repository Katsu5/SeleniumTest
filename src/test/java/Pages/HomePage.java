package Pages;

import Util.BasePage.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "[name='search']")
    private WebElement searchInput;

    @FindBy(css = "#searchform button")
    private WebElement searchButton;

    public ResultPage searchText(String text){
        searchInput.sendKeys(text);
        waitSomeSeconds(2);
        searchButton.click();
        return new ResultPage(super.getDriver());

    }
}
