package context;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.ContextMenuPage;

import static org.testng.Assert.assertEquals;

public class ContextMenuTests extends BaseTests {
    @Test
    public void testContextMenu(){
        ContextMenuPage contextMenuPage = homePage.clickContextMenu();
        contextMenuPage.performRightClick();
        assertEquals(contextMenuPage.getTextOnAlert(), "You selected a context menu", "Context menu is not selected.");
        contextMenuPage.clickOkButtonOnAlert();
        assertEquals(contextMenuPage.getContextMenuHeader(), "Context Menu", "Invalid header.");
    }
}
