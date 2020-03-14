package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;
    private By formAuthenticationLink = By.linkText("Form Authentication");
    private By dropDownLink = By.linkText("Dropdown");
    private By forgotPasswordLink = By.linkText("Forgot Password");
    private By hoversLink = By.linkText("Hovers");
    private By keyPresses = By.linkText("Key Presses");
    private By horizontalSlider = By.linkText("Horizontal Slider");
    private By javaScriptAlerts = By.linkText("JavaScript Alerts");
    private By fileUpload = By.linkText("File Upload");
    private By contextMenu = By.linkText("Context Menu");
    private By editor = By.linkText("WYSIWYG Editor");
    private By frames = By.linkText("Frames");
    private By dynamicLoading = By.linkText("Dynamic Loading");
    private By largeDom = By.linkText("Large & Deep DOM");
    private By infiniteScroll = By.linkText("Infinite Scroll");

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public LoginPage clickAuthentication(){
        driver.findElement(formAuthenticationLink).click();
        return new LoginPage(driver);
    }

    public DropDownPage clickDropDown(){
        driver.findElement(dropDownLink).click();
        return new DropDownPage(driver);
    }

    public ForgotPasswordPage clickForgotPassword(){
        driver.findElement(forgotPasswordLink).click();
        return new ForgotPasswordPage(driver);
    }

    public HoversPage clickHovers(){
        driver.findElement(hoversLink).click();
        return new HoversPage(driver);
    }

    public KeyPressesPage clickKeyPresses(){
        driver.findElement(keyPresses).click();
        return new KeyPressesPage(driver);
    }

    public HorizontalSliderPage clickHorizontalSlider(){
        driver.findElement(horizontalSlider).click();
        return new HorizontalSliderPage(driver);
    }

    public JavaScriptAlertPage clickJavaScriptAlert(){
        driver.findElement(javaScriptAlerts).click();
        return new JavaScriptAlertPage(driver);
    }

    public FileUploadPage clickFileUpload(){
        driver.findElement(fileUpload).click();
        return new FileUploadPage(driver);
    }

    public ContextMenuPage clickContextMenu(){
        driver.findElement(contextMenu).click();
        return new ContextMenuPage(driver);
    }

    public IFramePage clickEditor(){
        driver.findElement(editor).click();
        return new IFramePage(driver);
    }

    public FramesPage clickFrames(){
        driver.findElement(frames);
        return new FramesPage(driver);
    }

    public DynamicLoadingPage clickDynamicLoading(){
        driver.findElement(dynamicLoading).click();
        return new DynamicLoadingPage(driver);
    }

    public LargeDomPage clickLargeDom(){
        driver.findElement(largeDom).click();
        return new LargeDomPage(driver);
    }

    public InfiniteScrollPage clickInfiniteScroll(){
        driver.findElement(infiniteScroll).click();
        return new InfiniteScrollPage(driver);
    }
}
