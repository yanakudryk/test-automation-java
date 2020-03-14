package loading;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.DynamicLoadingPage;
import pages.ExampleFirstPage;
import pages.ExampleSecondPage;

import static org.testng.Assert.assertEquals;

public class LoadingTests extends BaseTests {
    @Test
    public void testDynamicLoadingFirstExample(){
        DynamicLoadingPage dynamicLoadingPage = homePage.clickDynamicLoading();
        ExampleFirstPage exampleFirstPage = dynamicLoadingPage.clickExampleFirst();
        exampleFirstPage.clickStart();
        assertEquals(exampleFirstPage.getLoadedText(), "Hello World!", "Loading is not successful.");
    }

    @Test
    public void testDynamicLoadingSecondExample(){
        DynamicLoadingPage dynamicLoadingPage = homePage.clickDynamicLoading();
        ExampleSecondPage exampleSecondPage = dynamicLoadingPage.clickExampleSecond();
        exampleSecondPage.clickStart();
        assertEquals(exampleSecondPage.getLoadedText(), "Hello World!", "Loading is not successful.");
    }
}
