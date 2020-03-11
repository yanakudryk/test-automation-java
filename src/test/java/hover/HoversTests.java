package hover;

import base.BaseTests;
import org.openqa.selenium.support.ui.Sleeper;
import org.testng.annotations.Test;
import org.testng.annotations.TestInstance;
import pages.HoversPage;

import java.sql.Time;

import static org.testng.Assert.*;

public class HoversTests extends BaseTests {
    @Test
    public void testHoversUser1(){
        HoversPage hoversPage = homePage.clickHovers();
        int figureIndex = 1;
        String figureLink = "https://the-internet.herokuapp.com/users/" + figureIndex;
        String title = "name: user" + figureIndex;
        String linkText = "View profile";
        HoversPage.FigureCaption figureCaption = hoversPage.hoverOverFigure(figureIndex);
        assertTrue(figureCaption.isDisplayed());
        assertEquals(figureCaption.getLink(), figureLink, "Invalid link.");
        assertEquals(figureCaption.getLinkText(), linkText, "Invalid link text");
        assertEquals(figureCaption.getName(), title, "Invalid title.");

    }
    @Test
    public void testHoversUser2(){
        HoversPage hoversPage = homePage.clickHovers();
        int figureIndex = 2;
        String figureLink = "https://the-internet.herokuapp.com/users/" + figureIndex;
        String title = "name: user" + figureIndex;
        String linkText = "View profile";
        HoversPage.FigureCaption figureCaption = hoversPage.hoverOverFigure(figureIndex);
        //assertTrue(figureCaption.isDisplayed());
        assertEquals(figureCaption.getLink(), figureLink, "Invalid link.");
        assertEquals(figureCaption.getLinkText(), linkText, "Invalid link text");
        assertEquals(figureCaption.getName(), title, "Invalid title.");

    }
    @Test
    public void testHoversUser3(){
        HoversPage hoversPage = homePage.clickHovers();
        int figureIndex = 3;
        String figureLink = "https://the-internet.herokuapp.com/users/" + figureIndex;
        String title = "name: user" + figureIndex;
        String linkText = "View profile";
        HoversPage.FigureCaption figureCaption = hoversPage.hoverOverFigure(figureIndex);
        assertTrue(figureCaption.isDisplayed());
        assertEquals(figureCaption.getLink(), figureLink, "Invalid link.");
        assertEquals(figureCaption.getLinkText(), linkText, "Invalid link text");
        assertEquals(figureCaption.getName(), title, "Invalid title.");

    }
}
