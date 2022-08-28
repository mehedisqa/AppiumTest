package base;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class BaseClass {

    public AppiumDriver<MobileElement> driver;
    public File appDir = new File("src/test/apk");
    public File app = new File(appDir, "ApiDemos-debug.apk");
    public AppiumDriverLocalService service;

    @BeforeClass
    public void configAppium() throws MalformedURLException {

       service = new AppiumServiceBuilder().withAppiumJS(new File("C:\\Users\\HP\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js"))
                .withIPAddress("127.0.0.1").usingPort(4723).build();

        service.start();

        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName", "android");
        caps.setCapability("platformVersion", "11");
        caps.setCapability("deviceName", "QAtest");

        caps.setCapability("automationName", "UiAutomator2");

        caps.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
        URL uri = new URL("http://127.0.0.1:4723/wd/hub/");
        driver = new AppiumDriver<MobileElement>(uri, caps);
    }
    @AfterClass
    public void tearDown() {
        driver.quit();
        service.stop();
    }
}