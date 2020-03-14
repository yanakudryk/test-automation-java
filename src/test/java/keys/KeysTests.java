package keys;

import base.BaseTests;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.KeyPressesPage;

import static java.lang.Thread.sleep;
import static org.testng.Assert.assertEquals;

public class KeysTests extends BaseTests {
    @Test
    public void testKeys(){
        KeyPressesPage keyPressesPagePage = homePage.clickKeyPresses();
        keyPressesPagePage.inputText("T" + Keys.BACK_SPACE);
        assertEquals(keyPressesPagePage.getResult(), "You entered: BACK_SPACE", "The result doesn't match.");
    }

    @Test
    public void testPi(){
        KeyPressesPage keyPressesPage = homePage.clickKeyPresses();
        keyPressesPage.enterPi();
        try {
            sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
