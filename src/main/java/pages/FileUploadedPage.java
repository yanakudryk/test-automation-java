package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FileUploadedPage {
    WebDriver driver;
    By file = By.id("uploaded-files");
    By resultText = By.tagName("h3");
    public FileUploadedPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getResultText(){
        return driver.findElement(resultText).getText();
    }

    public String getFile(){
        return driver.findElement(file).getText();
    }
}
