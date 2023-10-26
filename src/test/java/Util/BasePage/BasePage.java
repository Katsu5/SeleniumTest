package Util.BasePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {
    protected WebDriver driver;
    protected WebDriverWait wait;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }

    public WebDriver getDriver() {
        return driver;
    }

    public WebDriverWait getWait() {
        return wait;
    }

    //Este metodo es para verificar que el elemento sea cliqueable a traves de la condicion .elementToBe...
    public void waitToBeClickable(WebElement element){
        getWait().until(ExpectedConditions.elementToBeClickable(element));
    }

    //Este metodo es para verificar que el elemento sea visible a traves de la condicion .visibilityof
    public void waitElementVisibility(WebElement element){
        getWait().until(ExpectedConditions.visibilityOf(element));
    }

    //Este metodo es para verificar que la espera del tiempo se cumpla en ese tiempo. No es una buena
    //practica por que puede que tome menos tiempo y perdamos tiempo valioso. Pero debemos saber que existe.
    public void waitSomeSeconds(int time){
        try{
            Thread.sleep(time * 1000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }

}
