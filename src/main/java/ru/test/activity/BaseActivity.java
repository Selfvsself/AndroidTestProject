package ru.test.activity;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.test.TestProperties;

import java.util.Properties;

public class BaseActivity {

    protected AndroidDriver<AndroidElement> androidDriver;
    protected final WebDriverWait wait;
    protected static Properties properties = TestProperties.getInstance().getProperties();
    private static final String WAITING_TIME = properties.getProperty("test.wait.for.until");

    public BaseActivity(AndroidDriver<AndroidElement> androidDriver) {
        this.androidDriver = androidDriver;
        PageFactory.initElements(new AppiumFieldDecorator(androidDriver), this);
        wait = new WebDriverWait(androidDriver, Long.parseLong(WAITING_TIME));
    }

    public AndroidElement waitVisibility(AndroidElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
        return element;
    }

    public void click(AndroidElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.click();
    }
}
