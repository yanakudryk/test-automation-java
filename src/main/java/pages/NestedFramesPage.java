package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NestedFramesPage {
    private WebDriver driver;
    private String topFrames = "frame-top";
    private String topLeftFrame = "frame-left";
    private String bottomFrame = "frame-bottom";
    private By body = By.tagName("body");

    public NestedFramesPage(WebDriver driver) {
        this.driver = driver;
    }
    public String getLeftFrameText(){
        driver.switchTo().frame(topFrames);
        driver.switchTo().frame(topLeftFrame);
        String text = driver.findElement(body).getText();
        driver.switchTo().parentFrame();
        driver.switchTo().parentFrame();
        return text;
    }

    public String getBottomFrameText(){
        driver.switchTo().frame(bottomFrame);
        String text = driver.findElement(body).getText();
        driver.switchTo().parentFrame();
        return text;
    }

}
