package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class FileUploadPage {
    private WebDriver driver;
    private By fileUpload = By.id("file-upload");
    private By fileUploadButton = By.id("file-submit");
    public FileUploadPage(WebDriver driver) {
        this.driver = driver;
    }
    public void uploadFile(String absolutePathOfFile){
        driver.findElement(fileUpload).sendKeys(absolutePathOfFile);
    }
    public FileUploadedPage clickFileUpload(){
        driver.findElement(fileUploadButton).click();
        return new FileUploadedPage(driver);
    }


}
