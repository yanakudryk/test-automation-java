package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DynamicLoadingPage {
    private WebDriver driver;
    private By exampleFirst = By.xpath("//*[@id=\"content\"]/div/a[1]");
    private By exampleSecond = By.xpath("//*[@id=\"content\"]/div/a[2]");
    public DynamicLoadingPage(WebDriver driver) {
        this.driver = driver;
    }

    public ExampleFirstPage clickExampleFirst(){
        driver.findElement(exampleFirst).click();
        return new ExampleFirstPage(driver);
    }

    public ExampleSecondPage clickExampleSecond(){
        driver.findElement(exampleSecond).click();
        return new ExampleSecondPage(driver);
    }

}
