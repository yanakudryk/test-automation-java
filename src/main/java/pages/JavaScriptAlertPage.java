package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class JavaScriptAlertPage {
    private WebDriver driver;
    private By triggerAlertButton = By.cssSelector("ul > li > [onclick=\"jsAlert()\"]");
    private By triggerJSConfirmButton = By.cssSelector("ul > li > [onclick=\"jsConfirm()\"]");
    private By triggerJSPromptButton = By.cssSelector("ul > li > [onclick=\"jsPrompt()\"]");
    private By result = By.id("result");
    public JavaScriptAlertPage(WebDriver driver) {
        this.driver = driver;
    }
    public void clickJavaScriptAlertButton(){
        driver.findElement(triggerAlertButton).click();
    }

    public void clickJSConfirmButton(){
        driver.findElement(triggerJSConfirmButton).click();
    }

    public void clickJSPromptButton(){
        driver.findElement(triggerJSPromptButton).click();
    }

    public void alert_clickOkOnAlert(){
        driver.switchTo().alert().accept();
    }

    public String alert_getTextOnAlert(){
        return driver.switchTo().alert().getText();
    }

    public void alert_clickOnCancelButtonOnAlert(){
        driver.switchTo().alert().dismiss();
    }

    public void alert_inputTextOnAlert(String text){
        driver.switchTo().alert().sendKeys(text);
    }
    public String getResult(){
        return driver.findElement(result).getText();
    }
}
