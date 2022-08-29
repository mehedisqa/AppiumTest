package tc3;

import base.BaseClass;
import io.appium.java_client.MobileBy;
import org.testng.annotations.Test;

public class ScrollAction extends BaseClass {
    @Test
    public void scrollDown() {
        driver.findElementByAccessibilityId("Views").click();
        scrollDown("WebView");

    }

}
