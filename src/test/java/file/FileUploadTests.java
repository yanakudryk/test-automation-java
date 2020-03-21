package file;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.FileUploadPage;
import pages.FileUploadedPage;

import static org.testng.Assert.assertEquals;

public class FileUploadTests extends BaseTests {
    @Test
    public void testFileUpload(){
        String absolutePathToFile = "C:\\Users\\Yana\\IdeaProjects\\testautomatiom\\resources\\PDF1.pdf";
        FileUploadPage fileUploadPage = homePage.clickFileUpload();
        fileUploadPage.uploadFile(absolutePathToFile);
        FileUploadedPage fileUploadedPage = fileUploadPage.clickFileUpload();
        assertEquals(fileUploadedPage.getFile(), "PDF1.pdf", "Invalid file name");
        assertEquals(fileUploadedPage.getResultText(), "File Uploaded!", "File is not uploaded.");
    }
}
