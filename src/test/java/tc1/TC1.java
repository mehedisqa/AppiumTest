package tc1;

import base.BaseClass;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class TC1 extends BaseClass {

    @Test
    void test1() {
        String title = driver.findElementByAccessibilityId("Preference").getText();
        driver.findElementByAccessibilityId("Preference").click();

        Assert.assertEquals(title, "Preference");
        System.out.println(title);
    }

}
