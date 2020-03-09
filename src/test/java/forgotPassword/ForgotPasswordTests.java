package forgotPassword;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.EmailSentPage;
import pages.ForgotPasswordPage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class ForgotPasswordTests extends BaseTests {
    @Test
    public void testForgotPasswordSuccessful(){
        String email = "test@google.com";
        ForgotPasswordPage forgotPasswordPage = homePage.clickForgotPassword();
        forgotPasswordPage.inputEmail(email);
        EmailSentPage emailSentPage = forgotPasswordPage.clickRetrieveBtn();
        assertTrue(emailSentPage.getMessage().contains("Your e-mail's been sent!"), "Email was not sent.");
    }
}
