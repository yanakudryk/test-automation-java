package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HorizontalSliderPage {
    WebDriver driver;
    By slider = By.tagName("input");
    By range = By.id("range");

    public HorizontalSliderPage(WebDriver driver){
        this.driver = driver;
    }

    public void slide(int n){
        for (int i = 0; i < n; i++) {
            driver.findElement(slider).sendKeys(Keys.ARROW_RIGHT);
        }
    }

    public double getRange(){
        return Double.parseDouble(driver.findElement(range).getText());
    }
}
