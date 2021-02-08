package ru.test.activity;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class SMSCodeActivity extends BaseActivity{

    @AndroidFindBy(id = "ru.tele2.mytele2:id/otherWays")
    private AndroidElement otherWayButton;

    public SMSCodeActivity(AndroidDriver<AndroidElement> androidDriver) {
        super(androidDriver);
    }

    public void clickOnOtherWayButton() {
        click(otherWayButton);
    }
}
