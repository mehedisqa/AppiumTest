package tc4;

import base.BaseClass;
import io.appium.java_client.android.Activity;
import io.appium.java_client.android.AndroidDriver;
import org.testng.annotations.Test;

public class MiscellaneousActions extends BaseClass {

    @Test
    public void miscellaneousAction(){

      /*  How to find appPackage and appActivity:
        Mac: adb shell dumpsys window | grep -E 'mCurrentFocus'
        Windows: adb shell dumpsys window | find "mCurrentFocus"*/

        activity = new Activity("io.appium.android.apis", "io.appium.android.apis.view.Gallery1");
        //driver.startActivity(activity);


    }
}
