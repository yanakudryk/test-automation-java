package cookie;

import base.BaseTests;

import static org.testng.Assert.*;
import org.testng.annotations.Test;
import utils.CookieManager;

public class CookieTests extends BaseTests {

    @Test
    public void testCookieDelete(){
        CookieManager cookieManager = getCookieManager();
        cookieManager.deleteCookie("optimizelyBuckets");
        assertFalse(cookieManager.getCookies().contains(cookieManager.getCookie("optimizelyBuckets")));
    }
}
