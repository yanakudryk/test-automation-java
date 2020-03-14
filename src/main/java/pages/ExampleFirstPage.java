package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExampleFirstPage {
    private WebDriver driver;
    private By startButton = By.cssSelector("#start button");
    private By finish = By.id("finish");
    private By loading = By.id("loading");

    public ExampleFirstPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickStart(){
        driver.findElement(startButton).click();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.invisibilityOf(
                driver.findElement(loading)));
    }

    public String getLoadedText(){
        return driver.findElement(finish).getText();
    }
}
