package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MultipleWindowPage {
    private WebDriver driver;
    private By clickHereLink = By.linkText("Click Here");
    private By title = By.tagName("h3");

    public MultipleWindowPage(WebDriver driver) {
        this.driver = driver;
    }
    public void clickHere(){
        driver.findElement(clickHereLink).click();
    }

    public String getTitle(){
        return driver.findElement(title).getText();
    }
}
