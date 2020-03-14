package frames;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.FramesPage;
import pages.NestedFramesPage;

import static java.lang.Thread.sleep;
import static org.testng.Assert.assertEquals;

public class FramesTests extends BaseTests {
    @Test
    public void testNestedFrames(){
        FramesPage framesPage = homePage.clickFrames();
        NestedFramesPage nestedFramesPage = framesPage.clickNestedFrames();
        assertEquals(nestedFramesPage.getLeftFrameText(), "LEFT", "Invalid frame is selected.");
        assertEquals(nestedFramesPage.getBottomFrameText(), "BOTTOM", "Invalid frame is selected.");
    }
}
