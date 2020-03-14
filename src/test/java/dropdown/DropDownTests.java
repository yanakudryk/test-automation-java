package dropdown;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.DropDownPage;

import static org.testng.Assert.*;

public class DropDownTests extends BaseTests {
    @Test
    public void testSelectOption(){
        DropDownPage dropDownPage = homePage.clickDropDown();
        String option = "Option 1";
        dropDownPage.selectFromDropDown(option);
        assertEquals(dropDownPage.getSelectedOptions().size(),1, "Incorrect number of selections.");
        assertTrue(dropDownPage.getSelectedOptions().contains(option),
                "Option is not selected.");
    }
    @Test
    public void testMultipleSelection(){
        DropDownPage dropDownPage = homePage.clickDropDown();
        dropDownPage.setDropDownMultiple();
        String [] options = {"Option 1", "Option 2"};
        dropDownPage.selectFromDropDown(options);
        assertEquals(dropDownPage.getSelectedOptions().size(), 2, "Incorrect number of selections.");
        assertEquals(dropDownPage.getSelectedOptions().toArray(), options, "Selected options are incorrect.");
    }
}
