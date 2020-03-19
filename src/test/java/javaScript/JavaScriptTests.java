package javaScript;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.InfiniteScrollPage;
import pages.LargeDomPage;

import static java.lang.Thread.sleep;

public class JavaScriptTests extends BaseTests {
    @Test
    public void testScroll(){
        LargeDomPage largeDomPage = homePage.clickLargeDom();
        largeDomPage.scrollToTable();
        try {
            sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testInfiniteScroll(){
        InfiniteScrollPage infiniteScrollPage = homePage.clickInfiniteScroll();
        infiniteScrollPage.scrollToParagraph(5);
    }

}
