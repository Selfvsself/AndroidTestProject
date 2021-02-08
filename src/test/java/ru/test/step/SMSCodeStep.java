package ru.test.step;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import ru.test.activity.SMSCodeActivity;

public class SMSCodeStep extends BaseStep<SMSCodeActivity> {

    public SMSCodeStep(AndroidDriver<AndroidElement> androidDriver) {
        super(new SMSCodeActivity(androidDriver));
        log("Загрузилась страница 'Код из смс'");
    }

    public void clickOnOtherWayButton() {
        log("Нажимаем на кнопку 'Другие способы входа'");
        activity.clickOnOtherWayButton();
    }
}
