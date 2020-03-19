package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.json.JsonOutput;

import java.net.URL;
import java.util.ArrayList;
import java.util.Set;

public class WindowManager {
    private WebDriver driver;
    private WebDriver.Navigation navigate;

    public WindowManager(WebDriver driver){
        this.driver = driver;
        navigate = driver.navigate();
    }
    public void goBack(){
        navigate.back();
    }
    public void goForward(){
        navigate.forward();
    }
    public void refreshPage(){
        navigate.refresh();
    }
    public void goTo(String url){
        navigate.to(url);
    }
    public void switchToTab(String tabName){
        Set<String> windows = driver.getWindowHandles();
        System.out.println("Tabs:" + windows.size());
        System.out.println("Windows:");
        windows.forEach(System.out::println);
        for (String window : windows) {
            driver.switchTo().window(window);
            if (tabName.equals(driver.getTitle())) {
                break;
            }
        }
    }

    public void switchToTab(URL url){
        Set<String> windows = driver.getWindowHandles();
        for (String window: windows) {
            driver.switchTo().window(window);
            if(url.equals(driver.getCurrentUrl())){
                break;
            }
        }
    }

    public void switchToNewTab(){
        Set<String> windows = driver.getWindowHandles();
        for (String window: windows) {
            driver.switchTo().window(window);
        }
    }
}
