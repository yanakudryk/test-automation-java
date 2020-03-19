package base;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import pages.HomePage;
import utils.WindowManager;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static java.lang.Thread.sleep;

public class BaseTests {
    private WebDriver driver;
    protected HomePage homePage;

    @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        //driver.get("https://the-internet.herokuapp.com/");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        goHome();
        //driver.manage().window().maximize();
        homePage = new HomePage(driver);

    }
    @AfterClass
    public void tearDown(){
        driver.quit();
    }

    @BeforeMethod
    public void goHome(){
        driver.get("https://the-internet.herokuapp.com/");
    }

    public WindowManager getWindowManager(){
        return new WindowManager(driver);
    }
}
