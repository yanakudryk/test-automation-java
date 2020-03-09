package dropdown;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.DropDownPage;

import static org.testng.Assert.*;

public class DropDownTests extends BaseTests {
    @Test
    public void testDropdownOptions(){
        DropDownPage dropDownPage = homePage.clickDropDown();
        dropDownPage.selectFromDropDown("Option 1");
        assertTrue(dropDownPage.getSelectedOptions().contains("Option 1"),
                "Option is not selected!");
    }
}
