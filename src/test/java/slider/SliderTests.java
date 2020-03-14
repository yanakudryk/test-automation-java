package slider;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.HorizontalSliderPage;

import static org.testng.Assert.assertEquals;

public class SliderTests extends BaseTests {

        @Test
        public void testHorizontalSlider() {
            int n = 5;
            HorizontalSliderPage horizontalSliderPage = homePage.clickHorizontalSlider();
            horizontalSliderPage.slide(n);
            assertEquals(horizontalSliderPage.getRange(), n * 0.5, "Invalid range.");
        }
}
