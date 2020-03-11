package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;
    private By formAuthenticationLink = By.linkText("Form Authentication");
    private By dropDownLink = By.linkText("Dropdown");
    private By forgotPasswordLink = By.linkText("Forgot Password");
    private By hoversLink = By.linkText("Hovers");

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
}
