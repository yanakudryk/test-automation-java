package iframe;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.IFramePage;

import static java.lang.Thread.sleep;
import static org.testng.Assert.assertEquals;

public class IFrameTests extends BaseTests {
    @Test
    public void testIFrame(){
        String text1 = "Hello";
        String text2 = " world.";
        IFramePage iFramePage = homePage.clickEditor();
        iFramePage.inputTextToIFrame(text1);
        assertEquals(iFramePage.getInputtedToIFrameText(), text1, "Invalid input.");
        iFramePage.clickIncreaseIndentButton();
        assertEquals(iFramePage.getIndent(), "padding-left: 30px;", "Invalid indent.");
        iFramePage.inputTextToIFrame(text2);
        assertEquals(iFramePage.getInputtedToIFrameText(), text2, "Invalid input.");
    }
}
