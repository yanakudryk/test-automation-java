package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IFramePage {
    private WebDriver driver;
    private By iframe = By.id("mce_0_ifr");
    private By inputField = By.id("tinymce");
    private By increaseIndentButton = By.id("mceu_12");
    private By style = By.cssSelector("#tinymce > p");
    public IFramePage(WebDriver driver) {
        this.driver = driver;
    }
    private void switchToIFrame(){
        driver.switchTo().frame(driver.findElement(iframe));
    }
    private void exitIFrame(){
        driver.switchTo().parentFrame();
    }
    public void inputTextToIFrame(String text){
        switchToIFrame();
        driver.findElement(inputField).clear();
        driver.findElement(inputField).sendKeys(text);
        exitIFrame();
    }
    public void clickIncreaseIndentButton(){
        driver.findElement(increaseIndentButton).click();
    }
    public String getInputtedToIFrameText(){
        switchToIFrame();
        String text = driver.findElement(inputField).getText();
        exitIFrame();
        return text;
    }
    public String getIndent(){
        switchToIFrame();
        String indent = driver.findElement(style).getAttribute("style");
        exitIFrame();
        return indent;
    }


}
