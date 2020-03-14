package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextMenuPage {
    private WebDriver driver;
    private By hotSpot = By.id("hot-spot");
    private By contextMenuHeader = By.tagName("h3");
    public ContextMenuPage(WebDriver driver) {
        this.driver = driver;
    }

    public void performRightClick(){
        Actions rightClick = new Actions(driver);
        rightClick.contextClick(driver.findElement(hotSpot)).perform();
    }

    public void clickOkButtonOnAlert(){
        driver.switchTo().alert().accept();
    }

    public String getTextOnAlert(){
        return driver.switchTo().alert().getText();
    }

    public String getContextMenuHeader(){
        return driver.findElement(contextMenuHeader).getText();
    }
}
