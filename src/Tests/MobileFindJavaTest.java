package Tests;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

import java.net.URL;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.remote.DesiredCapabilities;

public class MobileFindJavaTest {

  private AppiumDriver<?>            driver;
  private static final String     url    = "http://127.0.0.1:4723/wd/hub";

  @Test
  public void apiDemo() throws Exception {
//	driver.scrollTo("about phone");
//	driver.scrollTo("Bluetooth");
	driver.rotate(ScreenOrientation.LANDSCAPE);
//	driver.rotate(ScreenOrientation.PORTRAIT);
  }


  @Before
  public void setUp() throws Exception {
    final DesiredCapabilities capabilities = new DesiredCapabilities();
    capabilities.setCapability("deviceName", "adb:asus Nexus 7");
 //   capabilities.setCapability("deviceName", "LGD855b605608e");
    capabilities.setCapability("appPackage", "com.android.settings");
    capabilities.setCapability("appActivity", ".Settings");
    driver = new AndroidDriver<>(new URL(url), capabilities);
  }

  @After
  public void tearDown() throws Exception {
    driver.quit();
  }
}