package navigation;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.DynamicLoadingPage;
import pages.ExampleSecondPage;
import pages.MultipleWindowPage;
import utils.WindowManager;

import static java.lang.Thread.sleep;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class NavigationTests extends BaseTests {
    @Test
    public void testNavigator(){
        homePage.clickDynamicLoading().clickExampleFirst();
        getWindowManager().goBack();
        getWindowManager().refreshPage();
        getWindowManager().goForward();
        getWindowManager().goTo("https://translate.google.com.ua/?hl=ru");
    }

    @Test
    public void testSwitchTabs(){
        MultipleWindowPage multipleWindowPage = homePage.clickMultipleWindow();
        multipleWindowPage.clickHere();
        getWindowManager().switchToTab("The Internet");
        assertEquals(multipleWindowPage.getTitle(), "Opening a new window", "Title does not match.");
    }
    @Test
    public void testNavigationBetweenDynamicWindows(){
        DynamicLoadingPage dynamicLoadingPage = homePage.clickDynamicLoading();
        ExampleSecondPage exampleSecondPage = dynamicLoadingPage.clickExampleSecondToOpenInNewWindow();
        getWindowManager().switchToTab("http://the-internet.herokuapp.com/dynamic_loading/2");
        assertTrue(exampleSecondPage.isStartButtonDisplayed(), "Start button is not displayed.");
    }
}
