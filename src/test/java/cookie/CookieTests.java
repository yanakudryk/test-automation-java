package cookie;

import base.BaseTests;

import static org.testng.Assert.*;
import org.testng.annotations.Test;

public class CookieTests extends BaseTests {

    @Test
    public void testCookieDelete(){
        deleteCookie("optimizelyBuckets");
        assertFalse(getCookies().contains(getCookie("optimizelyBuckets")));
    }
}
