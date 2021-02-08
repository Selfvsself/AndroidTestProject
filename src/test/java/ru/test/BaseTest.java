package ru.test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class BaseTest {

    protected static AndroidDriver<AndroidElement> androidDriver;
    protected static Properties properties = TestProperties.getInstance().getProperties();
    private static final String DEVICE_NAME = properties.getProperty("deviceName");
    private static final String PLATFORM_NAME = properties.getProperty("platformName");
    private static final String APP_PACKAGE = properties.getProperty("appPackage");
    private static final String APP_ACTIVITY = properties.getProperty("appActivity");
    private static final String APPIUM_BASE_URL = properties.getProperty("appium.base.url");
    private static final String IMPLICITLY_TIMEOUT = properties.getProperty("timeout.global");

    @BeforeClass
    public static void setUp() throws MalformedURLException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();

        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, DEVICE_NAME);
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, PLATFORM_NAME);
        desiredCapabilities.setCapability("appPackage", APP_PACKAGE);
        desiredCapabilities.setCapability("appActivity", APP_ACTIVITY);

        androidDriver = new AndroidDriver<>(
                new URL(APPIUM_BASE_URL),
                desiredCapabilities);

        androidDriver.manage().timeouts().implicitlyWait(Long.parseLong(IMPLICITLY_TIMEOUT), TimeUnit.SECONDS);
    }

    @AfterClass
    public static void close() {
        androidDriver.quit();
    }
}
