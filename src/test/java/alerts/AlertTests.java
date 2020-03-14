package alerts;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.JavaScriptAlertPage;

import static java.lang.Thread.sleep;
import static org.testng.Assert.assertEquals;

public class AlertTests extends BaseTests {
    @Test
    public void testClickAlert(){
        JavaScriptAlertPage javaScriptAlertPage = homePage.clickJavaScriptAlert();
        javaScriptAlertPage.clickJavaScriptAlertButton();
        javaScriptAlertPage.alert_clickOkOnAlert();
        assertEquals(javaScriptAlertPage.getResult(), "You successfuly clicked an alert", "Invalid click.");
    }
    @Test
    public void testJSCancelAlert(){
        JavaScriptAlertPage javaScriptAlertPage = homePage.clickJavaScriptAlert();
        javaScriptAlertPage.clickJSConfirmButton();
        String text = javaScriptAlertPage.alert_getTextOnAlert();
        javaScriptAlertPage.alert_clickOnCancelButtonOnAlert();
        assertEquals(text, "I am a JS Confirm", "Incorrect text on alert.");
        assertEquals(javaScriptAlertPage.getResult(), "You clicked: Cancel", "Invalid click.");
    }
    @Test
    public void testJSPromptAlert(){
        JavaScriptAlertPage javaScriptAlertPage = homePage.clickJavaScriptAlert();
        javaScriptAlertPage.clickJSPromptButton();
        String text = "Some text";
        javaScriptAlertPage.alert_inputTextOnAlert(text);
        javaScriptAlertPage.alert_clickOkOnAlert();
        assertEquals("You entered: " + text, javaScriptAlertPage.getResult(), "Invalid input.");
    }
}
