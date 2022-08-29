package tc2;

import base.BaseClass;
import com.google.common.collect.ImmutableMap;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LongPressGesture extends BaseClass {

    @Test
    public void longPress() throws InterruptedException {

        driver.findElementByAccessibilityId("Views").click();
        driver.findElementByAccessibilityId("Expandable Lists").click();
        driver.findElementByAccessibilityId("1. Custom Adapter").click();
        MobileElement eleValue = driver.findElement(By.xpath("//android.widget.TextView[@text='People Names']"));
        longPressAction(eleValue);

        String popupTitle = driver.findElement(By.id("android:id/title")).getText();
        Assert.assertTrue(driver.findElement(By.id("android:id/title")).isDisplayed());
        Assert.assertEquals(popupTitle, "Sample menu");


    }
}
