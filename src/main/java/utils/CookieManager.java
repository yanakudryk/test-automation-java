package utils;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;

import java.util.Set;

public class CookieManager {
    private WebDriver driver;

    public CookieManager(WebDriver driver){
        this.driver = driver;
    }

    private void setCookie(String name, String value){
        Cookie cookie = new Cookie.Builder(name, value)
                .domain("the-internet.herokuapp.com")
                .build();
        driver.manage().addCookie(cookie);
    }
    public void deleteCookie(String name){
        driver.manage().deleteCookieNamed(name);
    }

    public Set<Cookie> getCookies(){
        return driver.manage().getCookies();
    }

    public Cookie getCookie(String name){
        return driver.manage().getCookieNamed(name);
    }
}
